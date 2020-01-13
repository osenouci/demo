
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
 * Search critera based on the accomodation
 * 
 * <p>Java class for AccommodationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccommodationRequestType">
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
 *         &lt;element name="Rooms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomRequest" type="{http://www.bewotec.de/bewotecws/Schema}RoomRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="AccommodationFigures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccommodationFigure" type="{http://www.bewotec.de/bewotecws/Schema}FigureRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AccommodationRequestType", propOrder = {
    "productCodes",
    "identities",
    "name",
    "minCategory",
    "rooms",
    "boards",
    "accommodationProperties",
    "accommodationFigures",
    "recommendations"
})
public class AccommodationRequestType {

    @XmlElementRef(name = "ProductCodes", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AccommodationRequestType.ProductCodes> productCodes;
    @XmlElementRef(name = "Identities", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AccommodationRequestType.Identities> identities;
    @XmlElementRef(name = "Name", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "MinCategory", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> minCategory;
    @XmlElementRef(name = "Rooms", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AccommodationRequestType.Rooms> rooms;
    @XmlElementRef(name = "Boards", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AccommodationRequestType.Boards> boards;
    @XmlElement(name = "AccommodationProperties")
    protected AccommodationRequestType.AccommodationProperties accommodationProperties;
    @XmlElement(name = "AccommodationFigures")
    protected AccommodationRequestType.AccommodationFigures accommodationFigures;
    @XmlElement(name = "Recommendations")
    protected AccommodationRequestType.Recommendations recommendations;

    /**
     * Gets the value of the productCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccommodationRequestType.ProductCodes }{@code >}
     *     
     */
    public JAXBElement<AccommodationRequestType.ProductCodes> getProductCodes() {
        return productCodes;
    }

    /**
     * Sets the value of the productCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccommodationRequestType.ProductCodes }{@code >}
     *     
     */
    public void setProductCodes(JAXBElement<AccommodationRequestType.ProductCodes> value) {
        this.productCodes = value;
    }

    /**
     * Gets the value of the identities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccommodationRequestType.Identities }{@code >}
     *     
     */
    public JAXBElement<AccommodationRequestType.Identities> getIdentities() {
        return identities;
    }

    /**
     * Sets the value of the identities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccommodationRequestType.Identities }{@code >}
     *     
     */
    public void setIdentities(JAXBElement<AccommodationRequestType.Identities> value) {
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
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccommodationRequestType.Rooms }{@code >}
     *     
     */
    public JAXBElement<AccommodationRequestType.Rooms> getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccommodationRequestType.Rooms }{@code >}
     *     
     */
    public void setRooms(JAXBElement<AccommodationRequestType.Rooms> value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the boards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccommodationRequestType.Boards }{@code >}
     *     
     */
    public JAXBElement<AccommodationRequestType.Boards> getBoards() {
        return boards;
    }

    /**
     * Sets the value of the boards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccommodationRequestType.Boards }{@code >}
     *     
     */
    public void setBoards(JAXBElement<AccommodationRequestType.Boards> value) {
        this.boards = value;
    }

    /**
     * Gets the value of the accommodationProperties property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationRequestType.AccommodationProperties }
     *     
     */
    public AccommodationRequestType.AccommodationProperties getAccommodationProperties() {
        return accommodationProperties;
    }

    /**
     * Sets the value of the accommodationProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationRequestType.AccommodationProperties }
     *     
     */
    public void setAccommodationProperties(AccommodationRequestType.AccommodationProperties value) {
        this.accommodationProperties = value;
    }

    /**
     * Gets the value of the accommodationFigures property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationRequestType.AccommodationFigures }
     *     
     */
    public AccommodationRequestType.AccommodationFigures getAccommodationFigures() {
        return accommodationFigures;
    }

    /**
     * Sets the value of the accommodationFigures property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationRequestType.AccommodationFigures }
     *     
     */
    public void setAccommodationFigures(AccommodationRequestType.AccommodationFigures value) {
        this.accommodationFigures = value;
    }

    /**
     * Gets the value of the recommendations property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationRequestType.Recommendations }
     *     
     */
    public AccommodationRequestType.Recommendations getRecommendations() {
        return recommendations;
    }

    /**
     * Sets the value of the recommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationRequestType.Recommendations }
     *     
     */
    public void setRecommendations(AccommodationRequestType.Recommendations value) {
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
     *         &lt;element name="AccommodationFigure" type="{http://www.bewotec.de/bewotecws/Schema}FigureRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
        "accommodationFigure"
    })
    public static class AccommodationFigures {

        @XmlElement(name = "AccommodationFigure")
        protected List<FigureRequestType> accommodationFigure;

        /**
         * Gets the value of the accommodationFigure property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accommodationFigure property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccommodationFigure().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FigureRequestType }
         * 
         * 
         */
        public List<FigureRequestType> getAccommodationFigure() {
            if (accommodationFigure == null) {
                accommodationFigure = new ArrayList<FigureRequestType>();
            }
            return this.accommodationFigure;
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
     *         &lt;element name="RoomRequest" type="{http://www.bewotec.de/bewotecws/Schema}RoomRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
        "roomRequest"
    })
    public static class Rooms {

        @XmlElement(name = "RoomRequest", nillable = true)
        protected List<RoomRequestType> roomRequest;

        /**
         * Gets the value of the roomRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoomRequestType }
         * 
         * 
         */
        public List<RoomRequestType> getRoomRequest() {
            if (roomRequest == null) {
                roomRequest = new ArrayList<RoomRequestType>();
            }
            return this.roomRequest;
        }

    }

}
