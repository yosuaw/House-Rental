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
 * @author ACER
 */
public class Properti {

    private String nama_rumah;
    private String alamat;
    private Integer harga;

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

    public Properti() {
        getConnection();
    }

    public Properti(String nama_rumah) {
        getConnection();
        this.nama_rumah = nama_rumah;
    }

    public Properti(String nama_rumah, String alamat, Integer harga) {
        getConnection();
        this.nama_rumah = nama_rumah;
        this.alamat = alamat;
        this.harga = harga;
    }

    public String getNama_rumah() {
        return nama_rumah;
    }

    public void setNama_rumah(String nama_rumah) {
        this.nama_rumah = nama_rumah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer cekHarga() {
        Integer hasil = 0;
        try {
            if (!connect.isClosed()) {
                stat = (Statement) connect.createStatement();
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement("select harga from properti where nama_rumah = ?");
                sql.setString(1, nama_rumah);
                result = sql.executeQuery();

                if (result.next() == true) {
                    hasil = result.getInt("harga");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Riwayat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }

    public String cekListRumah() {
        String hasil = "";
        try {
            stat = (Statement) connect.createStatement();

            result = stat.executeQuery("Select * from properti");

            while (result.next()) {
                hasil += result.getString("nama_rumah") + ";";
                hasil += result.getString("alamat") + ";";
                hasil += result.getInt("harga") + "&";
            }
        } catch (SQLException ex) {
            Logger.getLogger(Riwayat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }

    public String cekRumah(String namaRumah) {
        String hasilAkhir = "false";
        try {
            stat = (Statement) connect.createStatement();

            result = stat.executeQuery("Select * from properti");
            ArrayList<String> hasil = new ArrayList<String>();
            
            while (result.next()) {
                hasil.add(result.getString("nama_rumah"));
            }

            for (int i = 0; i < hasil.size(); i++) {
                if (hasil.get(i).equals(namaRumah)) {
                    hasilAkhir = "true";
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Riwayat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasilAkhir;
    }
}
