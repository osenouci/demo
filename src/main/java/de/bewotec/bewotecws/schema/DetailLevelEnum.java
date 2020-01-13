
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DetailLevelEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Regular"/>
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="NoFlightDetails"/>
 *     &lt;enumeration value="NoFilterOverview"/>
 *     &lt;enumeration value="PriceDetails"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DetailLevelEnum")
@XmlEnum
public enum DetailLevelEnum {

    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Regular")
    REGULAR("Regular"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("NoFlightDetails")
    NO_FLIGHT_DETAILS("NoFlightDetails"),
    @XmlEnumValue("NoFilterOverview")
    NO_FILTER_OVERVIEW("NoFilterOverview"),
    @XmlEnumValue("PriceDetails")
    PRICE_DETAILS("PriceDetails");
    private final String value;

    DetailLevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DetailLevelEnum fromValue(String v) {
        for (DetailLevelEnum c: DetailLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
