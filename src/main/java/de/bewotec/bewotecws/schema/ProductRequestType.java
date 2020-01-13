
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type of all product requests
 * 
 * <p>Java class for ProductRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bewotec.de/bewotecws/Schema}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="Accommodation" type="{http://www.bewotec.de/bewotecws/Schema}AccommodationRequestType" minOccurs="0"/>
 *         &lt;element name="Flight" type="{http://www.bewotec.de/bewotecws/Schema}FlightRequestType" minOccurs="0"/>
 *         &lt;element name="Extra" type="{http://www.bewotec.de/bewotecws/Schema}ExtraRequestType" minOccurs="0"/>
 *         &lt;element name="Cruise" type="{http://www.bewotec.de/bewotecws/Schema}CruiseRequestType" minOccurs="0"/>
 *         &lt;element name="Passengers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Passenger" type="{http://www.bewotec.de/bewotecws/Schema}PassengerRequestType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Period" type="{http://www.bewotec.de/bewotecws/Schema}PeriodRequestType"/>
 *         &lt;element name="GeoLocation" type="{http://www.bewotec.de/bewotecws/Schema}GeoLocationRequestType" minOccurs="0"/>
 *         &lt;element name="GroupIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Price" type="{http://www.bewotec.de/bewotecws/Schema}PriceRequestType" minOccurs="0"/>
 *         &lt;element name="RequestBooking" type="{http://www.bewotec.de/bewotecws/Schema}IncludeExcludeOnlyEnum" minOccurs="0"/>
 *         &lt;element name="ResultsFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultsTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultsTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailLevel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.bewotec.de/bewotecws/Schema}DetailLevelEnum" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SortedBy" type="{http://www.bewotec.de/bewotecws/Schema}SortedByEnum" minOccurs="0"/>
 *         &lt;element name="DescendingSort" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ResultSet" type="{http://www.bewotec.de/bewotecws/Schema}ResultSetEnum" minOccurs="0"/>
 *         &lt;element name="MetaData" type="{http://www.bewotec.de/bewotecws/Schema}MetaDataType" minOccurs="0"/>
 *         &lt;element name="ShowSoldOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ParameterSet" type="{http://www.bewotec.de/bewotecws/Schema}ParameterSetType" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodEmptyStay" type="{http://www.bewotec.de/bewotecws/Schema}PeriodEmptyStayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductRequestType", propOrder = {
    "accommodation",
    "flight",
    "extra",
    "cruise",
    "passengers",
    "period",
    "geoLocation",
    "groupIds",
    "price",
    "requestBooking",
    "resultsFrom",
    "resultsTo",
    "resultsTotal",
    "detailLevel",
    "sortedBy",
    "descendingSort",
    "resultSet",
    "metaData",
    "showSoldOut",
    "parameterSet",
    "requestId",
    "periodEmptyStay"
})
@XmlSeeAlso({
    FiltersRequestType.class,
    GroupRequestType.class,
    ProductVariantRequestType.class,
    de.bewotec.bewotecws.schema.GetProductMatrix.GetProductMatrixRequest.class,
    ProductAvailabilityRequestType.class
})
public class ProductRequestType
    extends BaseRequestType
{

    @XmlElementRef(name = "Accommodation", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AccommodationRequestType> accommodation;
    @XmlElementRef(name = "Flight", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightRequestType> flight;
    @XmlElementRef(name = "Extra", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtraRequestType> extra;
    @XmlElement(name = "Cruise")
    protected CruiseRequestType cruise;
    @XmlElement(name = "Passengers", required = true, nillable = true)
    protected ProductRequestType.Passengers passengers;
    @XmlElement(name = "Period", required = true, nillable = true)
    protected PeriodRequestType period;
    @XmlElementRef(name = "GeoLocation", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoLocationRequestType> geoLocation;
    @XmlElementRef(name = "GroupIds", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductRequestType.GroupIds> groupIds;
    @XmlElementRef(name = "Price", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<PriceRequestType> price;
    @XmlElementRef(name = "RequestBooking", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<IncludeExcludeOnlyEnum> requestBooking;
    @XmlElement(name = "ResultsFrom")
    protected String resultsFrom;
    @XmlElement(name = "ResultsTo")
    protected String resultsTo;
    @XmlElement(name = "ResultsTotal")
    protected String resultsTotal;
    @XmlList
    @XmlElement(name = "DetailLevel")
    protected List<DetailLevelEnum> detailLevel;
    @XmlElement(name = "SortedBy")
    protected SortedByEnum sortedBy;
    @XmlElement(name = "DescendingSort")
    protected Boolean descendingSort;
    @XmlElement(name = "ResultSet")
    protected ResultSetEnum resultSet;
    @XmlElement(name = "MetaData")
    protected MetaDataType metaData;
    @XmlElement(name = "ShowSoldOut")
    protected Boolean showSoldOut;
    @XmlElement(name = "ParameterSet")
    protected ParameterSetType parameterSet;
    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "PeriodEmptyStay")
    protected PeriodEmptyStayType periodEmptyStay;

    /**
     * Gets the value of the accommodation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccommodationRequestType }{@code >}
     *     
     */
    public JAXBElement<AccommodationRequestType> getAccommodation() {
        return accommodation;
    }

    /**
     * Sets the value of the accommodation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccommodationRequestType }{@code >}
     *     
     */
    public void setAccommodation(JAXBElement<AccommodationRequestType> value) {
        this.accommodation = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightRequestType }{@code >}
     *     
     */
    public JAXBElement<FlightRequestType> getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightRequestType }{@code >}
     *     
     */
    public void setFlight(JAXBElement<FlightRequestType> value) {
        this.flight = value;
    }

    /**
     * Gets the value of the extra property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtraRequestType }{@code >}
     *     
     */
    public JAXBElement<ExtraRequestType> getExtra() {
        return extra;
    }

    /**
     * Sets the value of the extra property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtraRequestType }{@code >}
     *     
     */
    public void setExtra(JAXBElement<ExtraRequestType> value) {
        this.extra = value;
    }

    /**
     * Gets the value of the cruise property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseRequestType }
     *     
     */
    public CruiseRequestType getCruise() {
        return cruise;
    }

    /**
     * Sets the value of the cruise property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseRequestType }
     *     
     */
    public void setCruise(CruiseRequestType value) {
        this.cruise = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link ProductRequestType.Passengers }
     *     
     */
    public ProductRequestType.Passengers getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductRequestType.Passengers }
     *     
     */
    public void setPassengers(ProductRequestType.Passengers value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodRequestType }
     *     
     */
    public PeriodRequestType getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodRequestType }
     *     
     */
    public void setPeriod(PeriodRequestType value) {
        this.period = value;
    }

    /**
     * Gets the value of the geoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoLocationRequestType }{@code >}
     *     
     */
    public JAXBElement<GeoLocationRequestType> getGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets the value of the geoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoLocationRequestType }{@code >}
     *     
     */
    public void setGeoLocation(JAXBElement<GeoLocationRequestType> value) {
        this.geoLocation = value;
    }

    /**
     * Gets the value of the groupIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductRequestType.GroupIds }{@code >}
     *     
     */
    public JAXBElement<ProductRequestType.GroupIds> getGroupIds() {
        return groupIds;
    }

    /**
     * Sets the value of the groupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductRequestType.GroupIds }{@code >}
     *     
     */
    public void setGroupIds(JAXBElement<ProductRequestType.GroupIds> value) {
        this.groupIds = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriceRequestType }{@code >}
     *     
     */
    public JAXBElement<PriceRequestType> getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriceRequestType }{@code >}
     *     
     */
    public void setPrice(JAXBElement<PriceRequestType> value) {
        this.price = value;
    }

    /**
     * Gets the value of the requestBooking property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncludeExcludeOnlyEnum }{@code >}
     *     
     */
    public JAXBElement<IncludeExcludeOnlyEnum> getRequestBooking() {
        return requestBooking;
    }

    /**
     * Sets the value of the requestBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncludeExcludeOnlyEnum }{@code >}
     *     
     */
    public void setRequestBooking(JAXBElement<IncludeExcludeOnlyEnum> value) {
        this.requestBooking = value;
    }

    /**
     * Gets the value of the resultsFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsFrom() {
        return resultsFrom;
    }

    /**
     * Sets the value of the resultsFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsFrom(String value) {
        this.resultsFrom = value;
    }

    /**
     * Gets the value of the resultsTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsTo() {
        return resultsTo;
    }

    /**
     * Sets the value of the resultsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsTo(String value) {
        this.resultsTo = value;
    }

    /**
     * Gets the value of the resultsTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsTotal() {
        return resultsTotal;
    }

    /**
     * Sets the value of the resultsTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsTotal(String value) {
        this.resultsTotal = value;
    }

    /**
     * Gets the value of the detailLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailLevelEnum }
     * 
     * 
     */
    public List<DetailLevelEnum> getDetailLevel() {
        if (detailLevel == null) {
            detailLevel = new ArrayList<DetailLevelEnum>();
        }
        return this.detailLevel;
    }

    /**
     * Gets the value of the sortedBy property.
     * 
     * @return
     *     possible object is
     *     {@link SortedByEnum }
     *     
     */
    public SortedByEnum getSortedBy() {
        return sortedBy;
    }

    /**
     * Sets the value of the sortedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortedByEnum }
     *     
     */
    public void setSortedBy(SortedByEnum value) {
        this.sortedBy = value;
    }

    /**
     * Gets the value of the descendingSort property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescendingSort() {
        return descendingSort;
    }

    /**
     * Sets the value of the descendingSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescendingSort(Boolean value) {
        this.descendingSort = value;
    }

    /**
     * Gets the value of the resultSet property.
     * 
     * @return
     *     possible object is
     *     {@link ResultSetEnum }
     *     
     */
    public ResultSetEnum getResultSet() {
        return resultSet;
    }

    /**
     * Sets the value of the resultSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSetEnum }
     *     
     */
    public void setResultSet(ResultSetEnum value) {
        this.resultSet = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataType }
     *     
     */
    public MetaDataType getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataType }
     *     
     */
    public void setMetaData(MetaDataType value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the showSoldOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSoldOut() {
        return showSoldOut;
    }

    /**
     * Sets the value of the showSoldOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSoldOut(Boolean value) {
        this.showSoldOut = value;
    }

    /**
     * Gets the value of the parameterSet property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterSetType }
     *     
     */
    public ParameterSetType getParameterSet() {
        return parameterSet;
    }

    /**
     * Sets the value of the parameterSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterSetType }
     *     
     */
    public void setParameterSet(ParameterSetType value) {
        this.parameterSet = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the periodEmptyStay property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodEmptyStayType }
     *     
     */
    public PeriodEmptyStayType getPeriodEmptyStay() {
        return periodEmptyStay;
    }

    /**
     * Sets the value of the periodEmptyStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodEmptyStayType }
     *     
     */
    public void setPeriodEmptyStay(PeriodEmptyStayType value) {
        this.periodEmptyStay = value;
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
     *         &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "groupId"
    })
    public static class GroupIds {

        @XmlElement(name = "GroupId")
        protected List<String> groupId;

        /**
         * Gets the value of the groupId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the groupId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroupId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getGroupId() {
            if (groupId == null) {
                groupId = new ArrayList<String>();
            }
            return this.groupId;
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
     *         &lt;element name="Passenger" type="{http://www.bewotec.de/bewotecws/Schema}PassengerRequestType" maxOccurs="unbounded"/>
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
        "passenger"
    })
    public static class Passengers {

        @XmlElement(name = "Passenger", required = true, nillable = true)
        protected List<PassengerRequestType> passenger;

        /**
         * Gets the value of the passenger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passenger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassenger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PassengerRequestType }
         * 
         * 
         */
        public List<PassengerRequestType> getPassenger() {
            if (passenger == null) {
                passenger = new ArrayList<PassengerRequestType>();
            }
            return this.passenger;
        }

    }

}
