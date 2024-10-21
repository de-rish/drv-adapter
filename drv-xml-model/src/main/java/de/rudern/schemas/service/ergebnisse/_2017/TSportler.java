
package de.rudern.schemas.service.ergebnisse._2017;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java-Klasse für tSportler complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tSportler"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.rudern.de/service/ergebnisse/2017/}tExtensible"&amp;gt;
 *       &amp;lt;sequence minOccurs="0"&amp;gt;
 *         &amp;lt;element name="Nachname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Vorname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Jahrgang" type="{http://www.w3.org/2001/XMLSchema}gYear"/&amp;gt;
 *         &amp;lt;element name="VereinsName" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;simpleContent&amp;gt;
 *               &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;string"&amp;gt;
 *                 &amp;lt;attribute name="Kuerzel" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *               &amp;lt;/extension&amp;gt;
 *             &amp;lt;/simpleContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Position" use="required"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
 *             &amp;lt;minInclusive value="1"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="istSteuermann" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&amp;gt;
 *       &amp;lt;attribute name="AktivenID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&amp;gt;
 *       &amp;lt;attribute name="VereinsID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSportler", propOrder = {
    "nachname",
    "vorname",
    "jahrgang",
    "vereinsName"
})
public class TSportler
    extends TExtensible
{

    @XmlElement(name = "Nachname")
    protected String nachname;
    @XmlElement(name = "Vorname")
    protected String vorname;
    @XmlElement(name = "Jahrgang")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar jahrgang;
    @XmlElement(name = "VereinsName")
    protected TSportler.VereinsName vereinsName;
    @XmlAttribute(name = "Position", required = true)
    protected int position;
    @XmlAttribute(name = "istSteuermann")
    protected Boolean istSteuermann;
    @XmlAttribute(name = "AktivenID")
    @XmlSchemaType(name = "anySimpleType")
    protected String aktivenID;
    @XmlAttribute(name = "VereinsID")
    @XmlSchemaType(name = "anySimpleType")
    protected String vereinsID;

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
     * Ruft den Wert der jahrgang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJahrgang() {
        return jahrgang;
    }

    /**
     * Legt den Wert der jahrgang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJahrgang(XMLGregorianCalendar value) {
        this.jahrgang = value;
    }

    /**
     * Ruft den Wert der vereinsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TSportler.VereinsName }
     *     
     */
    public TSportler.VereinsName getVereinsName() {
        return vereinsName;
    }

    /**
     * Legt den Wert der vereinsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TSportler.VereinsName }
     *     
     */
    public void setVereinsName(TSportler.VereinsName value) {
        this.vereinsName = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     */
    public int getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     */
    public void setPosition(int value) {
        this.position = value;
    }

    /**
     * Ruft den Wert der istSteuermann-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIstSteuermann() {
        if (istSteuermann == null) {
            return false;
        } else {
            return istSteuermann;
        }
    }

    /**
     * Legt den Wert der istSteuermann-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstSteuermann(Boolean value) {
        this.istSteuermann = value;
    }

    /**
     * Ruft den Wert der aktivenID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktivenID() {
        return aktivenID;
    }

    /**
     * Legt den Wert der aktivenID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktivenID(String value) {
        this.aktivenID = value;
    }

    /**
     * Ruft den Wert der vereinsID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVereinsID() {
        return vereinsID;
    }

    /**
     * Legt den Wert der vereinsID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVereinsID(String value) {
        this.vereinsID = value;
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
        final TSportler that = ((TSportler) object);
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
            XMLGregorianCalendar leftJahrgang;
            leftJahrgang = this.getJahrgang();
            XMLGregorianCalendar rightJahrgang;
            rightJahrgang = that.getJahrgang();
            if (this.jahrgang!= null) {
                if (that.jahrgang!= null) {
                    if (!leftJahrgang.equals(rightJahrgang)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.jahrgang!= null) {
                    return false;
                }
            }
        }
        {
            TSportler.VereinsName leftVereinsName;
            leftVereinsName = this.getVereinsName();
            TSportler.VereinsName rightVereinsName;
            rightVereinsName = that.getVereinsName();
            if (this.vereinsName!= null) {
                if (that.vereinsName!= null) {
                    if (!leftVereinsName.equals(rightVereinsName)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.vereinsName!= null) {
                    return false;
                }
            }
        }
        {
            int leftPosition;
            leftPosition = this.getPosition();
            int rightPosition;
            rightPosition = that.getPosition();
            if (leftPosition!= rightPosition) {
                return false;
            }
        }
        {
            boolean leftIstSteuermann;
            leftIstSteuermann = ((this.istSteuermann!= null)?this.isIstSteuermann():false);
            boolean rightIstSteuermann;
            rightIstSteuermann = ((that.istSteuermann!= null)?that.isIstSteuermann():false);
            if (this.istSteuermann!= null) {
                if (that.istSteuermann!= null) {
                    if (leftIstSteuermann!= rightIstSteuermann) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.istSteuermann!= null) {
                    return false;
                }
            }
        }
        {
            String leftAktivenID;
            leftAktivenID = this.getAktivenID();
            String rightAktivenID;
            rightAktivenID = that.getAktivenID();
            if (this.aktivenID!= null) {
                if (that.aktivenID!= null) {
                    if (!leftAktivenID.equals(rightAktivenID)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.aktivenID!= null) {
                    return false;
                }
            }
        }
        {
            String leftVereinsID;
            leftVereinsID = this.getVereinsID();
            String rightVereinsID;
            rightVereinsID = that.getVereinsID();
            if (this.vereinsID!= null) {
                if (that.vereinsID!= null) {
                    if (!leftVereinsID.equals(rightVereinsID)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.vereinsID!= null) {
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
            XMLGregorianCalendar theJahrgang;
            theJahrgang = this.getJahrgang();
            if (this.jahrgang!= null) {
                currentHashCode += theJahrgang.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            TSportler.VereinsName theVereinsName;
            theVereinsName = this.getVereinsName();
            if (this.vereinsName!= null) {
                currentHashCode += theVereinsName.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            int thePosition;
            thePosition = this.getPosition();
            currentHashCode += thePosition;
        }
        {
            currentHashCode = (currentHashCode* 31);
            boolean theIstSteuermann;
            theIstSteuermann = ((this.istSteuermann!= null)?this.isIstSteuermann():false);
            if (this.istSteuermann!= null) {
                currentHashCode += (theIstSteuermann? 1231 : 1237);
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theAktivenID;
            theAktivenID = this.getAktivenID();
            if (this.aktivenID!= null) {
                currentHashCode += theAktivenID.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theVereinsID;
            theVereinsID = this.getVereinsID();
            if (this.vereinsID!= null) {
                currentHashCode += theVereinsID.hashCode();
            }
        }
        return currentHashCode;
    }


    /**
     * Name des Vereins, ggf. optionale Kurzschreibweise
     * 
     * &lt;p&gt;Java-Klasse für anonymous complex type.
     * 
     * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;simpleContent&amp;gt;
     *     &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;string"&amp;gt;
     *       &amp;lt;attribute name="Kuerzel" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
     *     &amp;lt;/extension&amp;gt;
     *   &amp;lt;/simpleContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class VereinsName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Kuerzel")
        protected String kuerzel;

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Ruft den Wert der kuerzel-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKuerzel() {
            return kuerzel;
        }

        /**
         * Legt den Wert der kuerzel-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKuerzel(String value) {
            this.kuerzel = value;
        }

        @Override
        public boolean equals(Object object) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final TSportler.VereinsName that = ((TSportler.VereinsName) object);
            {
                String leftValue;
                leftValue = this.getValue();
                String rightValue;
                rightValue = that.getValue();
                if (this.value!= null) {
                    if (that.value!= null) {
                        if (!leftValue.equals(rightValue)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    if (that.value!= null) {
                        return false;
                    }
                }
            }
            {
                String leftKuerzel;
                leftKuerzel = this.getKuerzel();
                String rightKuerzel;
                rightKuerzel = that.getKuerzel();
                if (this.kuerzel!= null) {
                    if (that.kuerzel!= null) {
                        if (!leftKuerzel.equals(rightKuerzel)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    if (that.kuerzel!= null) {
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
                String theValue;
                theValue = this.getValue();
                if (this.value!= null) {
                    currentHashCode += theValue.hashCode();
                }
            }
            {
                currentHashCode = (currentHashCode* 31);
                String theKuerzel;
                theKuerzel = this.getKuerzel();
                if (this.kuerzel!= null) {
                    currentHashCode += theKuerzel.hashCode();
                }
            }
            return currentHashCode;
        }

    }

}
