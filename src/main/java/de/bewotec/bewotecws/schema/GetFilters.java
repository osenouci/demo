
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
 *         &lt;element name="GetFiltersRequest" type="{http://www.bewotec.de/bewotecws/Schema}FiltersRequestType"/>
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
    "getFiltersRequest"
})
@XmlRootElement(name = "GetFilters")
public class GetFilters {

    @XmlElement(name = "GetFiltersRequest", required = true)
    protected FiltersRequestType getFiltersRequest;

    /**
     * Gets the value of the getFiltersRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FiltersRequestType }
     *     
     */
    public FiltersRequestType getGetFiltersRequest() {
        return getFiltersRequest;
    }

    /**
     * Sets the value of the getFiltersRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltersRequestType }
     *     
     */
    public void setGetFiltersRequest(FiltersRequestType value) {
        this.getFiltersRequest = value;
    }

}
