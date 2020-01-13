
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrsSystemEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CrsSystemEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Toma"/>
 *     &lt;enumeration value="Merlin"/>
 *     &lt;enumeration value="Internal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CrsSystemEnum")
@XmlEnum
public enum CrsSystemEnum {

    @XmlEnumValue("Toma")
    TOMA("Toma"),
    @XmlEnumValue("Merlin")
    MERLIN("Merlin"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal");
    private final String value;

    CrsSystemEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CrsSystemEnum fromValue(String v) {
        for (CrsSystemEnum c: CrsSystemEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
