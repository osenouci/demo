
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
 *         &lt;element name="GetFiltersResult" type="{http://www.bewotec.de/bewotecws/Schema}FiltersResponseType"/>
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
    "getFiltersResult"
})
@XmlRootElement(name = "GetFiltersResponse")
public class GetFiltersResponse {

    @XmlElement(name = "GetFiltersResult", required = true)
    protected FiltersResponseType getFiltersResult;

    /**
     * Gets the value of the getFiltersResult property.
     * 
     * @return
     *     possible object is
     *     {@link FiltersResponseType }
     *     
     */
    public FiltersResponseType getGetFiltersResult() {
        return getFiltersResult;
    }

    /**
     * Sets the value of the getFiltersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltersResponseType }
     *     
     */
    public void setGetFiltersResult(FiltersResponseType value) {
        this.getFiltersResult = value;
    }

}
