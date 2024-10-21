
package de.rudern.schemas.service.ausschreibung._2010;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.luebeckregatta.model.adapter.DrvOffsetDateTimeXmlAdapter;


/**
 * &lt;p&gt;Java-Klasse für tRegatta complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tRegatta"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="angaben" type="{http://schemas.rudern.de/service/ausschreibung/2010/}tAngaben"/&amp;gt;
 *         &amp;lt;element name="rennfolge" type="{http://schemas.rudern.de/service/ausschreibung/2010/}tRennfolge"/&amp;gt;
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
@XmlType(name = "tRegatta", propOrder = {
    "angaben",
    "rennfolge"
})
public class TRegatta {

    @XmlElement(required = true)
    protected TAngaben angaben;
    @XmlElementWrapper(required = true)
    @XmlElement(name = "rennen")
    protected List<TRennen> rennfolge = new ArrayList<TRennen>();
    @XmlAttribute(name = "stand")
    @XmlJavaTypeAdapter(DrvOffsetDateTimeXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime stand;

    /**
     * Ruft den Wert der angaben-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TAngaben }
     *     
     */
    public TAngaben getAngaben() {
        return angaben;
    }

    /**
     * Legt den Wert der angaben-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TAngaben }
     *     
     */
    public void setAngaben(TAngaben value) {
        this.angaben = value;
    }

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

    public List<TRennen> getRennfolge() {
        return rennfolge;
    }

    public void setRennfolge(List<TRennen> rennfolge) {
        this.rennfolge = rennfolge;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TRegatta that = ((TRegatta) object);
        {
            TAngaben leftAngaben;
            leftAngaben = this.getAngaben();
            TAngaben rightAngaben;
            rightAngaben = that.getAngaben();
            if (this.angaben!= null) {
                if (that.angaben!= null) {
                    if (!leftAngaben.equals(rightAngaben)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.angaben!= null) {
                    return false;
                }
            }
        }
        {
            List<TRennen> leftRennfolge;
            leftRennfolge = ((this.rennfolge!= null)?this.getRennfolge():null);
            List<TRennen> rightRennfolge;
            rightRennfolge = ((that.rennfolge!= null)?that.getRennfolge():null);
            if (this.rennfolge!= null) {
                if (that.rennfolge!= null) {
                    if (!leftRennfolge.equals(rightRennfolge)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.rennfolge!= null) {
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
            TAngaben theAngaben;
            theAngaben = this.getAngaben();
            if (this.angaben!= null) {
                currentHashCode += theAngaben.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<TRennen> theRennfolge;
            theRennfolge = ((this.rennfolge!= null)?this.getRennfolge():null);
            if (this.rennfolge!= null) {
                currentHashCode += theRennfolge.hashCode();
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
