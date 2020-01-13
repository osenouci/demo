
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessMessageTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessMessageTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="ConfigurationError"/>
 *     &lt;enumeration value="Information"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessMessageTypeEnum")
@XmlEnum
public enum ProcessMessageTypeEnum {

    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("ConfigurationError")
    CONFIGURATION_ERROR("ConfigurationError"),
    @XmlEnumValue("Information")
    INFORMATION("Information");
    private final String value;

    ProcessMessageTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessMessageTypeEnum fromValue(String v) {
        for (ProcessMessageTypeEnum c: ProcessMessageTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
