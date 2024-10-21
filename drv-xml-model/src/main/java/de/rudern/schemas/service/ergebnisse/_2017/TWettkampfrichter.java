
package de.rudern.schemas.service.ergebnisse._2017;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für tWettkampfrichter complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tWettkampfrichter"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.rudern.de/service/ergebnisse/2017/}tExtensible"&amp;gt;
 *       &amp;lt;sequence minOccurs="0"&amp;gt;
 *         &amp;lt;element name="Nachname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Vorname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Herkunft" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Lizenznummer" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tWettkampfrichter", propOrder = {
    "nachname",
    "vorname",
    "herkunft"
})
@XmlSeeAlso({
    TRegattaWKR.class
})
public class TWettkampfrichter
    extends TExtensible
{

    @XmlElement(name = "Nachname")
    protected String nachname;
    @XmlElement(name = "Vorname")
    protected String vorname;
    @XmlElement(name = "Herkunft")
    protected String herkunft;
    @XmlAttribute(name = "Lizenznummer")
    @XmlSchemaType(name = "unsignedInt")
    protected Long lizenznummer;

    /**
     * Ruft den Wert der nachname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * Legt den Wert der nachname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNachname(String value) {
        this.nachname = value;
    }

    /**
     * Ruft den Wert der vorname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Legt den Wert der vorname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorname(String value) {
        this.vorname = value;
    }

    /**
     * Ruft den Wert der herkunft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHerkunft() {
        return herkunft;
    }

    /**
     * Legt den Wert der herkunft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHerkunft(String value) {
        this.herkunft = value;
    }

    /**
     * Ruft den Wert der lizenznummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLizenznummer() {
        return lizenznummer;
    }

    /**
     * Legt den Wert der lizenznummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLizenznummer(Long value) {
        this.lizenznummer = value;
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
        final TWettkampfrichter that = ((TWettkampfrichter) object);
        {
            String leftNachname;
            leftNachname = this.getNachname();
            String rightNachname;
            rightNachname = that.getNachname();
            if (this.nachname!= null) {
                if (that.nachname!= null) {
                    if (!leftNachname.equals(rightNachname)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nachname!= null) {
                    return false;
                }
            }
        }
        {
            String leftVorname;
            leftVorname = this.getVorname();
            String rightVorname;
            rightVorname = that.getVorname();
            if (this.vorname!= null) {
                if (that.vorname!= null) {
                    if (!leftVorname.equals(rightVorname)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.vorname!= null) {
                    return false;
                }
            }
        }
        {
            String leftHerkunft;
            leftHerkunft = this.getHerkunft();
            String rightHerkunft;
            rightHerkunft = that.getHerkunft();
            if (this.herkunft!= null) {
                if (that.herkunft!= null) {
                    if (!leftHerkunft.equals(rightHerkunft)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.herkunft!= null) {
                    return false;
                }
            }
        }
        {
            Long leftLizenznummer;
            leftLizenznummer = this.getLizenznummer();
            Long rightLizenznummer;
            rightLizenznummer = that.getLizenznummer();
            if (this.lizenznummer!= null) {
                if (that.lizenznummer!= null) {
                    if (!leftLizenznummer.equals(rightLizenznummer)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.lizenznummer!= null) {
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
            String theNachname;
            theNachname = this.getNachname();
            if (this.nachname!= null) {
                currentHashCode += theNachname.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theVorname;
            theVorname = this.getVorname();
            if (this.vorname!= null) {
                currentHashCode += theVorname.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theHerkunft;
            theHerkunft = this.getHerkunft();
            if (this.herkunft!= null) {
                currentHashCode += theHerkunft.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theLizenznummer;
            theLizenznummer = this.getLizenznummer();
            if (this.lizenznummer!= null) {
                currentHashCode += theLizenznummer.hashCode();
            }
        }
        return currentHashCode;
    }

}
