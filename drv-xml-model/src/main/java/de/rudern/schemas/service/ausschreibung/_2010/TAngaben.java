
package de.rudern.schemas.service.ausschreibung._2010;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.luebeckregatta.model.adapter.DrvOffsetDateTimeXmlAdapter;
import io.github.threetenjaxb.core.LocalDateXmlAdapter;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java-Klasse für tAngaben complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tAngaben"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="subTitel" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="veranstalter" type="{http://schemas.rudern.de/service/ausschreibung/2010/}tVeranstalter" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="startDatum" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *         &amp;lt;element name="endDatum" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *         &amp;lt;element name="meldeschluss" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="homepage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="bestimmungen" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="bestimmung" maxOccurs="7" minOccurs="0"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                           &amp;lt;sequence&amp;gt;
 *                             &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                           &amp;lt;/sequence&amp;gt;
 *                           &amp;lt;attribute name="nr" use="required"&amp;gt;
 *                             &amp;lt;simpleType&amp;gt;
 *                               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
 *                                 &amp;lt;minInclusive value="1"/&amp;gt;
 *                                 &amp;lt;maxInclusive value="7"/&amp;gt;
 *                               &amp;lt;/restriction&amp;gt;
 *                             &amp;lt;/simpleType&amp;gt;
 *                           &amp;lt;/attribute&amp;gt;
 *                           &amp;lt;attribute name="inhalt" use="required"&amp;gt;
 *                             &amp;lt;simpleType&amp;gt;
 *                               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                                 &amp;lt;enumeration value="application/xhtml+xml"/&amp;gt;
 *                                 &amp;lt;enumeration value="text/plain"/&amp;gt;
 *                               &amp;lt;/restriction&amp;gt;
 *                             &amp;lt;/simpleType&amp;gt;
 *                           &amp;lt;/attribute&amp;gt;
 *                         &amp;lt;/restriction&amp;gt;
 *                       &amp;lt;/complexContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAngaben", propOrder = {
    "titel",
    "subTitel",
    "ort",
    "veranstalter",
    "startDatum",
    "endDatum",
    "meldeschluss",
    "homepage",
    "email",
    "bestimmungen"
})
public class TAngaben {

