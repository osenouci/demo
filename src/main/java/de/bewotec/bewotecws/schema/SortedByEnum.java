
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortedByEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortedByEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Price"/>
 *     &lt;enumeration value="Category"/>
 *     &lt;enumeration value="DepartureDate"/>
 *     &lt;enumeration value="DepartureAirport"/>
 *     &lt;enumeration value="Region"/>
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="Duration"/>
 *     &lt;enumeration value="Hotelname"/>
 *     &lt;enumeration value="Rating"/>
 *     &lt;enumeration value="Recommendation"/>
 *     &lt;enumeration value="Priority"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortedByEnum")
@XmlEnum
public enum SortedByEnum {

    @XmlEnumValue("Price")
    PRICE("Price"),
    @XmlEnumValue("Category")
    CATEGORY("Category"),
    @XmlEnumValue("DepartureDate")
    DEPARTURE_DATE("DepartureDate"),
    @XmlEnumValue("DepartureAirport")
    DEPARTURE_AIRPORT("DepartureAirport"),
    @XmlEnumValue("Region")
    REGION("Region"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("Duration")
    DURATION("Duration"),
    @XmlEnumValue("Hotelname")
    HOTELNAME("Hotelname"),
    @XmlEnumValue("Rating")
    RATING("Rating"),
    @XmlEnumValue("Recommendation")
    RECOMMENDATION("Recommendation"),
    @XmlEnumValue("Priority")
    PRIORITY("Priority");
    private final String value;

    SortedByEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortedByEnum fromValue(String v) {
        for (SortedByEnum c: SortedByEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
