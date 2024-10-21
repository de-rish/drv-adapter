
package de.rudern.schemas.service.ausschreibung._2010;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für tAusschreibung complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tAusschreibung"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="regatta" type="{http://schemas.rudern.de/service/ausschreibung/2010/}tRegatta" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAusschreibung", propOrder = {
    "regatta"
})
public class TAusschreibung {

    @XmlElement(required = true)
    protected List<TRegatta> regatta;

    /**
     * Gets the value of the regatta property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the regatta property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRegatta().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TRegatta }
     * 
     * 
     */
    public List<TRegatta> getRegatta() {
        if (regatta == null) {
            regatta = new ArrayList<TRegatta>();
        }
        return this.regatta;
    }

    public void setRegatta(List<TRegatta> value) {
        this.regatta = null;
        if (value!= null) {
            List<TRegatta> draftl = this.getRegatta();
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
        final TAusschreibung that = ((TAusschreibung) object);
        {
            List<TRegatta> leftRegatta;
            leftRegatta = (((this.regatta!= null)&&(!this.regatta.isEmpty()))?this.getRegatta():null);
            List<TRegatta> rightRegatta;
            rightRegatta = (((that.regatta!= null)&&(!that.regatta.isEmpty()))?that.getRegatta():null);
            if ((this.regatta!= null)&&(!this.regatta.isEmpty())) {
                if ((that.regatta!= null)&&(!that.regatta.isEmpty())) {
                    if (!leftRegatta.equals(rightRegatta)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.regatta!= null)&&(!that.regatta.isEmpty())) {
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
            List<TRegatta> theRegatta;
            theRegatta = (((this.regatta!= null)&&(!this.regatta.isEmpty()))?this.getRegatta():null);
            if ((this.regatta!= null)&&(!this.regatta.isEmpty())) {
                currentHashCode += theRegatta.hashCode();
            }
        }
        return currentHashCode;
    }

}
