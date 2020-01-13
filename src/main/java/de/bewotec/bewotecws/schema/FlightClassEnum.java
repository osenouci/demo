
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightClassEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightClassEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Economy"/>
 *     &lt;enumeration value="PremiumEconomy"/>
 *     &lt;enumeration value="Comfort"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="First"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightClassEnum")
@XmlEnum
public enum FlightClassEnum {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Economy")
    ECONOMY("Economy"),
    @XmlEnumValue("PremiumEconomy")
    PREMIUM_ECONOMY("PremiumEconomy"),
    @XmlEnumValue("Comfort")
    COMFORT("Comfort"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("First")
    FIRST("First");
    private final String value;

    FlightClassEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightClassEnum fromValue(String v) {
        for (FlightClassEnum c: FlightClassEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
