/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapp_rental;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class HandleSocket extends Thread {

    FormChatServer parent;
    Socket client;
    DataOutputStream out;
    BufferedReader in;
    Chat chat;

    public HandleSocket(FormChatServer _parent, Socket _client) {
        try {
            this.parent = _parent;
            this.client = _client;
            out = new DataOutputStream(client.getOutputStream());
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        } catch (Exception ex) {
            System.out.println("error di hs constructor = " + ex);
        }
    }

    public void run() {
        while (true) {
            try {
                String msg = in.readLine();

                if (msg.contains("register;-")) {
                    parent.userRegister(this, msg);
                } else if (msg.contains("login;-")) {
                    parent.userLogin(this, msg);
                } else if (msg.contains("cek tanggal;-")) {
                    parent.checkDate(this, msg);
                } else if (msg.contains("reservasi;-")) {
                    parent.reservation(this, msg);
                } else if (msg.contains("showchatclient;-")) {
                    parent.showChatClient(this, msg);
                } else if (msg.contains("lacak;-")) {
                    parent.track(this, msg);
                } else if (msg.equals("cek list rumah")) {
                    parent.checkListRumah(this);
                } else {
                    parent.insertChat(msg);
                }
            } catch (IOException ex) {
                Logger.getLogger(HandleSocket.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void sendChat(String msg) {
        try {
            out.writeBytes(msg + "\n");
        } catch (IOException ex) {
            System.out.println("error hs sendChat = " + ex);
        }
    }
}
