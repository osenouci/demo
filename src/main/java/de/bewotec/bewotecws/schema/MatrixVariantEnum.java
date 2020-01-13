
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatrixVariantEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatrixVariantEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Airline"/>
 *     &lt;enumeration value="Board"/>
 *     &lt;enumeration value="Category"/>
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="DepartureAirport"/>
 *     &lt;enumeration value="Duration"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Recommendation"/>
 *     &lt;enumeration value="Room"/>
 *     &lt;enumeration value="TourOperator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatrixVariantEnum")
@XmlEnum
public enum MatrixVariantEnum {

    @XmlEnumValue("Airline")
    AIRLINE("Airline"),
    @XmlEnumValue("Board")
    BOARD("Board"),
    @XmlEnumValue("Category")
    CATEGORY("Category"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("DepartureAirport")
    DEPARTURE_AIRPORT("DepartureAirport"),
    @XmlEnumValue("Duration")
    DURATION("Duration"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Recommendation")
    RECOMMENDATION("Recommendation"),
    @XmlEnumValue("Room")
    ROOM("Room"),
    @XmlEnumValue("TourOperator")
    TOUR_OPERATOR("TourOperator");
    private final String value;

    MatrixVariantEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatrixVariantEnum fromValue(String v) {
        for (MatrixVariantEnum c: MatrixVariantEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
