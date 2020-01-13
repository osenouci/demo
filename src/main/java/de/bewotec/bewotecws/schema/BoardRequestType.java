
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request criteria in relation to baord
 * 
 * <p>Java class for BoardRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoardRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoardCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BoardCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="BoardType" type="{http://www.bewotec.de/bewotecws/Schema}BoardEnum" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "BoardRequestType", propOrder = {
    "boardCodes",
    "boardTypes"
})
public class BoardRequestType {

    @XmlElement(name = "BoardCodes")
    protected BoardRequestType.BoardCodes boardCodes;
    @XmlElement(name = "BoardTypes")
    protected BoardRequestType.BoardTypes boardTypes;

    /**
     * Gets the value of the boardCodes property.
     * 
     * @return
     *     possible object is
     *     {@link BoardRequestType.BoardCodes }
     *     
     */
    public BoardRequestType.BoardCodes getBoardCodes() {
        return boardCodes;
    }

    /**
     * Sets the value of the boardCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardRequestType.BoardCodes }
     *     
     */
    public void setBoardCodes(BoardRequestType.BoardCodes value) {
        this.boardCodes = value;
    }

    /**
     * Gets the value of the boardTypes property.
     * 
     * @return
     *     possible object is
     *     {@link BoardRequestType.BoardTypes }
     *     
     */
    public BoardRequestType.BoardTypes getBoardTypes() {
        return boardTypes;
    }

    /**
     * Sets the value of the boardTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardRequestType.BoardTypes }
     *     
     */
    public void setBoardTypes(BoardRequestType.BoardTypes value) {
        this.boardTypes = value;
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
     *         &lt;element name="BoardCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "boardCode"
    })
    public static class BoardCodes {

        @XmlElement(name = "BoardCode", nillable = true)
        protected List<String> boardCode;

        /**
         * Gets the value of the boardCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the boardCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBoardCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBoardCode() {
            if (boardCode == null) {
                boardCode = new ArrayList<String>();
            }
            return this.boardCode;
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
     *         &lt;element name="BoardType" type="{http://www.bewotec.de/bewotecws/Schema}BoardEnum" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(name = "BoardType")
        protected List<BoardEnum> boardType;

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
         * {@link BoardEnum }
         * 
         * 
         */
        public List<BoardEnum> getBoardType() {
            if (boardType == null) {
                boardType = new ArrayList<BoardEnum>();
            }
            return this.boardType;
        }

    }

}
