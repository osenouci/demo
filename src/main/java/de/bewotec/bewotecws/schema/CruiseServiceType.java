
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
 * Cruise service
 * 
 * <p>Java class for CruiseServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CruiseServiceType">
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
 *         &lt;element name="Location" type="{http://www.bewotec.de/bewotecws/Schema}GeoLocationCruiseResponseType" minOccurs="0"/>
 *         &lt;element name="CruiseSpecifics" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CruiseSpecific" type="{http://www.bewotec.de/bewotecws/Schema}CruiseSpecificType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CruiseVariants" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CruiseVariant" type="{http://www.bewotec.de/bewotecws/Schema}CruiseVariantType" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="ShipIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruiseServiceType", propOrder = {
    "identities",
    "location",
    "cruiseSpecifics",
    "cruiseVariants",
    "recommendations",
    "shipIdentifier"
})
public class CruiseServiceType {

    @XmlElementRef(name = "Identities", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CruiseServiceType.Identities> identities;
    @XmlElementRef(name = "Location", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoLocationCruiseResponseType> location;
    @XmlElementRef(name = "CruiseSpecifics", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CruiseServiceType.CruiseSpecifics> cruiseSpecifics;
    @XmlElementRef(name = "CruiseVariants", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CruiseServiceType.CruiseVariants> cruiseVariants;
    @XmlElement(name = "Recommendations")
    protected CruiseServiceType.Recommendations recommendations;
    @XmlElement(name = "ShipIdentifier")
    protected String shipIdentifier;

    /**
     * Gets the value of the identities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CruiseServiceType.Identities }{@code >}
     *     
     */
    public JAXBElement<CruiseServiceType.Identities> getIdentities() {
        return identities;
    }

    /**
     * Sets the value of the identities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CruiseServiceType.Identities }{@code >}
     *     
     */
    public void setIdentities(JAXBElement<CruiseServiceType.Identities> value) {
        this.identities = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoLocationCruiseResponseType }{@code >}
     *     
     */
    public JAXBElement<GeoLocationCruiseResponseType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoLocationCruiseResponseType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<GeoLocationCruiseResponseType> value) {
        this.location = value;
    }

    /**
     * Gets the value of the cruiseSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CruiseServiceType.CruiseSpecifics }{@code >}
     *     
     */
    public JAXBElement<CruiseServiceType.CruiseSpecifics> getCruiseSpecifics() {
        return cruiseSpecifics;
    }

    /**
     * Sets the value of the cruiseSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CruiseServiceType.CruiseSpecifics }{@code >}
     *     
     */
    public void setCruiseSpecifics(JAXBElement<CruiseServiceType.CruiseSpecifics> value) {
        this.cruiseSpecifics = value;
    }

    /**
     * Gets the value of the cruiseVariants property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CruiseServiceType.CruiseVariants }{@code >}
     *     
     */
    public JAXBElement<CruiseServiceType.CruiseVariants> getCruiseVariants() {
        return cruiseVariants;
    }

    /**
     * Sets the value of the cruiseVariants property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CruiseServiceType.CruiseVariants }{@code >}
     *     
     */
    public void setCruiseVariants(JAXBElement<CruiseServiceType.CruiseVariants> value) {
        this.cruiseVariants = value;
    }

    /**
     * Gets the value of the recommendations property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseServiceType.Recommendations }
     *     
     */
    public CruiseServiceType.Recommendations getRecommendations() {
        return recommendations;
    }

    /**
     * Sets the value of the recommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseServiceType.Recommendations }
     *     
     */
    public void setRecommendations(CruiseServiceType.Recommendations value) {
        this.recommendations = value;
    }

    /**
     * Gets the value of the shipIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipIdentifier() {
        return shipIdentifier;
    }

    /**
     * Sets the value of the shipIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipIdentifier(String value) {
        this.shipIdentifier = value;
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
     *         &lt;element name="CruiseSpecific" type="{http://www.bewotec.de/bewotecws/Schema}CruiseSpecificType" maxOccurs="unbounded" minOccurs="0"/>
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
        "cruiseSpecific"
    })
    public static class CruiseSpecifics {

        @XmlElement(name = "CruiseSpecific", nillable = true)
        protected List<CruiseSpecificType> cruiseSpecific;

        /**
         * Gets the value of the cruiseSpecific property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cruiseSpecific property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCruiseSpecific().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseSpecificType }
         * 
         * 
         */
        public List<CruiseSpecificType> getCruiseSpecific() {
            if (cruiseSpecific == null) {
                cruiseSpecific = new ArrayList<CruiseSpecificType>();
            }
            return this.cruiseSpecific;
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
     *         &lt;element name="CruiseVariant" type="{http://www.bewotec.de/bewotecws/Schema}CruiseVariantType" maxOccurs="unbounded" minOccurs="0"/>
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
        "cruiseVariant"
    })
    public static class CruiseVariants {

        @XmlElement(name = "CruiseVariant", nillable = true)
        protected List<CruiseVariantType> cruiseVariant;

        /**
         * Gets the value of the cruiseVariant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cruiseVariant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCruiseVariant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseVariantType }
         * 
         * 
         */
        public List<CruiseVariantType> getCruiseVariant() {
            if (cruiseVariant == null) {
                cruiseVariant = new ArrayList<CruiseVariantType>();
            }
            return this.cruiseVariant;
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
