
package de.rudern.schemas.service.meldungen._2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für tRennen complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tRennen"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="meldung" type="{http://schemas.rudern.de/service/meldungen/2010/}tMeldung" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="nummer" use="required" type="{http://schemas.rudern.de/service/ausschreibung/2010/}tRennNummer" /&amp;gt;
 *       &amp;lt;attribute name="spezifikation" use="required" type="{http://schemas.rudern.de/service/ausschreibung/2010/}tRennSpezifikation" /&amp;gt;
 *       &amp;lt;attribute name="zusatz" type="{http://schemas.rudern.de/service/ausschreibung/2010/}tRennZusatz" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRennen", propOrder = {
    "meldung"
})
public class TRennen {

    protected List<TMeldung> meldung;
    @XmlAttribute(name = "nummer", required = true)
    protected String nummer;
    @XmlAttribute(name = "spezifikation", required = true)
    protected String spezifikation;
    @XmlAttribute(name = "zusatz")
    protected String zusatz;

    /**
     * Gets the value of the meldung property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the meldung property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getMeldung().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TMeldung }
     * 
     * 
     */
    public List<TMeldung> getMeldung() {
        if (meldung == null) {
            meldung = new ArrayList<TMeldung>();
        }
        return this.meldung;
    }

    /**
     * Ruft den Wert der nummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Legt den Wert der nummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Ruft den Wert der spezifikation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpezifikation() {
        return spezifikation;
    }

    /**
     * Legt den Wert der spezifikation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpezifikation(String value) {
        this.spezifikation = value;
    }

    /**
     * Ruft den Wert der zusatz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZusatz() {
        return zusatz;
    }

    /**
     * Legt den Wert der zusatz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZusatz(String value) {
        this.zusatz = value;
    }

    public void setMeldung(List<TMeldung> value) {
        this.meldung = null;
        if (value!= null) {
            List<TMeldung> draftl = this.getMeldung();
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
        final TRennen that = ((TRennen) object);
        {
            List<TMeldung> leftMeldung;
            leftMeldung = (((this.meldung!= null)&&(!this.meldung.isEmpty()))?this.getMeldung():null);
            List<TMeldung> rightMeldung;
            rightMeldung = (((that.meldung!= null)&&(!that.meldung.isEmpty()))?that.getMeldung():null);
            if ((this.meldung!= null)&&(!this.meldung.isEmpty())) {
                if ((that.meldung!= null)&&(!that.meldung.isEmpty())) {
                    if (!leftMeldung.equals(rightMeldung)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.meldung!= null)&&(!that.meldung.isEmpty())) {
                    return false;
                }
            }
        }
        {
            String leftNummer;
            leftNummer = this.getNummer();
            String rightNummer;
            rightNummer = that.getNummer();
            if (this.nummer!= null) {
                if (that.nummer!= null) {
                    if (!leftNummer.equals(rightNummer)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.nummer!= null) {
                    return false;
                }
            }
        }
        {
            String leftSpezifikation;
            leftSpezifikation = this.getSpezifikation();
            String rightSpezifikation;
            rightSpezifikation = that.getSpezifikation();
            if (this.spezifikation!= null) {
                if (that.spezifikation!= null) {
                    if (!leftSpezifikation.equals(rightSpezifikation)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.spezifikation!= null) {
                    return false;
                }
            }
        }
        {
            String leftZusatz;
            leftZusatz = this.getZusatz();
            String rightZusatz;
            rightZusatz = that.getZusatz();
            if (this.zusatz!= null) {
                if (that.zusatz!= null) {
                    if (!leftZusatz.equals(rightZusatz)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.zusatz!= null) {
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
            List<TMeldung> theMeldung;
            theMeldung = (((this.meldung!= null)&&(!this.meldung.isEmpty()))?this.getMeldung():null);
            if ((this.meldung!= null)&&(!this.meldung.isEmpty())) {
                currentHashCode += theMeldung.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theNummer;
            theNummer = this.getNummer();
            if (this.nummer!= null) {
                currentHashCode += theNummer.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theSpezifikation;
            theSpezifikation = this.getSpezifikation();
            if (this.spezifikation!= null) {
                currentHashCode += theSpezifikation.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theZusatz;
            theZusatz = this.getZusatz();
            if (this.zusatz!= null) {
                currentHashCode += theZusatz.hashCode();
            }
        }
        return currentHashCode;
    }

}
