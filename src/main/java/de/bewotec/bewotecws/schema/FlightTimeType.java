
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request criteria for filter with flight times
 * 
 * <p>Java class for FlightTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinTimeArrival" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxTimeArrival" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightTimeType", propOrder = {
    "minTime",
    "maxTime",
    "minTimeArrival",
    "maxTimeArrival"
})
public class FlightTimeType {

    @XmlElement(name = "MinTime")
    protected String minTime;
    @XmlElement(name = "MaxTime")
    protected String maxTime;
    @XmlElement(name = "MinTimeArrival")
    protected String minTimeArrival;
    @XmlElement(name = "MaxTimeArrival")
    protected String maxTimeArrival;

    /**
     * Gets the value of the minTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinTime() {
        return minTime;
    }

    /**
     * Sets the value of the minTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinTime(String value) {
        this.minTime = value;
    }

    /**
     * Gets the value of the maxTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxTime() {
        return maxTime;
    }

    /**
     * Sets the value of the maxTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxTime(String value) {
        this.maxTime = value;
    }

    /**
     * Gets the value of the minTimeArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinTimeArrival() {
        return minTimeArrival;
    }

    /**
     * Sets the value of the minTimeArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinTimeArrival(String value) {
        this.minTimeArrival = value;
    }

    /**
     * Gets the value of the maxTimeArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxTimeArrival() {
        return maxTimeArrival;
    }

    /**
     * Sets the value of the maxTimeArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxTimeArrival(String value) {
        this.maxTimeArrival = value;
    }

}
