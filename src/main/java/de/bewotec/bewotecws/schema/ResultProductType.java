
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
 * Price information is included in a product. A product references to one or more services.
 * 
 * <p>Java class for ResultProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConfirmationBooking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RequestBooking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServiceReferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServiceReference" type="{http://www.bewotec.de/bewotecws/Schema}ServiceReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceInformation" type="{http://www.bewotec.de/bewotecws/Schema}PriceInformationType"/>
 *         &lt;element name="FlightAlternativeExisting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SoldOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Availability" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlightAvailability" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultProductType", propOrder = {
    "id",
    "confirmationBooking",
    "requestBooking",
    "serviceReferences",
    "priceInformation",
    "flightAlternativeExisting",
    "soldOut",
    "availability",
    "flightAvailability"
})
public class ResultProductType {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "ConfirmationBooking")
    protected Boolean confirmationBooking;
    @XmlElement(name = "RequestBooking")
    protected Boolean requestBooking;
    @XmlElementRef(name = "ServiceReferences", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<ResultProductType.ServiceReferences> serviceReferences;
    @XmlElement(name = "PriceInformation", required = true, nillable = true)
    protected PriceInformationType priceInformation;
    @XmlElement(name = "FlightAlternativeExisting")
    protected Boolean flightAlternativeExisting;
    @XmlElement(name = "SoldOut")
    protected Boolean soldOut;
    @XmlElement(name = "Availability")
    protected Integer availability;
    @XmlElement(name = "FlightAvailability")
    protected Integer flightAvailability;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the confirmationBooking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmationBooking() {
        return confirmationBooking;
    }

    /**
     * Sets the value of the confirmationBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmationBooking(Boolean value) {
        this.confirmationBooking = value;
    }

    /**
     * Gets the value of the requestBooking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestBooking() {
        return requestBooking;
    }

    /**
     * Sets the value of the requestBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestBooking(Boolean value) {
        this.requestBooking = value;
    }

    /**
     * Gets the value of the serviceReferences property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResultProductType.ServiceReferences }{@code >}
     *     
     */
    public JAXBElement<ResultProductType.ServiceReferences> getServiceReferences() {
        return serviceReferences;
    }

    /**
     * Sets the value of the serviceReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResultProductType.ServiceReferences }{@code >}
     *     
     */
    public void setServiceReferences(JAXBElement<ResultProductType.ServiceReferences> value) {
        this.serviceReferences = value;
    }

    /**
     * Gets the value of the priceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInformationType }
     *     
     */
    public PriceInformationType getPriceInformation() {
        return priceInformation;
    }

    /**
     * Sets the value of the priceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInformationType }
     *     
     */
    public void setPriceInformation(PriceInformationType value) {
        this.priceInformation = value;
    }

    /**
     * Gets the value of the flightAlternativeExisting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlightAlternativeExisting() {
        return flightAlternativeExisting;
    }

    /**
     * Sets the value of the flightAlternativeExisting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlightAlternativeExisting(Boolean value) {
        this.flightAlternativeExisting = value;
    }

    /**
     * Gets the value of the soldOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoldOut() {
        return soldOut;
    }

    /**
     * Sets the value of the soldOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoldOut(Boolean value) {
        this.soldOut = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailability(Integer value) {
        this.availability = value;
    }

    /**
     * Gets the value of the flightAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightAvailability() {
        return flightAvailability;
    }

    /**
     * Sets the value of the flightAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightAvailability(Integer value) {
        this.flightAvailability = value;
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
     *         &lt;element name="ServiceReference" type="{http://www.bewotec.de/bewotecws/Schema}ServiceReferenceType" maxOccurs="unbounded" minOccurs="0"/>
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
        "serviceReference"
    })
    public static class ServiceReferences {

        @XmlElement(name = "ServiceReference", nillable = true)
        protected List<ServiceReferenceType> serviceReference;

        /**
         * Gets the value of the serviceReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceReferenceType }
         * 
         * 
         */
        public List<ServiceReferenceType> getServiceReference() {
            if (serviceReference == null) {
                serviceReference = new ArrayList<ServiceReferenceType>();
            }
            return this.serviceReference;
        }

    }

}
