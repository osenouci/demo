
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Base"/>
 *     &lt;enumeration value="Board"/>
 *     &lt;enumeration value="EarlyBird"/>
 *     &lt;enumeration value="ExtraDay"/>
 *     &lt;enumeration value="StayPay"/>
 *     &lt;enumeration value="ChildReduction"/>
 *     &lt;enumeration value="DurationReduction"/>
 *     &lt;enumeration value="ChildPrice"/>
 *     &lt;enumeration value="OccupancyReduction"/>
 *     &lt;enumeration value="OccupancySupplement"/>
 *     &lt;enumeration value="BoardChildReduction"/>
 *     &lt;enumeration value="BoardSupplement"/>
 *     &lt;enumeration value="SelfDrivingSupplement"/>
 *     &lt;enumeration value="GeneralSupplement"/>
 *     &lt;enumeration value="GeneralDiscount"/>
 *     &lt;enumeration value="FuelSurcharge"/>
 *     &lt;enumeration value="AirPassengerDuty"/>
 *     &lt;enumeration value="AirportSurcharge"/>
 *     &lt;enumeration value="FlightSupplement"/>
 *     &lt;enumeration value="FlightTax"/>
 *     &lt;enumeration value="SecurityCharge"/>
 *     &lt;enumeration value="FirstMinute"/>
 *     &lt;enumeration value="LastMinute"/>
 *     &lt;enumeration value="UltraFirstMinute"/>
 *     &lt;enumeration value="UltraLastMinute"/>
 *     &lt;enumeration value="CustomPriceType1"/>
 *     &lt;enumeration value="CustomPriceType2"/>
 *     &lt;enumeration value="CustomPriceType3"/>
 *     &lt;enumeration value="CustomPriceType4"/>
 *     &lt;enumeration value="CustomPriceType5"/>
 *     &lt;enumeration value="CustomPriceType6"/>
 *     &lt;enumeration value="CustomPriceType7"/>
 *     &lt;enumeration value="CustomPriceType8"/>
 *     &lt;enumeration value="CustomPriceType9"/>
 *     &lt;enumeration value="CustomPriceType10"/>
 *     &lt;enumeration value="CustomPriceType11"/>
 *     &lt;enumeration value="CustomPriceType12"/>
 *     &lt;enumeration value="CustomPriceType13"/>
 *     &lt;enumeration value="CustomPriceType14"/>
 *     &lt;enumeration value="CustomPriceType15"/>
 *     &lt;enumeration value="CustomPriceType16"/>
 *     &lt;enumeration value="CustomPriceType17"/>
 *     &lt;enumeration value="CustomPriceType18"/>
 *     &lt;enumeration value="CustomPriceType19"/>
 *     &lt;enumeration value="CustomPriceType20"/>
 *     &lt;enumeration value="CustomPriceType21"/>
 *     &lt;enumeration value="CustomPriceType22"/>
 *     &lt;enumeration value="CustomPriceType23"/>
 *     &lt;enumeration value="CustomPriceType24"/>
 *     &lt;enumeration value="CustomPriceType25"/>
 *     &lt;enumeration value="CustomPriceType26"/>
 *     &lt;enumeration value="CustomPriceType27"/>
 *     &lt;enumeration value="CustomPriceType28"/>
 *     &lt;enumeration value="CustomPriceType29"/>
 *     &lt;enumeration value="CustomPriceType30"/>
 *     &lt;enumeration value="CustomPriceType31"/>
 *     &lt;enumeration value="CustomPriceType32"/>
 *     &lt;enumeration value="CustomPriceType33"/>
 *     &lt;enumeration value="CustomPriceType34"/>
 *     &lt;enumeration value="CustomPriceType35"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceTypeEnum")
