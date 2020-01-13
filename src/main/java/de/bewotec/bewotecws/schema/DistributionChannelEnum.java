
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionChannelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistributionChannelEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bewotec"/>
 *     &lt;enumeration value="TravelTainment"/>
 *     &lt;enumeration value="Traffics"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DistributionChannelEnum")
@XmlEnum
public enum DistributionChannelEnum {

    @XmlEnumValue("Bewotec")
    BEWOTEC("Bewotec"),
    @XmlEnumValue("TravelTainment")
    TRAVEL_TAINMENT("TravelTainment"),
    @XmlEnumValue("Traffics")
    TRAFFICS("Traffics");
    private final String value;

    DistributionChannelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistributionChannelEnum fromValue(String v) {
        for (DistributionChannelEnum c: DistributionChannelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
