
package de.bewotec.bewotecws.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Geographic attributes of a service
 * 
 * <p>Java class for GeoLocationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoLocationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Airports" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.bewotec.de/bewotecws/Schema}CountryType" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.bewotec.de/bewotecws/Schema}RegionType" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.bewotec.de/bewotecws/Schema}CityType" minOccurs="0"/>
 *         &lt;element name="GeoCoordinate" type="{http://www.bewotec.de/bewotecws/Schema}GeoCoordinateType" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.bewotec.de/bewotecws/Schema}DestinationType" minOccurs="0"/>
 *         &lt;element name="Climate" type="{http://www.bewotec.de/bewotecws/Schema}ClimateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoLocationResponseType", propOrder = {
    "airports",
    "country",
    "region",
    "city",
    "geoCoordinate",
    "destination",
    "climate"
})
public class GeoLocationResponseType {

    @XmlElementRef(name = "Airports", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airports;
    @XmlElementRef(name = "Country", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CountryType> country;
    @XmlElement(name = "Region")
    protected RegionType region;
    @XmlElementRef(name = "City", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CityType> city;
    @XmlElementRef(name = "GeoCoordinate", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoCoordinateType> geoCoordinate;
    @XmlElement(name = "Destination")
    protected DestinationType destination;
    @XmlElement(name = "Climate")
    protected ClimateType climate;

    /**
     * Gets the value of the airports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirports() {
        return airports;
    }

    /**
     * Sets the value of the airports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirports(JAXBElement<String> value) {
        this.airports = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CountryType }{@code >}
     *     
     */
    public JAXBElement<CountryType> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CountryType }{@code >}
     *     
     */
    public void setCountry(JAXBElement<CountryType> value) {
        this.country = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link RegionType }
     *     
     */
    public RegionType getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionType }
     *     
     */
    public void setRegion(RegionType value) {
        this.region = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CityType }{@code >}
     *     
     */
    public JAXBElement<CityType> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CityType }{@code >}
     *     
     */
    public void setCity(JAXBElement<CityType> value) {
        this.city = value;
    }

    /**
     * Gets the value of the geoCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinateType }{@code >}
     *     
     */
    public JAXBElement<GeoCoordinateType> getGeoCoordinate() {
        return geoCoordinate;
    }

    /**
     * Sets the value of the geoCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoCoordinateType }{@code >}
     *     
     */
    public void setGeoCoordinate(JAXBElement<GeoCoordinateType> value) {
        this.geoCoordinate = value;
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

}
