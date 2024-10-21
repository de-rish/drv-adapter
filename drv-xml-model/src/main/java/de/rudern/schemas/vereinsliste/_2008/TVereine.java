
package de.rudern.schemas.vereinsliste._2008;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.luebeckregatta.model.adapter.DrvOffsetDateTimeXmlAdapter;


/**
 * &lt;p&gt;Java-Klasse für tVereine complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tVereine"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="verein" type="{http://schemas.rudern.de/vereinsliste/2008/}tVerein" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="erstellt" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tVereine", propOrder = {
    "verein"
})
public class TVereine {

    protected List<TVerein> verein;
    @XmlAttribute(name = "erstellt")
    @XmlJavaTypeAdapter(DrvOffsetDateTimeXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime erstellt;

    /**
     * Gets the value of the verein property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the verein property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getVerein().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TVerein }
     * 
     * 
     */
    public List<TVerein> getVerein() {
        if (verein == null) {
            verein = new ArrayList<TVerein>();
        }
        return this.verein;
    }

    /**
     * Ruft den Wert der erstellt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getErstellt() {
        return erstellt;
    }

    /**
     * Legt den Wert der erstellt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErstellt(OffsetDateTime value) {
        this.erstellt = value;
    }

    public void setVerein(List<TVerein> value) {
        this.verein = null;
        if (value!= null) {
            List<TVerein> draftl = this.getVerein();
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
        final TVereine that = ((TVereine) object);
        {
            List<TVerein> leftVerein;
            leftVerein = (((this.verein!= null)&&(!this.verein.isEmpty()))?this.getVerein():null);
            List<TVerein> rightVerein;
            rightVerein = (((that.verein!= null)&&(!that.verein.isEmpty()))?that.getVerein():null);
            if ((this.verein!= null)&&(!this.verein.isEmpty())) {
                if ((that.verein!= null)&&(!that.verein.isEmpty())) {
                    if (!leftVerein.equals(rightVerein)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.verein!= null)&&(!that.verein.isEmpty())) {
                    return false;
                }
            }
        }
        {
            OffsetDateTime leftErstellt;
            leftErstellt = this.getErstellt();
            OffsetDateTime rightErstellt;
            rightErstellt = that.getErstellt();
            if (this.erstellt!= null) {
                if (that.erstellt!= null) {
                    if (!leftErstellt.equals(rightErstellt)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.erstellt!= null) {
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
            List<TVerein> theVerein;
            theVerein = (((this.verein!= null)&&(!this.verein.isEmpty()))?this.getVerein():null);
            if ((this.verein!= null)&&(!this.verein.isEmpty())) {
                currentHashCode += theVerein.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            OffsetDateTime theErstellt;
            theErstellt = this.getErstellt();
            if (this.erstellt!= null) {
                currentHashCode += theErstellt.hashCode();
            }
        }
        return currentHashCode;
    }

}
