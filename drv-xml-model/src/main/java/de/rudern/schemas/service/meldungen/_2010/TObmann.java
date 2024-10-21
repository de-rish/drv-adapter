
package de.rudern.schemas.service.meldungen._2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * repräsentiert eine Person, die eine Meldung abgegeben hat.
 * 
 * &lt;p&gt;Java-Klasse für tObmann complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tObmann"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tObmann", propOrder = {
    "name",
    "email",
    "phone"
})
public class TObmann {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String email;
    protected String phone;
    @XmlAttribute(name = "id", required = true)
    protected String id;

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
     * Ruft den Wert der email-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Legt den Wert der email-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Ruft den Wert der phone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Legt den Wert der phone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
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
        final TObmann that = ((TObmann) object);
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
            String leftEmail;
            leftEmail = this.getEmail();
            String rightEmail;
            rightEmail = that.getEmail();
            if (this.email!= null) {
                if (that.email!= null) {
                    if (!leftEmail.equals(rightEmail)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.email!= null) {
                    return false;
                }
            }
        }
        {
            String leftPhone;
            leftPhone = this.getPhone();
            String rightPhone;
            rightPhone = that.getPhone();
            if (this.phone!= null) {
                if (that.phone!= null) {
                    if (!leftPhone.equals(rightPhone)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.phone!= null) {
                    return false;
                }
            }
        }
        {
            String leftId;
            leftId = this.getId();
            String rightId;
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
            String theEmail;
            theEmail = this.getEmail();
            if (this.email!= null) {
                currentHashCode += theEmail.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String thePhone;
            thePhone = this.getPhone();
            if (this.phone!= null) {
                currentHashCode += thePhone.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theId;
            theId = this.getId();
            if (this.id!= null) {
                currentHashCode += theId.hashCode();
            }
        }
        return currentHashCode;
    }

}
