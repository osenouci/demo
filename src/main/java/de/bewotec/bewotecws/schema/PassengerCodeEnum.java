
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PassengerCodeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Infant"/>
 *     &lt;enumeration value="Child"/>
 *     &lt;enumeration value="Adult"/>
 *     &lt;enumeration value="Senior"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PassengerCodeEnum")
@XmlEnum
public enum PassengerCodeEnum {

    @XmlEnumValue("Infant")
    INFANT("Infant"),
    @XmlEnumValue("Child")
    CHILD("Child"),
    @XmlEnumValue("Adult")
    ADULT("Adult"),
    @XmlEnumValue("Senior")
    SENIOR("Senior");
    private final String value;

    PassengerCodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassengerCodeEnum fromValue(String v) {
        for (PassengerCodeEnum c: PassengerCodeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
