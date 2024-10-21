
package de.rudern.schemas.service.meldungen._2010;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &amp;lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="kurzform" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="lettern" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="id" type="{http://schemas.rudern.de/service/meldungen/2010/}tVereinsID" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tVerein", propOrder = {
    "ort",
    "name",
    "kurzform",
    "lettern"
})
public class TVerein {

    @XmlElement(required = true)
    protected String ort;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String kurzform;
    @XmlElement(required = true)
    protected String lettern;
    @XmlAttribute(name = "id")
    protected Integer id;

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
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
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
            Integer leftId;
            leftId = this.getId();
            Integer rightId;
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
            String theOrt;
            theOrt = this.getOrt();
            if (this.ort!= null) {
                currentHashCode += theOrt.hashCode();
            }
        }
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
            Integer theId;
            theId = this.getId();
            if (this.id!= null) {
                currentHashCode += theId.hashCode();
            }
        }
        return currentHashCode;
    }

}
