
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
 * Search critera based on the cruise
 * 
 * <p>Java class for CruiseRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CruiseRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinCategory" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Cabins" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CabinRequest" type="{http://www.bewotec.de/bewotecws/Schema}CabinRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Boards" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BoardRequest" type="{http://www.bewotec.de/bewotecws/Schema}BoardRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="AccommodationProperty" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="TariffTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TariffType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CruiseRequestType", propOrder = {
    "productCodes",
    "identities",
    "name",
    "minCategory",
    "cabins",
    "boards",
    "accommodationProperties",
    "recommendations",
    "ports",
    "departurePorts",
    "arrivalPorts",
    "tariffTypes"
})
public class CruiseRequestType {

    @XmlElementRef(name = "ProductCodes", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CruiseRequestType.ProductCodes> productCodes;
    @XmlElementRef(name = "Identities", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CruiseRequestType.Identities> identities;
    @XmlElementRef(name = "Name", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "MinCategory", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> minCategory;
    @XmlElementRef(name = "Cabins", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CruiseRequestType.Cabins> cabins;
    @XmlElementRef(name = "Boards", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CruiseRequestType.Boards> boards;
    @XmlElement(name = "AccommodationProperties")
    protected CruiseRequestType.AccommodationProperties accommodationProperties;
    @XmlElement(name = "Recommendations")
    protected CruiseRequestType.Recommendations recommendations;
    @XmlElementRef(name = "Ports", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CruiseRequestType.Ports> ports;
    @XmlElementRef(name = "DeparturePorts", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CruiseRequestType.DeparturePorts> departurePorts;
    @XmlElementRef(name = "ArrivalPorts", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CruiseRequestType.ArrivalPorts> arrivalPorts;
    @XmlElementRef(name = "TariffTypes", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CruiseRequestType.TariffTypes> tariffTypes;

    /**
     * Gets the value of the productCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.ProductCodes }{@code >}
     *     
     */
    public JAXBElement<CruiseRequestType.ProductCodes> getProductCodes() {
        return productCodes;
    }

    /**
     * Sets the value of the productCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.ProductCodes }{@code >}
     *     
     */
    public void setProductCodes(JAXBElement<CruiseRequestType.ProductCodes> value) {
        this.productCodes = value;
    }

    /**
     * Gets the value of the identities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.Identities }{@code >}
     *     
     */
    public JAXBElement<CruiseRequestType.Identities> getIdentities() {
        return identities;
    }

    /**
     * Sets the value of the identities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.Identities }{@code >}
     *     
     */
    public void setIdentities(JAXBElement<CruiseRequestType.Identities> value) {
        this.identities = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the minCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getMinCategory() {
        return minCategory;
    }

    /**
     * Sets the value of the minCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setMinCategory(JAXBElement<Float> value) {
        this.minCategory = value;
    }

    /**
     * Gets the value of the cabins property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.Cabins }{@code >}
     *     
     */
    public JAXBElement<CruiseRequestType.Cabins> getCabins() {
        return cabins;
    }

    /**
     * Sets the value of the cabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.Cabins }{@code >}
     *     
     */
    public void setCabins(JAXBElement<CruiseRequestType.Cabins> value) {
        this.cabins = value;
    }

    /**
     * Gets the value of the boards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.Boards }{@code >}
     *     
     */
    public JAXBElement<CruiseRequestType.Boards> getBoards() {
        return boards;
    }

    /**
     * Sets the value of the boards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.Boards }{@code >}
     *     
     */
    public void setBoards(JAXBElement<CruiseRequestType.Boards> value) {
        this.boards = value;
    }

    /**
     * Gets the value of the accommodationProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseRequestType.AccommodationProperties }
     *     
     */
    public CruiseRequestType.AccommodationProperties getAccommodationProperties() {
        return accommodationProperties;
    }

    /**
     * Sets the value of the accommodationProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseRequestType.AccommodationProperties }
     *     
     */
    public void setAccommodationProperties(CruiseRequestType.AccommodationProperties value) {
        this.accommodationProperties = value;
    }

    /**
     * Gets the value of the recommendations property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseRequestType.Recommendations }
     *     
     */
    public CruiseRequestType.Recommendations getRecommendations() {
        return recommendations;
    }

    /**
     * Sets the value of the recommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseRequestType.Recommendations }
     *     
     */
    public void setRecommendations(CruiseRequestType.Recommendations value) {
        this.recommendations = value;
    }

    /**
     * Gets the value of the ports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.Ports }{@code >}
     *     
     */
    public JAXBElement<CruiseRequestType.Ports> getPorts() {
        return ports;
    }

    /**
     * Sets the value of the ports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.Ports }{@code >}
     *     
     */
    public void setPorts(JAXBElement<CruiseRequestType.Ports> value) {
        this.ports = value;
    }

    /**
     * Gets the value of the departurePorts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.DeparturePorts }{@code >}
     *     
     */
    public JAXBElement<CruiseRequestType.DeparturePorts> getDeparturePorts() {
        return departurePorts;
    }

    /**
     * Sets the value of the departurePorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.DeparturePorts }{@code >}
     *     
     */
    public void setDeparturePorts(JAXBElement<CruiseRequestType.DeparturePorts> value) {
        this.departurePorts = value;
    }

    /**
     * Gets the value of the arrivalPorts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.ArrivalPorts }{@code >}
     *     
     */
    public JAXBElement<CruiseRequestType.ArrivalPorts> getArrivalPorts() {
        return arrivalPorts;
    }

    /**
     * Sets the value of the arrivalPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.ArrivalPorts }{@code >}
     *     
     */
    public void setArrivalPorts(JAXBElement<CruiseRequestType.ArrivalPorts> value) {
        this.arrivalPorts = value;
    }

    /**
     * Gets the value of the tariffTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.TariffTypes }{@code >}
     *     
     */
    public JAXBElement<CruiseRequestType.TariffTypes> getTariffTypes() {
        return tariffTypes;
    }

    /**
     * Sets the value of the tariffTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CruiseRequestType.TariffTypes }{@code >}
     *     
     */
    public void setTariffTypes(JAXBElement<CruiseRequestType.TariffTypes> value) {
        this.tariffTypes = value;
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
     *         &lt;element name="AccommodationProperty" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(name = "AccommodationProperty")
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
     *         &lt;element name="BoardRequest" type="{http://www.bewotec.de/bewotecws/Schema}BoardRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
        "boardRequest"
    })
    public static class Boards {

        @XmlElement(name = "BoardRequest")
        protected List<BoardRequestType> boardRequest;

        /**
         * Gets the value of the boardRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the boardRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBoardRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoardRequestType }
         * 
         * 
         */
        public List<BoardRequestType> getBoardRequest() {
            if (boardRequest == null) {
                boardRequest = new ArrayList<BoardRequestType>();
            }
            return this.boardRequest;
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
     *         &lt;element name="CabinRequest" type="{http://www.bewotec.de/bewotecws/Schema}CabinRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
        "cabinRequest"
    })
    public static class Cabins {

        @XmlElement(name = "CabinRequest", nillable = true)
        protected List<CabinRequestType> cabinRequest;

        /**
         * Gets the value of the cabinRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabinRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabinRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CabinRequestType }
         * 
         * 
         */
        public List<CabinRequestType> getCabinRequest() {
            if (cabinRequest == null) {
                cabinRequest = new ArrayList<CabinRequestType>();
            }
            return this.cabinRequest;
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
     *         &lt;element name="TariffType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "tariffType"
    })
    public static class TariffTypes {

        @XmlElement(name = "TariffType", nillable = true)
        protected List<String> tariffType;

        /**
         * Gets the value of the tariffType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tariffType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTariffType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTariffType() {
            if (tariffType == null) {
                tariffType = new ArrayList<String>();
            }
            return this.tariffType;
        }

    }

}