    @XmlElement(required = true)
    protected String titel;
    @XmlElement(required = true)
    protected String subTitel;
    @XmlElement(required = true)
    protected String ort;
    protected TVeranstalter veranstalter;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate startDatum;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate endDatum;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(DrvOffsetDateTimeXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime meldeschluss;
    protected String homepage;
    protected String email;
    @XmlElementWrapper
    @XmlElement(name = "bestimmung")
    protected List<TAngaben.Bestimmung> bestimmungen = new ArrayList<TAngaben.Bestimmung>();

    /**
     * Ruft den Wert der titel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Legt den Wert der titel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Ruft den Wert der subTitel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTitel() {
        return subTitel;
    }

    /**
     * Legt den Wert der subTitel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTitel(String value) {
        this.subTitel = value;
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
     * Ruft den Wert der veranstalter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TVeranstalter }
     *     
     */
    public TVeranstalter getVeranstalter() {
        return veranstalter;
    }

    /**
     * Legt den Wert der veranstalter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TVeranstalter }
     *     
     */
    public void setVeranstalter(TVeranstalter value) {
        this.veranstalter = value;
    }

    /**
     * Ruft den Wert der startDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getStartDatum() {
        return startDatum;
    }

    /**
     * Legt den Wert der startDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDatum(LocalDate value) {
        this.startDatum = value;
    }

    /**
     * Ruft den Wert der endDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEndDatum() {
        return endDatum;
    }

    /**
     * Legt den Wert der endDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDatum(LocalDate value) {
        this.endDatum = value;
    }

    /**
     * Ruft den Wert der meldeschluss-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getMeldeschluss() {
        return meldeschluss;
    }

    /**
     * Legt den Wert der meldeschluss-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeldeschluss(OffsetDateTime value) {
        this.meldeschluss = value;
    }

    /**
     * Ruft den Wert der homepage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * Legt den Wert der homepage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomepage(String value) {
        this.homepage = value;
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

    public List<TAngaben.Bestimmung> getBestimmungen() {
        return bestimmungen;
    }

    public void setBestimmungen(List<TAngaben.Bestimmung> bestimmungen) {
        this.bestimmungen = bestimmungen;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TAngaben that = ((TAngaben) object);
        {
            String leftTitel;
            leftTitel = this.getTitel();
            String rightTitel;
            rightTitel = that.getTitel();
            if (this.titel!= null) {
                if (that.titel!= null) {
                    if (!leftTitel.equals(rightTitel)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.titel!= null) {
                    return false;
                }
            }
        }
        {
            String leftSubTitel;
            leftSubTitel = this.getSubTitel();
            String rightSubTitel;
            rightSubTitel = that.getSubTitel();
            if (this.subTitel!= null) {
                if (that.subTitel!= null) {
                    if (!leftSubTitel.equals(rightSubTitel)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.subTitel!= null) {
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
            TVeranstalter leftVeranstalter;
            leftVeranstalter = this.getVeranstalter();
            TVeranstalter rightVeranstalter;
            rightVeranstalter = that.getVeranstalter();
            if (this.veranstalter!= null) {
                if (that.veranstalter!= null) {
                    if (!leftVeranstalter.equals(rightVeranstalter)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.veranstalter!= null) {
                    return false;
                }
            }
        }
        {
            LocalDate leftStartDatum;
            leftStartDatum = this.getStartDatum();
            LocalDate rightStartDatum;
            rightStartDatum = that.getStartDatum();
            if (this.startDatum!= null) {
                if (that.startDatum!= null) {
                    if (!leftStartDatum.equals(rightStartDatum)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.startDatum!= null) {
                    return false;
                }
            }
        }
        {
            LocalDate leftEndDatum;
            leftEndDatum = this.getEndDatum();
            LocalDate rightEndDatum;
            rightEndDatum = that.getEndDatum();
            if (this.endDatum!= null) {
                if (that.endDatum!= null) {
                    if (!leftEndDatum.equals(rightEndDatum)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.endDatum!= null) {
                    return false;
                }
            }
        }
        {
            OffsetDateTime leftMeldeschluss;
            leftMeldeschluss = this.getMeldeschluss();
            OffsetDateTime rightMeldeschluss;
            rightMeldeschluss = that.getMeldeschluss();
            if (this.meldeschluss!= null) {
                if (that.meldeschluss!= null) {
                    if (!leftMeldeschluss.equals(rightMeldeschluss)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.meldeschluss!= null) {
                    return false;
                }
            }
        }
        {
            String leftHomepage;
            leftHomepage = this.getHomepage();
            String rightHomepage;
            rightHomepage = that.getHomepage();
            if (this.homepage!= null) {
                if (that.homepage!= null) {
                    if (!leftHomepage.equals(rightHomepage)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.homepage!= null) {
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
            List<TAngaben.Bestimmung> leftBestimmungen;
            leftBestimmungen = ((this.bestimmungen!= null)?this.getBestimmungen():null);
            List<TAngaben.Bestimmung> rightBestimmungen;
            rightBestimmungen = ((that.bestimmungen!= null)?that.getBestimmungen():null);
            if (this.bestimmungen!= null) {
                if (that.bestimmungen!= null) {
                    if (!leftBestimmungen.equals(rightBestimmungen)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.bestimmungen!= null) {
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
            String theTitel;
            theTitel = this.getTitel();
            if (this.titel!= null) {
                currentHashCode += theTitel.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theSubTitel;
            theSubTitel = this.getSubTitel();
            if (this.subTitel!= null) {
                currentHashCode += theSubTitel.hashCode();
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
            TVeranstalter theVeranstalter;
            theVeranstalter = this.getVeranstalter();
            if (this.veranstalter!= null) {
                currentHashCode += theVeranstalter.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            LocalDate theStartDatum;
            theStartDatum = this.getStartDatum();
            if (this.startDatum!= null) {
                currentHashCode += theStartDatum.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            LocalDate theEndDatum;
            theEndDatum = this.getEndDatum();
            if (this.endDatum!= null) {
                currentHashCode += theEndDatum.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            OffsetDateTime theMeldeschluss;
            theMeldeschluss = this.getMeldeschluss();
            if (this.meldeschluss!= null) {
                currentHashCode += theMeldeschluss.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theHomepage;
            theHomepage = this.getHomepage();
            if (this.homepage!= null) {
                currentHashCode += theHomepage.hashCode();
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
            List<TAngaben.Bestimmung> theBestimmungen;
            theBestimmungen = ((this.bestimmungen!= null)?this.getBestimmungen():null);
            if (this.bestimmungen!= null) {
                currentHashCode += theBestimmungen.hashCode();
            }
        }
        return currentHashCode;
    }


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
     *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *       &amp;lt;attribute name="nr" use="required"&amp;gt;
     *         &amp;lt;simpleType&amp;gt;
     *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
     *             &amp;lt;minInclusive value="1"/&amp;gt;
     *             &amp;lt;maxInclusive value="7"/&amp;gt;
     *           &amp;lt;/restriction&amp;gt;
     *         &amp;lt;/simpleType&amp;gt;
     *       &amp;lt;/attribute&amp;gt;
     *       &amp;lt;attribute name="inhalt" use="required"&amp;gt;
     *         &amp;lt;simpleType&amp;gt;
     *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *             &amp;lt;enumeration value="application/xhtml+xml"/&amp;gt;
     *             &amp;lt;enumeration value="text/plain"/&amp;gt;
     *           &amp;lt;/restriction&amp;gt;
     *         &amp;lt;/simpleType&amp;gt;
     *       &amp;lt;/attribute&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Bestimmung {

        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlAttribute(name = "nr", required = true)
        protected int nr;
        @XmlAttribute(name = "inhalt", required = true)
        protected String inhalt;

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
         * Ruft den Wert der nr-Eigenschaft ab.
         * 
         */
        public int getNr() {
            return nr;
        }

        /**
         * Legt den Wert der nr-Eigenschaft fest.
         * 
         */
        public void setNr(int value) {
            this.nr = value;
        }

        /**
         * Ruft den Wert der inhalt-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInhalt() {
            return inhalt;
        }

        /**
         * Legt den Wert der inhalt-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInhalt(String value) {
            this.inhalt = value;
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
            final TAngaben.Bestimmung that = ((TAngaben.Bestimmung) object);
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
                int leftNr;
                leftNr = this.getNr();
                int rightNr;
                rightNr = that.getNr();
                if (leftNr!= rightNr) {
                    return false;
                }
            }
            {
                String leftInhalt;
                leftInhalt = this.getInhalt();
                String rightInhalt;
                rightInhalt = that.getInhalt();
                if (this.inhalt!= null) {
                    if (that.inhalt!= null) {
                        if (!leftInhalt.equals(rightInhalt)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    if (that.inhalt!= null) {
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
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                if ((this.any!= null)&&(!this.any.isEmpty())) {
                    currentHashCode += theAny.hashCode();
                }
            }
            {
                currentHashCode = (currentHashCode* 31);
                int theNr;
                theNr = this.getNr();
                currentHashCode += theNr;
            }
            {
                currentHashCode = (currentHashCode* 31);
                String theInhalt;
                theInhalt = this.getInhalt();
                if (this.inhalt!= null) {
                    currentHashCode += theInhalt.hashCode();
                }
            }
            return currentHashCode;
        }

    }

}
