
package de.rudern.schemas.service.ergebnisse._2017;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für tAbmeldung complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tAbmeldung"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.rudern.de/service/ergebnisse/2017/}tBoot"&amp;gt;
 *       &amp;lt;attribute name="Grund" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAbmeldung")
public class TAbmeldung
    extends TBoot
{

    @XmlAttribute(name = "Grund")
    protected String grund;

    /**
     * Ruft den Wert der grund-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrund() {
        return grund;
    }

    /**
     * Legt den Wert der grund-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrund(String value) {
        this.grund = value;
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
        final TAbmeldung that = ((TAbmeldung) object);
        {
            String leftGrund;
            leftGrund = this.getGrund();
            String rightGrund;
            rightGrund = that.getGrund();
            if (this.grund!= null) {
                if (that.grund!= null) {
                    if (!leftGrund.equals(rightGrund)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.grund!= null) {
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
            String theGrund;
            theGrund = this.getGrund();
            if (this.grund!= null) {
                currentHashCode += theGrund.hashCode();
            }
        }
        return currentHashCode;
    }

}
