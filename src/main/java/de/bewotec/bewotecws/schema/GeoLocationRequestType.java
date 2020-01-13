
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
 * Request criteria in relation to geographic characteristics
 * 
 * <p>Java class for GeoLocationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoLocationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Regions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GiataCityIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GiataCityId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GiataDestinationIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GiataDestinationId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClimateRequest" type="{http://www.bewotec.de/bewotecws/Schema}ClimateRequestType" minOccurs="0"/>
 *         &lt;element name="Cities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Countries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DestinationCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "GeoLocationRequestType", propOrder = {
    "regions",
    "giataCityIds",
    "giataDestinationIds",
    "climateRequest",
    "cities",
    "countries",
    "destinationCodes"
})
public class GeoLocationRequestType {

    @XmlElementRef(name = "Regions", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoLocationRequestType.Regions> regions;
    @XmlElement(name = "GiataCityIds")
    protected GeoLocationRequestType.GiataCityIds giataCityIds;
    @XmlElement(name = "GiataDestinationIds")
    protected GeoLocationRequestType.GiataDestinationIds giataDestinationIds;
    @XmlElement(name = "ClimateRequest")
    protected ClimateRequestType climateRequest;
    @XmlElement(name = "Cities")
    protected GeoLocationRequestType.Cities cities;
    @XmlElement(name = "Countries")
    protected GeoLocationRequestType.Countries countries;
    @XmlElement(name = "DestinationCodes")
    protected GeoLocationRequestType.DestinationCodes destinationCodes;

    /**
     * Gets the value of the regions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoLocationRequestType.Regions }{@code >}
     *     
     */
    public JAXBElement<GeoLocationRequestType.Regions> getRegions() {
        return regions;
    }

    /**
     * Sets the value of the regions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoLocationRequestType.Regions }{@code >}
     *     
     */
    public void setRegions(JAXBElement<GeoLocationRequestType.Regions> value) {
        this.regions = value;
    }

    /**
     * Gets the value of the giataCityIds property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocationRequestType.GiataCityIds }
     *     
     */
    public GeoLocationRequestType.GiataCityIds getGiataCityIds() {
        return giataCityIds;
    }

    /**
     * Sets the value of the giataCityIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocationRequestType.GiataCityIds }
     *     
     */
    public void setGiataCityIds(GeoLocationRequestType.GiataCityIds value) {
        this.giataCityIds = value;
    }

    /**
     * Gets the value of the giataDestinationIds property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocationRequestType.GiataDestinationIds }
     *     
     */
    public GeoLocationRequestType.GiataDestinationIds getGiataDestinationIds() {
        return giataDestinationIds;
    }

    /**
     * Sets the value of the giataDestinationIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocationRequestType.GiataDestinationIds }
     *     
     */
    public void setGiataDestinationIds(GeoLocationRequestType.GiataDestinationIds value) {
        this.giataDestinationIds = value;
    }

    /**
     * Gets the value of the climateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ClimateRequestType }
     *     
     */
    public ClimateRequestType getClimateRequest() {
        return climateRequest;
    }

    /**
     * Sets the value of the climateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClimateRequestType }
     *     
     */
    public void setClimateRequest(ClimateRequestType value) {
        this.climateRequest = value;
    }

    /**
     * Gets the value of the cities property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocationRequestType.Cities }
     *     
     */
    public GeoLocationRequestType.Cities getCities() {
        return cities;
    }

    /**
     * Sets the value of the cities property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocationRequestType.Cities }
     *     
     */
    public void setCities(GeoLocationRequestType.Cities value) {
        this.cities = value;
    }

    /**
     * Gets the value of the countries property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocationRequestType.Countries }
     *     
     */
    public GeoLocationRequestType.Countries getCountries() {
        return countries;
    }

    /**
     * Sets the value of the countries property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocationRequestType.Countries }
     *     
     */
    public void setCountries(GeoLocationRequestType.Countries value) {
        this.countries = value;
    }

    /**
     * Gets the value of the destinationCodes property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocationRequestType.DestinationCodes }
     *     
     */
    public GeoLocationRequestType.DestinationCodes getDestinationCodes() {
        return destinationCodes;
    }

    /**
     * Sets the value of the destinationCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocationRequestType.DestinationCodes }
     *     
     */
    public void setDestinationCodes(GeoLocationRequestType.DestinationCodes value) {
        this.destinationCodes = value;
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
     *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(name = "City")
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
     *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        protected List<String> country;

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
         * {@link String }
         * 
         * 
         */
        public List<String> getCountry() {
            if (country == null) {
                country = new ArrayList<String>();
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
     *         &lt;element name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "destinationCode"
    })
    public static class DestinationCodes {

        @XmlElement(name = "DestinationCode")
        protected List<String> destinationCode;

        /**
         * Gets the value of the destinationCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the destinationCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDestinationCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDestinationCode() {
            if (destinationCode == null) {
                destinationCode = new ArrayList<String>();
            }
            return this.destinationCode;
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
     *         &lt;element name="GiataCityId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
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
        "giataCityId"
    })
    public static class GiataCityIds {

        @XmlElement(name = "GiataCityId", type = Long.class)
        @XmlSchemaType(name = "unsignedInt")
        protected List<Long> giataCityId;

        /**
         * Gets the value of the giataCityId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the giataCityId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGiataCityId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getGiataCityId() {
            if (giataCityId == null) {
                giataCityId = new ArrayList<Long>();
            }
            return this.giataCityId;
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
     *         &lt;element name="GiataDestinationId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
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
        "giataDestinationId"
    })
    public static class GiataDestinationIds {

        @XmlElement(name = "GiataDestinationId", type = Long.class)
        @XmlSchemaType(name = "unsignedInt")
        protected List<Long> giataDestinationId;

        /**
         * Gets the value of the giataDestinationId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the giataDestinationId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGiataDestinationId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getGiataDestinationId() {
            if (giataDestinationId == null) {
                giataDestinationId = new ArrayList<Long>();
            }
            return this.giataDestinationId;
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
     *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(name = "Region")
        protected List<String> region;

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
         * {@link String }
         * 
         * 
         */
        public List<String> getRegion() {
            if (region == null) {
                region = new ArrayList<String>();
            }
            return this.region;
        }

    }

}
