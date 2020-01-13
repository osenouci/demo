
package de.bewotec.bewotecws.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Dynamic filter criterias
 * 
 * <p>Java class for DynamicFilters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicFilters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributesOverview" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Attribute" type="{http://www.bewotec.de/bewotecws/Schema}AttributeCountType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Durations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TravelStartDatesFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TravelStartDatesTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TravelStartDates" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaxPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OutboundDepartureTimes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *         &lt;element name="Ports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeparturePorts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArrivalPorts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProductCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DynamicFilters", propOrder = {
    "attributesOverview",
    "durations",
    "travelStartDatesFrom",
    "travelStartDatesTo",
    "travelStartDates",
    "minPrice",
    "maxPrice",
    "outboundDepartureTimes",
    "airlines",
    "ports",
    "departurePorts",
    "arrivalPorts",
    "productCodes"
})
public class DynamicFilters {

    @XmlElement(name = "AttributesOverview")
    protected DynamicFilters.AttributesOverview attributesOverview;
    @XmlElement(name = "Durations")
    protected DynamicFilters.Durations durations;
    @XmlElement(name = "TravelStartDatesFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar travelStartDatesFrom;
    @XmlElement(name = "TravelStartDatesTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar travelStartDatesTo;
    @XmlElement(name = "TravelStartDates")
    protected String travelStartDates;
    @XmlElement(name = "MinPrice")
    protected BigDecimal minPrice;
    @XmlElement(name = "MaxPrice")
    protected BigDecimal maxPrice;
    @XmlElement(name = "OutboundDepartureTimes")
    protected DynamicFilters.OutboundDepartureTimes outboundDepartureTimes;
    @XmlElement(name = "Airlines")
    protected DynamicFilters.Airlines airlines;
    @XmlElementRef(name = "Ports", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<DynamicFilters.Ports> ports;
    @XmlElementRef(name = "DeparturePorts", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<DynamicFilters.DeparturePorts> departurePorts;
    @XmlElementRef(name = "ArrivalPorts", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<DynamicFilters.ArrivalPorts> arrivalPorts;
    @XmlElementRef(name = "ProductCodes", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<DynamicFilters.ProductCodes> productCodes;

    /**
     * Gets the value of the attributesOverview property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicFilters.AttributesOverview }
     *     
     */
    public DynamicFilters.AttributesOverview getAttributesOverview() {
        return attributesOverview;
    }

    /**
     * Sets the value of the attributesOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicFilters.AttributesOverview }
     *     
     */
    public void setAttributesOverview(DynamicFilters.AttributesOverview value) {
        this.attributesOverview = value;
    }

    /**
     * Gets the value of the durations property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicFilters.Durations }
     *     
     */
    public DynamicFilters.Durations getDurations() {
        return durations;
    }

    /**
     * Sets the value of the durations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicFilters.Durations }
     *     
     */
    public void setDurations(DynamicFilters.Durations value) {
        this.durations = value;
    }

    /**
     * Gets the value of the travelStartDatesFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelStartDatesFrom() {
        return travelStartDatesFrom;
    }

    /**
     * Sets the value of the travelStartDatesFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelStartDatesFrom(XMLGregorianCalendar value) {
        this.travelStartDatesFrom = value;
    }

    /**
     * Gets the value of the travelStartDatesTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelStartDatesTo() {
        return travelStartDatesTo;
    }

    /**
     * Sets the value of the travelStartDatesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelStartDatesTo(XMLGregorianCalendar value) {
        this.travelStartDatesTo = value;
    }

    /**
     * Gets the value of the travelStartDates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelStartDates() {
        return travelStartDates;
    }

    /**
     * Sets the value of the travelStartDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelStartDates(String value) {
        this.travelStartDates = value;
    }

    /**
     * Gets the value of the minPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinPrice(BigDecimal value) {
        this.minPrice = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPrice(BigDecimal value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the outboundDepartureTimes property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicFilters.OutboundDepartureTimes }
     *     
     */
    public DynamicFilters.OutboundDepartureTimes getOutboundDepartureTimes() {
        return outboundDepartureTimes;
    }

    /**
     * Sets the value of the outboundDepartureTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicFilters.OutboundDepartureTimes }
     *     
     */
    public void setOutboundDepartureTimes(DynamicFilters.OutboundDepartureTimes value) {
        this.outboundDepartureTimes = value;
    }

    /**
     * Gets the value of the airlines property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicFilters.Airlines }
     *     
     */
    public DynamicFilters.Airlines getAirlines() {
        return airlines;
    }

    /**
     * Sets the value of the airlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicFilters.Airlines }
     *     
     */
    public void setAirlines(DynamicFilters.Airlines value) {
        this.airlines = value;
    }

    /**
     * Gets the value of the ports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DynamicFilters.Ports }{@code >}
     *     
     */
    public JAXBElement<DynamicFilters.Ports> getPorts() {
        return ports;
    }

    /**
     * Sets the value of the ports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DynamicFilters.Ports }{@code >}
     *     
     */
    public void setPorts(JAXBElement<DynamicFilters.Ports> value) {
        this.ports = value;
    }

    /**
     * Gets the value of the departurePorts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DynamicFilters.DeparturePorts }{@code >}
     *     
     */
    public JAXBElement<DynamicFilters.DeparturePorts> getDeparturePorts() {
        return departurePorts;
    }

    /**
     * Sets the value of the departurePorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DynamicFilters.DeparturePorts }{@code >}
     *     
     */
    public void setDeparturePorts(JAXBElement<DynamicFilters.DeparturePorts> value) {
        this.departurePorts = value;
    }

    /**
     * Gets the value of the arrivalPorts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DynamicFilters.ArrivalPorts }{@code >}
     *     
     */
    public JAXBElement<DynamicFilters.ArrivalPorts> getArrivalPorts() {
        return arrivalPorts;
    }

    /**
     * Sets the value of the arrivalPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DynamicFilters.ArrivalPorts }{@code >}
     *     
     */
    public void setArrivalPorts(JAXBElement<DynamicFilters.ArrivalPorts> value) {
        this.arrivalPorts = value;
    }

    /**
     * Gets the value of the productCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DynamicFilters.ProductCodes }{@code >}
     *     
     */
    public JAXBElement<DynamicFilters.ProductCodes> getProductCodes() {
        return productCodes;
    }

    /**
     * Sets the value of the productCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DynamicFilters.ProductCodes }{@code >}
     *     
     */
    public void setProductCodes(JAXBElement<DynamicFilters.ProductCodes> value) {
        this.productCodes = value;
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
     *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "port"
    })
    public static class ArrivalPorts {

        @XmlElement(name = "Port", nillable = true)
        protected List<String> port;

        /**
         * Gets the value of the port property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the port property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPort().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPort() {
            if (port == null) {
                port = new ArrayList<String>();
            }
            return this.port;
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
     *         &lt;element name="Attribute" type="{http://www.bewotec.de/bewotecws/Schema}AttributeCountType" maxOccurs="unbounded"/>
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
        "attribute"
    })
    public static class AttributesOverview {

        @XmlElement(name = "Attribute", required = true)
        protected List<AttributeCountType> attribute;

        /**
         * Gets the value of the attribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeCountType }
         * 
         * 
         */
        public List<AttributeCountType> getAttribute() {
            if (attribute == null) {
                attribute = new ArrayList<AttributeCountType>();
            }
            return this.attribute;
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
     *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "port"
    })
    public static class DeparturePorts {

        @XmlElement(name = "Port", nillable = true)
        protected List<String> port;

        /**
         * Gets the value of the port property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the port property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPort().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPort() {
            if (port == null) {
                port = new ArrayList<String>();
            }
            return this.port;
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
     *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
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

        @XmlElement(name = "Duration", type = Integer.class)
        protected List<Integer> duration;

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
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getDuration() {
            if (duration == null) {
                duration = new ArrayList<Integer>();
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
     *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "time"
    })
    public static class OutboundDepartureTimes {

        @XmlElement(name = "Time", required = true)
        protected List<String> time;

        /**
         * Gets the value of the time property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the time property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTime() {
            if (time == null) {
                time = new ArrayList<String>();
            }
            return this.time;
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
     *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "port"
    })
    public static class Ports {

        @XmlElement(name = "Port", nillable = true)
        protected List<String> port;

        /**
         * Gets the value of the port property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the port property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPort().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPort() {
            if (port == null) {
                port = new ArrayList<String>();
            }
            return this.port;
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
     *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(name = "ProductCode", nillable = true)
        protected List<String> productCode;

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
         * {@link String }
         * 
         * 
         */
        public List<String> getProductCode() {
            if (productCode == null) {
                productCode = new ArrayList<String>();
            }
            return this.productCode;
        }

    }

}
