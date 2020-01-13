
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
 *         &lt;element name="GetProductGroupsRequest" type="{http://www.bewotec.de/bewotecws/Schema}GroupRequestType"/>
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
    "getProductGroupsRequest"
})
@XmlRootElement(name = "GetProductGroups")
public class GetProductGroups {

    @XmlElement(name = "GetProductGroupsRequest", required = true)
    protected GroupRequestType getProductGroupsRequest;

    /**
     * Gets the value of the getProductGroupsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GroupRequestType }
     *     
     */
    public GroupRequestType getGetProductGroupsRequest() {
        return getProductGroupsRequest;
    }

    /**
     * Sets the value of the getProductGroupsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupRequestType }
     *     
     */
    public void setGetProductGroupsRequest(GroupRequestType value) {
        this.getProductGroupsRequest = value;
    }

}
