/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rental.peter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laptop
 */
public class Pengguna {
    private String username;
    private String password;
    private String nama;
    private String no_telp;
    private String alamat;

    private Connection connect;
    private ResultSet result;
    private Statement stat;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/uas_anakrektor", "root", "");
        } catch (Exception ex) {
            Logger.getLogger(Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }

    public Pengguna() {
        getConnection();
        this.username = "";
        this.password = "";
    }

    public Pengguna(String username, String password) {
        getConnection();
        this.username = "";
        this.password = "";
    }

    public Pengguna(String username, String password, String nama, String no_telp, String alamat) {
        getConnection();
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.no_telp = no_telp;
        this.alamat = alamat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public ArrayList<String> displayToString() {
        ArrayList<String> temp = new ArrayList<String>();
        try {
            stat = (Statement) connect.createStatement();

            result = stat.executeQuery("select * from pengguna");
            while (result.next()) {
                Pengguna p = new Pengguna(
                        result.getString("username"),
                        result.getString("password"),
                        result.getString("nama"),
                        result.getString("no_telp"),
                        result.getString("alamat"));
                temp.add(p.username + "-" + p.password);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

    public void insert() {
        try {
            stat = (Statement) connect.createStatement();
            if (!connect.isClosed()) {
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement("insert into pengguna(username, password, nama, no_telp, alamat) values (?, ?, ?, ?, ?)");
                sql.setString(1, username);
                sql.setString(2, password);
                sql.setString(3, nama);
                sql.setString(4, no_telp);
                sql.setString(5, alamat);
                sql.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
