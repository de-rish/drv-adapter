
package de.rudern.schemas.service.meldungen._2010;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.luebeckregatta.model.adapter.DrvOffsetDateTimeXmlAdapter;


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
 *         &amp;lt;element name="obleute"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="obmann" type="{http://schemas.rudern.de/service/meldungen/2010/}tObmann" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="meldungen"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="rennen" type="{http://schemas.rudern.de/service/meldungen/2010/}tRennen" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="vereine"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="verein" type="{http://schemas.rudern.de/service/meldungen/2010/}tVerein" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="stand" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "obleute",
    "meldungen",
    "vereine"
})
@XmlRootElement(name = "regatta-meldungen")
public class RegattaMeldungen {

    @XmlElementWrapper(required = true)
    @XmlElement(name = "obmann")
    protected List<TObmann> obleute = new ArrayList<TObmann>();
    @XmlElementWrapper(required = true)
    @XmlElement(name = "rennen")
    protected List<TRennen> meldungen = new ArrayList<TRennen>();
    @XmlElementWrapper(required = true)
    @XmlElement(name = "verein")
    protected List<TVerein> vereine = new ArrayList<TVerein>();
    @XmlAttribute(name = "stand")
    @XmlJavaTypeAdapter(DrvOffsetDateTimeXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime stand;

    /**
     * Ruft den Wert der stand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getStand() {
        return stand;
    }

    /**
     * Legt den Wert der stand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStand(OffsetDateTime value) {
        this.stand = value;
    }

    public List<TObmann> getObleute() {
        return obleute;
    }

    public void setObleute(List<TObmann> obleute) {
        this.obleute = obleute;
    }

    public List<TRennen> getMeldungen() {
        return meldungen;
    }

    public void setMeldungen(List<TRennen> meldungen) {
        this.meldungen = meldungen;
    }

    public List<TVerein> getVereine() {
        return vereine;
    }

    public void setVereine(List<TVerein> vereine) {
        this.vereine = vereine;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RegattaMeldungen that = ((RegattaMeldungen) object);
        {
            List<TObmann> leftObleute;
            leftObleute = ((this.obleute!= null)?this.getObleute():null);
            List<TObmann> rightObleute;
            rightObleute = ((that.obleute!= null)?that.getObleute():null);
            if (this.obleute!= null) {
                if (that.obleute!= null) {
                    if (!leftObleute.equals(rightObleute)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.obleute!= null) {
                    return false;
                }
            }
        }
        {
            List<TRennen> leftMeldungen;
            leftMeldungen = ((this.meldungen!= null)?this.getMeldungen():null);
            List<TRennen> rightMeldungen;
            rightMeldungen = ((that.meldungen!= null)?that.getMeldungen():null);
            if (this.meldungen!= null) {
                if (that.meldungen!= null) {
                    if (!leftMeldungen.equals(rightMeldungen)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.meldungen!= null) {
                    return false;
                }
            }
        }
        {
            List<TVerein> leftVereine;
            leftVereine = ((this.vereine!= null)?this.getVereine():null);
            List<TVerein> rightVereine;
            rightVereine = ((that.vereine!= null)?that.getVereine():null);
            if (this.vereine!= null) {
                if (that.vereine!= null) {
                    if (!leftVereine.equals(rightVereine)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.vereine!= null) {
                    return false;
                }
            }
        }
        {
            OffsetDateTime leftStand;
            leftStand = this.getStand();
            OffsetDateTime rightStand;
            rightStand = that.getStand();
            if (this.stand!= null) {
                if (that.stand!= null) {
                    if (!leftStand.equals(rightStand)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.stand!= null) {
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
            List<TObmann> theObleute;
            theObleute = ((this.obleute!= null)?this.getObleute():null);
            if (this.obleute!= null) {
                currentHashCode += theObleute.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<TRennen> theMeldungen;
            theMeldungen = ((this.meldungen!= null)?this.getMeldungen():null);
            if (this.meldungen!= null) {
                currentHashCode += theMeldungen.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<TVerein> theVereine;
            theVereine = ((this.vereine!= null)?this.getVereine():null);
            if (this.vereine!= null) {
                currentHashCode += theVereine.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            OffsetDateTime theStand;
            theStand = this.getStand();
            if (this.stand!= null) {
                currentHashCode += theStand.hashCode();
            }
        }
        return currentHashCode;
    }

}
