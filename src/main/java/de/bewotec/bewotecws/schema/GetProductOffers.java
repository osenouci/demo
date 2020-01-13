
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
 *         &lt;element name="GetProductOffersRequest" type="{http://www.bewotec.de/bewotecws/Schema}ProductRequestType"/>
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
    "getProductOffersRequest"
})
@XmlRootElement(name = "GetProductOffers")
public class GetProductOffers {

    @XmlElement(name = "GetProductOffersRequest", required = true)
    protected ProductRequestType getProductOffersRequest;

    /**
     * Gets the value of the getProductOffersRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ProductRequestType }
     *     
     */
    public ProductRequestType getGetProductOffersRequest() {
        return getProductOffersRequest;
    }

    /**
     * Sets the value of the getProductOffersRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductRequestType }
     *     
     */
    public void setGetProductOffersRequest(ProductRequestType value) {
        this.getProductOffersRequest = value;
    }

}
