
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaggageTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BaggageTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cabin"/>
 *     &lt;enumeration value="Checked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BaggageTypeEnum")
@XmlEnum
public enum BaggageTypeEnum {

    @XmlEnumValue("Cabin")
    CABIN("Cabin"),
    @XmlEnumValue("Checked")
    CHECKED("Checked");
    private final String value;

    BaggageTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BaggageTypeEnum fromValue(String v) {
        for (BaggageTypeEnum c: BaggageTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
