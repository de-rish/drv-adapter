
package de.rudern.schemas.service.ergebnisse._2017;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für tBootErgebnis complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tBootErgebnis"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.rudern.de/service/ergebnisse/2017/}tBoot"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Ergebnis" type="{http://schemas.rudern.de/service/ergebnisse/2017/}tErgebnis" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBootErgebnis", propOrder = {
    "ergebnis"
})
public class TBootErgebnis
    extends TBoot
{

    @XmlElement(name = "Ergebnis")
    protected TErgebnis ergebnis;

    /**
     * Ruft den Wert der ergebnis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TErgebnis }
     *     
     */
    public TErgebnis getErgebnis() {
        return ergebnis;
    }

    /**
     * Legt den Wert der ergebnis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TErgebnis }
     *     
     */
    public void setErgebnis(TErgebnis value) {
        this.ergebnis = value;
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
        final TBootErgebnis that = ((TBootErgebnis) object);
        {
            TErgebnis leftErgebnis;
            leftErgebnis = this.getErgebnis();
            TErgebnis rightErgebnis;
            rightErgebnis = that.getErgebnis();
            if (this.ergebnis!= null) {
                if (that.ergebnis!= null) {
                    if (!leftErgebnis.equals(rightErgebnis)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.ergebnis!= null) {
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
            TErgebnis theErgebnis;
            theErgebnis = this.getErgebnis();
            if (this.ergebnis!= null) {
                currentHashCode += theErgebnis.hashCode();
            }
        }
        return currentHashCode;
    }

}
