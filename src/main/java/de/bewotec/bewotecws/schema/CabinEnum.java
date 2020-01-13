
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CabinEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Balcony"/>
 *     &lt;enumeration value="JuniorSuite"/>
 *     &lt;enumeration value="Interior"/>
 *     &lt;enumeration value="Veranda"/>
 *     &lt;enumeration value="Suite"/>
 *     &lt;enumeration value="Outside"/>
 *     &lt;enumeration value="Family"/>
 *     &lt;enumeration value="DeluxeSuite"/>
 *     &lt;enumeration value="PanoramaSuite"/>
 *     &lt;enumeration value="PanoramaBalcony"/>
 *     &lt;enumeration value="FamilyBalcony"/>
 *     &lt;enumeration value="FamilyVeranda"/>
 *     &lt;enumeration value="SkySuite"/>
 *     &lt;enumeration value="HorizonSuite"/>
 *     &lt;enumeration value="ViewSuite"/>
 *     &lt;enumeration value="SpaBalcony"/>
 *     &lt;enumeration value="OverseaSuite"/>
 *     &lt;enumeration value="JuniorSuiteVeranda"/>
 *     &lt;enumeration value="VerandaSuite"/>
 *     &lt;enumeration value="ThemeSuite"/>
 *     &lt;enumeration value="CombiBalcony"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CabinEnum")
@XmlEnum
public enum CabinEnum {

    @XmlEnumValue("Balcony")
    BALCONY("Balcony"),
    @XmlEnumValue("JuniorSuite")
    JUNIOR_SUITE("JuniorSuite"),
    @XmlEnumValue("Interior")
    INTERIOR("Interior"),
    @XmlEnumValue("Veranda")
    VERANDA("Veranda"),
    @XmlEnumValue("Suite")
    SUITE("Suite"),
    @XmlEnumValue("Outside")
    OUTSIDE("Outside"),
    @XmlEnumValue("Family")
    FAMILY("Family"),
    @XmlEnumValue("DeluxeSuite")
    DELUXE_SUITE("DeluxeSuite"),
    @XmlEnumValue("PanoramaSuite")
    PANORAMA_SUITE("PanoramaSuite"),
    @XmlEnumValue("PanoramaBalcony")
    PANORAMA_BALCONY("PanoramaBalcony"),
    @XmlEnumValue("FamilyBalcony")
    FAMILY_BALCONY("FamilyBalcony"),
    @XmlEnumValue("FamilyVeranda")
    FAMILY_VERANDA("FamilyVeranda"),
    @XmlEnumValue("SkySuite")
    SKY_SUITE("SkySuite"),
    @XmlEnumValue("HorizonSuite")
    HORIZON_SUITE("HorizonSuite"),
    @XmlEnumValue("ViewSuite")
    VIEW_SUITE("ViewSuite"),
    @XmlEnumValue("SpaBalcony")
    SPA_BALCONY("SpaBalcony"),
    @XmlEnumValue("OverseaSuite")
    OVERSEA_SUITE("OverseaSuite"),
    @XmlEnumValue("JuniorSuiteVeranda")
    JUNIOR_SUITE_VERANDA("JuniorSuiteVeranda"),
    @XmlEnumValue("VerandaSuite")
    VERANDA_SUITE("VerandaSuite"),
    @XmlEnumValue("ThemeSuite")
    THEME_SUITE("ThemeSuite"),
    @XmlEnumValue("CombiBalcony")
    COMBI_BALCONY("CombiBalcony");
    private final String value;

    CabinEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CabinEnum fromValue(String v) {
        for (CabinEnum c: CabinEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
