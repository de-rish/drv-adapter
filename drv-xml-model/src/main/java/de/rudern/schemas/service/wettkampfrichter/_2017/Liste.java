
package de.rudern.schemas.service.wettkampfrichter._2017;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import io.github.threetenjaxb.core.LocalDateXmlAdapter;


/**
 * &lt;p&gt;Java-Klasse für anonymous complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{http://schemas.rudern.de/service/wettkampfrichter/2017}Wettkampfrichter" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="erstellt" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *       &amp;lt;anyAttribute/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wettkampfrichter",
    "any"
})
@XmlRootElement(name = "Liste")
public class Liste {

    @XmlElement(name = "Wettkampfrichter", namespace = "http://schemas.rudern.de/service/wettkampfrichter/2017")
    protected List<TWKR> wettkampfrichter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "erstellt")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate erstellt;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the wettkampfrichter property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the wettkampfrichter property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getWettkampfrichter().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TWKR }
     * 
     * 
     */
    public List<TWKR> getWettkampfrichter() {
        if (wettkampfrichter == null) {
            wettkampfrichter = new ArrayList<TWKR>();
        }
        return this.wettkampfrichter;
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
     * Ruft den Wert der erstellt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getErstellt() {
        return erstellt;
    }

    /**
     * Legt den Wert der erstellt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErstellt(LocalDate value) {
        this.erstellt = value;
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

    public void setWettkampfrichter(List<TWKR> value) {
        this.wettkampfrichter = null;
        if (value!= null) {
            List<TWKR> draftl = this.getWettkampfrichter();
            draftl.addAll(value);
        }
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
        final Liste that = ((Liste) object);
        {
            List<TWKR> leftWettkampfrichter;
            leftWettkampfrichter = (((this.wettkampfrichter!= null)&&(!this.wettkampfrichter.isEmpty()))?this.getWettkampfrichter():null);
            List<TWKR> rightWettkampfrichter;
            rightWettkampfrichter = (((that.wettkampfrichter!= null)&&(!that.wettkampfrichter.isEmpty()))?that.getWettkampfrichter():null);
            if ((this.wettkampfrichter!= null)&&(!this.wettkampfrichter.isEmpty())) {
                if ((that.wettkampfrichter!= null)&&(!that.wettkampfrichter.isEmpty())) {
                    if (!leftWettkampfrichter.equals(rightWettkampfrichter)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.wettkampfrichter!= null)&&(!that.wettkampfrichter.isEmpty())) {
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
            LocalDate leftErstellt;
            leftErstellt = this.getErstellt();
            LocalDate rightErstellt;
            rightErstellt = that.getErstellt();
            if (this.erstellt!= null) {
                if (that.erstellt!= null) {
                    if (!leftErstellt.equals(rightErstellt)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.erstellt!= null) {
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
            List<TWKR> theWettkampfrichter;
            theWettkampfrichter = (((this.wettkampfrichter!= null)&&(!this.wettkampfrichter.isEmpty()))?this.getWettkampfrichter():null);
            if ((this.wettkampfrichter!= null)&&(!this.wettkampfrichter.isEmpty())) {
                currentHashCode += theWettkampfrichter.hashCode();
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
            LocalDate theErstellt;
            theErstellt = this.getErstellt();
            if (this.erstellt!= null) {
                currentHashCode += theErstellt.hashCode();
            }
        }
        return currentHashCode;
    }

}
