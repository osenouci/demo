
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
 *         &lt;element name="GetProductVariantRequest" type="{http://www.bewotec.de/bewotecws/Schema}ProductVariantRequestType"/>
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
    "getProductVariantRequest"
})
@XmlRootElement(name = "GetProductVariant")
public class GetProductVariant {

    @XmlElement(name = "GetProductVariantRequest", required = true)
    protected ProductVariantRequestType getProductVariantRequest;

    /**
     * Gets the value of the getProductVariantRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ProductVariantRequestType }
     *     
     */
    public ProductVariantRequestType getGetProductVariantRequest() {
        return getProductVariantRequest;
    }

    /**
     * Sets the value of the getProductVariantRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductVariantRequestType }
     *     
     */
    public void setGetProductVariantRequest(ProductVariantRequestType value) {
        this.getProductVariantRequest = value;
    }

}
