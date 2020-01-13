
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FilterEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CheckInDates"/>
 *     &lt;enumeration value="Duration"/>
 *     &lt;enumeration value="Mealplan"/>
 *     &lt;enumeration value="Airport"/>
 *     &lt;enumeration value="AccommodationType"/>
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="Region"/>
 *     &lt;enumeration value="Destination"/>
 *     &lt;enumeration value="Price"/>
 *     &lt;enumeration value="Airline"/>
 *     &lt;enumeration value="FlightTime"/>
 *     &lt;enumeration value="DistanceBeach"/>
 *     &lt;enumeration value="DistanceCityCenter"/>
 *     &lt;enumeration value="DistanceShopping"/>
 *     &lt;enumeration value="DistanceAirport"/>
 *     &lt;enumeration value="DistancePublicTransport"/>
 *     &lt;enumeration value="DistanceSkiLift"/>
 *     &lt;enumeration value="DistanceGolfCourse"/>
 *     &lt;enumeration value="DistanceLake"/>
 *     &lt;enumeration value="DistanceCustom1"/>
 *     &lt;enumeration value="DistanceCustom2"/>
 *     &lt;enumeration value="DistanceCustom3"/>
 *     &lt;enumeration value="DistanceCustom4"/>
 *     &lt;enumeration value="DistanceCustom5"/>
 *     &lt;enumeration value="DistanceCustom6"/>
 *     &lt;enumeration value="DistanceCustom7"/>
 *     &lt;enumeration value="DistanceCustom8"/>
 *     &lt;enumeration value="DistanceCustom9"/>
 *     &lt;enumeration value="DistanceCustom10"/>
 *     &lt;enumeration value="FacilityAmountBedrooms"/>
 *     &lt;enumeration value="FacilityUnitSize"/>
 *     &lt;enumeration value="FacilityAmountRooms"/>
 *     &lt;enumeration value="FacilityAmountFloors"/>
 *     &lt;enumeration value="FacilityAmountBathrooms"/>
 *     &lt;enumeration value="FacilityCustom1"/>
 *     &lt;enumeration value="FacilityCustom2"/>
 *     &lt;enumeration value="FacilityCustom3"/>
 *     &lt;enumeration value="FacilityCustom4"/>
 *     &lt;enumeration value="FacilityCustom5"/>
 *     &lt;enumeration value="FacilityCustom6"/>
 *     &lt;enumeration value="FacilityCustom7"/>
 *     &lt;enumeration value="FacilityCustom8"/>
 *     &lt;enumeration value="FacilityCustom9"/>
 *     &lt;enumeration value="FacilityCustom10"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FilterEnum")
@XmlEnum
public enum FilterEnum {

    @XmlEnumValue("CheckInDates")
    CHECK_IN_DATES("CheckInDates"),
    @XmlEnumValue("Duration")
    DURATION("Duration"),
    @XmlEnumValue("Mealplan")
    MEALPLAN("Mealplan"),
    @XmlEnumValue("Airport")
    AIRPORT("Airport"),
    @XmlEnumValue("AccommodationType")
    ACCOMMODATION_TYPE("AccommodationType"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("Region")
    REGION("Region"),
    @XmlEnumValue("Destination")
    DESTINATION("Destination"),
    @XmlEnumValue("Price")
    PRICE("Price"),
    @XmlEnumValue("Airline")
    AIRLINE("Airline"),
    @XmlEnumValue("FlightTime")
    FLIGHT_TIME("FlightTime"),
    @XmlEnumValue("DistanceBeach")
    DISTANCE_BEACH("DistanceBeach"),
    @XmlEnumValue("DistanceCityCenter")
    DISTANCE_CITY_CENTER("DistanceCityCenter"),
    @XmlEnumValue("DistanceShopping")
    DISTANCE_SHOPPING("DistanceShopping"),
    @XmlEnumValue("DistanceAirport")
    DISTANCE_AIRPORT("DistanceAirport"),
    @XmlEnumValue("DistancePublicTransport")
    DISTANCE_PUBLIC_TRANSPORT("DistancePublicTransport"),
    @XmlEnumValue("DistanceSkiLift")
    DISTANCE_SKI_LIFT("DistanceSkiLift"),
    @XmlEnumValue("DistanceGolfCourse")
    DISTANCE_GOLF_COURSE("DistanceGolfCourse"),
    @XmlEnumValue("DistanceLake")
    DISTANCE_LAKE("DistanceLake"),
    @XmlEnumValue("DistanceCustom1")
    DISTANCE_CUSTOM_1("DistanceCustom1"),
    @XmlEnumValue("DistanceCustom2")
    DISTANCE_CUSTOM_2("DistanceCustom2"),
    @XmlEnumValue("DistanceCustom3")
    DISTANCE_CUSTOM_3("DistanceCustom3"),
    @XmlEnumValue("DistanceCustom4")
    DISTANCE_CUSTOM_4("DistanceCustom4"),
    @XmlEnumValue("DistanceCustom5")
    DISTANCE_CUSTOM_5("DistanceCustom5"),
    @XmlEnumValue("DistanceCustom6")
    DISTANCE_CUSTOM_6("DistanceCustom6"),
    @XmlEnumValue("DistanceCustom7")
    DISTANCE_CUSTOM_7("DistanceCustom7"),
    @XmlEnumValue("DistanceCustom8")
    DISTANCE_CUSTOM_8("DistanceCustom8"),
    @XmlEnumValue("DistanceCustom9")
    DISTANCE_CUSTOM_9("DistanceCustom9"),
    @XmlEnumValue("DistanceCustom10")
    DISTANCE_CUSTOM_10("DistanceCustom10"),
    @XmlEnumValue("FacilityAmountBedrooms")
    FACILITY_AMOUNT_BEDROOMS("FacilityAmountBedrooms"),
    @XmlEnumValue("FacilityUnitSize")
    FACILITY_UNIT_SIZE("FacilityUnitSize"),
    @XmlEnumValue("FacilityAmountRooms")
    FACILITY_AMOUNT_ROOMS("FacilityAmountRooms"),
    @XmlEnumValue("FacilityAmountFloors")
    FACILITY_AMOUNT_FLOORS("FacilityAmountFloors"),
    @XmlEnumValue("FacilityAmountBathrooms")
    FACILITY_AMOUNT_BATHROOMS("FacilityAmountBathrooms"),
    @XmlEnumValue("FacilityCustom1")
    FACILITY_CUSTOM_1("FacilityCustom1"),
    @XmlEnumValue("FacilityCustom2")
    FACILITY_CUSTOM_2("FacilityCustom2"),
    @XmlEnumValue("FacilityCustom3")
    FACILITY_CUSTOM_3("FacilityCustom3"),
    @XmlEnumValue("FacilityCustom4")
    FACILITY_CUSTOM_4("FacilityCustom4"),
    @XmlEnumValue("FacilityCustom5")
    FACILITY_CUSTOM_5("FacilityCustom5"),
    @XmlEnumValue("FacilityCustom6")
    FACILITY_CUSTOM_6("FacilityCustom6"),
    @XmlEnumValue("FacilityCustom7")
    FACILITY_CUSTOM_7("FacilityCustom7"),
    @XmlEnumValue("FacilityCustom8")
    FACILITY_CUSTOM_8("FacilityCustom8"),
    @XmlEnumValue("FacilityCustom9")
    FACILITY_CUSTOM_9("FacilityCustom9"),
    @XmlEnumValue("FacilityCustom10")
    FACILITY_CUSTOM_10("FacilityCustom10");
    private final String value;

    FilterEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FilterEnum fromValue(String v) {
        for (FilterEnum c: FilterEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
