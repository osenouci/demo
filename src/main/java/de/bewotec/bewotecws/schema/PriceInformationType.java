
package de.bewotec.bewotecws.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Price information for a specific product
 * 
 * <p>Java class for PriceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PerPerson" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Passengers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PriceInformationPassenger" type="{http://www.bewotec.de/bewotecws/Schema}PriceInformationPassengerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PriceType" type="{http://www.bewotec.de/bewotecws/Schema}PriceTypeEnum" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PriceDetail" type="{http://www.bewotec.de/bewotecws/Schema}PriceDetailType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PriceInformationType", propOrder = {
    "amount",
    "perPerson",
    "passengers",
    "priceTypes",
    "flightAmount",
    "priceDetails"
})
public class PriceInformationType {

    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "PerPerson")
    protected Boolean perPerson;
    @XmlElementRef(name = "Passengers", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<PriceInformationType.Passengers> passengers;
    @XmlElement(name = "PriceTypes")
    protected PriceInformationType.PriceTypes priceTypes;
    @XmlElement(name = "FlightAmount")
    protected BigDecimal flightAmount;
    @XmlElement(name = "PriceDetails")
    protected PriceInformationType.PriceDetails priceDetails;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the perPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerPerson() {
        return perPerson;
    }

    /**
     * Sets the value of the perPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerPerson(Boolean value) {
        this.perPerson = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriceInformationType.Passengers }{@code >}
     *     
     */
    public JAXBElement<PriceInformationType.Passengers> getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriceInformationType.Passengers }{@code >}
     *     
     */
    public void setPassengers(JAXBElement<PriceInformationType.Passengers> value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the priceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInformationType.PriceTypes }
     *     
     */
    public PriceInformationType.PriceTypes getPriceTypes() {
        return priceTypes;
    }

    /**
     * Sets the value of the priceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInformationType.PriceTypes }
     *     
     */
    public void setPriceTypes(PriceInformationType.PriceTypes value) {
        this.priceTypes = value;
    }

    /**
     * Gets the value of the flightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlightAmount() {
        return flightAmount;
    }

    /**
     * Sets the value of the flightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlightAmount(BigDecimal value) {
        this.flightAmount = value;
    }

    /**
     * Gets the value of the priceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInformationType.PriceDetails }
     *     
     */
    public PriceInformationType.PriceDetails getPriceDetails() {
        return priceDetails;
    }

    /**
     * Sets the value of the priceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInformationType.PriceDetails }
     *     
     */
    public void setPriceDetails(PriceInformationType.PriceDetails value) {
        this.priceDetails = value;
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
     *         &lt;element name="PriceInformationPassenger" type="{http://www.bewotec.de/bewotecws/Schema}PriceInformationPassengerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "priceInformationPassenger"
    })
    public static class Passengers {

        @XmlElement(name = "PriceInformationPassenger", nillable = true)
        protected List<PriceInformationPassengerType> priceInformationPassenger;

        /**
         * Gets the value of the priceInformationPassenger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceInformationPassenger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceInformationPassenger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PriceInformationPassengerType }
         * 
         * 
         */
        public List<PriceInformationPassengerType> getPriceInformationPassenger() {
            if (priceInformationPassenger == null) {
                priceInformationPassenger = new ArrayList<PriceInformationPassengerType>();
            }
            return this.priceInformationPassenger;
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
     *         &lt;element name="PriceDetail" type="{http://www.bewotec.de/bewotecws/Schema}PriceDetailType" maxOccurs="unbounded" minOccurs="0"/>
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
        "priceDetail"
    })
    public static class PriceDetails {

        @XmlElement(name = "PriceDetail")
        protected List<PriceDetailType> priceDetail;

        /**
         * Gets the value of the priceDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PriceDetailType }
         * 
         * 
         */
        public List<PriceDetailType> getPriceDetail() {
            if (priceDetail == null) {
                priceDetail = new ArrayList<PriceDetailType>();
            }
            return this.priceDetail;
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
     *         &lt;element name="PriceType" type="{http://www.bewotec.de/bewotecws/Schema}PriceTypeEnum" maxOccurs="unbounded" minOccurs="0"/>
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
        "priceType"
    })
    public static class PriceTypes {

        @XmlElement(name = "PriceType")
        protected List<PriceTypeEnum> priceType;

        /**
         * Gets the value of the priceType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PriceTypeEnum }
         * 
         * 
         */
        public List<PriceTypeEnum> getPriceType() {
            if (priceType == null) {
                priceType = new ArrayList<PriceTypeEnum>();
            }
            return this.priceType;
        }

    }

}
