
package de.rudern.schemas.service.wettkampfrichter._2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java-Klasse für tWKR complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tWKR"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Vorname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Nachname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Ort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="Lizenznummer" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tWKR", propOrder = {
    "vorname",
    "nachname",
    "ort",
    "region",
    "any"
})
public class TWKR {

    @XmlElement(name = "Vorname", required = true)
    protected String vorname;
    @XmlElement(name = "Nachname", required = true)
    protected String nachname;
    @XmlElement(name = "Ort")
    protected String ort;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "Lizenznummer")
    @XmlSchemaType(name = "unsignedInt")
    protected Long lizenznummer;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Ruft den Wert der ort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Legt den Wert der ort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Ruft den Wert der region-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Legt den Wert der region-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the any property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAny().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * &lt;p&gt;
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public void setAny(List<Object> value) {
        this.any = null;
        if (value!= null) {
            List<Object> draftl = this.getAny();
            draftl.addAll(value);
        }
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TWKR that = ((TWKR) object);
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
            String leftOrt;
            leftOrt = this.getOrt();
            String rightOrt;
            rightOrt = that.getOrt();
            if (this.ort!= null) {
                if (that.ort!= null) {
                    if (!leftOrt.equals(rightOrt)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.ort!= null) {
                    return false;
                }
            }
        }
        {
            String leftRegion;
            leftRegion = this.getRegion();
            String rightRegion;
            rightRegion = that.getRegion();
            if (this.region!= null) {
                if (that.region!= null) {
                    if (!leftRegion.equals(rightRegion)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.region!= null) {
                    return false;
                }
            }
        }
        {
            List<Object> leftAny;
            leftAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            List<Object> rightAny;
            rightAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
            if ((this.any!= null)&&(!this.any.isEmpty())) {
                if ((that.any!= null)&&(!that.any.isEmpty())) {
                    if (!leftAny.equals(rightAny)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.any!= null)&&(!that.any.isEmpty())) {
                    return false;
                }
            }
        }
        {
            String leftStatus;
            leftStatus = this.getStatus();
            String rightStatus;
            rightStatus = that.getStatus();
            if (this.status!= null) {
                if (that.status!= null) {
                    if (!leftStatus.equals(rightStatus)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.status!= null) {
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
            String theNachname;
            theNachname = this.getNachname();
            if (this.nachname!= null) {
                currentHashCode += theNachname.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theOrt;
            theOrt = this.getOrt();
            if (this.ort!= null) {
                currentHashCode += theOrt.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theRegion;
            theRegion = this.getRegion();
            if (this.region!= null) {
                currentHashCode += theRegion.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<Object> theAny;
            theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            if ((this.any!= null)&&(!this.any.isEmpty())) {
                currentHashCode += theAny.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theStatus;
            theStatus = this.getStatus();
            if (this.status!= null) {
                currentHashCode += theStatus.hashCode();
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
