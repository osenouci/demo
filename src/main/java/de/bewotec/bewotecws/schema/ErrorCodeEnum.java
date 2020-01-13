
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCodeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UnspecificError"/>
 *     &lt;enumeration value="ValidationError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCodeEnum")
@XmlEnum
public enum ErrorCodeEnum {

    @XmlEnumValue("UnspecificError")
    UNSPECIFIC_ERROR("UnspecificError"),
    @XmlEnumValue("ValidationError")
    VALIDATION_ERROR("ValidationError");
    private final String value;

    ErrorCodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCodeEnum fromValue(String v) {
        for (ErrorCodeEnum c: ErrorCodeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
