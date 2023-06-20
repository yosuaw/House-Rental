
package serverapp_rental;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CekTanggal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CekTanggal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tanggal_masuk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tanggal_keluar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nama_rumah" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CekTanggal", propOrder = {
    "tanggalMasuk",
    "tanggalKeluar",
    "namaRumah"
})
public class CekTanggal {

    @XmlElement(name = "tanggal_masuk")
    protected String tanggalMasuk;
    @XmlElement(name = "tanggal_keluar")
    protected String tanggalKeluar;
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
