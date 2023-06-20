/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rental.peter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Laptop
 */
@WebService(serviceName = "Rental")
public class Rental {

    Pengguna model = new Pengguna();
    Riwayat riwayat;
    Properti properti;
    ArrayList<String> listOfUser = new ArrayList<String>();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CekTanggal")
    public String CekTanggal(@WebParam(name = "tanggal_masuk") String tanggal_masuk, @WebParam(name = "tanggal_keluar") String tanggal_keluar, @WebParam(name = "nama_rumah") String nama_rumah) {
        String hasil = "gagal";
        try {
            properti = new Properti();
            if (properti.cekRumah(nama_rumah).equals("true")) {
                DateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
                Date dateMasuk = (java.util.Date) parser.parse(tanggal_masuk);
                Date dateKeluar = (java.util.Date) parser.parse(tanggal_keluar);

                riwayat = new Riwayat(dateMasuk, dateKeluar, 0, "", nama_rumah);
                hasil = riwayat.cekTanggal();
            }
        } catch (ParseException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Reservasi")
    public String Reservasi(@WebParam(name = "tanggal_masuk") String tanggal_masuk, @WebParam(name = "tanggal_keluar") String tanggal_keluar, @WebParam(name = "username") String username,
            @WebParam(name = "nama_rumah") String nama_rumah) {
        String hasil = "gagal:0";
        try {
            properti = new Properti();
            if (properti.cekRumah(nama_rumah).equals("true")) {
                DateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
                Date dateMasuk = (java.util.Date) parser.parse(tanggal_masuk);
                Date dateKeluar = (java.util.Date) parser.parse(tanggal_keluar);

                long diff = dateKeluar.getTime() - dateMasuk.getTime();
                long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

                properti = new Properti(nama_rumah);

                int harga = (int) days * properti.cekHarga();

                riwayat = new Riwayat(dateMasuk, dateKeluar, harga, username, nama_rumah);

                if (riwayat.cekTanggal().equals("sukses")) {
                    riwayat.reservasi();
                    hasil = "sukses:" + String.valueOf(harga);
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CekLogin")
    public String CekLogin(@WebParam(name = "username") String username,
            @WebParam(name = "password") String password
    ) {
        listOfUser = model.displayToString();
        String status = "";

        for (int i = 0; i < listOfUser.size(); i++) {
            String[] user = listOfUser.get(i).split("-");
            if (username.equals(user[0]) && password.equals(user[1])) {
                status = "sukses";
                break;
            } else {
                status = "gagal";
            }
        }
        return status;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Register")
    public String Register(@WebParam(name = "username") String username,
            @WebParam(name = "password") String password,
            @WebParam(name = "nama") String nama,
            @WebParam(name = "nomor_telepon") String nomor_telepon,
            @WebParam(name = "alamat") String alamat
    ) {
        listOfUser = model.displayToString();
        String status = "";
        for (int i = 0; i < listOfUser.size(); i++) {
            String[] user = listOfUser.get(i).split("-");
            if (username.equals(user[0])) {
                status = "gagal";
                break;
            } else {
                status = "sukses";
            }
        }
        if (status.equals("sukses")) {
            model = new Pengguna(username, password, nama, nomor_telepon, alamat);
            model.insert();
        }
        return status;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Lacak")
    public String Lacak(@WebParam(name = "username") String username,
            @WebParam(name = "tanggal_masuk") String tanggal_masuk,
            @WebParam(name = "tanggal_keluar") String tanggal_keluar
    ) {
        String hasil = "tidak";
        try {
            DateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
            Date dateMasuk = (java.util.Date) parser.parse(tanggal_masuk);
            Date dateKeluar = (java.util.Date) parser.parse(tanggal_keluar);

            riwayat = new Riwayat(dateMasuk, dateKeluar, username);

            if (riwayat.lacak().equals("ada")) {
                hasil = "ada";
            }
        } catch (ParseException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CekListRumah")
    public String CekListRumah() {
        //TODO write your implementation code here:
        String hasil = "";
        properti = new Properti();

        hasil = properti.cekListRumah();
        return hasil;
    }
}
