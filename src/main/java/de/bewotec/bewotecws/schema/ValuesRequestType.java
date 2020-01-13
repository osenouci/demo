
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request for data to support search masks. In current state the following information can be requested: - Country codes - Departure airports - Product groups - Region trees 
 * 
 * <p>Java class for ValuesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValuesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bewotec.de/bewotecws/Schema}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="CriteriaTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CriteriaType" type="{http://www.bewotec.de/bewotecws/Schema}CriteriaEnum" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuesRequestType", propOrder = {
    "criteriaTypes",
    "requestId"
})
public class ValuesRequestType
    extends BaseRequestType
{

    @XmlElement(name = "CriteriaTypes")
    protected ValuesRequestType.CriteriaTypes criteriaTypes;
    @XmlElement(name = "RequestId")
    protected String requestId;

    /**
     * Gets the value of the criteriaTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesRequestType.CriteriaTypes }
     *     
     */
    public ValuesRequestType.CriteriaTypes getCriteriaTypes() {
        return criteriaTypes;
    }

    /**
     * Sets the value of the criteriaTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesRequestType.CriteriaTypes }
     *     
     */
    public void setCriteriaTypes(ValuesRequestType.CriteriaTypes value) {
        this.criteriaTypes = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
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
     *         &lt;element name="CriteriaType" type="{http://www.bewotec.de/bewotecws/Schema}CriteriaEnum" maxOccurs="unbounded" minOccurs="0"/>
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
        "criteriaType"
    })
    public static class CriteriaTypes {

        @XmlElement(name = "CriteriaType")
        protected List<CriteriaEnum> criteriaType;

        /**
         * Gets the value of the criteriaType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the criteriaType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCriteriaType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CriteriaEnum }
         * 
         * 
         */
        public List<CriteriaEnum> getCriteriaType() {
            if (criteriaType == null) {
                criteriaType = new ArrayList<CriteriaEnum>();
            }
            return this.criteriaType;
        }

    }

}
