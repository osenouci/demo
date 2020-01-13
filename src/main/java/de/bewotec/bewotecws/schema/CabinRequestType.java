
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request criteria in relation to cabins
 * 
 * <p>Java class for CabinRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CabinCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CabinTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CabinType" type="{http://www.bewotec.de/bewotecws/Schema}CabinEnum" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CabinRequestType", propOrder = {
    "cabinCodes",
    "cabinTypes"
})
public class CabinRequestType {

    @XmlElement(name = "CabinCodes")
    protected CabinRequestType.CabinCodes cabinCodes;
    @XmlElement(name = "CabinTypes")
    protected CabinRequestType.CabinTypes cabinTypes;

    /**
     * Gets the value of the cabinCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CabinRequestType.CabinCodes }
     *     
     */
    public CabinRequestType.CabinCodes getCabinCodes() {
        return cabinCodes;
    }

    /**
     * Sets the value of the cabinCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinRequestType.CabinCodes }
     *     
     */
    public void setCabinCodes(CabinRequestType.CabinCodes value) {
        this.cabinCodes = value;
    }

    /**
     * Gets the value of the cabinTypes property.
     * 
     * @return
     *     possible object is
     *     {@link CabinRequestType.CabinTypes }
     *     
     */
    public CabinRequestType.CabinTypes getCabinTypes() {
        return cabinTypes;
    }

    /**
     * Sets the value of the cabinTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinRequestType.CabinTypes }
     *     
     */
    public void setCabinTypes(CabinRequestType.CabinTypes value) {
        this.cabinTypes = value;
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
     *         &lt;element name="CabinCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "cabinCode"
    })
    public static class CabinCodes {

        @XmlElement(name = "CabinCode", nillable = true)
        protected List<String> cabinCode;

        /**
         * Gets the value of the cabinCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabinCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabinCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCabinCode() {
            if (cabinCode == null) {
                cabinCode = new ArrayList<String>();
            }
            return this.cabinCode;
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
     *         &lt;element name="CabinType" type="{http://www.bewotec.de/bewotecws/Schema}CabinEnum" maxOccurs="unbounded" minOccurs="0"/>
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
        "cabinType"
    })
    public static class CabinTypes {

        @XmlElement(name = "CabinType")
        protected List<CabinEnum> cabinType;

        /**
         * Gets the value of the cabinType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabinType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabinType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CabinEnum }
         * 
         * 
         */
        public List<CabinEnum> getCabinType() {
            if (cabinType == null) {
                cabinType = new ArrayList<CabinEnum>();
            }
            return this.cabinType;
        }

    }

}
