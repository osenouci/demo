
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
 * <p>Java class for ValuesCruiseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValuesCruiseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Port" type="{http://www.bewotec.de/bewotecws/Schema}PortType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CabinTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CabinType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TariffTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TariffType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
@XmlType(name = "ValuesCruiseType", propOrder = {
    "ports",
    "cabinTypes",
    "tariffTypes"
})
public class ValuesCruiseType {

    @XmlElementRef(name = "Ports", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<ValuesCruiseType.Ports> ports;
    @XmlElement(name = "CabinTypes")
    protected ValuesCruiseType.CabinTypes cabinTypes;
    @XmlElement(name = "TariffTypes")
    protected ValuesCruiseType.TariffTypes tariffTypes;

    /**
     * Gets the value of the ports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValuesCruiseType.Ports }{@code >}
     *     
     */
    public JAXBElement<ValuesCruiseType.Ports> getPorts() {
        return ports;
    }

    /**
     * Sets the value of the ports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValuesCruiseType.Ports }{@code >}
     *     
     */
    public void setPorts(JAXBElement<ValuesCruiseType.Ports> value) {
        this.ports = value;
    }

    /**
     * Gets the value of the cabinTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesCruiseType.CabinTypes }
     *     
     */
    public ValuesCruiseType.CabinTypes getCabinTypes() {
        return cabinTypes;
    }

    /**
     * Sets the value of the cabinTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesCruiseType.CabinTypes }
     *     
     */
    public void setCabinTypes(ValuesCruiseType.CabinTypes value) {
        this.cabinTypes = value;
    }

    /**
     * Gets the value of the tariffTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesCruiseType.TariffTypes }
     *     
     */
    public ValuesCruiseType.TariffTypes getTariffTypes() {
        return tariffTypes;
    }

    /**
     * Sets the value of the tariffTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesCruiseType.TariffTypes }
     *     
     */
    public void setTariffTypes(ValuesCruiseType.TariffTypes value) {
        this.tariffTypes = value;
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
     *         &lt;element name="CabinType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "cabinType"
    })
    public static class CabinTypes {

        @XmlElement(name = "CabinType", required = true)
        protected List<String> cabinType;

        /**
         * Gets the value of the cabinType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabinType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabinType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCabinType() {
            if (cabinType == null) {
                cabinType = new ArrayList<String>();
            }
            return this.cabinType;
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
     *         &lt;element name="Port" type="{http://www.bewotec.de/bewotecws/Schema}PortType" maxOccurs="unbounded" minOccurs="0"/>
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
        "port"
    })
    public static class Ports {

        @XmlElement(name = "Port", nillable = true)
        protected List<PortType> port;

        /**
         * Gets the value of the port property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the port property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPort().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PortType }
         * 
         * 
         */
        public List<PortType> getPort() {
            if (port == null) {
                port = new ArrayList<PortType>();
            }
            return this.port;
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
     *         &lt;element name="TariffType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "tariffType"
    })
    public static class TariffTypes {

        @XmlElement(name = "TariffType", required = true)
        protected List<String> tariffType;

        /**
         * Gets the value of the tariffType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tariffType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTariffType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTariffType() {
            if (tariffType == null) {
                tariffType = new ArrayList<String>();
            }
            return this.tariffType;
        }

    }

}
