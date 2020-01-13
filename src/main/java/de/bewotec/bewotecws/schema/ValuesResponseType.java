
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Response delivers data to support search masks. In current state the following information can be delivered: - Country codes - Departure airports - Product groups - Region trees 
 * 
 * <p>Java class for ValuesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValuesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bewotec.de/bewotecws/Schema}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="ArrivalAirports" type="{http://www.bewotec.de/bewotecws/Schema}AirportListType" minOccurs="0"/>
 *         &lt;element name="DepartureAirports" type="{http://www.bewotec.de/bewotecws/Schema}AirportListType" minOccurs="0"/>
 *         &lt;element name="Countries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Country" type="{http://www.bewotec.de/bewotecws/Schema}CountryType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Regions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Region" type="{http://www.bewotec.de/bewotecws/Schema}RegionType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProductGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProductGroup" type="{http://www.bewotec.de/bewotecws/Schema}ProductGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccommodationProperties" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccommodationProperty" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MinDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HotelNames" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoomTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BoardTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BoardType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GeoLocations" type="{http://www.bewotec.de/bewotecws/Schema}ValuesDescendantsType" minOccurs="0"/>
 *         &lt;element name="TouroperatorCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TouroperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Destinations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Destination" type="{http://www.bewotec.de/bewotecws/Schema}DestinationType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cruise" type="{http://www.bewotec.de/bewotecws/Schema}ValuesCruiseType" minOccurs="0"/>
 *         &lt;element name="Hotels" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Hotel" type="{http://www.bewotec.de/bewotecws/Schema}ValuesHotelType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuesResponseType", propOrder = {
    "arrivalAirports",
    "departureAirports",
    "countries",
    "regions",
    "productGroups",
    "accommodationProperties",
    "minDate",
    "maxDate",
    "hotelNames",
    "cities",
    "roomTypes",
    "boardTypes",
    "geoLocations",
    "touroperatorCodes",
    "destinations",
    "cruise",
    "hotels",
    "priceTypes"
})
public class ValuesResponseType
    extends BaseResponseType
{

    @XmlElementRef(name = "ArrivalAirports", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportListType> arrivalAirports;
    @XmlElementRef(name = "DepartureAirports", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportListType> departureAirports;
    @XmlElementRef(name = "Countries", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<ValuesResponseType.Countries> countries;
    @XmlElementRef(name = "Regions", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<ValuesResponseType.Regions> regions;
    @XmlElementRef(name = "ProductGroups", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<ValuesResponseType.ProductGroups> productGroups;
    @XmlElement(name = "AccommodationProperties")
    protected ValuesResponseType.AccommodationProperties accommodationProperties;
    @XmlElement(name = "MinDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minDate;
    @XmlElement(name = "MaxDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxDate;
    @XmlElement(name = "HotelNames")
    protected ValuesResponseType.HotelNames hotelNames;
    @XmlElement(name = "Cities")
    protected ValuesResponseType.Cities cities;
    @XmlElement(name = "RoomTypes")
    protected ValuesResponseType.RoomTypes roomTypes;
    @XmlElement(name = "BoardTypes")
    protected ValuesResponseType.BoardTypes boardTypes;
    @XmlElement(name = "GeoLocations")
    protected ValuesDescendantsType geoLocations;
    @XmlElement(name = "TouroperatorCodes")
    protected ValuesResponseType.TouroperatorCodes touroperatorCodes;
    @XmlElementRef(name = "Destinations", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<ValuesResponseType.Destinations> destinations;
    @XmlElement(name = "Cruise")
    protected ValuesCruiseType cruise;
    @XmlElement(name = "Hotels")
    protected ValuesResponseType.Hotels hotels;
    @XmlElement(name = "PriceTypes")
    protected ValuesResponseType.PriceTypes priceTypes;

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
     * Gets the value of the countries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValuesResponseType.Countries }{@code >}
     *     
     */
    public JAXBElement<ValuesResponseType.Countries> getCountries() {
        return countries;
    }

    /**
     * Sets the value of the countries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValuesResponseType.Countries }{@code >}
     *     
     */
    public void setCountries(JAXBElement<ValuesResponseType.Countries> value) {
        this.countries = value;
    }

    /**
     * Gets the value of the regions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValuesResponseType.Regions }{@code >}
     *     
     */
    public JAXBElement<ValuesResponseType.Regions> getRegions() {
        return regions;
    }

    /**
     * Sets the value of the regions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValuesResponseType.Regions }{@code >}
     *     
     */
    public void setRegions(JAXBElement<ValuesResponseType.Regions> value) {
        this.regions = value;
    }

    /**
     * Gets the value of the productGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValuesResponseType.ProductGroups }{@code >}
     *     
     */
    public JAXBElement<ValuesResponseType.ProductGroups> getProductGroups() {
        return productGroups;
    }

    /**
     * Sets the value of the productGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValuesResponseType.ProductGroups }{@code >}
     *     
     */
    public void setProductGroups(JAXBElement<ValuesResponseType.ProductGroups> value) {
        this.productGroups = value;
    }

    /**
     * Gets the value of the accommodationProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesResponseType.AccommodationProperties }
     *     
     */
    public ValuesResponseType.AccommodationProperties getAccommodationProperties() {
        return accommodationProperties;
    }

    /**
     * Sets the value of the accommodationProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesResponseType.AccommodationProperties }
     *     
     */
    public void setAccommodationProperties(ValuesResponseType.AccommodationProperties value) {
        this.accommodationProperties = value;
    }

    /**
     * Gets the value of the minDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinDate() {
        return minDate;
    }

    /**
     * Sets the value of the minDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinDate(XMLGregorianCalendar value) {
        this.minDate = value;
    }

    /**
     * Gets the value of the maxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxDate() {
        return maxDate;
    }

    /**
     * Sets the value of the maxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxDate(XMLGregorianCalendar value) {
        this.maxDate = value;
    }

    /**
     * Gets the value of the hotelNames property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesResponseType.HotelNames }
     *     
     */
    public ValuesResponseType.HotelNames getHotelNames() {
        return hotelNames;
    }

    /**
     * Sets the value of the hotelNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesResponseType.HotelNames }
     *     
     */
    public void setHotelNames(ValuesResponseType.HotelNames value) {
        this.hotelNames = value;
    }

    /**
     * Gets the value of the cities property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesResponseType.Cities }
     *     
     */
    public ValuesResponseType.Cities getCities() {
        return cities;
    }

    /**
     * Sets the value of the cities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesResponseType.Cities }
     *     
     */
    public void setCities(ValuesResponseType.Cities value) {
        this.cities = value;
    }

    /**
     * Gets the value of the roomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesResponseType.RoomTypes }
     *     
     */
    public ValuesResponseType.RoomTypes getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesResponseType.RoomTypes }
     *     
     */
    public void setRoomTypes(ValuesResponseType.RoomTypes value) {
        this.roomTypes = value;
    }

    /**
     * Gets the value of the boardTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesResponseType.BoardTypes }
     *     
     */
    public ValuesResponseType.BoardTypes getBoardTypes() {
        return boardTypes;
    }

    /**
     * Sets the value of the boardTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesResponseType.BoardTypes }
     *     
     */
    public void setBoardTypes(ValuesResponseType.BoardTypes value) {
        this.boardTypes = value;
    }

    /**
     * Gets the value of the geoLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesDescendantsType }
     *     
     */
    public ValuesDescendantsType getGeoLocations() {
        return geoLocations;
    }

    /**
     * Sets the value of the geoLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesDescendantsType }
     *     
     */
    public void setGeoLocations(ValuesDescendantsType value) {
        this.geoLocations = value;
    }

    /**
     * Gets the value of the touroperatorCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesResponseType.TouroperatorCodes }
     *     
     */
    public ValuesResponseType.TouroperatorCodes getTouroperatorCodes() {
        return touroperatorCodes;
    }

    /**
     * Sets the value of the touroperatorCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesResponseType.TouroperatorCodes }
     *     
     */
    public void setTouroperatorCodes(ValuesResponseType.TouroperatorCodes value) {
        this.touroperatorCodes = value;
    }

    /**
     * Gets the value of the destinations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValuesResponseType.Destinations }{@code >}
     *     
     */
    public JAXBElement<ValuesResponseType.Destinations> getDestinations() {
        return destinations;
    }

    /**
     * Sets the value of the destinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValuesResponseType.Destinations }{@code >}
     *     
     */
    public void setDestinations(JAXBElement<ValuesResponseType.Destinations> value) {
        this.destinations = value;
    }

    /**
     * Gets the value of the cruise property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesCruiseType }
     *     
     */
    public ValuesCruiseType getCruise() {
        return cruise;
    }

    /**
     * Sets the value of the cruise property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesCruiseType }
     *     
     */
    public void setCruise(ValuesCruiseType value) {
        this.cruise = value;
    }

    /**
     * Gets the value of the hotels property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesResponseType.Hotels }
     *     
     */
    public ValuesResponseType.Hotels getHotels() {
        return hotels;
    }

    /**
     * Sets the value of the hotels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesResponseType.Hotels }
     *     
     */
    public void setHotels(ValuesResponseType.Hotels value) {
        this.hotels = value;
    }

    /**
     * Gets the value of the priceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesResponseType.PriceTypes }
     *     
     */
    public ValuesResponseType.PriceTypes getPriceTypes() {
        return priceTypes;
    }

    /**
     * Sets the value of the priceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesResponseType.PriceTypes }
     *     
     */
    public void setPriceTypes(ValuesResponseType.PriceTypes value) {
        this.priceTypes = value;
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
     *         &lt;element name="AccommodationProperty" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "accommodationProperty"
    })
    public static class AccommodationProperties {

        @XmlElement(name = "AccommodationProperty", required = true)
        protected List<String> accommodationProperty;

        /**
         * Gets the value of the accommodationProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accommodationProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccommodationProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAccommodationProperty() {
            if (accommodationProperty == null) {
                accommodationProperty = new ArrayList<String>();
            }
            return this.accommodationProperty;
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
     *         &lt;element name="BoardType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "boardType"
    })
    public static class BoardTypes {

        @XmlElement(name = "BoardType", required = true)
        protected List<String> boardType;

        /**
         * Gets the value of the boardType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the boardType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBoardType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBoardType() {
            if (boardType == null) {
                boardType = new ArrayList<String>();
            }
            return this.boardType;
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
     *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "city"
    })
    public static class Cities {

        @XmlElement(name = "City", required = true)
        protected List<String> city;

        /**
         * Gets the value of the city property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the city property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCity() {
            if (city == null) {
                city = new ArrayList<String>();
            }
            return this.city;
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
     *         &lt;element name="Country" type="{http://www.bewotec.de/bewotecws/Schema}CountryType" maxOccurs="unbounded" minOccurs="0"/>
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
        "country"
    })
    public static class Countries {

        @XmlElement(name = "Country")
        protected List<CountryType> country;

        /**
         * Gets the value of the country property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the country property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountryType }
         * 
         * 
         */
        public List<CountryType> getCountry() {
            if (country == null) {
                country = new ArrayList<CountryType>();
            }
            return this.country;
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
     *         &lt;element name="Destination" type="{http://www.bewotec.de/bewotecws/Schema}DestinationType" maxOccurs="unbounded" minOccurs="0"/>
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
        "destination"
    })
    public static class Destinations {

        @XmlElement(name = "Destination", nillable = true)
        protected List<DestinationType> destination;

        /**
         * Gets the value of the destination property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the destination property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDestination().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DestinationType }
         * 
         * 
         */
        public List<DestinationType> getDestination() {
            if (destination == null) {
                destination = new ArrayList<DestinationType>();
            }
            return this.destination;
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
     *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "hotelName"
    })
    public static class HotelNames {

        @XmlElement(name = "HotelName", required = true)
        protected List<String> hotelName;

        /**
         * Gets the value of the hotelName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getHotelName() {
            if (hotelName == null) {
                hotelName = new ArrayList<String>();
            }
            return this.hotelName;
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
     *         &lt;element name="Hotel" type="{http://www.bewotec.de/bewotecws/Schema}ValuesHotelType" maxOccurs="unbounded" minOccurs="0"/>
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
        "hotel"
    })
    public static class Hotels {

        @XmlElement(name = "Hotel", nillable = true)
        protected List<ValuesHotelType> hotel;

        /**
         * Gets the value of the hotel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ValuesHotelType }
         * 
         * 
         */
        public List<ValuesHotelType> getHotel() {
            if (hotel == null) {
                hotel = new ArrayList<ValuesHotelType>();
            }
            return this.hotel;
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
     *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "priceType"
    })
    public static class PriceTypes {

        @XmlElement(name = "PriceType", required = true)
        protected List<String> priceType;

        /**
         * Gets the value of the priceType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPriceType() {
            if (priceType == null) {
                priceType = new ArrayList<String>();
            }
            return this.priceType;
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
     *         &lt;element name="ProductGroup" type="{http://www.bewotec.de/bewotecws/Schema}ProductGroupType" maxOccurs="unbounded" minOccurs="0"/>
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
        "productGroup"
    })
    public static class ProductGroups {

        @XmlElement(name = "ProductGroup", nillable = true)
        protected List<ProductGroupType> productGroup;

        /**
         * Gets the value of the productGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProductGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductGroupType }
         * 
         * 
         */
        public List<ProductGroupType> getProductGroup() {
            if (productGroup == null) {
                productGroup = new ArrayList<ProductGroupType>();
            }
            return this.productGroup;
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
     *         &lt;element name="Region" type="{http://www.bewotec.de/bewotecws/Schema}RegionType" maxOccurs="unbounded" minOccurs="0"/>
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
        "region"
    })
    public static class Regions {

        @XmlElement(name = "Region", nillable = true)
        protected List<RegionType> region;

        /**
         * Gets the value of the region property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the region property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RegionType }
         * 
         * 
         */
        public List<RegionType> getRegion() {
            if (region == null) {
                region = new ArrayList<RegionType>();
            }
            return this.region;
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
     *         &lt;element name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "roomType"
    })
    public static class RoomTypes {

        @XmlElement(name = "RoomType", required = true)
        protected List<String> roomType;

        /**
         * Gets the value of the roomType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRoomType() {
            if (roomType == null) {
                roomType = new ArrayList<String>();
            }
            return this.roomType;
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
     *         &lt;element name="TouroperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "touroperatorCode"
    })
    public static class TouroperatorCodes {

        @XmlElement(name = "TouroperatorCode", required = true)
        protected List<String> touroperatorCode;

        /**
         * Gets the value of the touroperatorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the touroperatorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTouroperatorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTouroperatorCode() {
            if (touroperatorCode == null) {
                touroperatorCode = new ArrayList<String>();
            }
            return this.touroperatorCode;
        }

    }

}
