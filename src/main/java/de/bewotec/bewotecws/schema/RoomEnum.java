
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoomEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XX"/>
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="BU"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="DP"/>
 *     &lt;enumeration value="DR"/>
 *     &lt;enumeration value="DL"/>
 *     &lt;enumeration value="ER"/>
 *     &lt;enumeration value="FC"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="HA"/>
 *     &lt;enumeration value="HB"/>
 *     &lt;enumeration value="JS"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="MB"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="SU"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="VF"/>
 *     &lt;enumeration value="VH"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="WB"/>
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="Double"/>
 *     &lt;enumeration value="Apartment"/>
 *     &lt;enumeration value="Studio"/>
 *     &lt;enumeration value="Bungalow"/>
 *     &lt;enumeration value="Triple"/>
 *     &lt;enumeration value="Suite"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Family"/>
 *     &lt;enumeration value="Villa"/>
 *     &lt;enumeration value="HolidayHome"/>
 *     &lt;enumeration value="SemidetachedHouse"/>
 *     &lt;enumeration value="Quad"/>
 *     &lt;enumeration value="SingleWithChild"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoomEnum")
@XmlEnum
public enum RoomEnum {

    XX("XX"),
    AP("AP"),
    BU("BU"),
    CA("CA"),
    CH("CH"),
    CT("CT"),
    DP("DP"),
    DR("DR"),
    DL("DL"),
    ER("ER"),
    FC("FC"),
    FR("FR"),
    HA("HA"),
    HB("HB"),
    JS("JS"),
    MA("MA"),
    MB("MB"),
    MH("MH"),
    PH("PH"),
    SP("SP"),
    SR("SR"),
    ST("ST"),
    SU("SU"),
    TR("TR"),
    VF("VF"),
    VH("VH"),
    VI("VI"),
    WB("WB"),
    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("Apartment")
    APARTMENT("Apartment"),
    @XmlEnumValue("Studio")
    STUDIO("Studio"),
    @XmlEnumValue("Bungalow")
    BUNGALOW("Bungalow"),
    @XmlEnumValue("Triple")
    TRIPLE("Triple"),
    @XmlEnumValue("Suite")
    SUITE("Suite"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Family")
    FAMILY("Family"),
    @XmlEnumValue("Villa")
    VILLA("Villa"),
    @XmlEnumValue("HolidayHome")
    HOLIDAY_HOME("HolidayHome"),
    @XmlEnumValue("SemidetachedHouse")
    SEMIDETACHED_HOUSE("SemidetachedHouse"),
    @XmlEnumValue("Quad")
    QUAD("Quad"),
    @XmlEnumValue("SingleWithChild")
    SINGLE_WITH_CHILD("SingleWithChild");
    private final String value;

    RoomEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoomEnum fromValue(String v) {
        for (RoomEnum c: RoomEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
