
package com.rental.peter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reservasi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reservasi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tanggal_masuk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tanggal_keluar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nama_rumah" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reservasi", propOrder = {
    "tanggalMasuk",
    "tanggalKeluar",
    "username",
    "namaRumah"
})
public class Reservasi {

    @XmlElement(name = "tanggal_masuk")
    protected String tanggalMasuk;
    @XmlElement(name = "tanggal_keluar")
    protected String tanggalKeluar;
    protected String username;
    @XmlElement(name = "nama_rumah")
    protected String namaRumah;

    /**
     * Gets the value of the tanggalMasuk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    /**
     * Sets the value of the tanggalMasuk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalMasuk(String value) {
        this.tanggalMasuk = value;
    }

    /**
     * Gets the value of the tanggalKeluar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalKeluar() {
        return tanggalKeluar;
    }

    /**
     * Sets the value of the tanggalKeluar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalKeluar(String value) {
        this.tanggalKeluar = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the namaRumah property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaRumah() {
        return namaRumah;
    }

    /**
     * Sets the value of the namaRumah property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaRumah(String value) {
        this.namaRumah = value;
    }

}
