
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Product groups
 * 
 * <p>Java class for ProductGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountProductsInGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GiataCityIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GiataCityId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Airports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Airport" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TopProducts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TopProduct" type="{http://www.bewotec.de/bewotecws/Schema}TopProductType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProductGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProductGroup" type="{http://www.bewotec.de/bewotecws/Schema}ProductGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductGroupType", propOrder = {
    "id",
    "countProductsInGroup",
    "name",
    "giataCityIds",
    "airports",
    "topProducts",
    "productGroups"
})
public class ProductGroupType {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "CountProductsInGroup")
    protected int countProductsInGroup;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "GiataCityIds")
    protected ProductGroupType.GiataCityIds giataCityIds;
    @XmlElement(name = "Airports")
    protected ProductGroupType.Airports airports;
    @XmlElement(name = "TopProducts")
    protected ProductGroupType.TopProducts topProducts;
    @XmlElementRef(name = "ProductGroups", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductGroupType.ProductGroups> productGroups;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the countProductsInGroup property.
     * 
     */
    public int getCountProductsInGroup() {
        return countProductsInGroup;
    }

    /**
     * Sets the value of the countProductsInGroup property.
     * 
     */
    public void setCountProductsInGroup(int value) {
        this.countProductsInGroup = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the giataCityIds property.
     * 
     * @return
     *     possible object is
     *     {@link ProductGroupType.GiataCityIds }
     *     
     */
    public ProductGroupType.GiataCityIds getGiataCityIds() {
        return giataCityIds;
    }

    /**
     * Sets the value of the giataCityIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductGroupType.GiataCityIds }
     *     
     */
    public void setGiataCityIds(ProductGroupType.GiataCityIds value) {
        this.giataCityIds = value;
    }

    /**
     * Gets the value of the airports property.
     * 
     * @return
     *     possible object is
     *     {@link ProductGroupType.Airports }
     *     
     */
    public ProductGroupType.Airports getAirports() {
        return airports;
    }

    /**
     * Sets the value of the airports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductGroupType.Airports }
     *     
     */
    public void setAirports(ProductGroupType.Airports value) {
        this.airports = value;
    }

    /**
     * Gets the value of the topProducts property.
     * 
     * @return
     *     possible object is
     *     {@link ProductGroupType.TopProducts }
     *     
     */
    public ProductGroupType.TopProducts getTopProducts() {
        return topProducts;
    }

    /**
     * Sets the value of the topProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductGroupType.TopProducts }
     *     
     */
    public void setTopProducts(ProductGroupType.TopProducts value) {
        this.topProducts = value;
    }

    /**
     * Gets the value of the productGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductGroupType.ProductGroups }{@code >}
     *     
     */
    public JAXBElement<ProductGroupType.ProductGroups> getProductGroups() {
        return productGroups;
    }

    /**
     * Sets the value of the productGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductGroupType.ProductGroups }{@code >}
     *     
     */
    public void setProductGroups(JAXBElement<ProductGroupType.ProductGroups> value) {
        this.productGroups = value;
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
     *         &lt;element name="Airport" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "airport"
    })
    public static class Airports {

        @XmlElement(name = "Airport")
        protected List<String> airport;

        /**
         * Gets the value of the airport property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airport property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirport().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAirport() {
            if (airport == null) {
                airport = new ArrayList<String>();
            }
            return this.airport;
        }

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
     *         &lt;element name="GiataCityId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
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
        "giataCityId"
    })
    public static class GiataCityIds {

        @XmlElement(name = "GiataCityId", type = Long.class)
        @XmlSchemaType(name = "unsignedInt")
        protected List<Long> giataCityId;

        /**
         * Gets the value of the giataCityId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the giataCityId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGiataCityId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getGiataCityId() {
            if (giataCityId == null) {
                giataCityId = new ArrayList<Long>();
            }
            return this.giataCityId;
        }

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
     *         &lt;element name="ProductGroup" type="{http://www.bewotec.de/bewotecws/Schema}ProductGroupType" maxOccurs="unbounded" minOccurs="0"/>
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
        "productGroup"
    })
    public static class ProductGroups {

        @XmlElement(name = "ProductGroup", nillable = true)
        protected List<ProductGroupType> productGroup;

        /**
         * Gets the value of the productGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProductGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductGroupType }
         * 
         * 
         */
        public List<ProductGroupType> getProductGroup() {
            if (productGroup == null) {
                productGroup = new ArrayList<ProductGroupType>();
            }
            return this.productGroup;
        }

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
     *         &lt;element name="TopProduct" type="{http://www.bewotec.de/bewotecws/Schema}TopProductType" maxOccurs="unbounded"/>
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
        "topProduct"
    })
    public static class TopProducts {

        @XmlElement(name = "TopProduct", required = true)
        protected List<TopProductType> topProduct;

        /**
         * Gets the value of the topProduct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the topProduct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTopProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TopProductType }
         * 
         * 
         */
        public List<TopProductType> getTopProduct() {
            if (topProduct == null) {
                topProduct = new ArrayList<TopProductType>();
            }
            return this.topProduct;
        }

    }

}
