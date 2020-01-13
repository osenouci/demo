
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Request criteria in relation to flight
 * 
 * <p>Java class for FlightRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureAirports" type="{http://www.bewotec.de/bewotecws/Schema}AirportListType" minOccurs="0"/>
 *         &lt;element name="ArrivalAirports" type="{http://www.bewotec.de/bewotecws/Schema}AirportListType" minOccurs="0"/>
 *         &lt;element name="FlightNumbers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DurationMin" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="DurationMax" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="NoAlternatives" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProductCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProductCode" type="{http://www.bewotec.de/bewotecws/Schema}FlightProductCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightTime" type="{http://www.bewotec.de/bewotecws/Schema}FlightTimeType" minOccurs="0"/>
 *         &lt;element name="OpenYawAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Airlines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Airline" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DurationMinInbound" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="DurationMaxInbound" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="FlightTimeInbound" type="{http://www.bewotec.de/bewotecws/Schema}FlightTimeType" minOccurs="0"/>
 *         &lt;element name="MinStops" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="MaxStops" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="MinStopsInbound" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="MaxStopsInbound" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Types" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DepartureAirportsInbound" type="{http://www.bewotec.de/bewotecws/Schema}AirportListType" minOccurs="0"/>
 *         &lt;element name="ArrivalAirportsInbound" type="{http://www.bewotec.de/bewotecws/Schema}AirportListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRequestType", propOrder = {
    "departureAirports",
    "arrivalAirports",
    "flightNumbers",
    "durationMin",
    "durationMax",
    "noAlternatives",
    "productCodes",
    "flightTime",
    "openYawAllowed",
    "airlines",
    "durationMinInbound",
    "durationMaxInbound",
    "flightTimeInbound",
    "minStops",
    "maxStops",
    "minStopsInbound",
    "maxStopsInbound",
    "types",
    "departureAirportsInbound",
    "arrivalAirportsInbound"
})
public class FlightRequestType {

    @XmlElementRef(name = "DepartureAirports", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportListType> departureAirports;
    @XmlElementRef(name = "ArrivalAirports", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportListType> arrivalAirports;
    @XmlElementRef(name = "FlightNumbers", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightRequestType.FlightNumbers> flightNumbers;
    @XmlElement(name = "DurationMin")
    @XmlSchemaType(name = "unsignedInt")
    protected Long durationMin;
    @XmlElement(name = "DurationMax")
    @XmlSchemaType(name = "unsignedInt")
    protected Long durationMax;
    @XmlElement(name = "NoAlternatives")
    protected Boolean noAlternatives;
    @XmlElement(name = "ProductCodes")
    protected FlightRequestType.ProductCodes productCodes;
    @XmlElement(name = "FlightTime")
    protected FlightTimeType flightTime;
    @XmlElement(name = "OpenYawAllowed")
    protected Boolean openYawAllowed;
    @XmlElement(name = "Airlines")
    protected FlightRequestType.Airlines airlines;
    @XmlElement(name = "DurationMinInbound")
    @XmlSchemaType(name = "unsignedInt")
    protected Long durationMinInbound;
    @XmlElement(name = "DurationMaxInbound")
    @XmlSchemaType(name = "unsignedInt")
    protected Long durationMaxInbound;
    @XmlElement(name = "FlightTimeInbound")
    protected FlightTimeType flightTimeInbound;
    @XmlElement(name = "MinStops")
    @XmlSchemaType(name = "unsignedInt")
    protected Long minStops;
    @XmlElement(name = "MaxStops")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxStops;
    @XmlElement(name = "MinStopsInbound")
    @XmlSchemaType(name = "unsignedInt")
    protected Long minStopsInbound;
    @XmlElement(name = "MaxStopsInbound")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxStopsInbound;
    @XmlElement(name = "Types")
    protected FlightRequestType.Types types;
    @XmlElementRef(name = "DepartureAirportsInbound", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportListType> departureAirportsInbound;
    @XmlElementRef(name = "ArrivalAirportsInbound", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportListType> arrivalAirportsInbound;

    /**
     * Gets the value of the departureAirports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportListType }{@code >}
     *     
     */
    public JAXBElement<AirportListType> getDepartureAirports() {
        return departureAirports;
    }

    /**
     * Sets the value of the departureAirports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportListType }{@code >}
     *     
     */
    public void setDepartureAirports(JAXBElement<AirportListType> value) {
        this.departureAirports = value;
    }

    /**
     * Gets the value of the arrivalAirports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportListType }{@code >}
     *     
     */
    public JAXBElement<AirportListType> getArrivalAirports() {
        return arrivalAirports;
    }

    /**
     * Sets the value of the arrivalAirports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportListType }{@code >}
     *     
     */
    public void setArrivalAirports(JAXBElement<AirportListType> value) {
        this.arrivalAirports = value;
    }

    /**
     * Gets the value of the flightNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightRequestType.FlightNumbers }{@code >}
     *     
     */
    public JAXBElement<FlightRequestType.FlightNumbers> getFlightNumbers() {
        return flightNumbers;
    }

    /**
     * Sets the value of the flightNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightRequestType.FlightNumbers }{@code >}
     *     
     */
    public void setFlightNumbers(JAXBElement<FlightRequestType.FlightNumbers> value) {
        this.flightNumbers = value;
    }

    /**
     * Gets the value of the durationMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDurationMin() {
        return durationMin;
    }

    /**
     * Sets the value of the durationMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDurationMin(Long value) {
        this.durationMin = value;
    }

    /**
     * Gets the value of the durationMax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDurationMax() {
        return durationMax;
    }

    /**
     * Sets the value of the durationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDurationMax(Long value) {
        this.durationMax = value;
    }

    /**
     * Gets the value of the noAlternatives property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoAlternatives() {
        return noAlternatives;
    }

    /**
     * Sets the value of the noAlternatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoAlternatives(Boolean value) {
        this.noAlternatives = value;
    }

    /**
     * Gets the value of the productCodes property.
     * 
     * @return
     *     possible object is
     *     {@link FlightRequestType.ProductCodes }
     *     
     */
    public FlightRequestType.ProductCodes getProductCodes() {
        return productCodes;
    }

    /**
     * Sets the value of the productCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRequestType.ProductCodes }
     *     
     */
    public void setProductCodes(FlightRequestType.ProductCodes value) {
        this.productCodes = value;
    }

    /**
     * Gets the value of the flightTime property.
     * 
     * @return
     *     possible object is
     *     {@link FlightTimeType }
     *     
     */
    public FlightTimeType getFlightTime() {
        return flightTime;
    }

    /**
     * Sets the value of the flightTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTimeType }
     *     
     */
    public void setFlightTime(FlightTimeType value) {
        this.flightTime = value;
    }

    /**
     * Gets the value of the openYawAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenYawAllowed() {
        return openYawAllowed;
    }

    /**
     * Sets the value of the openYawAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenYawAllowed(Boolean value) {
        this.openYawAllowed = value;
    }

    /**
     * Gets the value of the airlines property.
     * 
     * @return
     *     possible object is
     *     {@link FlightRequestType.Airlines }
     *     
     */
    public FlightRequestType.Airlines getAirlines() {
        return airlines;
    }

    /**
     * Sets the value of the airlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRequestType.Airlines }
     *     
     */
    public void setAirlines(FlightRequestType.Airlines value) {
        this.airlines = value;
    }

    /**
     * Gets the value of the durationMinInbound property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDurationMinInbound() {
        return durationMinInbound;
    }

    /**
     * Sets the value of the durationMinInbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDurationMinInbound(Long value) {
        this.durationMinInbound = value;
    }

    /**
     * Gets the value of the durationMaxInbound property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDurationMaxInbound() {
        return durationMaxInbound;
    }

    /**
     * Sets the value of the durationMaxInbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDurationMaxInbound(Long value) {
        this.durationMaxInbound = value;
    }

    /**
     * Gets the value of the flightTimeInbound property.
     * 
     * @return
     *     possible object is
     *     {@link FlightTimeType }
     *     
     */
    public FlightTimeType getFlightTimeInbound() {
        return flightTimeInbound;
    }

    /**
     * Sets the value of the flightTimeInbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTimeType }
     *     
     */
    public void setFlightTimeInbound(FlightTimeType value) {
        this.flightTimeInbound = value;
    }

    /**
     * Gets the value of the minStops property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinStops() {
        return minStops;
    }

    /**
     * Sets the value of the minStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinStops(Long value) {
        this.minStops = value;
    }

    /**
     * Gets the value of the maxStops property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxStops() {
        return maxStops;
    }

    /**
     * Sets the value of the maxStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxStops(Long value) {
        this.maxStops = value;
    }

    /**
     * Gets the value of the minStopsInbound property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinStopsInbound() {
        return minStopsInbound;
    }

    /**
     * Sets the value of the minStopsInbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinStopsInbound(Long value) {
        this.minStopsInbound = value;
    }

    /**
     * Gets the value of the maxStopsInbound property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxStopsInbound() {
        return maxStopsInbound;
    }

    /**
     * Sets the value of the maxStopsInbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxStopsInbound(Long value) {
        this.maxStopsInbound = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link FlightRequestType.Types }
     *     
     */
    public FlightRequestType.Types getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRequestType.Types }
     *     
     */
    public void setTypes(FlightRequestType.Types value) {
        this.types = value;
    }

    /**
     * Gets the value of the departureAirportsInbound property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportListType }{@code >}
     *     
     */
    public JAXBElement<AirportListType> getDepartureAirportsInbound() {
        return departureAirportsInbound;
    }

    /**
     * Sets the value of the departureAirportsInbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportListType }{@code >}
     *     
     */
    public void setDepartureAirportsInbound(JAXBElement<AirportListType> value) {
        this.departureAirportsInbound = value;
    }

    /**
     * Gets the value of the arrivalAirportsInbound property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportListType }{@code >}
     *     
     */
    public JAXBElement<AirportListType> getArrivalAirportsInbound() {
        return arrivalAirportsInbound;
    }

    /**
     * Sets the value of the arrivalAirportsInbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportListType }{@code >}
     *     
     */
    public void setArrivalAirportsInbound(JAXBElement<AirportListType> value) {
        this.arrivalAirportsInbound = value;
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
     *         &lt;element name="Airline" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "airline"
    })
    public static class Airlines {

        @XmlElement(name = "Airline", required = true)
        protected List<String> airline;

        /**
         * Gets the value of the airline property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airline property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirline().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAirline() {
            if (airline == null) {
                airline = new ArrayList<String>();
            }
            return this.airline;
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
     *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "flightNumber"
    })
    public static class FlightNumbers {

        @XmlElement(name = "FlightNumber")
        protected List<String> flightNumber;

        /**
         * Gets the value of the flightNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFlightNumber() {
            if (flightNumber == null) {
                flightNumber = new ArrayList<String>();
            }
            return this.flightNumber;
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
     *         &lt;element name="ProductCode" type="{http://www.bewotec.de/bewotecws/Schema}FlightProductCodeType" maxOccurs="unbounded" minOccurs="0"/>
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
        "productCode"
    })
    public static class ProductCodes {

        @XmlElement(name = "ProductCode")
        protected List<FlightProductCodeType> productCode;

        /**
         * Gets the value of the productCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProductCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightProductCodeType }
         * 
         * 
         */
        public List<FlightProductCodeType> getProductCode() {
            if (productCode == null) {
                productCode = new ArrayList<FlightProductCodeType>();
            }
            return this.productCode;
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
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "type"
    })
    public static class Types {

        @XmlElement(name = "Type", required = true)
        protected List<String> type;

        /**
         * Gets the value of the type property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the type property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getType() {
            if (type == null) {
                type = new ArrayList<String>();
            }
            return this.type;
        }

    }

}
