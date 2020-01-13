
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request criteria in relation to rooms
 * 
 * <p>Java class for RoomRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="RoomType" type="{http://www.bewotec.de/bewotecws/Schema}RoomEnum" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Passengers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PassengerId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoomFigures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomFigure" type="{http://www.bewotec.de/bewotecws/Schema}FigureRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RoomRequestType", propOrder = {
    "roomCodes",
    "roomTypes",
    "passengers",
    "roomFigures"
})
public class RoomRequestType {

    @XmlElement(name = "RoomCodes")
    protected RoomRequestType.RoomCodes roomCodes;
    @XmlElement(name = "RoomTypes")
    protected RoomRequestType.RoomTypes roomTypes;
    @XmlElement(name = "Passengers")
    protected RoomRequestType.Passengers passengers;
    @XmlElement(name = "RoomFigures")
    protected RoomRequestType.RoomFigures roomFigures;

    /**
     * Gets the value of the roomCodes property.
     * 
     * @return
     *     possible object is
     *     {@link RoomRequestType.RoomCodes }
     *     
     */
    public RoomRequestType.RoomCodes getRoomCodes() {
        return roomCodes;
    }

    /**
     * Sets the value of the roomCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomRequestType.RoomCodes }
     *     
     */
    public void setRoomCodes(RoomRequestType.RoomCodes value) {
        this.roomCodes = value;
    }

    /**
     * Gets the value of the roomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link RoomRequestType.RoomTypes }
     *     
     */
    public RoomRequestType.RoomTypes getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomRequestType.RoomTypes }
     *     
     */
    public void setRoomTypes(RoomRequestType.RoomTypes value) {
        this.roomTypes = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link RoomRequestType.Passengers }
     *     
     */
    public RoomRequestType.Passengers getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomRequestType.Passengers }
     *     
     */
    public void setPassengers(RoomRequestType.Passengers value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the roomFigures property.
     * 
     * @return
     *     possible object is
     *     {@link RoomRequestType.RoomFigures }
     *     
     */
    public RoomRequestType.RoomFigures getRoomFigures() {
        return roomFigures;
    }

    /**
     * Sets the value of the roomFigures property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomRequestType.RoomFigures }
     *     
     */
    public void setRoomFigures(RoomRequestType.RoomFigures value) {
        this.roomFigures = value;
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
     *         &lt;element name="PassengerId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
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
        "passengerId"
    })
    public static class Passengers {

        @XmlElement(name = "PassengerId", type = Integer.class)
        protected List<Integer> passengerId;

        /**
         * Gets the value of the passengerId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getPassengerId() {
            if (passengerId == null) {
                passengerId = new ArrayList<Integer>();
            }
            return this.passengerId;
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
     *         &lt;element name="RoomCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "roomCode"
    })
    public static class RoomCodes {

        @XmlElement(name = "RoomCode", nillable = true)
        protected List<String> roomCode;

        /**
         * Gets the value of the roomCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRoomCode() {
            if (roomCode == null) {
                roomCode = new ArrayList<String>();
            }
            return this.roomCode;
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
     *         &lt;element name="RoomFigure" type="{http://www.bewotec.de/bewotecws/Schema}FigureRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
        "roomFigure"
    })
    public static class RoomFigures {

        @XmlElement(name = "RoomFigure")
        protected List<FigureRequestType> roomFigure;

        /**
         * Gets the value of the roomFigure property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomFigure property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomFigure().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FigureRequestType }
         * 
         * 
         */
        public List<FigureRequestType> getRoomFigure() {
            if (roomFigure == null) {
                roomFigure = new ArrayList<FigureRequestType>();
            }
            return this.roomFigure;
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
     *         &lt;element name="RoomType" type="{http://www.bewotec.de/bewotecws/Schema}RoomEnum" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(name = "RoomType")
        protected List<RoomEnum> roomType;

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
         * {@link RoomEnum }
         * 
         * 
         */
        public List<RoomEnum> getRoomType() {
            if (roomType == null) {
                roomType = new ArrayList<RoomEnum>();
            }
            return this.roomType;
        }

    }

}
