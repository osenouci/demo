
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type of all requests
 * 
 * <p>Java class for BaseRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{http://www.bewotec.de/bewotecws/Schema}ProductEnum"/>
 *         &lt;element name="TouroperatorCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TouroperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TreeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRequestType", propOrder = {
    "authKey",
    "currency",
    "lang",
    "productType",
    "touroperatorCodes",
    "treeId"
})
@XmlSeeAlso({
    ValuesRequestType.class,
    ProductRequestType.class
})
public class BaseRequestType {

    @XmlElement(name = "AuthKey", required = true)
    protected String authKey;
    @XmlElement(name = "Currency", defaultValue = "EUR")
    protected String currency;
    @XmlElement(name = "Lang", defaultValue = "de")
    protected String lang;
    @XmlElement(name = "ProductType", required = true)
    protected ProductEnum productType;
    @XmlElement(name = "TouroperatorCodes")
    protected BaseRequestType.TouroperatorCodes touroperatorCodes;
    @XmlElement(name = "TreeId")
    protected String treeId;

    /**
     * Gets the value of the authKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthKey() {
        return authKey;
    }

    /**
     * Sets the value of the authKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthKey(String value) {
        this.authKey = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductEnum }
     *     
     */
    public ProductEnum getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductEnum }
     *     
     */
    public void setProductType(ProductEnum value) {
        this.productType = value;
    }

    /**
     * Gets the value of the touroperatorCodes property.
     * 
     * @return
     *     possible object is
     *     {@link BaseRequestType.TouroperatorCodes }
     *     
     */
    public BaseRequestType.TouroperatorCodes getTouroperatorCodes() {
        return touroperatorCodes;
    }

    /**
     * Sets the value of the touroperatorCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRequestType.TouroperatorCodes }
     *     
     */
    public void setTouroperatorCodes(BaseRequestType.TouroperatorCodes value) {
        this.touroperatorCodes = value;
    }

    /**
     * Gets the value of the treeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreeId() {
        return treeId;
    }

    /**
     * Sets the value of the treeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreeId(String value) {
        this.treeId = value;
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
     *         &lt;element name="TouroperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "touroperatorCode"
    })
    public static class TouroperatorCodes {

        @XmlElement(name = "TouroperatorCode")
        protected List<String> touroperatorCode;

        /**
         * Gets the value of the touroperatorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the touroperatorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTouroperatorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTouroperatorCode() {
            if (touroperatorCode == null) {
                touroperatorCode = new ArrayList<String>();
            }
            return this.touroperatorCode;
        }

    }

}
