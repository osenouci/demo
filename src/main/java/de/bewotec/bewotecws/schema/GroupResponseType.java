
package de.bewotec.bewotecws.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * This response includes all product groups that contain at least one product according search parameter
 * 
 * <p>Java class for GroupResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bewotec.de/bewotecws/Schema}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="ProductGroups" type="{http://www.bewotec.de/bewotecws/Schema}ProductGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupResponseType", propOrder = {
    "productGroups"
})
public class GroupResponseType
    extends BaseResponseType
{

    @XmlElementRef(name = "ProductGroups", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductGroupType> productGroups;

    /**
     * Gets the value of the productGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductGroupType }{@code >}
     *     
     */
    public JAXBElement<ProductGroupType> getProductGroups() {
        return productGroups;
    }

    /**
     * Sets the value of the productGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductGroupType }{@code >}
     *     
     */
    public void setProductGroups(JAXBElement<ProductGroupType> value) {
        this.productGroups = value;
    }

}
