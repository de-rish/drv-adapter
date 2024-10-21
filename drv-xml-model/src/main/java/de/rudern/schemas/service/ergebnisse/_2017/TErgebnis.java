
package de.rudern.schemas.service.ergebnisse._2017;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * &lt;p&gt;Java-Klasse für tErgebnis complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tErgebnis"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.rudern.de/service/ergebnisse/2017/}tExtensible"&amp;gt;
 *       &amp;lt;attribute name="Rang" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&amp;gt;
 *       &amp;lt;attribute name="Zeit" type="{http://www.w3.org/2001/XMLSchema}duration" /&amp;gt;
 *       &amp;lt;attribute name="Delta" type="{http://www.w3.org/2001/XMLSchema}duration" /&amp;gt;
 *       &amp;lt;attribute name="Zeitkorrektur" type="{http://www.w3.org/2001/XMLSchema}duration" /&amp;gt;
 *       &amp;lt;attribute name="Bemerkung" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tErgebnis")
public class TErgebnis
    extends TExtensible
{

    @XmlAttribute(name = "Rang")
    @XmlSchemaType(name = "unsignedInt")
    protected Long rang;
    @XmlAttribute(name = "Zeit")
    protected Duration zeit;
    @XmlAttribute(name = "Delta")
    protected Duration delta;
    @XmlAttribute(name = "Zeitkorrektur")
    protected Duration zeitkorrektur;
    @XmlAttribute(name = "Bemerkung")
    protected String bemerkung;

    /**
     * Ruft den Wert der rang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRang() {
        return rang;
    }

    /**
     * Legt den Wert der rang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRang(Long value) {
        this.rang = value;
    }

    /**
     * Ruft den Wert der zeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getZeit() {
        return zeit;
    }

    /**
     * Legt den Wert der zeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setZeit(Duration value) {
        this.zeit = value;
    }

    /**
     * Ruft den Wert der delta-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDelta() {
        return delta;
    }

    /**
     * Legt den Wert der delta-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDelta(Duration value) {
        this.delta = value;
    }

    /**
     * Ruft den Wert der zeitkorrektur-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getZeitkorrektur() {
        return zeitkorrektur;
    }

    /**
     * Legt den Wert der zeitkorrektur-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setZeitkorrektur(Duration value) {
        this.zeitkorrektur = value;
    }

    /**
     * Ruft den Wert der bemerkung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Legt den Wert der bemerkung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBemerkung(String value) {
        this.bemerkung = value;
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
        final TErgebnis that = ((TErgebnis) object);
        {
            Long leftRang;
            leftRang = this.getRang();
            Long rightRang;
            rightRang = that.getRang();
            if (this.rang!= null) {
                if (that.rang!= null) {
                    if (!leftRang.equals(rightRang)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.rang!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftZeit;
            leftZeit = this.getZeit();
            Duration rightZeit;
            rightZeit = that.getZeit();
            if (this.zeit!= null) {
                if (that.zeit!= null) {
                    if (!leftZeit.equals(rightZeit)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.zeit!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftDelta;
            leftDelta = this.getDelta();
            Duration rightDelta;
            rightDelta = that.getDelta();
            if (this.delta!= null) {
                if (that.delta!= null) {
                    if (!leftDelta.equals(rightDelta)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.delta!= null) {
                    return false;
                }
            }
        }
        {
            Duration leftZeitkorrektur;
            leftZeitkorrektur = this.getZeitkorrektur();
            Duration rightZeitkorrektur;
            rightZeitkorrektur = that.getZeitkorrektur();
            if (this.zeitkorrektur!= null) {
                if (that.zeitkorrektur!= null) {
                    if (!leftZeitkorrektur.equals(rightZeitkorrektur)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.zeitkorrektur!= null) {
                    return false;
                }
            }
        }
        {
            String leftBemerkung;
            leftBemerkung = this.getBemerkung();
            String rightBemerkung;
            rightBemerkung = that.getBemerkung();
            if (this.bemerkung!= null) {
                if (that.bemerkung!= null) {
                    if (!leftBemerkung.equals(rightBemerkung)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.bemerkung!= null) {
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
            Long theRang;
            theRang = this.getRang();
            if (this.rang!= null) {
                currentHashCode += theRang.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theZeit;
            theZeit = this.getZeit();
            if (this.zeit!= null) {
                currentHashCode += theZeit.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theDelta;
            theDelta = this.getDelta();
            if (this.delta!= null) {
                currentHashCode += theDelta.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Duration theZeitkorrektur;
            theZeitkorrektur = this.getZeitkorrektur();
            if (this.zeitkorrektur!= null) {
                currentHashCode += theZeitkorrektur.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theBemerkung;
            theBemerkung = this.getBemerkung();
            if (this.bemerkung!= null) {
                currentHashCode += theBemerkung.hashCode();
            }
        }
        return currentHashCode;
    }

}
