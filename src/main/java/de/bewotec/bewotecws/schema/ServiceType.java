
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type for touristic services. AccomodationService, FlightService, ExtraService
 * 
 * <p>Java class for ServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;choice>
 *           &lt;element name="AccommodationService" type="{http://www.bewotec.de/bewotecws/Schema}AccommodationServiceType"/>
 *           &lt;element name="FlightService" type="{http://www.bewotec.de/bewotecws/Schema}FlightServiceType"/>
 *           &lt;element name="ExtraService" type="{http://www.bewotec.de/bewotecws/Schema}ExtraServiceType"/>
 *           &lt;element name="CruiseService" type="{http://www.bewotec.de/bewotecws/Schema}CruiseServiceType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", propOrder = {
    "id",
    "accommodationService",
    "flightService",
    "extraService",
    "cruiseService"
})
public class ServiceType {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "AccommodationService")
    protected AccommodationServiceType accommodationService;
    @XmlElement(name = "FlightService")
    protected FlightServiceType flightService;
    @XmlElement(name = "ExtraService")
    protected ExtraServiceType extraService;
    @XmlElement(name = "CruiseService")
    protected CruiseServiceType cruiseService;

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
     * Gets the value of the accommodationService property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationServiceType }
     *     
     */
    public AccommodationServiceType getAccommodationService() {
        return accommodationService;
    }

    /**
     * Sets the value of the accommodationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationServiceType }
     *     
     */
    public void setAccommodationService(AccommodationServiceType value) {
        this.accommodationService = value;
    }

    /**
     * Gets the value of the flightService property.
     * 
     * @return
     *     possible object is
     *     {@link FlightServiceType }
     *     
     */
    public FlightServiceType getFlightService() {
        return flightService;
    }

    /**
     * Sets the value of the flightService property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightServiceType }
     *     
     */
    public void setFlightService(FlightServiceType value) {
        this.flightService = value;
    }

    /**
     * Gets the value of the extraService property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraServiceType }
     *     
     */
    public ExtraServiceType getExtraService() {
        return extraService;
    }

    /**
     * Sets the value of the extraService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraServiceType }
     *     
     */
    public void setExtraService(ExtraServiceType value) {
        this.extraService = value;
    }

    /**
     * Gets the value of the cruiseService property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseServiceType }
     *     
     */
    public CruiseServiceType getCruiseService() {
        return cruiseService;
    }

    /**
     * Sets the value of the cruiseService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseServiceType }
     *     
     */
    public void setCruiseService(CruiseServiceType value) {
        this.cruiseService = value;
    }

}
