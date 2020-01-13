
package de.bewotec.bewotecws.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request criteria in relation to price
 * 
 * <p>Java class for PriceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerPerson" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PriceTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PriceType" type="{http://www.bewotec.de/bewotecws/Schema}PriceTypeEnum" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FullpayerPriceOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceRequestType", propOrder = {
    "minAmount",
    "maxAmount",
    "perPerson",
    "priceTypes",
    "fullpayerPriceOnly"
})
public class PriceRequestType {

    @XmlElement(name = "MinAmount")
    protected BigDecimal minAmount;
    @XmlElement(name = "MaxAmount")
    protected BigDecimal maxAmount;
    @XmlElement(name = "PerPerson")
    protected Boolean perPerson;
    @XmlElement(name = "PriceTypes")
    protected PriceRequestType.PriceTypes priceTypes;
    @XmlElement(name = "FullpayerPriceOnly")
    protected Boolean fullpayerPriceOnly;

    /**
     * Gets the value of the minAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAmount(BigDecimal value) {
        this.minAmount = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmount(BigDecimal value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the perPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerPerson() {
        return perPerson;
    }

    /**
     * Sets the value of the perPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerPerson(Boolean value) {
        this.perPerson = value;
    }

    /**
     * Gets the value of the priceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRequestType.PriceTypes }
     *     
     */
    public PriceRequestType.PriceTypes getPriceTypes() {
        return priceTypes;
    }

    /**
     * Sets the value of the priceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRequestType.PriceTypes }
     *     
     */
    public void setPriceTypes(PriceRequestType.PriceTypes value) {
        this.priceTypes = value;
    }

    /**
     * Gets the value of the fullpayerPriceOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullpayerPriceOnly() {
        return fullpayerPriceOnly;
    }

    /**
     * Sets the value of the fullpayerPriceOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullpayerPriceOnly(Boolean value) {
        this.fullpayerPriceOnly = value;
    }


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
     *         &lt;element name="PriceType" type="{http://www.bewotec.de/bewotecws/Schema}PriceTypeEnum" maxOccurs="unbounded" minOccurs="0"/>
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
        "priceType"
    })
    public static class PriceTypes {

        @XmlElement(name = "PriceType")
        protected List<PriceTypeEnum> priceType;

        /**
         * Gets the value of the priceType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PriceTypeEnum }
         * 
         * 
         */
        public List<PriceTypeEnum> getPriceType() {
            if (priceType == null) {
                priceType = new ArrayList<PriceTypeEnum>();
            }
            return this.priceType;
        }

    }

}
