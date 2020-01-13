
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultSetEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultSetEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="OnlyCheapestPerTravelPeriod"/>
 *     &lt;enumeration value="CheapestPerGroupPerTravelPeriodPerRouting"/>
 *     &lt;enumeration value="JourneyIdentifier"/>
 *     &lt;enumeration value="JourneyIdentifierPriceCategory"/>
 *     &lt;enumeration value="JourneyIdentifierPriceCategoryCabinType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultSetEnum")
@XmlEnum
public enum ResultSetEnum {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("OnlyCheapestPerTravelPeriod")
    ONLY_CHEAPEST_PER_TRAVEL_PERIOD("OnlyCheapestPerTravelPeriod"),
    @XmlEnumValue("CheapestPerGroupPerTravelPeriodPerRouting")
    CHEAPEST_PER_GROUP_PER_TRAVEL_PERIOD_PER_ROUTING("CheapestPerGroupPerTravelPeriodPerRouting"),
    @XmlEnumValue("JourneyIdentifier")
    JOURNEY_IDENTIFIER("JourneyIdentifier"),
    @XmlEnumValue("JourneyIdentifierPriceCategory")
    JOURNEY_IDENTIFIER_PRICE_CATEGORY("JourneyIdentifierPriceCategory"),
    @XmlEnumValue("JourneyIdentifierPriceCategoryCabinType")
    JOURNEY_IDENTIFIER_PRICE_CATEGORY_CABIN_TYPE("JourneyIdentifierPriceCategoryCabinType");
    private final String value;

    ResultSetEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultSetEnum fromValue(String v) {
        for (ResultSetEnum c: ResultSetEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
