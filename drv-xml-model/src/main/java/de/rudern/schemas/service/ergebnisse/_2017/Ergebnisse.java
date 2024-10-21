
package de.rudern.schemas.service.ergebnisse._2017;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &amp;lt;element name="Rennen" type="{http://schemas.rudern.de/service/ergebnisse/2017/}tRennen" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Wettkampfrichter" type="{http://schemas.rudern.de/service/ergebnisse/2017/}tRegattaWKR" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rennen",
    "wettkampfrichter"
})
@XmlRootElement(name = "Ergebnisse")
public class Ergebnisse {

    @XmlElement(name = "Rennen")
    protected List<TRennen> rennen;
    @XmlElement(name = "Wettkampfrichter")
    protected List<TRegattaWKR> wettkampfrichter;

    /**
     * Gets the value of the rennen property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rennen property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRennen().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TRennen }
     * 
     * 
     */
    public List<TRennen> getRennen() {
        if (rennen == null) {
            rennen = new ArrayList<TRennen>();
        }
        return this.rennen;
    }

    /**
     * Gets the value of the wettkampfrichter property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the wettkampfrichter property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getWettkampfrichter().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TRegattaWKR }
     * 
     * 
     */
    public List<TRegattaWKR> getWettkampfrichter() {
        if (wettkampfrichter == null) {
            wettkampfrichter = new ArrayList<TRegattaWKR>();
        }
        return this.wettkampfrichter;
    }

    public void setRennen(List<TRennen> value) {
        this.rennen = null;
        if (value!= null) {
            List<TRennen> draftl = this.getRennen();
            draftl.addAll(value);
        }
    }

    public void setWettkampfrichter(List<TRegattaWKR> value) {
        this.wettkampfrichter = null;
        if (value!= null) {
            List<TRegattaWKR> draftl = this.getWettkampfrichter();
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
        final Ergebnisse that = ((Ergebnisse) object);
        {
            List<TRennen> leftRennen;
            leftRennen = (((this.rennen!= null)&&(!this.rennen.isEmpty()))?this.getRennen():null);
            List<TRennen> rightRennen;
            rightRennen = (((that.rennen!= null)&&(!that.rennen.isEmpty()))?that.getRennen():null);
            if ((this.rennen!= null)&&(!this.rennen.isEmpty())) {
                if ((that.rennen!= null)&&(!that.rennen.isEmpty())) {
                    if (!leftRennen.equals(rightRennen)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.rennen!= null)&&(!that.rennen.isEmpty())) {
                    return false;
                }
            }
        }
        {
            List<TRegattaWKR> leftWettkampfrichter;
            leftWettkampfrichter = (((this.wettkampfrichter!= null)&&(!this.wettkampfrichter.isEmpty()))?this.getWettkampfrichter():null);
            List<TRegattaWKR> rightWettkampfrichter;
            rightWettkampfrichter = (((that.wettkampfrichter!= null)&&(!that.wettkampfrichter.isEmpty()))?that.getWettkampfrichter():null);
            if ((this.wettkampfrichter!= null)&&(!this.wettkampfrichter.isEmpty())) {
                if ((that.wettkampfrichter!= null)&&(!that.wettkampfrichter.isEmpty())) {
                    if (!leftWettkampfrichter.equals(rightWettkampfrichter)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.wettkampfrichter!= null)&&(!that.wettkampfrichter.isEmpty())) {
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
            List<TRennen> theRennen;
            theRennen = (((this.rennen!= null)&&(!this.rennen.isEmpty()))?this.getRennen():null);
            if ((this.rennen!= null)&&(!this.rennen.isEmpty())) {
                currentHashCode += theRennen.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<TRegattaWKR> theWettkampfrichter;
            theWettkampfrichter = (((this.wettkampfrichter!= null)&&(!this.wettkampfrichter.isEmpty()))?this.getWettkampfrichter():null);
            if ((this.wettkampfrichter!= null)&&(!this.wettkampfrichter.isEmpty())) {
                currentHashCode += theWettkampfrichter.hashCode();
            }
        }
        return currentHashCode;
    }

}
