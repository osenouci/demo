
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This request provides a list of products availabilities (i.e. hotel), to examine in which periods a distinct product will be available.
 * 
 * <p>Java class for ProductAvailabilityRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAvailabilityRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bewotec.de/bewotecws/Schema}ProductRequestType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAvailabilityRequestType")
public class ProductAvailabilityRequestType
    extends ProductRequestType
{


}
