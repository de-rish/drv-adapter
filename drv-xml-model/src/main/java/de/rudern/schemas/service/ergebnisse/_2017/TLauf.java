
package de.rudern.schemas.service.ergebnisse._2017;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für tLauf complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tLauf"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.rudern.de/service/ergebnisse/2017/}tExtensible"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Boot" type="{http://schemas.rudern.de/service/ergebnisse/2017/}tBootErgebnis" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Schiedsrichter" type="{http://schemas.rudern.de/service/ergebnisse/2017/}tWettkampfrichter" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Typ" use="required"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *             &amp;lt;enumeration value="B"/&amp;gt;
 *             &amp;lt;enumeration value="V"/&amp;gt;
 *             &amp;lt;enumeration value="Q"/&amp;gt;
 *             &amp;lt;enumeration value="H"/&amp;gt;
 *             &amp;lt;enumeration value="S"/&amp;gt;
 *             &amp;lt;enumeration value="F"/&amp;gt;
 *             &amp;lt;enumeration value="A"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="Nummer" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" /&amp;gt;
 *       &amp;lt;attribute name="Bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="Leistungsgruppe"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
 *             &amp;lt;minInclusive value="1"/&amp;gt;
 *             &amp;lt;maxInclusive value="3"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="Altersklasse"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *             &amp;lt;minLength value="1"/&amp;gt;
 *             &amp;lt;maxLength value="1"/&amp;gt;
 *             &amp;lt;pattern value="[A-Z]"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLauf", propOrder = {
    "boot",
    "schiedsrichter"
})
public class TLauf
    extends TExtensible
{

    @XmlElement(name = "Boot")
    protected List<TBootErgebnis> boot;
    @XmlElement(name = "Schiedsrichter")
    protected List<TWettkampfrichter> schiedsrichter;
    @XmlAttribute(name = "Typ", required = true)
    protected String typ;
    @XmlAttribute(name = "Nummer", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short nummer;
    @XmlAttribute(name = "Bezeichnung")
    protected String bezeichnung;
    @XmlAttribute(name = "Leistungsgruppe")
    protected Integer leistungsgruppe;
    @XmlAttribute(name = "Altersklasse")
    protected String altersklasse;

    /**
     * Gets the value of the boot property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the boot property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getBoot().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TBootErgebnis }
     * 
     * 
     */
    public List<TBootErgebnis> getBoot() {
        if (boot == null) {
            boot = new ArrayList<TBootErgebnis>();
        }
        return this.boot;
    }

    /**
     * Gets the value of the schiedsrichter property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the schiedsrichter property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSchiedsrichter().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TWettkampfrichter }
     * 
     * 
     */
    public List<TWettkampfrichter> getSchiedsrichter() {
        if (schiedsrichter == null) {
            schiedsrichter = new ArrayList<TWettkampfrichter>();
        }
        return this.schiedsrichter;
    }

    /**
     * Ruft den Wert der typ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Legt den Wert der typ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Ruft den Wert der nummer-Eigenschaft ab.
     * 
     */
    public short getNummer() {
        return nummer;
    }

    /**
     * Legt den Wert der nummer-Eigenschaft fest.
     * 
     */
    public void setNummer(short value) {
        this.nummer = value;
    }

    /**
     * Ruft den Wert der bezeichnung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Legt den Wert der bezeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Ruft den Wert der leistungsgruppe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeistungsgruppe() {
        return leistungsgruppe;
    }

    /**
     * Legt den Wert der leistungsgruppe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeistungsgruppe(Integer value) {
        this.leistungsgruppe = value;
    }

    /**
     * Ruft den Wert der altersklasse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltersklasse() {
        return altersklasse;
    }

    /**
     * Legt den Wert der altersklasse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltersklasse(String value) {
        this.altersklasse = value;
    }

    public void setBoot(List<TBootErgebnis> value) {
        this.boot = null;
        if (value!= null) {
            List<TBootErgebnis> draftl = this.getBoot();
            draftl.addAll(value);
        }
    }

    public void setSchiedsrichter(List<TWettkampfrichter> value) {
        this.schiedsrichter = null;
        if (value!= null) {
            List<TWettkampfrichter> draftl = this.getSchiedsrichter();
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
        if (!super.equals(object)) {
            return false;
        }
        final TLauf that = ((TLauf) object);
        {
            List<TBootErgebnis> leftBoot;
            leftBoot = (((this.boot!= null)&&(!this.boot.isEmpty()))?this.getBoot():null);
            List<TBootErgebnis> rightBoot;
            rightBoot = (((that.boot!= null)&&(!that.boot.isEmpty()))?that.getBoot():null);
            if ((this.boot!= null)&&(!this.boot.isEmpty())) {
                if ((that.boot!= null)&&(!that.boot.isEmpty())) {
                    if (!leftBoot.equals(rightBoot)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.boot!= null)&&(!that.boot.isEmpty())) {
                    return false;
                }
            }
        }
        {
            List<TWettkampfrichter> leftSchiedsrichter;
            leftSchiedsrichter = (((this.schiedsrichter!= null)&&(!this.schiedsrichter.isEmpty()))?this.getSchiedsrichter():null);
            List<TWettkampfrichter> rightSchiedsrichter;
            rightSchiedsrichter = (((that.schiedsrichter!= null)&&(!that.schiedsrichter.isEmpty()))?that.getSchiedsrichter():null);
            if ((this.schiedsrichter!= null)&&(!this.schiedsrichter.isEmpty())) {
                if ((that.schiedsrichter!= null)&&(!that.schiedsrichter.isEmpty())) {
                    if (!leftSchiedsrichter.equals(rightSchiedsrichter)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.schiedsrichter!= null)&&(!that.schiedsrichter.isEmpty())) {
                    return false;
                }
            }
        }
        {
            String leftTyp;
            leftTyp = this.getTyp();
            String rightTyp;
            rightTyp = that.getTyp();
            if (this.typ!= null) {
                if (that.typ!= null) {
                    if (!leftTyp.equals(rightTyp)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.typ!= null) {
                    return false;
                }
            }
        }
        {
            short leftNummer;
            leftNummer = this.getNummer();
            short rightNummer;
            rightNummer = that.getNummer();
            if (leftNummer!= rightNummer) {
                return false;
            }
        }
        {
            String leftBezeichnung;
            leftBezeichnung = this.getBezeichnung();
            String rightBezeichnung;
            rightBezeichnung = that.getBezeichnung();
            if (this.bezeichnung!= null) {
                if (that.bezeichnung!= null) {
                    if (!leftBezeichnung.equals(rightBezeichnung)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.bezeichnung!= null) {
                    return false;
                }
            }
        }
        {
            Integer leftLeistungsgruppe;
            leftLeistungsgruppe = this.getLeistungsgruppe();
            Integer rightLeistungsgruppe;
            rightLeistungsgruppe = that.getLeistungsgruppe();
            if (this.leistungsgruppe!= null) {
                if (that.leistungsgruppe!= null) {
                    if (!leftLeistungsgruppe.equals(rightLeistungsgruppe)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.leistungsgruppe!= null) {
                    return false;
                }
            }
        }
        {
            String leftAltersklasse;
            leftAltersklasse = this.getAltersklasse();
            String rightAltersklasse;
            rightAltersklasse = that.getAltersklasse();
            if (this.altersklasse!= null) {
                if (that.altersklasse!= null) {
                    if (!leftAltersklasse.equals(rightAltersklasse)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.altersklasse!= null) {
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
            List<TBootErgebnis> theBoot;
            theBoot = (((this.boot!= null)&&(!this.boot.isEmpty()))?this.getBoot():null);
            if ((this.boot!= null)&&(!this.boot.isEmpty())) {
                currentHashCode += theBoot.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<TWettkampfrichter> theSchiedsrichter;
            theSchiedsrichter = (((this.schiedsrichter!= null)&&(!this.schiedsrichter.isEmpty()))?this.getSchiedsrichter():null);
            if ((this.schiedsrichter!= null)&&(!this.schiedsrichter.isEmpty())) {
                currentHashCode += theSchiedsrichter.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theTyp;
            theTyp = this.getTyp();
            if (this.typ!= null) {
                currentHashCode += theTyp.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            short theNummer;
            theNummer = this.getNummer();
            currentHashCode += ((int) theNummer);
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theBezeichnung;
            theBezeichnung = this.getBezeichnung();
            if (this.bezeichnung!= null) {
                currentHashCode += theBezeichnung.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Integer theLeistungsgruppe;
            theLeistungsgruppe = this.getLeistungsgruppe();
            if (this.leistungsgruppe!= null) {
                currentHashCode += theLeistungsgruppe.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theAltersklasse;
            theAltersklasse = this.getAltersklasse();
            if (this.altersklasse!= null) {
                currentHashCode += theAltersklasse.hashCode();
            }
        }
        return currentHashCode;
    }

}
