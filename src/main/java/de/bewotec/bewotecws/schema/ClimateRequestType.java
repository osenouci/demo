
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Climate information
 * 
 * <p>Java class for ClimateRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClimateRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirTemperatureMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AirTemperatureMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WaterTemperatureMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WaterTemperatureMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClimateRequestType", propOrder = {
    "airTemperatureMin",
    "airTemperatureMax",
    "waterTemperatureMin",
    "waterTemperatureMax"
})
public class ClimateRequestType {

    @XmlElement(name = "AirTemperatureMin")
    protected Integer airTemperatureMin;
    @XmlElement(name = "AirTemperatureMax")
    protected Integer airTemperatureMax;
    @XmlElement(name = "WaterTemperatureMin")
    protected Integer waterTemperatureMin;
    @XmlElement(name = "WaterTemperatureMax")
    protected Integer waterTemperatureMax;

    /**
     * Gets the value of the airTemperatureMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAirTemperatureMin() {
        return airTemperatureMin;
    }

    /**
     * Sets the value of the airTemperatureMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAirTemperatureMin(Integer value) {
        this.airTemperatureMin = value;
    }

    /**
     * Gets the value of the airTemperatureMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAirTemperatureMax() {
        return airTemperatureMax;
    }

    /**
     * Sets the value of the airTemperatureMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAirTemperatureMax(Integer value) {
        this.airTemperatureMax = value;
    }

    /**
     * Gets the value of the waterTemperatureMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWaterTemperatureMin() {
        return waterTemperatureMin;
    }

    /**
     * Sets the value of the waterTemperatureMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWaterTemperatureMin(Integer value) {
        this.waterTemperatureMin = value;
    }

    /**
     * Gets the value of the waterTemperatureMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWaterTemperatureMax() {
        return waterTemperatureMax;
    }

    /**
     * Sets the value of the waterTemperatureMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWaterTemperatureMax(Integer value) {
        this.waterTemperatureMax = value;
    }

}
