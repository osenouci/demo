
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
 *         &lt;element name="GetProductVariantResult" type="{http://www.bewotec.de/bewotecws/Schema}ProductResponseType"/>
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
    "getProductVariantResult"
})
@XmlRootElement(name = "GetProductVariantResponse")
public class GetProductVariantResponse {

    @XmlElement(name = "GetProductVariantResult", required = true)
    protected ProductResponseType getProductVariantResult;

    /**
     * Gets the value of the getProductVariantResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductResponseType }
     *     
     */
    public ProductResponseType getGetProductVariantResult() {
        return getProductVariantResult;
    }

    /**
     * Sets the value of the getProductVariantResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductResponseType }
     *     
     */
    public void setGetProductVariantResult(ProductResponseType value) {
        this.getProductVariantResult = value;
    }

}
