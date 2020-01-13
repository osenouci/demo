
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriteriaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CriteriaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Groups"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CriteriaEnum")
@XmlEnum
public enum CriteriaEnum {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Groups")
    GROUPS("Groups");
    private final String value;

    CriteriaEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CriteriaEnum fromValue(String v) {
        for (CriteriaEnum c: CriteriaEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
