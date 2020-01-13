
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariantEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VariantEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Board"/>
 *     &lt;enumeration value="Room"/>
 *     &lt;enumeration value="Date"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VariantEnum")
@XmlEnum
public enum VariantEnum {

    @XmlEnumValue("Board")
    BOARD("Board"),
    @XmlEnumValue("Room")
    ROOM("Room"),
    @XmlEnumValue("Date")
    DATE("Date");
    private final String value;

    VariantEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VariantEnum fromValue(String v) {
        for (VariantEnum c: VariantEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
