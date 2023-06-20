/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp_rental;

import java.io.ByteArrayInputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author Laptop
 */
public class FormCallClient extends javax.swing.JFrame implements Runnable {

    InetAddress group;
    static AudioInputStream ais;
    static AudioFormat format;
    static boolean status = true;
    static int port = 50005;
    static int sampleRate = 44100; //44100

    static DataLine.Info dataLineInfo;
    static SourceDataLine sourceDataLine;
    MulticastSocket mSocket;

    Thread t;
    int now = 0;

    /**
     * Creates new form FormCallClient
     */
    public FormCallClient() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @Override
    public void run() {
        while (true) {
            call();
        }
    }

    private static void toSpeaker(byte soundbytes[]) {
        try {
            sourceDataLine.write(soundbytes, 0, soundbytes.length);
        } catch (Exception e) {
            System.out.println("Not working in speakers...");
            e.printStackTrace();
        }
    }

    private void call() {
        txtStatus.append("Koneksi berhasil dibuat, menunggu pemilik untuk menerima panggilan...\n");
        System.setProperty("java.net.preferIPv4Stack", "true");

        try {
            if (status == true) {
                group = InetAddress.getByName("225.6.7.8");
                mSocket = new MulticastSocket(port);
                mSocket.setReuseAddress(true);
                mSocket.joinGroup(group);

                /**
                 * Formula for lag = (byte_size/sample_rate)*2 Byte size 9728
                 * will produce ~ 0.45 seconds of lag. Voice slightly broken.
                 * Byte size 1400 will produce ~ 0.06 seconds of lag. Voice
                 * extremely broken. Byte size 4000 will produce ~ 0.18 seconds
                 * of lag. Voice slightly more broken then 9728.
                 */
                byte[] receiveData = new byte[9728]; //4096
                format = new AudioFormat(sampleRate, 16, 2, true, false);
                dataLineInfo = new DataLine.Info(SourceDataLine.class, format);
                sourceDataLine = (SourceDataLine) AudioSystem.getLine(dataLineInfo);
                sourceDataLine.open(format);
                sourceDataLine.start();

                //FloatControl volumeControl = (FloatControl) sourceDataLine.getControl(FloatControl.Type.MASTER_GAIN);
                //volumeControl.setValue(1.00f);
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                ByteArrayInputStream baiss = new ByteArrayInputStream(receivePacket.getData());

                while (status == true) {
                    mSocket.receive(receivePacket);
                    ais = new AudioInputStream(baiss, format, receivePacket.getLength());
                    if (now == 0) {
                        txtStatus.append("Panggilan telah tersambung");
                        now++;
                    }
                    toSpeaker(receivePacket.getData());
                }
            }
        } catch (Exception e) {
            System.out.println("Client Audio error: " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtStatus = new javax.swing.JTextArea();
        btnEndCall = new javax.swing.JButton();
        btnStartCall = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtStatus.setEditable(false);
        txtStatus.setColumns(20);
        txtStatus.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtStatus.setRows(5);
        jScrollPane1.setViewportView(txtStatus);

        btnEndCall.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEndCall.setText("End Call");
        btnEndCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndCallActionPerformed(evt);
            }
        });

        btnStartCall.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnStartCall.setText("Start Call");
        btnStartCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartCallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnStartCall)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEndCall)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEndCall)
                    .addComponent(btnStartCall))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEndCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndCallActionPerformed
        try {
            status = false;
            format = null;
            ais.close();
            sourceDataLine.stop();
            group = null;
            mSocket = null;
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(FormCallClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEndCallActionPerformed

    private void btnStartCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartCallActionPerformed
        status = true;
        if (t == null) {
            t = new Thread(this, "Audio Client");
            t.start();
        }
    }//GEN-LAST:event_btnStartCallActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCallClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCallClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCallClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCallClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCallClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEndCall;
    private javax.swing.JButton btnStartCall;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtStatus;
    // End of variables declaration//GEN-END:variables
}
