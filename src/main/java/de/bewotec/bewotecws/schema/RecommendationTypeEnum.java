
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecommendationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecommendationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Rating"/>
 *     &lt;enumeration value="Recommendation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecommendationTypeEnum")
@XmlEnum
public enum RecommendationTypeEnum {

    @XmlEnumValue("Rating")
    RATING("Rating"),
    @XmlEnumValue("Recommendation")
    RECOMMENDATION("Recommendation");
    private final String value;

    RecommendationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecommendationTypeEnum fromValue(String v) {
        for (RecommendationTypeEnum c: RecommendationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
