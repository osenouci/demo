
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
 *         &lt;element name="GetProductListResult" type="{http://www.bewotec.de/bewotecws/Schema}ProductResponseType"/>
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
    "getProductListResult"
})
@XmlRootElement(name = "GetProductListResponse")
public class GetProductListResponse {

    @XmlElement(name = "GetProductListResult", required = true)
    protected ProductResponseType getProductListResult;

    /**
     * Gets the value of the getProductListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductResponseType }
     *     
     */
    public ProductResponseType getGetProductListResult() {
        return getProductListResult;
    }

    /**
     * Sets the value of the getProductListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductResponseType }
     *     
     */
    public void setGetProductListResult(ProductResponseType value) {
        this.getProductListResult = value;
    }

}
