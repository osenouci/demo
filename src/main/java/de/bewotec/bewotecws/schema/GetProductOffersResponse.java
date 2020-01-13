
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
 *         &lt;element name="GetProductOffersResult" type="{http://www.bewotec.de/bewotecws/Schema}ProductResponseType"/>
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
    "getProductOffersResult"
})
@XmlRootElement(name = "GetProductOffersResponse")
public class GetProductOffersResponse {

    @XmlElement(name = "GetProductOffersResult", required = true)
    protected ProductResponseType getProductOffersResult;

    /**
     * Gets the value of the getProductOffersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductResponseType }
     *     
     */
    public ProductResponseType getGetProductOffersResult() {
        return getProductOffersResult;
    }

    /**
     * Sets the value of the getProductOffersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductResponseType }
     *     
     */
    public void setGetProductOffersResult(ProductResponseType value) {
        this.getProductOffersResult = value;
    }

}
