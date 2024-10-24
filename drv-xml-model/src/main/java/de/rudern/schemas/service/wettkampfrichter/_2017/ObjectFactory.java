
package de.rudern.schemas.service.wettkampfrichter._2017;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.rudern.schemas.service.wettkampfrichter._2017 package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _Wettkampfrichter_QNAME = new QName("http://schemas.rudern.de/service/wettkampfrichter/2017", "Wettkampfrichter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.rudern.schemas.service.wettkampfrichter._2017
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Liste }
     * 
     */
    public Liste createListe() {
        return new Liste();
    }

    /**
     * Create an instance of {@link TWKR }
     * 
     */
    public TWKR createTWKR() {
        return new TWKR();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TWKR }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TWKR }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.rudern.de/service/wettkampfrichter/2017", name = "Wettkampfrichter")
    public JAXBElement<TWKR> createWettkampfrichter(TWKR value) {
        return new JAXBElement<TWKR>(_Wettkampfrichter_QNAME, TWKR.class, null, value);
    }

}
