
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Climate information
 * 
 * <p>Java class for ClimateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClimateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirTemperature" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WaterTemperature" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TemperatureUnit" type="{http://www.bewotec.de/bewotecws/Schema}TemperatureUnitEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClimateType", propOrder = {
    "airTemperature",
    "waterTemperature",
    "temperatureUnit"
})
public class ClimateType {

    @XmlElement(name = "AirTemperature")
    protected Integer airTemperature;
    @XmlElement(name = "WaterTemperature")
    protected Integer waterTemperature;
    @XmlElement(name = "TemperatureUnit")
    protected TemperatureUnitEnum temperatureUnit;

    /**
     * Gets the value of the airTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAirTemperature() {
        return airTemperature;
    }

    /**
     * Sets the value of the airTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAirTemperature(Integer value) {
        this.airTemperature = value;
    }

    /**
     * Gets the value of the waterTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWaterTemperature() {
        return waterTemperature;
    }

    /**
     * Sets the value of the waterTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWaterTemperature(Integer value) {
        this.waterTemperature = value;
    }

    /**
     * Gets the value of the temperatureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureUnitEnum }
     *     
     */
    public TemperatureUnitEnum getTemperatureUnit() {
        return temperatureUnit;
    }

    /**
     * Sets the value of the temperatureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureUnitEnum }
     *     
     */
    public void setTemperatureUnit(TemperatureUnitEnum value) {
        this.temperatureUnit = value;
    }

}
