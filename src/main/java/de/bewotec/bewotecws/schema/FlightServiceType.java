
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
 * Flight service
 * 
 * <p>Java class for FlightServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartAirport" type="{http://www.bewotec.de/bewotecws/Schema}AirportType"/>
 *         &lt;element name="EndAirport" type="{http://www.bewotec.de/bewotecws/Schema}AirportType"/>
 *         &lt;element name="Oneway" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FlightVariants" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightVariant" type="{http://www.bewotec.de/bewotecws/Schema}FlightVariantType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "FlightServiceType", propOrder = {
    "startAirport",
    "endAirport",
    "oneway",
    "flightVariants"
})
public class FlightServiceType {

    @XmlElement(name = "StartAirport", required = true)
    protected String startAirport;
    @XmlElement(name = "EndAirport", required = true)
    protected String endAirport;
    @XmlElement(name = "Oneway")
    protected Boolean oneway;
    @XmlElementRef(name = "FlightVariants", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightServiceType.FlightVariants> flightVariants;

    /**
     * Gets the value of the startAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartAirport() {
        return startAirport;
    }

    /**
     * Sets the value of the startAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAirport(String value) {
        this.startAirport = value;
    }

    /**
     * Gets the value of the endAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndAirport() {
        return endAirport;
    }

    /**
     * Sets the value of the endAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndAirport(String value) {
        this.endAirport = value;
    }

    /**
     * Gets the value of the oneway property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneway() {
        return oneway;
    }

    /**
     * Sets the value of the oneway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneway(Boolean value) {
        this.oneway = value;
    }

    /**
     * Gets the value of the flightVariants property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightServiceType.FlightVariants }{@code >}
     *     
     */
    public JAXBElement<FlightServiceType.FlightVariants> getFlightVariants() {
        return flightVariants;
    }

    /**
     * Sets the value of the flightVariants property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightServiceType.FlightVariants }{@code >}
     *     
     */
    public void setFlightVariants(JAXBElement<FlightServiceType.FlightVariants> value) {
        this.flightVariants = value;
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
     *         &lt;element name="FlightVariant" type="{http://www.bewotec.de/bewotecws/Schema}FlightVariantType" maxOccurs="unbounded" minOccurs="0"/>
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
        "flightVariant"
    })
    public static class FlightVariants {

        @XmlElement(name = "FlightVariant", nillable = true)
        protected List<FlightVariantType> flightVariant;

        /**
         * Gets the value of the flightVariant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightVariant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightVariant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightVariantType }
         * 
         * 
         */
        public List<FlightVariantType> getFlightVariant() {
            if (flightVariant == null) {
                flightVariant = new ArrayList<FlightVariantType>();
            }
            return this.flightVariant;
        }

    }

}
