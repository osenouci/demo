
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tour operator independant reference, defined by IdentityProvider (i.e. OTDS, GIATA) and ServiceIdentity defined by IdentityProvider
 * 
 * <p>Java class for ServiceIdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceIdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentityProvider" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceIdentityType", propOrder = {
    "identityProvider",
    "serviceIdentity"
})
public class ServiceIdentityType {

    @XmlElement(name = "IdentityProvider", required = true)
    protected String identityProvider;
    @XmlElement(name = "ServiceIdentity", required = true)
    protected String serviceIdentity;

    /**
     * Gets the value of the identityProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityProvider() {
        return identityProvider;
    }

    /**
     * Sets the value of the identityProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityProvider(String value) {
        this.identityProvider = value;
    }

    /**
     * Gets the value of the serviceIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIdentity() {
        return serviceIdentity;
    }

    /**
     * Sets the value of the serviceIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIdentity(String value) {
        this.serviceIdentity = value;
    }

}
