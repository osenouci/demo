
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailabilityResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Rooms">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Room" type="{http://www.bewotec.de/bewotecws/Schema}RoomTypeAndCodeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Boards">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Board" type="{http://www.bewotec.de/bewotecws/Schema}BoardTypeAndCodeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DepartureAirports" type="{http://www.bewotec.de/bewotecws/Schema}AirportListType" minOccurs="0"/>
 *         &lt;element name="ArrivalAirports" type="{http://www.bewotec.de/bewotecws/Schema}AirportListType" minOccurs="0"/>
 *         &lt;element name="Durations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityResponseType", propOrder = {
    "month",
    "year",
    "rooms",
    "boards",
    "departureAirports",
    "arrivalAirports",
    "durations",
    "count"
})
public class AvailabilityResponseType {

    @XmlElement(name = "Month")
    protected int month;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "Rooms", required = true)
    protected AvailabilityResponseType.Rooms rooms;
    @XmlElement(name = "Boards", required = true)
    protected AvailabilityResponseType.Boards boards;
    @XmlElement(name = "DepartureAirports")
    protected AirportListType departureAirports;
    @XmlElement(name = "ArrivalAirports")
    protected AirportListType arrivalAirports;
    @XmlElement(name = "Durations", required = true)
    protected AvailabilityResponseType.Durations durations;
    @XmlElement(name = "Count")
    protected int count;

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityResponseType.Rooms }
     *     
     */
    public AvailabilityResponseType.Rooms getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityResponseType.Rooms }
     *     
     */
    public void setRooms(AvailabilityResponseType.Rooms value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the boards property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityResponseType.Boards }
     *     
     */
    public AvailabilityResponseType.Boards getBoards() {
        return boards;
    }

    /**
     * Sets the value of the boards property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityResponseType.Boards }
     *     
     */
    public void setBoards(AvailabilityResponseType.Boards value) {
        this.boards = value;
    }

    /**
     * Gets the value of the departureAirports property.
     * 
     * @return
     *     possible object is
     *     {@link AirportListType }
     *     
     */
    public AirportListType getDepartureAirports() {
        return departureAirports;
    }

    /**
     * Sets the value of the departureAirports property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportListType }
     *     
     */
    public void setDepartureAirports(AirportListType value) {
        this.departureAirports = value;
    }

    /**
     * Gets the value of the arrivalAirports property.
     * 
     * @return
     *     possible object is
     *     {@link AirportListType }
     *     
     */
    public AirportListType getArrivalAirports() {
        return arrivalAirports;
    }

    /**
     * Sets the value of the arrivalAirports property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportListType }
     *     
     */
    public void setArrivalAirports(AirportListType value) {
        this.arrivalAirports = value;
    }

    /**
     * Gets the value of the durations property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityResponseType.Durations }
     *     
     */
    public AvailabilityResponseType.Durations getDurations() {
        return durations;
    }

    /**
     * Sets the value of the durations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityResponseType.Durations }
     *     
     */
    public void setDurations(AvailabilityResponseType.Durations value) {
        this.durations = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
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
     *         &lt;element name="Board" type="{http://www.bewotec.de/bewotecws/Schema}BoardTypeAndCodeType" maxOccurs="unbounded"/>
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
        "board"
    })
    public static class Boards {

        @XmlElement(name = "Board", required = true)
        protected List<BoardTypeAndCodeType> board;

        /**
         * Gets the value of the board property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the board property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBoard().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoardTypeAndCodeType }
         * 
         * 
         */
        public List<BoardTypeAndCodeType> getBoard() {
            if (board == null) {
                board = new ArrayList<BoardTypeAndCodeType>();
            }
            return this.board;
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
     *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
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
        "duration"
    })
    public static class Durations {

        @XmlElement(name = "Duration", type = Integer.class)
        protected List<Integer> duration;

        /**
         * Gets the value of the duration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the duration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDuration().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getDuration() {
            if (duration == null) {
                duration = new ArrayList<Integer>();
            }
            return this.duration;
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
     *         &lt;element name="Room" type="{http://www.bewotec.de/bewotecws/Schema}RoomTypeAndCodeType" maxOccurs="unbounded"/>
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
        "room"
    })
    public static class Rooms {

        @XmlElement(name = "Room", required = true)
        protected List<RoomTypeAndCodeType> room;

        /**
         * Gets the value of the room property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the room property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoom().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoomTypeAndCodeType }
         * 
         * 
         */
        public List<RoomTypeAndCodeType> getRoom() {
            if (room == null) {
                room = new ArrayList<RoomTypeAndCodeType>();
            }
            return this.room;
        }

    }

}
