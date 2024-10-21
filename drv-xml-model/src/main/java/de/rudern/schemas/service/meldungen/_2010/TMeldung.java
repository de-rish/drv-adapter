
package de.rudern.schemas.service.meldungen._2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * &lt;p&gt;Java-Klasse für tMeldung complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tMeldung"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="mannschaft"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="position" type="{http://schemas.rudern.de/service/meldungen/2010/}tBootsPosition" maxOccurs="unbounded"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="parameters" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="parameter" maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;simpleContent&amp;gt;
 *                         &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;string"&amp;gt;
 *                           &amp;lt;attribute name="typ" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *                         &amp;lt;/extension&amp;gt;
 *                       &amp;lt;/simpleContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="alternative-zu" type="{http://schemas.rudern.de/service/ausschreibung/2010/}tRennNummer" /&amp;gt;
 *       &amp;lt;attribute name="verein" use="required" type="{http://schemas.rudern.de/service/meldungen/2010/}tVereinsID" /&amp;gt;
 *       &amp;lt;attribute name="obmann" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMeldung", propOrder = {
    "mannschaft",
    "titel",
    "parameters",
    "remark"
})
public class TMeldung {

    @XmlElementWrapper(required = true)
    @XmlElement(name = "position")
    protected List<TBootsPosition> mannschaft = new ArrayList<TBootsPosition>();
    @XmlElement(required = true)
    protected String titel;
    @XmlElementWrapper
    @XmlElement(name = "parameter")
    protected List<TMeldung.Parameter> parameters = new ArrayList<TMeldung.Parameter>();
    protected String remark;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "alternative-zu")
    protected String alternativeZu;
    @XmlAttribute(name = "verein", required = true)
    protected int verein;
    @XmlAttribute(name = "obmann", required = true)
    protected String obmann;

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
     * Ruft den Wert der remark-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Legt den Wert der remark-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der alternativeZu-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeZu() {
        return alternativeZu;
    }

    /**
     * Legt den Wert der alternativeZu-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeZu(String value) {
        this.alternativeZu = value;
    }

    /**
     * Ruft den Wert der verein-Eigenschaft ab.
     * 
     */
    public int getVerein() {
        return verein;
    }

    /**
     * Legt den Wert der verein-Eigenschaft fest.
     * 
     */
    public void setVerein(int value) {
        this.verein = value;
    }

    /**
     * Ruft den Wert der obmann-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObmann() {
        return obmann;
    }

    /**
     * Legt den Wert der obmann-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObmann(String value) {
        this.obmann = value;
    }

    public List<TBootsPosition> getMannschaft() {
        return mannschaft;
    }

    public void setMannschaft(List<TBootsPosition> mannschaft) {
        this.mannschaft = mannschaft;
    }

    public List<TMeldung.Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<TMeldung.Parameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TMeldung that = ((TMeldung) object);
        {
            List<TBootsPosition> leftMannschaft;
            leftMannschaft = ((this.mannschaft!= null)?this.getMannschaft():null);
            List<TBootsPosition> rightMannschaft;
            rightMannschaft = ((that.mannschaft!= null)?that.getMannschaft():null);
            if (this.mannschaft!= null) {
                if (that.mannschaft!= null) {
                    if (!leftMannschaft.equals(rightMannschaft)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.mannschaft!= null) {
                    return false;
                }
            }
        }
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
            List<TMeldung.Parameter> leftParameters;
            leftParameters = ((this.parameters!= null)?this.getParameters():null);
            List<TMeldung.Parameter> rightParameters;
            rightParameters = ((that.parameters!= null)?that.getParameters():null);
            if (this.parameters!= null) {
                if (that.parameters!= null) {
                    if (!leftParameters.equals(rightParameters)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.parameters!= null) {
                    return false;
                }
            }
        }
        {
            String leftRemark;
            leftRemark = this.getRemark();
            String rightRemark;
            rightRemark = that.getRemark();
            if (this.remark!= null) {
                if (that.remark!= null) {
                    if (!leftRemark.equals(rightRemark)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.remark!= null) {
                    return false;
                }
            }
        }
        {
            String leftId;
            leftId = this.getId();
            String rightId;
            rightId = that.getId();
            if (this.id!= null) {
                if (that.id!= null) {
                    if (!leftId.equals(rightId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.id!= null) {
                    return false;
                }
            }
        }
        {
            String leftAlternativeZu;
            leftAlternativeZu = this.getAlternativeZu();
            String rightAlternativeZu;
            rightAlternativeZu = that.getAlternativeZu();
            if (this.alternativeZu!= null) {
                if (that.alternativeZu!= null) {
                    if (!leftAlternativeZu.equals(rightAlternativeZu)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.alternativeZu!= null) {
                    return false;
                }
            }
        }
        {
            int leftVerein;
            leftVerein = this.getVerein();
            int rightVerein;
            rightVerein = that.getVerein();
            if (leftVerein!= rightVerein) {
                return false;
            }
        }
        {
            String leftObmann;
            leftObmann = this.getObmann();
            String rightObmann;
            rightObmann = that.getObmann();
            if (this.obmann!= null) {
                if (that.obmann!= null) {
                    if (!leftObmann.equals(rightObmann)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.obmann!= null) {
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
            List<TBootsPosition> theMannschaft;
            theMannschaft = ((this.mannschaft!= null)?this.getMannschaft():null);
            if (this.mannschaft!= null) {
                currentHashCode += theMannschaft.hashCode();
            }
        }
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
            List<TMeldung.Parameter> theParameters;
            theParameters = ((this.parameters!= null)?this.getParameters():null);
            if (this.parameters!= null) {
                currentHashCode += theParameters.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theRemark;
            theRemark = this.getRemark();
            if (this.remark!= null) {
                currentHashCode += theRemark.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theId;
            theId = this.getId();
            if (this.id!= null) {
                currentHashCode += theId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theAlternativeZu;
            theAlternativeZu = this.getAlternativeZu();
            if (this.alternativeZu!= null) {
                currentHashCode += theAlternativeZu.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            int theVerein;
            theVerein = this.getVerein();
            currentHashCode += theVerein;
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theObmann;
            theObmann = this.getObmann();
            if (this.obmann!= null) {
                currentHashCode += theObmann.hashCode();
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
     *   &amp;lt;simpleContent&amp;gt;
     *     &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;string"&amp;gt;
     *       &amp;lt;attribute name="typ" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
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
    public static class Parameter {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "typ")
        protected String typ;

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

        @Override
        public boolean equals(Object object) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final TMeldung.Parameter that = ((TMeldung.Parameter) object);
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
                String theTyp;
                theTyp = this.getTyp();
                if (this.typ!= null) {
                    currentHashCode += theTyp.hashCode();
                }
            }
            return currentHashCode;
        }

    }

}
