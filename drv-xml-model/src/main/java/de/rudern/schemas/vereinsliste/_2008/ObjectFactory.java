
package de.rudern.schemas.vereinsliste._2008;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.rudern.schemas.vereinsliste._2008 package. 
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

    private final static QName _Vereine_QNAME = new QName("http://schemas.rudern.de/vereinsliste/2008/", "vereine");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.rudern.schemas.vereinsliste._2008
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TVereine }
     * 
     */
    public TVereine createTVereine() {
        return new TVereine();
    }

    /**
     * Create an instance of {@link TVerein }
     * 
     */
    public TVerein createTVerein() {
        return new TVerein();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TVereine }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TVereine }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.rudern.de/vereinsliste/2008/", name = "vereine")
    public JAXBElement<TVereine> createVereine(TVereine value) {
        return new JAXBElement<TVereine>(_Vereine_QNAME, TVereine.class, null, value);
    }

}
