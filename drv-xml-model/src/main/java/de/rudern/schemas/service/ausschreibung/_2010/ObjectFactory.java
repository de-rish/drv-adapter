
package de.rudern.schemas.service.ausschreibung._2010;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.rudern.schemas.service.ausschreibung._2010 package. 
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

    private final static QName _Ausschreibungen_QNAME = new QName("http://schemas.rudern.de/service/ausschreibung/2010/", "ausschreibungen");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.rudern.schemas.service.ausschreibung._2010
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TRennen }
     * 
     */
    public TRennen createTRennen() {
        return new TRennen();
    }

    /**
     * Create an instance of {@link TRennen.Parameters }
     * 
     */
    public TRennen.Parameters createTRennenParameters() {
        return new TRennen.Parameters();
    }

    /**
     * Create an instance of {@link TAngaben }
     * 
     */
    public TAngaben createTAngaben() {
        return new TAngaben();
    }

    /**
     * Create an instance of {@link TAusschreibung }
     * 
     */
    public TAusschreibung createTAusschreibung() {
        return new TAusschreibung();
    }

    /**
     * Create an instance of {@link TRegatta }
     * 
     */
    public TRegatta createTRegatta() {
        return new TRegatta();
    }

    /**
     * Create an instance of {@link TVeranstalter }
     * 
     */
    public TVeranstalter createTVeranstalter() {
        return new TVeranstalter();
    }

    /**
     * Create an instance of {@link TRennen.Parameters.Param }
     * 
     */
    public TRennen.Parameters.Param createTRennenParametersParam() {
        return new TRennen.Parameters.Param();
    }

    /**
     * Create an instance of {@link TAngaben.Bestimmung }
     * 
     */
    public TAngaben.Bestimmung createTAngabenBestimmung() {
        return new TAngaben.Bestimmung();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAusschreibung }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TAusschreibung }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.rudern.de/service/ausschreibung/2010/", name = "ausschreibungen")
    public JAXBElement<TAusschreibung> createAusschreibungen(TAusschreibung value) {
        return new JAXBElement<TAusschreibung>(_Ausschreibungen_QNAME, TAusschreibung.class, null, value);
    }

}
