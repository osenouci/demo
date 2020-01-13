
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request criteria for concrete flight combination
 * 
 * <p>Java class for FlightProductCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightProductCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutboundCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InboundCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightProductCodeType", propOrder = {
    "outboundCode",
    "inboundCode"
})
public class FlightProductCodeType {

    @XmlElement(name = "OutboundCode")
    protected String outboundCode;
    @XmlElement(name = "InboundCode")
    protected String inboundCode;

    /**
     * Gets the value of the outboundCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundCode() {
        return outboundCode;
    }

    /**
     * Sets the value of the outboundCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundCode(String value) {
        this.outboundCode = value;
    }

    /**
     * Gets the value of the inboundCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundCode() {
        return inboundCode;
    }

    /**
     * Sets the value of the inboundCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundCode(String value) {
        this.inboundCode = value;
    }

}
