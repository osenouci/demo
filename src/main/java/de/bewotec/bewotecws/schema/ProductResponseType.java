
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type of all product responses
 * 
 * <p>Java class for ProductResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bewotec.de/bewotecws/Schema}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResultsFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultsTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultsTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SortedBy" type="{http://www.bewotec.de/bewotecws/Schema}SortedByEnum" minOccurs="0"/>
 *         &lt;element name="Products" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Product" type="{http://www.bewotec.de/bewotecws/Schema}ResultProductType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Services" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Service" type="{http://www.bewotec.de/bewotecws/Schema}ServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Filters" type="{http://www.bewotec.de/bewotecws/Schema}DynamicFilters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductResponseType", propOrder = {
    "resultsFrom",
    "resultsTo",
    "resultsTotal",
    "sortedBy",
    "products",
    "services",
    "filters"
})
public class ProductResponseType
    extends BaseResponseType
{

    @XmlElement(name = "ResultsFrom")
    protected String resultsFrom;
    @XmlElement(name = "ResultsTo")
    protected String resultsTo;
    @XmlElement(name = "ResultsTotal", required = true)
    protected String resultsTotal;
    @XmlElement(name = "SortedBy")
    protected SortedByEnum sortedBy;
    @XmlElementRef(name = "Products", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductResponseType.Products> products;
    @XmlElementRef(name = "Services", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductResponseType.Services> services;
    @XmlElement(name = "Filters")
    protected DynamicFilters filters;

    /**
     * Gets the value of the resultsFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsFrom() {
        return resultsFrom;
    }

    /**
     * Sets the value of the resultsFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsFrom(String value) {
        this.resultsFrom = value;
    }

    /**
     * Gets the value of the resultsTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsTo() {
        return resultsTo;
    }

    /**
     * Sets the value of the resultsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsTo(String value) {
        this.resultsTo = value;
    }

    /**
     * Gets the value of the resultsTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsTotal() {
        return resultsTotal;
    }

    /**
     * Sets the value of the resultsTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsTotal(String value) {
        this.resultsTotal = value;
    }

    /**
     * Gets the value of the sortedBy property.
     * 
     * @return
     *     possible object is
     *     {@link SortedByEnum }
     *     
     */
    public SortedByEnum getSortedBy() {
        return sortedBy;
    }

    /**
     * Sets the value of the sortedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortedByEnum }
     *     
     */
    public void setSortedBy(SortedByEnum value) {
        this.sortedBy = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductResponseType.Products }{@code >}
     *     
     */
    public JAXBElement<ProductResponseType.Products> getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductResponseType.Products }{@code >}
     *     
     */
    public void setProducts(JAXBElement<ProductResponseType.Products> value) {
        this.products = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductResponseType.Services }{@code >}
     *     
     */
    public JAXBElement<ProductResponseType.Services> getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductResponseType.Services }{@code >}
     *     
     */
    public void setServices(JAXBElement<ProductResponseType.Services> value) {
        this.services = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicFilters }
     *     
     */
    public DynamicFilters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicFilters }
     *     
     */
    public void setFilters(DynamicFilters value) {
        this.filters = value;
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
     *         &lt;element name="Product" type="{http://www.bewotec.de/bewotecws/Schema}ResultProductType" maxOccurs="unbounded" minOccurs="0"/>
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
        "product"
    })
    public static class Products {

        @XmlElement(name = "Product", nillable = true)
        protected List<ResultProductType> product;

        /**
         * Gets the value of the product property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the product property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResultProductType }
         * 
         * 
         */
        public List<ResultProductType> getProduct() {
            if (product == null) {
                product = new ArrayList<ResultProductType>();
            }
            return this.product;
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
     *         &lt;element name="Service" type="{http://www.bewotec.de/bewotecws/Schema}ServiceType" maxOccurs="unbounded" minOccurs="0"/>
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
        "service"
    })
    public static class Services {

        @XmlElement(name = "Service", nillable = true)
        protected List<ServiceType> service;

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceType }
         * 
         * 
         */
        public List<ServiceType> getService() {
            if (service == null) {
                service = new ArrayList<ServiceType>();
            }
            return this.service;
        }

    }

}