@XmlEnum
public enum PriceTypeEnum {

    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Board")
    BOARD("Board"),
    @XmlEnumValue("EarlyBird")
    EARLY_BIRD("EarlyBird"),
    @XmlEnumValue("ExtraDay")
    EXTRA_DAY("ExtraDay"),
    @XmlEnumValue("StayPay")
    STAY_PAY("StayPay"),
    @XmlEnumValue("ChildReduction")
    CHILD_REDUCTION("ChildReduction"),
    @XmlEnumValue("DurationReduction")
    DURATION_REDUCTION("DurationReduction"),
    @XmlEnumValue("ChildPrice")
    CHILD_PRICE("ChildPrice"),
    @XmlEnumValue("OccupancyReduction")
    OCCUPANCY_REDUCTION("OccupancyReduction"),
    @XmlEnumValue("OccupancySupplement")
    OCCUPANCY_SUPPLEMENT("OccupancySupplement"),
    @XmlEnumValue("BoardChildReduction")
    BOARD_CHILD_REDUCTION("BoardChildReduction"),
    @XmlEnumValue("BoardSupplement")
    BOARD_SUPPLEMENT("BoardSupplement"),
    @XmlEnumValue("SelfDrivingSupplement")
    SELF_DRIVING_SUPPLEMENT("SelfDrivingSupplement"),
    @XmlEnumValue("GeneralSupplement")
    GENERAL_SUPPLEMENT("GeneralSupplement"),
    @XmlEnumValue("GeneralDiscount")
    GENERAL_DISCOUNT("GeneralDiscount"),
    @XmlEnumValue("FuelSurcharge")
    FUEL_SURCHARGE("FuelSurcharge"),
    @XmlEnumValue("AirPassengerDuty")
    AIR_PASSENGER_DUTY("AirPassengerDuty"),
    @XmlEnumValue("AirportSurcharge")
    AIRPORT_SURCHARGE("AirportSurcharge"),
    @XmlEnumValue("FlightSupplement")
    FLIGHT_SUPPLEMENT("FlightSupplement"),
    @XmlEnumValue("FlightTax")
    FLIGHT_TAX("FlightTax"),
    @XmlEnumValue("SecurityCharge")
    SECURITY_CHARGE("SecurityCharge"),
    @XmlEnumValue("FirstMinute")
    FIRST_MINUTE("FirstMinute"),
    @XmlEnumValue("LastMinute")
    LAST_MINUTE("LastMinute"),
    @XmlEnumValue("UltraFirstMinute")
    ULTRA_FIRST_MINUTE("UltraFirstMinute"),
    @XmlEnumValue("UltraLastMinute")
    ULTRA_LAST_MINUTE("UltraLastMinute"),
    @XmlEnumValue("CustomPriceType1")
    CUSTOM_PRICE_TYPE_1("CustomPriceType1"),
    @XmlEnumValue("CustomPriceType2")
    CUSTOM_PRICE_TYPE_2("CustomPriceType2"),
    @XmlEnumValue("CustomPriceType3")
    CUSTOM_PRICE_TYPE_3("CustomPriceType3"),
    @XmlEnumValue("CustomPriceType4")
    CUSTOM_PRICE_TYPE_4("CustomPriceType4"),
    @XmlEnumValue("CustomPriceType5")
    CUSTOM_PRICE_TYPE_5("CustomPriceType5"),
    @XmlEnumValue("CustomPriceType6")
    CUSTOM_PRICE_TYPE_6("CustomPriceType6"),
    @XmlEnumValue("CustomPriceType7")
    CUSTOM_PRICE_TYPE_7("CustomPriceType7"),
    @XmlEnumValue("CustomPriceType8")
    CUSTOM_PRICE_TYPE_8("CustomPriceType8"),
    @XmlEnumValue("CustomPriceType9")
    CUSTOM_PRICE_TYPE_9("CustomPriceType9"),
    @XmlEnumValue("CustomPriceType10")
    CUSTOM_PRICE_TYPE_10("CustomPriceType10"),
    @XmlEnumValue("CustomPriceType11")
    CUSTOM_PRICE_TYPE_11("CustomPriceType11"),
    @XmlEnumValue("CustomPriceType12")
    CUSTOM_PRICE_TYPE_12("CustomPriceType12"),
    @XmlEnumValue("CustomPriceType13")
    CUSTOM_PRICE_TYPE_13("CustomPriceType13"),
    @XmlEnumValue("CustomPriceType14")
    CUSTOM_PRICE_TYPE_14("CustomPriceType14"),
    @XmlEnumValue("CustomPriceType15")
    CUSTOM_PRICE_TYPE_15("CustomPriceType15"),
    @XmlEnumValue("CustomPriceType16")
    CUSTOM_PRICE_TYPE_16("CustomPriceType16"),
    @XmlEnumValue("CustomPriceType17")
    CUSTOM_PRICE_TYPE_17("CustomPriceType17"),
    @XmlEnumValue("CustomPriceType18")
    CUSTOM_PRICE_TYPE_18("CustomPriceType18"),
    @XmlEnumValue("CustomPriceType19")
    CUSTOM_PRICE_TYPE_19("CustomPriceType19"),
    @XmlEnumValue("CustomPriceType20")
    CUSTOM_PRICE_TYPE_20("CustomPriceType20"),
    @XmlEnumValue("CustomPriceType21")
    CUSTOM_PRICE_TYPE_21("CustomPriceType21"),
    @XmlEnumValue("CustomPriceType22")
    CUSTOM_PRICE_TYPE_22("CustomPriceType22"),
    @XmlEnumValue("CustomPriceType23")
    CUSTOM_PRICE_TYPE_23("CustomPriceType23"),
    @XmlEnumValue("CustomPriceType24")
    CUSTOM_PRICE_TYPE_24("CustomPriceType24"),
    @XmlEnumValue("CustomPriceType25")
    CUSTOM_PRICE_TYPE_25("CustomPriceType25"),
    @XmlEnumValue("CustomPriceType26")
    CUSTOM_PRICE_TYPE_26("CustomPriceType26"),
    @XmlEnumValue("CustomPriceType27")
    CUSTOM_PRICE_TYPE_27("CustomPriceType27"),
    @XmlEnumValue("CustomPriceType28")
    CUSTOM_PRICE_TYPE_28("CustomPriceType28"),
    @XmlEnumValue("CustomPriceType29")
    CUSTOM_PRICE_TYPE_29("CustomPriceType29"),
    @XmlEnumValue("CustomPriceType30")
    CUSTOM_PRICE_TYPE_30("CustomPriceType30"),
    @XmlEnumValue("CustomPriceType31")
    CUSTOM_PRICE_TYPE_31("CustomPriceType31"),
    @XmlEnumValue("CustomPriceType32")
    CUSTOM_PRICE_TYPE_32("CustomPriceType32"),
    @XmlEnumValue("CustomPriceType33")
    CUSTOM_PRICE_TYPE_33("CustomPriceType33"),
    @XmlEnumValue("CustomPriceType34")
    CUSTOM_PRICE_TYPE_34("CustomPriceType34"),
    @XmlEnumValue("CustomPriceType35")
    CUSTOM_PRICE_TYPE_35("CustomPriceType35");
    private final String value;

    PriceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceTypeEnum fromValue(String v) {
        for (PriceTypeEnum c: PriceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
