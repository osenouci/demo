
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FiltersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiltersRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bewotec.de/bewotecws/Schema}ProductRequestType">
 *       &lt;sequence>
 *         &lt;element name="Filter" type="{http://www.bewotec.de/bewotecws/Schema}FilterEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiltersRequestType", propOrder = {
    "filter"
})
public class FiltersRequestType
    extends ProductRequestType
{

    @XmlElement(name = "Filter")
    protected FilterEnum filter;

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

}
