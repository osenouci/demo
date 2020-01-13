
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
 *         &lt;element name="GetProductAvailabilityResult" type="{http://www.bewotec.de/bewotecws/Schema}ProductAvailabilityResponseType"/>
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
    "getProductAvailabilityResult"
})
@XmlRootElement(name = "GetProductAvailabilityResponse")
public class GetProductAvailabilityResponse {

    @XmlElement(name = "GetProductAvailabilityResult", required = true)
    protected ProductAvailabilityResponseType getProductAvailabilityResult;

    /**
     * Gets the value of the getProductAvailabilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAvailabilityResponseType }
     *     
     */
    public ProductAvailabilityResponseType getGetProductAvailabilityResult() {
        return getProductAvailabilityResult;
    }

    /**
     * Sets the value of the getProductAvailabilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAvailabilityResponseType }
     *     
     */
    public void setGetProductAvailabilityResult(ProductAvailabilityResponseType value) {
        this.getProductAvailabilityResult = value;
    }

}
