
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
 *         &lt;element name="GetAvailableValuesRequest" type="{http://www.bewotec.de/bewotecws/Schema}ValuesRequestType"/>
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
    "getAvailableValuesRequest"
})
@XmlRootElement(name = "GetAvailableValues")
public class GetAvailableValues {

    @XmlElement(name = "GetAvailableValuesRequest", required = true)
    protected ValuesRequestType getAvailableValuesRequest;

    /**
     * Gets the value of the getAvailableValuesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesRequestType }
     *     
     */
    public ValuesRequestType getGetAvailableValuesRequest() {
        return getAvailableValuesRequest;
    }

    /**
     * Sets the value of the getAvailableValuesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesRequestType }
     *     
     */
    public void setGetAvailableValuesRequest(ValuesRequestType value) {
        this.getAvailableValuesRequest = value;
    }

}
