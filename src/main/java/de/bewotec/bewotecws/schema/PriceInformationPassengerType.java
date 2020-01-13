
package de.bewotec.bewotecws.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Price information per participant
 * 
 * <p>Java class for PriceInformationPassengerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceInformationPassengerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PassengerCode" type="{http://www.bewotec.de/bewotecws/Schema}PassengerCodeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInformationPassengerType", propOrder = {
    "id",
    "amount",
    "passengerCode"
})
public class PriceInformationPassengerType {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "PassengerCode")
    protected PassengerCodeEnum passengerCode;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the passengerCode property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCodeEnum }
     *     
     */
    public PassengerCodeEnum getPassengerCode() {
        return passengerCode;
    }

    /**
     * Sets the value of the passengerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCodeEnum }
     *     
     */
    public void setPassengerCode(PassengerCodeEnum value) {
        this.passengerCode = value;
    }

}
