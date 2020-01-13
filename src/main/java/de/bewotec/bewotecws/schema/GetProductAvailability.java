
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetProductAvailabilityRequest" type="{http://www.bewotec.de/bewotecws/Schema}ProductAvailabilityRequestType"/>
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
    "getProductAvailabilityRequest"
})
@XmlRootElement(name = "GetProductAvailability")
public class GetProductAvailability {

    @XmlElement(name = "GetProductAvailabilityRequest", required = true)
    protected ProductAvailabilityRequestType getProductAvailabilityRequest;

    /**
     * Gets the value of the getProductAvailabilityRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAvailabilityRequestType }
     *     
     */
    public ProductAvailabilityRequestType getGetProductAvailabilityRequest() {
        return getProductAvailabilityRequest;
    }

    /**
     * Sets the value of the getProductAvailabilityRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAvailabilityRequestType }
     *     
     */
    public void setGetProductAvailabilityRequest(ProductAvailabilityRequestType value) {
        this.getProductAvailabilityRequest = value;
    }

}
