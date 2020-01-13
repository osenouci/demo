
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
 * Accomodation service
 * 
 * <p>Java class for AccommodationServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccommodationServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identity" type="{http://www.bewotec.de/bewotecws/Schema}ServiceIdentityType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Location" type="{http://www.bewotec.de/bewotecws/Schema}GeoLocationResponseType" minOccurs="0"/>
 *         &lt;element name="AccommodationSpecifics" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccommodationSpecific" type="{http://www.bewotec.de/bewotecws/Schema}AccommodationSpecificType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccommodationVariants" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccommodationVariant" type="{http://www.bewotec.de/bewotecws/Schema}AccommodationVariantType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Recommendations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Recommendation" type="{http://www.bewotec.de/bewotecws/Schema}RecommendationType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AccommodationServiceType", propOrder = {
    "identities",
    "location",
    "accommodationSpecifics",
    "accommodationVariants",
    "recommendations"
})
public class AccommodationServiceType {

    @XmlElementRef(name = "Identities", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AccommodationServiceType.Identities> identities;
    @XmlElementRef(name = "Location", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoLocationResponseType> location;
    @XmlElementRef(name = "AccommodationSpecifics", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AccommodationServiceType.AccommodationSpecifics> accommodationSpecifics;
    @XmlElementRef(name = "AccommodationVariants", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AccommodationServiceType.AccommodationVariants> accommodationVariants;
    @XmlElement(name = "Recommendations")
    protected AccommodationServiceType.Recommendations recommendations;

    /**
     * Gets the value of the identities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccommodationServiceType.Identities }{@code >}
     *     
     */
    public JAXBElement<AccommodationServiceType.Identities> getIdentities() {
        return identities;
    }

    /**
     * Sets the value of the identities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccommodationServiceType.Identities }{@code >}
     *     
     */
    public void setIdentities(JAXBElement<AccommodationServiceType.Identities> value) {
        this.identities = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoLocationResponseType }{@code >}
     *     
     */
    public JAXBElement<GeoLocationResponseType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoLocationResponseType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<GeoLocationResponseType> value) {
        this.location = value;
    }

    /**
     * Gets the value of the accommodationSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccommodationServiceType.AccommodationSpecifics }{@code >}
     *     
     */
    public JAXBElement<AccommodationServiceType.AccommodationSpecifics> getAccommodationSpecifics() {
        return accommodationSpecifics;
    }

    /**
     * Sets the value of the accommodationSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccommodationServiceType.AccommodationSpecifics }{@code >}
     *     
     */
    public void setAccommodationSpecifics(JAXBElement<AccommodationServiceType.AccommodationSpecifics> value) {
        this.accommodationSpecifics = value;
    }

    /**
     * Gets the value of the accommodationVariants property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccommodationServiceType.AccommodationVariants }{@code >}
     *     
     */
    public JAXBElement<AccommodationServiceType.AccommodationVariants> getAccommodationVariants() {
        return accommodationVariants;
    }

    /**
     * Sets the value of the accommodationVariants property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccommodationServiceType.AccommodationVariants }{@code >}
     *     
     */
    public void setAccommodationVariants(JAXBElement<AccommodationServiceType.AccommodationVariants> value) {
        this.accommodationVariants = value;
    }

    /**
     * Gets the value of the recommendations property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationServiceType.Recommendations }
     *     
     */
    public AccommodationServiceType.Recommendations getRecommendations() {
        return recommendations;
    }

    /**
     * Sets the value of the recommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationServiceType.Recommendations }
     *     
     */
    public void setRecommendations(AccommodationServiceType.Recommendations value) {
        this.recommendations = value;
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
     *         &lt;element name="AccommodationSpecific" type="{http://www.bewotec.de/bewotecws/Schema}AccommodationSpecificType" maxOccurs="unbounded" minOccurs="0"/>
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
        "accommodationSpecific"
    })
    public static class AccommodationSpecifics {

        @XmlElement(name = "AccommodationSpecific", nillable = true)
        protected List<AccommodationSpecificType> accommodationSpecific;

        /**
         * Gets the value of the accommodationSpecific property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accommodationSpecific property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccommodationSpecific().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccommodationSpecificType }
         * 
         * 
         */
        public List<AccommodationSpecificType> getAccommodationSpecific() {
            if (accommodationSpecific == null) {
                accommodationSpecific = new ArrayList<AccommodationSpecificType>();
            }
            return this.accommodationSpecific;
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
     *         &lt;element name="AccommodationVariant" type="{http://www.bewotec.de/bewotecws/Schema}AccommodationVariantType" maxOccurs="unbounded" minOccurs="0"/>
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
        "accommodationVariant"
    })
    public static class AccommodationVariants {

        @XmlElement(name = "AccommodationVariant", nillable = true)
        protected List<AccommodationVariantType> accommodationVariant;

        /**
         * Gets the value of the accommodationVariant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accommodationVariant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccommodationVariant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccommodationVariantType }
         * 
         * 
         */
        public List<AccommodationVariantType> getAccommodationVariant() {
            if (accommodationVariant == null) {
                accommodationVariant = new ArrayList<AccommodationVariantType>();
            }
            return this.accommodationVariant;
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
     *         &lt;element name="Identity" type="{http://www.bewotec.de/bewotecws/Schema}ServiceIdentityType" maxOccurs="unbounded" minOccurs="0"/>
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
        "identity"
    })
    public static class Identities {

        @XmlElement(name = "Identity", nillable = true)
        protected List<ServiceIdentityType> identity;

        /**
         * Gets the value of the identity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceIdentityType }
         * 
         * 
         */
        public List<ServiceIdentityType> getIdentity() {
            if (identity == null) {
                identity = new ArrayList<ServiceIdentityType>();
            }
            return this.identity;
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
     *         &lt;element name="Recommendation" type="{http://www.bewotec.de/bewotecws/Schema}RecommendationType" maxOccurs="unbounded" minOccurs="0"/>
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
        "recommendation"
    })
    public static class Recommendations {

        @XmlElement(name = "Recommendation")
        protected List<RecommendationType> recommendation;

        /**
         * Gets the value of the recommendation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recommendation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecommendation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RecommendationType }
         * 
         * 
         */
        public List<RecommendationType> getRecommendation() {
            if (recommendation == null) {
                recommendation = new ArrayList<RecommendationType>();
            }
            return this.recommendation;
        }

    }

}
