
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Steering of sales market and sales channel
 * 
 * <p>Java class for ParameterSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParameterSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrsSystem" type="{http://www.bewotec.de/bewotecws/Schema}CrsSystemEnum" minOccurs="0"/>
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesChannel" type="{http://www.bewotec.de/bewotecws/Schema}SalesChannelEnum" minOccurs="0"/>
 *         &lt;element name="DistributionChannel" type="{http://www.bewotec.de/bewotecws/Schema}DistributionChannelEnum" minOccurs="0"/>
 *         &lt;element name="SalesMarket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterSetType", propOrder = {
    "crsSystem",
    "agencyCode",
    "salesChannel",
    "distributionChannel",
    "salesMarket"
})
public class ParameterSetType {

    @XmlElement(name = "CrsSystem")
    protected CrsSystemEnum crsSystem;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "SalesChannel")
    protected SalesChannelEnum salesChannel;
    @XmlElement(name = "DistributionChannel")
    protected DistributionChannelEnum distributionChannel;
    @XmlElement(name = "SalesMarket")
    protected String salesMarket;

    /**
     * Gets the value of the crsSystem property.
     * 
     * @return
     *     possible object is
     *     {@link CrsSystemEnum }
     *     
     */
    public CrsSystemEnum getCrsSystem() {
        return crsSystem;
    }

    /**
     * Sets the value of the crsSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrsSystemEnum }
     *     
     */
    public void setCrsSystem(CrsSystemEnum value) {
        this.crsSystem = value;
    }

    /**
     * Gets the value of the agencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * Sets the value of the agencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * Gets the value of the salesChannel property.
     * 
     * @return
     *     possible object is
     *     {@link SalesChannelEnum }
     *     
     */
    public SalesChannelEnum getSalesChannel() {
        return salesChannel;
    }

    /**
     * Sets the value of the salesChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesChannelEnum }
     *     
     */
    public void setSalesChannel(SalesChannelEnum value) {
        this.salesChannel = value;
    }

    /**
     * Gets the value of the distributionChannel property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelEnum }
     *     
     */
    public DistributionChannelEnum getDistributionChannel() {
        return distributionChannel;
    }

    /**
     * Sets the value of the distributionChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelEnum }
     *     
     */
    public void setDistributionChannel(DistributionChannelEnum value) {
        this.distributionChannel = value;
    }

    /**
     * Gets the value of the salesMarket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesMarket() {
        return salesMarket;
    }

    /**
     * Sets the value of the salesMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesMarket(String value) {
        this.salesMarket = value;
    }

}
