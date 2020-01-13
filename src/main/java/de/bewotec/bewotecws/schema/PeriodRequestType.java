
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Request criteria in relation to travel period
 * 
 * <p>Java class for PeriodRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Start" type="{http://www.bewotec.de/bewotecws/Schema}PeriodDelimiterType"/>
 *         &lt;element name="End" type="{http://www.bewotec.de/bewotecws/Schema}PeriodDelimiterType" minOccurs="0"/>
 *         &lt;element name="Durations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreferredDurations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PreferredDuration" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodRequestType", propOrder = {
    "start",
    "end",
    "durations",
    "preferredDurations"
})
public class PeriodRequestType {

    @XmlElement(name = "Start", required = true, nillable = true)
    protected PeriodDelimiterType start;
    @XmlElementRef(name = "End", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<PeriodDelimiterType> end;
    @XmlElementRef(name = "Durations", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<PeriodRequestType.Durations> durations;
    @XmlElement(name = "PreferredDurations")
    protected PeriodRequestType.PreferredDurations preferredDurations;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodDelimiterType }
     *     
     */
    public PeriodDelimiterType getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDelimiterType }
     *     
     */
    public void setStart(PeriodDelimiterType value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PeriodDelimiterType }{@code >}
     *     
     */
    public JAXBElement<PeriodDelimiterType> getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PeriodDelimiterType }{@code >}
     *     
     */
    public void setEnd(JAXBElement<PeriodDelimiterType> value) {
        this.end = value;
    }

    /**
     * Gets the value of the durations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PeriodRequestType.Durations }{@code >}
     *     
     */
    public JAXBElement<PeriodRequestType.Durations> getDurations() {
        return durations;
    }

    /**
     * Sets the value of the durations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PeriodRequestType.Durations }{@code >}
     *     
     */
    public void setDurations(JAXBElement<PeriodRequestType.Durations> value) {
        this.durations = value;
    }

    /**
     * Gets the value of the preferredDurations property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodRequestType.PreferredDurations }
     *     
     */
    public PeriodRequestType.PreferredDurations getPreferredDurations() {
        return preferredDurations;
    }

    /**
     * Sets the value of the preferredDurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodRequestType.PreferredDurations }
     *     
     */
    public void setPreferredDurations(PeriodRequestType.PreferredDurations value) {
        this.preferredDurations = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "duration"
    })
    public static class Durations {

        @XmlElement(name = "Duration")
        protected List<String> duration;

        /**
         * Gets the value of the duration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the duration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDuration().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDuration() {
            if (duration == null) {
                duration = new ArrayList<String>();
            }
            return this.duration;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PreferredDuration" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "preferredDuration"
    })
    public static class PreferredDurations {

        @XmlElement(name = "PreferredDuration")
        protected List<String> preferredDuration;

        /**
         * Gets the value of the preferredDuration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preferredDuration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreferredDuration().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPreferredDuration() {
            if (preferredDuration == null) {
                preferredDuration = new ArrayList<String>();
            }
            return this.preferredDuration;
        }

    }

}
