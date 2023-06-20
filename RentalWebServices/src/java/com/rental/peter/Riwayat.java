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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laptop
 */
public class Riwayat {

    private Date tanggal_masuk;
    private Date tanggal_keluar;
    private Integer harga_total;
    private String username;
    private String nama_rumah;

    private Connection connect;
    private ResultSet result;
    private Statement stat;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/uas_anakrektor", "root", "");
        } catch (Exception ex) {
            Logger.getLogger(Riwayat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }

    public Riwayat(Date tanggal_masuk, Date tanggal_keluar, String username) {
        getConnection();
        this.tanggal_masuk = tanggal_masuk;
        this.tanggal_keluar = tanggal_keluar;
        this.username = username;
    }
    
    public Riwayat(Date tanggal_masuk, Date tanggal_keluar, Integer harga_total, String username, String nama_rumah) {
        getConnection();
        this.tanggal_masuk = tanggal_masuk;
        this.tanggal_keluar = tanggal_keluar;
        this.harga_total = harga_total;
        this.username = username;
        this.nama_rumah = nama_rumah;
    }

    public Date getTanggal_masuk() {
        return tanggal_masuk;
    }

    public void setTanggal_masuk(Date tanggal_masuk) {
        this.tanggal_masuk = tanggal_masuk;
    }

    public Date getTanggal_keluar() {
        return tanggal_keluar;
    }

    public void setTanggal_keluar(Date tanggal_keluar) {
        this.tanggal_keluar = tanggal_keluar;
    }

    public Integer getHarga_total() {
        return harga_total;
    }

    public void setHarga_total(Integer harga_total) {
        this.harga_total = harga_total;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama_rumah() {
        return nama_rumah;
    }

    public void setNama_rumah(String nama_rumah) {
        this.nama_rumah = nama_rumah;
    }
    
    public String cekTanggal() {
        String hasil = "sukses";
        try {
            if (!connect.isClosed()) {
                stat = (Statement) connect.createStatement();
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement("select * from riwayat where (tanggal_masuk >= ? AND tanggal_keluar <= ?) AND nama_rumah = ?");
                java.sql.Date sqlDate1 = new java.sql.Date(tanggal_masuk.getTime());
                java.sql.Date sqlDate2 = new java.sql.Date(tanggal_keluar.getTime());
                sql.setDate(1, sqlDate1);
                sql.setDate(2, sqlDate2);
                sql.setString(3, getNama_rumah());
                result = sql.executeQuery();
                
                if (result.next() == true) {
                    hasil = "gagal";                    
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Riwayat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }

    public void reservasi() {
        try {
            if (!connect.isClosed()) {
                stat = (Statement) connect.createStatement();
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement("insert into riwayat"
                        + "(tanggal_masuk, tanggal_keluar, harga_total, username, nama_rumah) values (?, ?, ?, ?, ?)");
                java.sql.Date sqlDate1 = new java.sql.Date(tanggal_masuk.getTime());
                java.sql.Date sqlDate2 = new java.sql.Date(tanggal_keluar.getTime());

                sql.setDate(1, sqlDate1);
                sql.setDate(2, sqlDate2);
                sql.setInt(3, getHarga_total());
                sql.setString(4, getUsername());
                sql.setString(5, getNama_rumah());
                sql.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Riwayat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String lacak() {
        String hasil = "tidak ada";
        try {
            if (!connect.isClosed()) {
                stat = (Statement) connect.createStatement();
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement("select * from riwayat where tanggal_masuk = ?  AND tanggal_keluar = ? AND username = ?");
                java.sql.Date sqlDate1 = new java.sql.Date(tanggal_masuk.getTime());
                java.sql.Date sqlDate2 = new java.sql.Date(tanggal_keluar.getTime());
                sql.setDate(1, sqlDate1);
                sql.setDate(2, sqlDate2);
                sql.setString(3, username);
                result = sql.executeQuery();

                if (result.next() == true) {
                    hasil = "ada";
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Riwayat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
}
