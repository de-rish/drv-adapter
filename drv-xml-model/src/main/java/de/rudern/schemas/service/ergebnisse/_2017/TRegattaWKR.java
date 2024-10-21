
package de.rudern.schemas.service.ergebnisse._2017;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für tRegattaWKR complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tRegattaWKR"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.rudern.de/service/ergebnisse/2017/}tWettkampfrichter"&amp;gt;
 *       &amp;lt;attribute name="IstObmann" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRegattaWKR")
public class TRegattaWKR
    extends TWettkampfrichter
{

    @XmlAttribute(name = "IstObmann")
    protected Boolean istObmann;

    /**
     * Ruft den Wert der istObmann-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstObmann() {
        return istObmann;
    }

    /**
     * Legt den Wert der istObmann-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstObmann(Boolean value) {
        this.istObmann = value;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        final TRegattaWKR that = ((TRegattaWKR) object);
        {
            Boolean leftIstObmann;
            leftIstObmann = this.isIstObmann();
            Boolean rightIstObmann;
            rightIstObmann = that.isIstObmann();
            if (this.istObmann!= null) {
                if (that.istObmann!= null) {
                    if (!leftIstObmann.equals(rightIstObmann)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.istObmann!= null) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        currentHashCode = ((currentHashCode* 31)+ super.hashCode());
        {
            currentHashCode = (currentHashCode* 31);
            Boolean theIstObmann;
            theIstObmann = this.isIstObmann();
            if (this.istObmann!= null) {
                currentHashCode += theIstObmann.hashCode();
            }
        }
        return currentHashCode;
    }

}
