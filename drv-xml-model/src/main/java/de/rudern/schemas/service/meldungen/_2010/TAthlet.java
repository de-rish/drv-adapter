
package de.rudern.schemas.service.meldungen._2010;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für tAthlet complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tAthlet"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="vorname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="jahrgang"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
 *               &amp;lt;minExclusive value="1920"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="geschlecht"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="m"/&amp;gt;
 *               &amp;lt;enumeration value="w"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="id" use="required" type="{http://schemas.rudern.de/service/meldungen/2010/}tPassID" /&amp;gt;
 *       &amp;lt;attribute name="verein" use="required" type="{http://schemas.rudern.de/service/meldungen/2010/}tVereinsID" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAthlet", propOrder = {
    "name",
    "vorname",
    "jahrgang",
    "geschlecht"
})
public class TAthlet {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String vorname;
    protected int jahrgang;
    @XmlElement(required = true)
    protected String geschlecht;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "verein", required = true)
    protected int verein;

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
     * Ruft den Wert der jahrgang-Eigenschaft ab.
     * 
     */
    public int getJahrgang() {
        return jahrgang;
    }

    /**
     * Legt den Wert der jahrgang-Eigenschaft fest.
     * 
     */
    public void setJahrgang(int value) {
        this.jahrgang = value;
    }

    /**
     * Ruft den Wert der geschlecht-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeschlecht() {
        return geschlecht;
    }

    /**
     * Legt den Wert der geschlecht-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeschlecht(String value) {
        this.geschlecht = value;
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

    /**
     * Ruft den Wert der verein-Eigenschaft ab.
     * 
     */
    public int getVerein() {
        return verein;
    }

    /**
     * Legt den Wert der verein-Eigenschaft fest.
     * 
     */
    public void setVerein(int value) {
        this.verein = value;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TAthlet that = ((TAthlet) object);
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
            int leftJahrgang;
            leftJahrgang = this.getJahrgang();
            int rightJahrgang;
            rightJahrgang = that.getJahrgang();
            if (leftJahrgang!= rightJahrgang) {
                return false;
            }
        }
        {
            String leftGeschlecht;
            leftGeschlecht = this.getGeschlecht();
            String rightGeschlecht;
            rightGeschlecht = that.getGeschlecht();
            if (this.geschlecht!= null) {
                if (that.geschlecht!= null) {
                    if (!leftGeschlecht.equals(rightGeschlecht)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.geschlecht!= null) {
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
        {
            int leftVerein;
            leftVerein = this.getVerein();
            int rightVerein;
            rightVerein = that.getVerein();
            if (leftVerein!= rightVerein) {
                return false;
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
            String theVorname;
            theVorname = this.getVorname();
            if (this.vorname!= null) {
                currentHashCode += theVorname.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            int theJahrgang;
            theJahrgang = this.getJahrgang();
            currentHashCode += theJahrgang;
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theGeschlecht;
            theGeschlecht = this.getGeschlecht();
            if (this.geschlecht!= null) {
                currentHashCode += theGeschlecht.hashCode();
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
        {
            currentHashCode = (currentHashCode* 31);
            int theVerein;
            theVerein = this.getVerein();
            currentHashCode += theVerein;
        }
        return currentHashCode;
    }

}
