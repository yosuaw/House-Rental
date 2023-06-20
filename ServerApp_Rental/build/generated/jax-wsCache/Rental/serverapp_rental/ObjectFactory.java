
package serverapp_rental;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serverapp_rental package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CekLogin_QNAME = new QName("http://peter.rental.com/", "CekLogin");
    private final static QName _LacakResponse_QNAME = new QName("http://peter.rental.com/", "LacakResponse");
    private final static QName _CekLoginResponse_QNAME = new QName("http://peter.rental.com/", "CekLoginResponse");
    private final static QName _Reservasi_QNAME = new QName("http://peter.rental.com/", "Reservasi");
    private final static QName _CekListRumah_QNAME = new QName("http://peter.rental.com/", "CekListRumah");
    private final static QName _CekTanggal_QNAME = new QName("http://peter.rental.com/", "CekTanggal");
    private final static QName _CekTanggalResponse_QNAME = new QName("http://peter.rental.com/", "CekTanggalResponse");
    private final static QName _Register_QNAME = new QName("http://peter.rental.com/", "Register");
    private final static QName _ReservasiResponse_QNAME = new QName("http://peter.rental.com/", "ReservasiResponse");
    private final static QName _Lacak_QNAME = new QName("http://peter.rental.com/", "Lacak");
    private final static QName _CekListRumahResponse_QNAME = new QName("http://peter.rental.com/", "CekListRumahResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://peter.rental.com/", "RegisterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serverapp_rental
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CekListRumahResponse }
     * 
     */
    public CekListRumahResponse createCekListRumahResponse() {
        return new CekListRumahResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link Lacak }
     * 
     */
    public Lacak createLacak() {
        return new Lacak();
    }

    /**
     * Create an instance of {@link CekTanggal }
     * 
     */
    public CekTanggal createCekTanggal() {
        return new CekTanggal();
    }

    /**
     * Create an instance of {@link CekTanggalResponse }
     * 
     */
    public CekTanggalResponse createCekTanggalResponse() {
        return new CekTanggalResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link ReservasiResponse }
     * 
     */
    public ReservasiResponse createReservasiResponse() {
        return new ReservasiResponse();
    }

    /**
     * Create an instance of {@link CekListRumah }
     * 
     */
    public CekListRumah createCekListRumah() {
        return new CekListRumah();
    }

    /**
     * Create an instance of {@link CekLoginResponse }
     * 
     */
    public CekLoginResponse createCekLoginResponse() {
        return new CekLoginResponse();
    }

    /**
     * Create an instance of {@link Reservasi }
     * 
     */
    public Reservasi createReservasi() {
        return new Reservasi();
    }

    /**
     * Create an instance of {@link CekLogin }
     * 
     */
    public CekLogin createCekLogin() {
        return new CekLogin();
    }

    /**
     * Create an instance of {@link LacakResponse }
     * 
     */
    public LacakResponse createLacakResponse() {
        return new LacakResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.rental.com/", name = "CekLogin")
    public JAXBElement<CekLogin> createCekLogin(CekLogin value) {
        return new JAXBElement<CekLogin>(_CekLogin_QNAME, CekLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LacakResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.rental.com/", name = "LacakResponse")
    public JAXBElement<LacakResponse> createLacakResponse(LacakResponse value) {
        return new JAXBElement<LacakResponse>(_LacakResponse_QNAME, LacakResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.rental.com/", name = "CekLoginResponse")
    public JAXBElement<CekLoginResponse> createCekLoginResponse(CekLoginResponse value) {
        return new JAXBElement<CekLoginResponse>(_CekLoginResponse_QNAME, CekLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reservasi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.rental.com/", name = "Reservasi")
    public JAXBElement<Reservasi> createReservasi(Reservasi value) {
        return new JAXBElement<Reservasi>(_Reservasi_QNAME, Reservasi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekListRumah }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.rental.com/", name = "CekListRumah")
    public JAXBElement<CekListRumah> createCekListRumah(CekListRumah value) {
        return new JAXBElement<CekListRumah>(_CekListRumah_QNAME, CekListRumah.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekTanggal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.rental.com/", name = "CekTanggal")
    public JAXBElement<CekTanggal> createCekTanggal(CekTanggal value) {
        return new JAXBElement<CekTanggal>(_CekTanggal_QNAME, CekTanggal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekTanggalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.rental.com/", name = "CekTanggalResponse")
    public JAXBElement<CekTanggalResponse> createCekTanggalResponse(CekTanggalResponse value) {
        return new JAXBElement<CekTanggalResponse>(_CekTanggalResponse_QNAME, CekTanggalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.rental.com/", name = "Register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservasiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.rental.com/", name = "ReservasiResponse")
    public JAXBElement<ReservasiResponse> createReservasiResponse(ReservasiResponse value) {
        return new JAXBElement<ReservasiResponse>(_ReservasiResponse_QNAME, ReservasiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lacak }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.rental.com/", name = "Lacak")
    public JAXBElement<Lacak> createLacak(Lacak value) {
        return new JAXBElement<Lacak>(_Lacak_QNAME, Lacak.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekListRumahResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.rental.com/", name = "CekListRumahResponse")
    public JAXBElement<CekListRumahResponse> createCekListRumahResponse(CekListRumahResponse value) {
        return new JAXBElement<CekListRumahResponse>(_CekListRumahResponse_QNAME, CekListRumahResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.rental.com/", name = "RegisterResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

}
