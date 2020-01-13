
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Baggage information
 * 
 * <p>Java class for BaggageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageType" type="{http://www.bewotec.de/bewotecws/Schema}BaggageTypeEnum" minOccurs="0"/>
 *         &lt;element name="Pieces" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageType", propOrder = {
    "baggageType",
    "pieces",
    "weight"
})
public class BaggageType {

    @XmlElement(name = "BaggageType")
    protected BaggageTypeEnum baggageType;
    @XmlElement(name = "Pieces")
    @XmlSchemaType(name = "unsignedInt")
    protected Long pieces;
    @XmlElement(name = "Weight")
    protected Float weight;

    /**
     * Gets the value of the baggageType property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageTypeEnum }
     *     
     */
    public BaggageTypeEnum getBaggageType() {
        return baggageType;
    }

    /**
     * Sets the value of the baggageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageTypeEnum }
     *     
     */
    public void setBaggageType(BaggageTypeEnum value) {
        this.baggageType = value;
    }

    /**
     * Gets the value of the pieces property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPieces() {
        return pieces;
    }

    /**
     * Sets the value of the pieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPieces(Long value) {
        this.pieces = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeight(Float value) {
        this.weight = value;
    }

}
