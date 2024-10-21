
package de.rudern.schemas.vereinsliste._2008;

import java.math.BigInteger;
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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java-Klasse für tVerein complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tVerein"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="kurzform" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="lettern" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tVerein", propOrder = {
    "name",
    "ort",
    "kurzform",
    "lettern",
    "any"
})
public class TVerein {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String ort;
    @XmlElement(required = true)
    protected String kurzform;
    @XmlElement(required = true)
    protected String lettern;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Ruft den Wert der kurzform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurzform() {
        return kurzform;
    }

    /**
     * Legt den Wert der kurzform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurzform(String value) {
        this.kurzform = value;
    }

    /**
     * Ruft den Wert der lettern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLettern() {
        return lettern;
    }

    /**
     * Legt den Wert der lettern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLettern(String value) {
        this.lettern = value;
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
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
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
        final TVerein that = ((TVerein) object);
        {
            String leftName;
            leftName = this.getName();
            String rightName;
            rightName = that.getName();
            if (this.name!= null) {
                if (that.name!= null) {
                    if (!leftName.equals(rightName)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.name!= null) {
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
            String leftKurzform;
            leftKurzform = this.getKurzform();
            String rightKurzform;
            rightKurzform = that.getKurzform();
            if (this.kurzform!= null) {
                if (that.kurzform!= null) {
                    if (!leftKurzform.equals(rightKurzform)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.kurzform!= null) {
                    return false;
                }
            }
        }
        {
            String leftLettern;
            leftLettern = this.getLettern();
            String rightLettern;
            rightLettern = that.getLettern();
            if (this.lettern!= null) {
                if (that.lettern!= null) {
                    if (!leftLettern.equals(rightLettern)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.lettern!= null) {
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
            BigInteger leftId;
            leftId = this.getId();
            BigInteger rightId;
            rightId = that.getId();
            if (this.id!= null) {
                if (that.id!= null) {
                    if (!leftId.equals(rightId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.id!= null) {
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
            String theName;
            theName = this.getName();
            if (this.name!= null) {
                currentHashCode += theName.hashCode();
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
            String theKurzform;
            theKurzform = this.getKurzform();
            if (this.kurzform!= null) {
                currentHashCode += theKurzform.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theLettern;
            theLettern = this.getLettern();
            if (this.lettern!= null) {
                currentHashCode += theLettern.hashCode();
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
            BigInteger theId;
            theId = this.getId();
            if (this.id!= null) {
                currentHashCode += theId.hashCode();
            }
        }
        return currentHashCode;
    }

}
