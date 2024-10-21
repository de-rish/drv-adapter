
package de.rudern.schemas.service.ausschreibung._2010;

import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.github.threetenjaxb.core.LocalDateXmlAdapter;


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
 *         &amp;lt;element name="nummer" type="{http://schemas.rudern.de/service/ausschreibung/2010/}tRennNummer"/&amp;gt;
 *         &amp;lt;element name="spezifikation" type="{http://schemas.rudern.de/service/ausschreibung/2010/}tRennSpezifikation"/&amp;gt;
 *         &amp;lt;element name="zusatz" type="{http://schemas.rudern.de/service/ausschreibung/2010/}tRennZusatz" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="parameters" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="param"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;simpleContent&amp;gt;
 *                         &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;string"&amp;gt;
 *                           &amp;lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *                         &amp;lt;/extension&amp;gt;
 *                       &amp;lt;/simpleContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="datum" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRennen", propOrder = {
    "nummer",
    "spezifikation",
    "zusatz",
    "parameters"
})
public class TRennen {

    @XmlElement(required = true)
    protected String nummer;
    @XmlElement(required = true)
    protected String spezifikation;
    protected String zusatz;
    protected TRennen.Parameters parameters;
    @XmlAttribute(name = "datum")
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate datum;

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

    /**
     * Ruft den Wert der parameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TRennen.Parameters }
     *     
     */
    public TRennen.Parameters getParameters() {
        return parameters;
    }

    /**
     * Legt den Wert der parameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TRennen.Parameters }
     *     
     */
    public void setParameters(TRennen.Parameters value) {
        this.parameters = value;
    }

    /**
     * Ruft den Wert der datum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDatum() {
        return datum;
    }

    /**
     * Legt den Wert der datum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(LocalDate value) {
        this.datum = value;
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
        {
            TRennen.Parameters leftParameters;
            leftParameters = this.getParameters();
            TRennen.Parameters rightParameters;
            rightParameters = that.getParameters();
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
            LocalDate leftDatum;
            leftDatum = this.getDatum();
            LocalDate rightDatum;
            rightDatum = that.getDatum();
            if (this.datum!= null) {
                if (that.datum!= null) {
                    if (!leftDatum.equals(rightDatum)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.datum!= null) {
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
        {
            currentHashCode = (currentHashCode* 31);
            TRennen.Parameters theParameters;
            theParameters = this.getParameters();
            if (this.parameters!= null) {
                currentHashCode += theParameters.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            LocalDate theDatum;
            theDatum = this.getDatum();
            if (this.datum!= null) {
                currentHashCode += theDatum.hashCode();
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
     *         &amp;lt;element name="param"&amp;gt;
     *           &amp;lt;complexType&amp;gt;
     *             &amp;lt;simpleContent&amp;gt;
     *               &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;string"&amp;gt;
     *                 &amp;lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
     *               &amp;lt;/extension&amp;gt;
     *             &amp;lt;/simpleContent&amp;gt;
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
    @XmlType(name = "", propOrder = {
        "param"
    })
    public static class Parameters {

        @XmlElement(required = true)
        protected TRennen.Parameters.Param param;

        /**
         * Ruft den Wert der param-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TRennen.Parameters.Param }
         *     
         */
        public TRennen.Parameters.Param getParam() {
            return param;
        }

        /**
         * Legt den Wert der param-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TRennen.Parameters.Param }
         *     
         */
        public void setParam(TRennen.Parameters.Param value) {
            this.param = value;
        }

        @Override
        public boolean equals(Object object) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final TRennen.Parameters that = ((TRennen.Parameters) object);
            {
                TRennen.Parameters.Param leftParam;
                leftParam = this.getParam();
                TRennen.Parameters.Param rightParam;
                rightParam = that.getParam();
                if (this.param!= null) {
                    if (that.param!= null) {
                        if (!leftParam.equals(rightParam)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    if (that.param!= null) {
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
                TRennen.Parameters.Param theParam;
                theParam = this.getParam();
                if (this.param!= null) {
                    currentHashCode += theParam.hashCode();
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
         *       &amp;lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
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
        public static class Param {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "name")
            protected String name;

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
             * Ruft den Wert der name-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Legt den Wert der name-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            @Override
            public boolean equals(Object object) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final TRennen.Parameters.Param that = ((TRennen.Parameters.Param) object);
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
                    String leftName;
                    leftName = this.getName();
                    String rightName;
                    rightName = that.getName();
                    if (this.name!= null) {
                        if (that.name!= null) {
                            if (!leftName.equals(rightName)) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        if (that.name!= null) {
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
                    String theName;
                    theName = this.getName();
                    if (this.name!= null) {
                        currentHashCode += theName.hashCode();
                    }
                }
                return currentHashCode;
            }

        }

    }

}
