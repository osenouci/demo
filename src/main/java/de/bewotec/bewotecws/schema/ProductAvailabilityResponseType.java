
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Returns availabilities per month for the requested offer period.
 * 
 * <p>Java class for ProductAvailabilityResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAvailabilityResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ProcessMessages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProcessMessage" type="{http://www.bewotec.de/bewotecws/Schema}ProcessMessageType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Availabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Availability" type="{http://www.bewotec.de/bewotecws/Schema}AvailabilityResponseType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ProductAvailabilityResponseType", propOrder = {
    "requestId",
    "success",
    "processMessages",
    "availabilities"
})
public class ProductAvailabilityResponseType {

    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "Success")
    protected boolean success;
    @XmlElement(name = "ProcessMessages")
    protected ProductAvailabilityResponseType.ProcessMessages processMessages;
    @XmlElement(name = "Availabilities")
    protected ProductAvailabilityResponseType.Availabilities availabilities;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Gets the value of the processMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAvailabilityResponseType.ProcessMessages }
     *     
     */
    public ProductAvailabilityResponseType.ProcessMessages getProcessMessages() {
        return processMessages;
    }

    /**
     * Sets the value of the processMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAvailabilityResponseType.ProcessMessages }
     *     
     */
    public void setProcessMessages(ProductAvailabilityResponseType.ProcessMessages value) {
        this.processMessages = value;
    }

    /**
     * Gets the value of the availabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAvailabilityResponseType.Availabilities }
     *     
     */
    public ProductAvailabilityResponseType.Availabilities getAvailabilities() {
        return availabilities;
    }

    /**
     * Sets the value of the availabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAvailabilityResponseType.Availabilities }
     *     
     */
    public void setAvailabilities(ProductAvailabilityResponseType.Availabilities value) {
        this.availabilities = value;
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
     *         &lt;element name="Availability" type="{http://www.bewotec.de/bewotecws/Schema}AvailabilityResponseType" maxOccurs="unbounded" minOccurs="0"/>
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
        "availability"
    })
    public static class Availabilities {

        @XmlElement(name = "Availability")
        protected List<AvailabilityResponseType> availability;

        /**
         * Gets the value of the availability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvailability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AvailabilityResponseType }
         * 
         * 
         */
        public List<AvailabilityResponseType> getAvailability() {
            if (availability == null) {
                availability = new ArrayList<AvailabilityResponseType>();
            }
            return this.availability;
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
     *         &lt;element name="ProcessMessage" type="{http://www.bewotec.de/bewotecws/Schema}ProcessMessageType" maxOccurs="unbounded"/>
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
        "processMessage"
    })
    public static class ProcessMessages {

        @XmlElement(name = "ProcessMessage", required = true)
        protected List<ProcessMessageType> processMessage;

        /**
         * Gets the value of the processMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the processMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcessMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProcessMessageType }
         * 
         * 
         */
        public List<ProcessMessageType> getProcessMessage() {
            if (processMessage == null) {
                processMessage = new ArrayList<ProcessMessageType>();
            }
            return this.processMessage;
        }

    }

}
