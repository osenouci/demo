
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Tour operator specific attribute of accomodation service
 * 
 * <p>Java class for AccommodationSpecificType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccommodationSpecificType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TourOperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="AccommodationAttributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccommodationAttribute" type="{http://www.bewotec.de/bewotecws/Schema}AccommodationAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccommodationFigures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccommodationFigure" type="{http://www.bewotec.de/bewotecws/Schema}FigureResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GiataFacts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GiataFactgroup" type="{http://www.bewotec.de/bewotecws/Schema}GiataFactgroupType" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="ProductGroup" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Catalogs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Catalog" type="{http://www.bewotec.de/bewotecws/Schema}CatalogType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AccommodationSpecificType", propOrder = {
    "id",
    "name",
    "productCode",
    "tourOperatorCode",
    "travelType",
    "category",
    "accommodationAttributes",
    "accommodationFigures",
    "giataFacts",
    "productGroups",
    "catalogs"
})
@XmlSeeAlso({
    CruiseSpecificType.class
})
public class AccommodationSpecificType {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "TourOperatorCode")
    protected String tourOperatorCode;
    @XmlElement(name = "TravelType")
    protected String travelType;
    @XmlElement(name = "Category")
    protected Float category;
    @XmlElementRef(name = "AccommodationAttributes", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AccommodationSpecificType.AccommodationAttributes> accommodationAttributes;
    @XmlElement(name = "AccommodationFigures")
    protected AccommodationSpecificType.AccommodationFigures accommodationFigures;
    @XmlElementRef(name = "GiataFacts", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AccommodationSpecificType.GiataFacts> giataFacts;
    @XmlElementRef(name = "ProductGroups", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<AccommodationSpecificType.ProductGroups> productGroups;
    @XmlElement(name = "Catalogs")
    protected AccommodationSpecificType.Catalogs catalogs;

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
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the tourOperatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorCode() {
        return tourOperatorCode;
    }

    /**
     * Sets the value of the tourOperatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorCode(String value) {
        this.tourOperatorCode = value;
    }

    /**
     * Gets the value of the travelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelType() {
        return travelType;
    }

    /**
     * Sets the value of the travelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelType(String value) {
        this.travelType = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCategory(Float value) {
        this.category = value;
    }

    /**
     * Gets the value of the accommodationAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccommodationSpecificType.AccommodationAttributes }{@code >}
     *     
     */
    public JAXBElement<AccommodationSpecificType.AccommodationAttributes> getAccommodationAttributes() {
        return accommodationAttributes;
    }

    /**
     * Sets the value of the accommodationAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccommodationSpecificType.AccommodationAttributes }{@code >}
     *     
     */
    public void setAccommodationAttributes(JAXBElement<AccommodationSpecificType.AccommodationAttributes> value) {
        this.accommodationAttributes = value;
    }

    /**
     * Gets the value of the accommodationFigures property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationSpecificType.AccommodationFigures }
     *     
     */
    public AccommodationSpecificType.AccommodationFigures getAccommodationFigures() {
        return accommodationFigures;
    }

    /**
     * Sets the value of the accommodationFigures property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationSpecificType.AccommodationFigures }
     *     
     */
    public void setAccommodationFigures(AccommodationSpecificType.AccommodationFigures value) {
        this.accommodationFigures = value;
    }

    /**
     * Gets the value of the giataFacts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccommodationSpecificType.GiataFacts }{@code >}
     *     
     */
    public JAXBElement<AccommodationSpecificType.GiataFacts> getGiataFacts() {
        return giataFacts;
    }

    /**
     * Sets the value of the giataFacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccommodationSpecificType.GiataFacts }{@code >}
     *     
     */
    public void setGiataFacts(JAXBElement<AccommodationSpecificType.GiataFacts> value) {
        this.giataFacts = value;
    }

    /**
     * Gets the value of the productGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccommodationSpecificType.ProductGroups }{@code >}
     *     
     */
    public JAXBElement<AccommodationSpecificType.ProductGroups> getProductGroups() {
        return productGroups;
    }

    /**
     * Sets the value of the productGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccommodationSpecificType.ProductGroups }{@code >}
     *     
     */
    public void setProductGroups(JAXBElement<AccommodationSpecificType.ProductGroups> value) {
        this.productGroups = value;
    }

    /**
     * Gets the value of the catalogs property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationSpecificType.Catalogs }
     *     
     */
    public AccommodationSpecificType.Catalogs getCatalogs() {
        return catalogs;
    }

    /**
     * Sets the value of the catalogs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationSpecificType.Catalogs }
     *     
     */
    public void setCatalogs(AccommodationSpecificType.Catalogs value) {
        this.catalogs = value;
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
     *         &lt;element name="AccommodationAttribute" type="{http://www.bewotec.de/bewotecws/Schema}AccommodationAttributeType" maxOccurs="unbounded" minOccurs="0"/>
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
        "accommodationAttribute"
    })
    public static class AccommodationAttributes {

        @XmlElement(name = "AccommodationAttribute", nillable = true)
        protected List<AccommodationAttributeType> accommodationAttribute;

        /**
         * Gets the value of the accommodationAttribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accommodationAttribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccommodationAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccommodationAttributeType }
         * 
         * 
         */
        public List<AccommodationAttributeType> getAccommodationAttribute() {
            if (accommodationAttribute == null) {
                accommodationAttribute = new ArrayList<AccommodationAttributeType>();
            }
            return this.accommodationAttribute;
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
     *         &lt;element name="AccommodationFigure" type="{http://www.bewotec.de/bewotecws/Schema}FigureResponseType" maxOccurs="unbounded" minOccurs="0"/>
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
        "accommodationFigure"
    })
    public static class AccommodationFigures {

        @XmlElement(name = "AccommodationFigure")
        protected List<FigureResponseType> accommodationFigure;

        /**
         * Gets the value of the accommodationFigure property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accommodationFigure property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccommodationFigure().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FigureResponseType }
         * 
         * 
         */
        public List<FigureResponseType> getAccommodationFigure() {
            if (accommodationFigure == null) {
                accommodationFigure = new ArrayList<FigureResponseType>();
            }
            return this.accommodationFigure;
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
     *         &lt;element name="Catalog" type="{http://www.bewotec.de/bewotecws/Schema}CatalogType" maxOccurs="unbounded" minOccurs="0"/>
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
        "catalog"
    })
    public static class Catalogs {

        @XmlElement(name = "Catalog")
        protected List<CatalogType> catalog;

        /**
         * Gets the value of the catalog property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the catalog property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCatalog().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CatalogType }
         * 
         * 
         */
        public List<CatalogType> getCatalog() {
            if (catalog == null) {
                catalog = new ArrayList<CatalogType>();
            }
            return this.catalog;
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
     *         &lt;element name="GiataFactgroup" type="{http://www.bewotec.de/bewotecws/Schema}GiataFactgroupType" maxOccurs="unbounded" minOccurs="0"/>
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
        "giataFactgroup"
    })
    public static class GiataFacts {

        @XmlElement(name = "GiataFactgroup", nillable = true)
        protected List<GiataFactgroupType> giataFactgroup;

        /**
         * Gets the value of the giataFactgroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the giataFactgroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGiataFactgroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GiataFactgroupType }
         * 
         * 
         */
        public List<GiataFactgroupType> getGiataFactgroup() {
            if (giataFactgroup == null) {
                giataFactgroup = new ArrayList<GiataFactgroupType>();
            }
            return this.giataFactgroup;
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
     *         &lt;element name="ProductGroup" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(name = "ProductGroup")
        protected List<String> productGroup;

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
         * {@link String }
         * 
         * 
         */
        public List<String> getProductGroup() {
            if (productGroup == null) {
                productGroup = new ArrayList<String>();
            }
            return this.productGroup;
        }

    }

}
