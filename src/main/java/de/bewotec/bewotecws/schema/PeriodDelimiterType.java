
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Travel period
 * 
 * <p>Java class for PeriodDelimiterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodDelimiterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PostOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeekDayMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodDelimiterType", propOrder = {
    "preOffset",
    "date",
    "postOffset",
    "weekDayMask"
})
public class PeriodDelimiterType {

    @XmlElement(name = "PreOffset")
    protected String preOffset;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "PostOffset")
    protected String postOffset;
    @XmlElement(name = "WeekDayMask")
    protected String weekDayMask;

    /**
     * Gets the value of the preOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreOffset() {
        return preOffset;
    }

    /**
     * Sets the value of the preOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreOffset(String value) {
        this.preOffset = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the postOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostOffset() {
        return postOffset;
    }

    /**
     * Sets the value of the postOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostOffset(String value) {
        this.postOffset = value;
    }

    /**
     * Gets the value of the weekDayMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekDayMask() {
        return weekDayMask;
    }

    /**
     * Sets the value of the weekDayMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekDayMask(String value) {
        this.weekDayMask = value;
    }

}
