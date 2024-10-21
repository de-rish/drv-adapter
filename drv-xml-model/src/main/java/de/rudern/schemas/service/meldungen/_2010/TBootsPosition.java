
package de.rudern.schemas.service.meldungen._2010;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für tBootsPosition complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tBootsPosition"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="athlet" type="{http://schemas.rudern.de/service/meldungen/2010/}tAthlet" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="nr" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="st" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBootsPosition", propOrder = {
    "athlet"
})
public class TBootsPosition {

    protected TAthlet athlet;
    @XmlAttribute(name = "nr", required = true)
    protected int nr;
    @XmlAttribute(name = "st")
    protected Boolean st;

    /**
     * Ruft den Wert der athlet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TAthlet }
     *     
     */
    public TAthlet getAthlet() {
        return athlet;
    }

    /**
     * Legt den Wert der athlet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TAthlet }
     *     
     */
    public void setAthlet(TAthlet value) {
        this.athlet = value;
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
     * Ruft den Wert der st-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSt() {
        if (st == null) {
            return false;
        } else {
            return st;
        }
    }

    /**
     * Legt den Wert der st-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSt(Boolean value) {
        this.st = value;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TBootsPosition that = ((TBootsPosition) object);
        {
            TAthlet leftAthlet;
            leftAthlet = this.getAthlet();
            TAthlet rightAthlet;
            rightAthlet = that.getAthlet();
            if (this.athlet!= null) {
                if (that.athlet!= null) {
                    if (!leftAthlet.equals(rightAthlet)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.athlet!= null) {
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
            boolean leftSt;
            leftSt = ((this.st!= null)?this.isSt():false);
            boolean rightSt;
            rightSt = ((that.st!= null)?that.isSt():false);
            if (this.st!= null) {
                if (that.st!= null) {
                    if (leftSt!= rightSt) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.st!= null) {
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
            TAthlet theAthlet;
            theAthlet = this.getAthlet();
            if (this.athlet!= null) {
                currentHashCode += theAthlet.hashCode();
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
            boolean theSt;
            theSt = ((this.st!= null)?this.isSt():false);
            if (this.st!= null) {
                currentHashCode += (theSt? 1231 : 1237);
            }
        }
        return currentHashCode;
    }

}
