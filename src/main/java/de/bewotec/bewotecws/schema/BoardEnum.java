
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BoardEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BoardEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XX"/>
 *     &lt;enumeration value="AO"/>
 *     &lt;enumeration value="BB"/>
 *     &lt;enumeration value="HB"/>
 *     &lt;enumeration value="HBP"/>
 *     &lt;enumeration value="FB"/>
 *     &lt;enumeration value="FBP"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="AIL"/>
 *     &lt;enumeration value="AIP"/>
 *     &lt;enumeration value="AIU"/>
 *     &lt;enumeration value="AIR"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="SelfCatering"/>
 *     &lt;enumeration value="Breakfast"/>
 *     &lt;enumeration value="HalfBoard"/>
 *     &lt;enumeration value="HalfBoardPlus"/>
 *     &lt;enumeration value="FullBoard"/>
 *     &lt;enumeration value="FullBoardPlus"/>
 *     &lt;enumeration value="AllInclusive"/>
 *     &lt;enumeration value="AllInclusivePlus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BoardEnum")
@XmlEnum
public enum BoardEnum {

    XX("XX"),
    AO("AO"),
    BB("BB"),
    HB("HB"),
    HBP("HBP"),
    FB("FB"),
    FBP("FBP"),
    AI("AI"),
    AIL("AIL"),
    AIP("AIP"),
    AIU("AIU"),
    AIR("AIR"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("SelfCatering")
    SELF_CATERING("SelfCatering"),
    @XmlEnumValue("Breakfast")
    BREAKFAST("Breakfast"),
    @XmlEnumValue("HalfBoard")
    HALF_BOARD("HalfBoard"),
    @XmlEnumValue("HalfBoardPlus")
    HALF_BOARD_PLUS("HalfBoardPlus"),
    @XmlEnumValue("FullBoard")
    FULL_BOARD("FullBoard"),
    @XmlEnumValue("FullBoardPlus")
    FULL_BOARD_PLUS("FullBoardPlus"),
    @XmlEnumValue("AllInclusive")
    ALL_INCLUSIVE("AllInclusive"),
    @XmlEnumValue("AllInclusivePlus")
    ALL_INCLUSIVE_PLUS("AllInclusivePlus");
    private final String value;

    BoardEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoardEnum fromValue(String v) {
        for (BoardEnum c: BoardEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
