/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapp_rental;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class FormChatServer extends javax.swing.JFrame implements Runnable {

    Socket incoming;
    ServerSocket s;
    Thread t;
    ArrayList<HandleSocket> clients = new ArrayList<HandleSocket>();
    ArrayList<String> clientNames = new ArrayList<String>();
    Chat chat;
    int status = 0;

    public FormChatServer() {
        initComponents();
        setLocationRelativeTo(null);
        cbNama.setSelectedIndex(-1);
        try {
            s = new ServerSocket(6000);
            if (t == null) {
                t = new Thread(this, "Simple Chat");
                t.start();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "error koneksi " + ex);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                incoming = s.accept();
                HandleSocket hs = new HandleSocket(this, incoming);
                hs.start();
                clients.add(hs);
            } catch (IOException ex) {
                System.out.println("formserver run error = " + ex);
            }
        }
    }

    public void userRegister(HandleSocket _hs, String msg) {
        String msgSplit[] = msg.split(";-");

        if (register(msgSplit[1], msgSplit[2], msgSplit[3], msgSplit[4], msgSplit[5]).equals("sukses")) {
            _hs.sendChat("true");
        } else {
            _hs.sendChat("false");
        }
    }

    public void userLogin(HandleSocket _hs, String msg) {
        String msgSplit[] = msg.split(";-");

        if (cekLogin(msgSplit[1], msgSplit[2]).equals("sukses")) {
            _hs.sendChat("true");
            cbNama.addItem(msgSplit[1]);
        } else {
            _hs.sendChat("false");
        }
    }

    public void insertChat(String msg) {
        String msgSplit[] = msg.split(":");
        String username = msgSplit[0];
        String content = msgSplit[1];

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        String dateTime = dateFormat.format(cal.getTime());

        chat = new Chat(username, "admin", content, dateTime);
        chat.insert();

        txtChat.append(username + ": " + content + "\n");
    }

    public void showChatClient(HandleSocket _hs, String msg) {
        String msgSplit[] = msg.split(";-");
        String hasilAkhir = "showChat&&";
        int cek = 1;
        chat = new Chat();

        for (Chat c : chat.displayClient(msgSplit[1])) {
            if (chat.displayClient(msgSplit[1]).size() == cek) {
                hasilAkhir += c.getUsername() + ";" + c.getContent() + ";" + c.getTime_chat();
            } else {
                hasilAkhir += c.getUsername() + ";" + c.getContent() + ";" + c.getTime_chat() + "&";
                cek++;
            }
        }
        _hs.sendChat(hasilAkhir);
    }

    public void checkDate(HandleSocket _hs, String msg) {
        try {
            String msgSplit[] = msg.split(";-");
            String tglSplit[] = msgSplit[1].split(" sampai ");
            String nama_rumah = msgSplit[2];
            String tgl_msk = tglSplit[0];
            String tgl_keluar = tglSplit[1];

            String hasil = cekTanggal(tgl_msk, tgl_keluar, nama_rumah);

            if (hasil.equals("sukses")) {
                if (status == 1) {
                    txtChat.append("Sistem: tanggal tersedia\n");
                } else {
                    _hs.sendChat("Sistem: tanggal tersedia");
                }
            } else {
                if (status == 1) {
                    txtChat.append("Sistem: tanggal tidak tersedia\n");
                } else {
                    _hs.sendChat("Sistem: tanggal tidak tersedia");
                }
            }
            status = 0;
        } catch (Exception ex) {
            Logger.getLogger(FormChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void reservation(HandleSocket _hs, String msg) {
        try {
            String msgSplit[] = msg.split(";-");
            String username = msgSplit[2];
            String nama_rumah = msgSplit[3];
            String tglSplit[] = msgSplit[1].split(" sampai ");
            String tgl_msk = tglSplit[0];
            String tgl_keluar = tglSplit[1];

            String hasil = reservasi(tgl_msk, tgl_keluar, username, nama_rumah);

            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            String dateTime = dateFormat.format(cal.getTime());

            String msgFinal = "reservasi:" + tgl_msk + " sampai " + tgl_keluar + ":" + nama_rumah;
            chat = new Chat(username, "admin", msgFinal, dateTime);

            if (status == 0) {
                txtChat.append(username + ": " + msgSplit[0] + ":" + tgl_msk + " sampai " + tgl_keluar + ":" + nama_rumah + "\n");
            }

            String[] splitted = hasil.split(":");
            if (splitted[0].equals("sukses")) {
                _hs.sendChat("Sistem: reservasi berhasil, Total harga : Rp." + splitted[1]);
                txtChat.append("Sistem: reservasi berhasil, Total harga : Rp." + splitted[1] + "\n");
                chat.insert(); //chat reservasi hanya dicatat jika reservasi berhasil
            } else {
                _hs.sendChat("Sistem: reservasi gagal, tanggal tidak tersedia");
                txtChat.append("Sistem: reservasi gagal, tanggal tidak tersedia\n");
            }
            status = 0;
        } catch (Exception ex) {
            Logger.getLogger(FormChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void checkListRumah(HandleSocket _hs) {
        try {
            String awal = cekListRumah();
            String[] splitted = awal.split("&");

            if (status == 1) {
                for (int i = 0; i < splitted.length; i++) {
                    String[] listInfo = splitted[i].split(";");
                    txtChat.append(listInfo[0] + ", Alamat : " + listInfo[1] + ", Harga Per Hari : Rp." + listInfo[2] + "\n");
                }
            } else {
                awal += "%cekListRumah%";
                _hs.sendChat(awal);
            }

            status = 0;
        } catch (Exception ex) {
            Logger.getLogger(FormChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void track(HandleSocket _hs, String msg) {
        try {
            String msgSplit[] = msg.split(";-");
            String username = msgSplit[2];
            String tglSplit[] = msgSplit[1].split(" sampai ");
            String tgl_msk = tglSplit[0];
            String tgl_keluar = tglSplit[1];

            String hasil = lacak(username, tgl_msk, tgl_keluar);

            if (hasil.equals("ada")) {
                _hs.sendChat("Sistem: Reservasi pernah dibuat");
            } else {
                _hs.sendChat("Sistem: Reservasi tidak pernah dibuat");
            }
        } catch (Exception ex) {
            Logger.getLogger(FormChatServer.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPesan = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        btnHistoryChat = new javax.swing.JButton();
        cbNama = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnCall = new javax.swing.JButton();
        btnPanduan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setText("Chat Admin");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Pesan");

        txtPesan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSend.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        txtChat.setEditable(false);
        txtChat.setColumns(20);
        txtChat.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        txtChat.setRows(5);
        jScrollPane1.setViewportView(txtChat);

        btnHistoryChat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHistoryChat.setText("History Chat");
        btnHistoryChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryChatActionPerformed(evt);
            }
        });

        cbNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNamaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Kirim Pesan Ke");

        btnCall.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnCall.setText("Hubungi Klien");
        btnCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCallActionPerformed(evt);
            }
        });

        btnPanduan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPanduan.setText("Panduan");
        btnPanduan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanduanActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(btnPanduan, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 58, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addComponent(cbNama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(113, 113, 113)
                        .addComponent(btnCall))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSend))
                            .addComponent(btnHistoryChat)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPanduan)
                            .addComponent(btnCall))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbNama, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHistoryChat)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        if (cbNama.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Pilih nama terlebih dahulu sebelum mengirim pesan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (txtPesan.getText().contains("reservasi:")) {
                String hasil[] = txtPesan.getText().split(":");
                txtChat.append("Admin: " + txtPesan.getText() + "\n");
                status = 1;
                reservation(clients.get(cbNama.getSelectedIndex()), "reservasi;-" + hasil[1] + ";-" + String.valueOf(cbNama.getSelectedItem()) + ";-" + hasil[2]);
            } else if (txtPesan.getText().contains("cek tanggal:")) {
                String hasil[] = txtPesan.getText().split(":");
                txtChat.append("Admin: " + txtPesan.getText() + "\n");
                status = 1;
                checkDate(clients.get(cbNama.getSelectedIndex()), "cek tanggal;-" + hasil[1] + ";-" + hasil[2]);
            } else if (txtPesan.getText().equals("cek list rumah")) {
                txtChat.append("Admin: " + txtPesan.getText() + "\n");
                status = 1;
                checkListRumah(clients.get(cbNama.getSelectedIndex()));
            } else {
                txtChat.append("Admin: " + txtPesan.getText() + "\n");
                int idx = cbNama.getSelectedIndex();
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Calendar cal = Calendar.getInstance();
                String dateTime = dateFormat.format(cal.getTime());

                chat = new Chat("admin", String.valueOf(cbNama.getSelectedItem()), txtPesan.getText(), dateTime);
                chat.insert();

                clients.get(idx).sendChat("Admin: " + txtPesan.getText());
            }
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnHistoryChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryChatActionPerformed
        FormShowChat form = new FormShowChat();
        form.setVisible(true);
    }//GEN-LAST:event_btnHistoryChatActionPerformed

    private void cbNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNamaActionPerformed

    }//GEN-LAST:event_cbNamaActionPerformed

    private void btnCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCallActionPerformed
        FormCallServer formCallServer = new FormCallServer();
        formCallServer.setVisible(true);
    }//GEN-LAST:event_btnCallActionPerformed

    private void btnPanduanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanduanActionPerformed
        JOptionPane.showMessageDialog(this, "1. Untuk mengecek ketersediaan tanggal untuk reservasi, ketik: "
                + "'cek tanggal:<tanggal masuk> sampai <tanggal keluar>:<nama rumah>'"
                + "\n     Contoh: 'cek tanggal:2021-10-12 sampai 2021-12-12:Rumah A'"
                + "\n2. Untuk melakukan reservasi, ketik: 'reservasi:<tanggal masuk> sampai <tanggal keluar>:<nama rumah>'"
                + "\n     Contoh: 'reservasi:2021-10-12 sampai 2021-12-12:Rumah A'"
                + "\n3. Untuk melihat list rumah yang tersedia, ketik: 'cek list rumah'"
                + "\nNote: Penulisan tanggal dengan format: yyyy-MM-dd.", "Panduan", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnPanduanActionPerformed

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
            java.util.logging.Logger.getLogger(FormChatServer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormChatServer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormChatServer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormChatServer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormChatServer().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCall;
    private javax.swing.JButton btnHistoryChat;
    private javax.swing.JButton btnPanduan;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox<String> cbNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextField txtPesan;
    // End of variables declaration//GEN-END:variables

    private static String cekLogin(java.lang.String username, java.lang.String password) {
        serverapp_rental.Rental_Service service = new serverapp_rental.Rental_Service();
        serverapp_rental.Rental port = service.getRentalPort();
        return port.cekLogin(username, password);
    }

    private static String register(java.lang.String username, java.lang.String password, java.lang.String nama, java.lang.String nomorTelepon, java.lang.String alamat) {
        serverapp_rental.Rental_Service service = new serverapp_rental.Rental_Service();
        serverapp_rental.Rental port = service.getRentalPort();
        return port.register(username, password, nama, nomorTelepon, alamat);
    }

    private static String lacak(java.lang.String username, java.lang.String tanggalMasuk, java.lang.String tanggalKeluar) {
        serverapp_rental.Rental_Service service = new serverapp_rental.Rental_Service();
        serverapp_rental.Rental port = service.getRentalPort();
        return port.lacak(username, tanggalMasuk, tanggalKeluar);
    }

    private static String cekListRumah() {
        serverapp_rental.Rental_Service service = new serverapp_rental.Rental_Service();
        serverapp_rental.Rental port = service.getRentalPort();
        return port.cekListRumah();
    }

    private static String cekTanggal(java.lang.String tanggalMasuk, java.lang.String tanggalKeluar, java.lang.String namaRumah) {
        serverapp_rental.Rental_Service service = new serverapp_rental.Rental_Service();
        serverapp_rental.Rental port = service.getRentalPort();
        return port.cekTanggal(tanggalMasuk, tanggalKeluar, namaRumah);
    }

    private static String reservasi(java.lang.String tanggalMasuk, java.lang.String tanggalKeluar, java.lang.String username, java.lang.String namaRumah) {
        serverapp_rental.Rental_Service service = new serverapp_rental.Rental_Service();
        serverapp_rental.Rental port = service.getRentalPort();
        return port.reservasi(tanggalMasuk, tanggalKeluar, username, namaRumah);
    }
}
