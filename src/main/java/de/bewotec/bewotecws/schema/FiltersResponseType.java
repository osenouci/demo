
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Response delivers data to support search masks with dynamic filter content.
 * 
 * <p>Java class for FiltersResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiltersResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bewotec.de/bewotecws/Schema}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="Filter" type="{http://www.bewotec.de/bewotecws/Schema}FilterEnum"/>
 *         &lt;element name="TravelStartDatesFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TravelStartDatesTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TravelStartDates" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Attribute" type="{http://www.bewotec.de/bewotecws/Schema}AttributeCountType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiltersResponseType", propOrder = {
    "filter",
    "travelStartDatesFrom",
    "travelStartDatesTo",
    "travelStartDates",
    "attributes"
})
public class FiltersResponseType
    extends BaseResponseType
{

    @XmlElement(name = "Filter", required = true)
    protected FilterEnum filter;
    @XmlElement(name = "TravelStartDatesFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar travelStartDatesFrom;
    @XmlElement(name = "TravelStartDatesTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar travelStartDatesTo;
    @XmlElement(name = "TravelStartDates")
    protected String travelStartDates;
    @XmlElement(name = "Attributes")
    protected FiltersResponseType.Attributes attributes;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterEnum }
     *     
     */
    public FilterEnum getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterEnum }
     *     
     */
    public void setFilter(FilterEnum value) {
        this.filter = value;
    }

    /**
     * Gets the value of the travelStartDatesFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelStartDatesFrom() {
        return travelStartDatesFrom;
    }

    /**
     * Sets the value of the travelStartDatesFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelStartDatesFrom(XMLGregorianCalendar value) {
        this.travelStartDatesFrom = value;
    }

    /**
     * Gets the value of the travelStartDatesTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelStartDatesTo() {
        return travelStartDatesTo;
    }

    /**
     * Sets the value of the travelStartDatesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelStartDatesTo(XMLGregorianCalendar value) {
        this.travelStartDatesTo = value;
    }

    /**
     * Gets the value of the travelStartDates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelStartDates() {
        return travelStartDates;
    }

    /**
     * Sets the value of the travelStartDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelStartDates(String value) {
        this.travelStartDates = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link FiltersResponseType.Attributes }
     *     
     */
    public FiltersResponseType.Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltersResponseType.Attributes }
     *     
     */
    public void setAttributes(FiltersResponseType.Attributes value) {
        this.attributes = value;
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
     *         &lt;element name="Attribute" type="{http://www.bewotec.de/bewotecws/Schema}AttributeCountType" maxOccurs="unbounded"/>
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
        "attribute"
    })
    public static class Attributes {

        @XmlElement(name = "Attribute", required = true)
        protected List<AttributeCountType> attribute;

        /**
         * Gets the value of the attribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeCountType }
         * 
         * 
         */
        public List<AttributeCountType> getAttribute() {
            if (attribute == null) {
                attribute = new ArrayList<AttributeCountType>();
            }
            return this.attribute;
        }

    }

}
