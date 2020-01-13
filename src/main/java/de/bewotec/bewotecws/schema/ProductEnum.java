
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Package"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="Flight"/>
 *     &lt;enumeration value="Extra"/>
 *     &lt;enumeration value="CruisePackage"/>
 *     &lt;enumeration value="Cruise"/>
 *     &lt;enumeration value="FlightPackage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductEnum")
@XmlEnum
public enum ProductEnum {

    @XmlEnumValue("Package")
    PACKAGE("Package"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Flight")
    FLIGHT("Flight"),
    @XmlEnumValue("Extra")
    EXTRA("Extra"),
    @XmlEnumValue("CruisePackage")
    CRUISE_PACKAGE("CruisePackage"),
    @XmlEnumValue("Cruise")
    CRUISE("Cruise"),
    @XmlEnumValue("FlightPackage")
    FLIGHT_PACKAGE("FlightPackage");
    private final String value;

    ProductEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductEnum fromValue(String v) {
        for (ProductEnum c: ProductEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
