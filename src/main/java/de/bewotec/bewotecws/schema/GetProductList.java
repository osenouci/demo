
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
 *         &lt;element name="GetProductListRequest" type="{http://www.bewotec.de/bewotecws/Schema}ProductRequestType"/>
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
    "getProductListRequest"
})
@XmlRootElement(name = "GetProductList")
public class GetProductList {

    @XmlElement(name = "GetProductListRequest", required = true)
    protected ProductRequestType getProductListRequest;

    /**
     * Gets the value of the getProductListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ProductRequestType }
     *     
     */
    public ProductRequestType getGetProductListRequest() {
        return getProductListRequest;
    }

    /**
     * Sets the value of the getProductListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductRequestType }
     *     
     */
    public void setGetProductListRequest(ProductRequestType value) {
        this.getProductListRequest = value;
    }

}
