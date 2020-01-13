
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
 * Variant of an cruise service
 * 
 * <p>Java class for CruiseVariantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CruiseVariantType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bewotec.de/bewotecws/Schema}AccommodationVariantType">
 *       &lt;sequence>
 *         &lt;element name="Cabins" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Cabin" type="{http://www.bewotec.de/bewotecws/Schema}CabinType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PackageReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Identities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identity" type="{http://www.bewotec.de/bewotecws/Schema}ServiceIdentityType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CategoryIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruiseVariantType", propOrder = {
    "cabins",
    "packageReference",
    "identities",
    "categoryIdentifier",
    "categoryType",
    "tariffType"
})
public class CruiseVariantType
    extends AccommodationVariantType
{

    @XmlElementRef(name = "Cabins", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CruiseVariantType.Cabins> cabins;
    @XmlElement(name = "PackageReference")
    protected String packageReference;
    @XmlElementRef(name = "Identities", namespace = "http://www.bewotec.de/bewotecws/Schema", type = JAXBElement.class, required = false)
    protected JAXBElement<CruiseVariantType.Identities> identities;
    @XmlElement(name = "CategoryIdentifier")
    protected String categoryIdentifier;
    @XmlElement(name = "CategoryType")
    protected String categoryType;
    @XmlElement(name = "TariffType")
    protected String tariffType;

    /**
     * Gets the value of the cabins property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CruiseVariantType.Cabins }{@code >}
     *     
     */
    public JAXBElement<CruiseVariantType.Cabins> getCabins() {
        return cabins;
    }

    /**
     * Sets the value of the cabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CruiseVariantType.Cabins }{@code >}
     *     
     */
    public void setCabins(JAXBElement<CruiseVariantType.Cabins> value) {
        this.cabins = value;
    }

    /**
     * Gets the value of the packageReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageReference() {
        return packageReference;
    }

    /**
     * Sets the value of the packageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageReference(String value) {
        this.packageReference = value;
    }

    /**
     * Gets the value of the identities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CruiseVariantType.Identities }{@code >}
     *     
     */
    public JAXBElement<CruiseVariantType.Identities> getIdentities() {
        return identities;
    }

    /**
     * Sets the value of the identities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CruiseVariantType.Identities }{@code >}
     *     
     */
    public void setIdentities(JAXBElement<CruiseVariantType.Identities> value) {
        this.identities = value;
    }

    /**
     * Gets the value of the categoryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryIdentifier() {
        return categoryIdentifier;
    }

    /**
     * Sets the value of the categoryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryIdentifier(String value) {
        this.categoryIdentifier = value;
    }

    /**
     * Gets the value of the categoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryType() {
        return categoryType;
    }

    /**
     * Sets the value of the categoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryType(String value) {
        this.categoryType = value;
    }

    /**
     * Gets the value of the tariffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffType() {
        return tariffType;
    }

    /**
     * Sets the value of the tariffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffType(String value) {
        this.tariffType = value;
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
     *         &lt;element name="Cabin" type="{http://www.bewotec.de/bewotecws/Schema}CabinType" maxOccurs="unbounded" minOccurs="0"/>
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
        "cabin"
    })
    public static class Cabins {

        @XmlElement(name = "Cabin", nillable = true)
        protected List<CabinType> cabin;

        /**
         * Gets the value of the cabin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CabinType }
         * 
         * 
         */
        public List<CabinType> getCabin() {
            if (cabin == null) {
                cabin = new ArrayList<CabinType>();
            }
            return this.cabin;
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
     *         &lt;element name="Identity" type="{http://www.bewotec.de/bewotecws/Schema}ServiceIdentityType" maxOccurs="unbounded" minOccurs="0"/>
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
        "identity"
    })
    public static class Identities {

        @XmlElement(name = "Identity", nillable = true)
        protected List<ServiceIdentityType> identity;

        /**
         * Gets the value of the identity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceIdentityType }
         * 
         * 
         */
        public List<ServiceIdentityType> getIdentity() {
            if (identity == null) {
                identity = new ArrayList<ServiceIdentityType>();
            }
            return this.identity;
        }

    }

}
