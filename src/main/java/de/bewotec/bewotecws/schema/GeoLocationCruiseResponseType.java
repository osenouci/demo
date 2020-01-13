
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
 * Geographic attributes of a cruise service
 * 
 * <p>Java class for GeoLocationCruiseResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoLocationCruiseResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginAirports" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationAirports" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.bewotec.de/bewotecws/Schema}CodeNameType" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.bewotec.de/bewotecws/Schema}DestinationType" minOccurs="0"/>
 *         &lt;element name="Climate" type="{http://www.bewotec.de/bewotecws/Schema}ClimateType" minOccurs="0"/>
 *         &lt;element name="Ports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Port" type="{http://www.bewotec.de/bewotecws/Schema}CodeNameType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Route" type="{http://www.bewotec.de/bewotecws/Schema}CodeNameType" minOccurs="0"/>
 *         &lt;element name="RouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoLocationCruiseResponseType", propOrder = {
    "originAirports",
    "destinationAirports",
    "region",
    "destination",
    "climate",
    "ports",
    "route",
    "routeIdentifier"
})
public class GeoLocationCruiseResponseType {

    @XmlElementRef(name = "OriginAirports", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originAirports;
    @XmlElementRef(name = "DestinationAirports", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationAirports;
    @XmlElement(name = "Region")
    protected CodeNameType region;
    @XmlElement(name = "Destination")
    protected DestinationType destination;
    @XmlElement(name = "Climate")
    protected ClimateType climate;
    @XmlElement(name = "Ports")
    protected GeoLocationCruiseResponseType.Ports ports;
    @XmlElement(name = "Route")
    protected CodeNameType route;
    @XmlElement(name = "RouteIdentifier")
    protected String routeIdentifier;

    /**
     * Gets the value of the originAirports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginAirports() {
        return originAirports;
    }

    /**
     * Sets the value of the originAirports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginAirports(JAXBElement<String> value) {
        this.originAirports = value;
    }

    /**
     * Gets the value of the destinationAirports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationAirports() {
        return destinationAirports;
    }

    /**
     * Sets the value of the destinationAirports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationAirports(JAXBElement<String> value) {
        this.destinationAirports = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNameType }
     *     
     */
    public CodeNameType getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNameType }
     *     
     */
    public void setRegion(CodeNameType value) {
        this.region = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationType }
     *     
     */
    public DestinationType getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationType }
     *     
     */
    public void setDestination(DestinationType value) {
        this.destination = value;
    }

    /**
     * Gets the value of the climate property.
     * 
     * @return
     *     possible object is
     *     {@link ClimateType }
     *     
     */
    public ClimateType getClimate() {
        return climate;
    }

    /**
     * Sets the value of the climate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClimateType }
     *     
     */
    public void setClimate(ClimateType value) {
        this.climate = value;
    }

    /**
     * Gets the value of the ports property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocationCruiseResponseType.Ports }
     *     
     */
    public GeoLocationCruiseResponseType.Ports getPorts() {
        return ports;
    }

    /**
     * Sets the value of the ports property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocationCruiseResponseType.Ports }
     *     
     */
    public void setPorts(GeoLocationCruiseResponseType.Ports value) {
        this.ports = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNameType }
     *     
     */
    public CodeNameType getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNameType }
     *     
     */
    public void setRoute(CodeNameType value) {
        this.route = value;
    }

    /**
     * Gets the value of the routeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteIdentifier() {
        return routeIdentifier;
    }

    /**
     * Sets the value of the routeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteIdentifier(String value) {
        this.routeIdentifier = value;
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
     *         &lt;element name="Port" type="{http://www.bewotec.de/bewotecws/Schema}CodeNameType" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(name = "Port")
        protected List<CodeNameType> port;

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
         * {@link CodeNameType }
         * 
         * 
         */
        public List<CodeNameType> getPort() {
            if (port == null) {
                port = new ArrayList<CodeNameType>();
            }
            return this.port;
        }

    }

}
