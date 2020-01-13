/**
 * PriceTypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package de.bewotec.www.bewotecws.schema;


/**
 *  PriceTypeEnum bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class PriceTypeEnum implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.bewotec.de/bewotecws/Schema",
            "PriceTypeEnum", "ns1");
    private static java.util.HashMap _table_ = new java.util.HashMap();
    public static final java.lang.String _Base = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "Base");
    public static final java.lang.String _Board = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "Board");
    public static final java.lang.String _EarlyBird = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EarlyBird");
    public static final java.lang.String _ExtraDay = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ExtraDay");
    public static final java.lang.String _StayPay = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "StayPay");
    public static final java.lang.String _ChildReduction = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ChildReduction");
    public static final java.lang.String _DurationReduction = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DurationReduction");
    public static final java.lang.String _ChildPrice = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ChildPrice");
    public static final java.lang.String _OccupancyReduction = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "OccupancyReduction");
    public static final java.lang.String _OccupancySupplement = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "OccupancySupplement");
    public static final java.lang.String _BoardChildReduction = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BoardChildReduction");
    public static final java.lang.String _BoardSupplement = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BoardSupplement");
    public static final java.lang.String _SelfDrivingSupplement = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SelfDrivingSupplement");
    public static final java.lang.String _GeneralSupplement = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GeneralSupplement");
    public static final java.lang.String _GeneralDiscount = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GeneralDiscount");
    public static final java.lang.String _FuelSurcharge = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FuelSurcharge");
    public static final java.lang.String _AirPassengerDuty = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AirPassengerDuty");
    public static final java.lang.String _AirportSurcharge = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AirportSurcharge");
    public static final java.lang.String _FlightSupplement = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FlightSupplement");
    public static final java.lang.String _FlightTax = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FlightTax");
    public static final java.lang.String _SecurityCharge = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SecurityCharge");
    public static final java.lang.String _FirstMinute = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FirstMinute");
    public static final java.lang.String _LastMinute = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "LastMinute");
    public static final java.lang.String _UltraFirstMinute = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "UltraFirstMinute");
    public static final java.lang.String _UltraLastMinute = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "UltraLastMinute");
    public static final java.lang.String _CustomPriceType1 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType1");
    public static final java.lang.String _CustomPriceType2 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType2");
    public static final java.lang.String _CustomPriceType3 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType3");
    public static final java.lang.String _CustomPriceType4 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType4");
    public static final java.lang.String _CustomPriceType5 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType5");
    public static final java.lang.String _CustomPriceType6 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType6");
    public static final java.lang.String _CustomPriceType7 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType7");
    public static final java.lang.String _CustomPriceType8 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType8");
    public static final java.lang.String _CustomPriceType9 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType9");
    public static final java.lang.String _CustomPriceType10 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType10");
    public static final java.lang.String _CustomPriceType11 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType11");
    public static final java.lang.String _CustomPriceType12 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType12");
    public static final java.lang.String _CustomPriceType13 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType13");
    public static final java.lang.String _CustomPriceType14 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType14");
    public static final java.lang.String _CustomPriceType15 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType15");
    public static final java.lang.String _CustomPriceType16 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType16");
    public static final java.lang.String _CustomPriceType17 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType17");
    public static final java.lang.String _CustomPriceType18 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType18");
    public static final java.lang.String _CustomPriceType19 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType19");
    public static final java.lang.String _CustomPriceType20 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType20");
    public static final java.lang.String _CustomPriceType21 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType21");
    public static final java.lang.String _CustomPriceType22 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType22");
    public static final java.lang.String _CustomPriceType23 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType23");
    public static final java.lang.String _CustomPriceType24 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType24");
    public static final java.lang.String _CustomPriceType25 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType25");
    public static final java.lang.String _CustomPriceType26 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType26");
    public static final java.lang.String _CustomPriceType27 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType27");
    public static final java.lang.String _CustomPriceType28 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType28");
    public static final java.lang.String _CustomPriceType29 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType29");
    public static final java.lang.String _CustomPriceType30 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType30");
    public static final java.lang.String _CustomPriceType31 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType31");
    public static final java.lang.String _CustomPriceType32 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType32");
    public static final java.lang.String _CustomPriceType33 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType33");
    public static final java.lang.String _CustomPriceType34 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType34");
    public static final java.lang.String _CustomPriceType35 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CustomPriceType35");
    public static final PriceTypeEnum Base = new PriceTypeEnum(_Base, true);
    public static final PriceTypeEnum Board = new PriceTypeEnum(_Board, true);
    public static final PriceTypeEnum EarlyBird = new PriceTypeEnum(_EarlyBird,
            true);
    public static final PriceTypeEnum ExtraDay = new PriceTypeEnum(_ExtraDay,
            true);
    public static final PriceTypeEnum StayPay = new PriceTypeEnum(_StayPay, true);
    public static final PriceTypeEnum ChildReduction = new PriceTypeEnum(_ChildReduction,
            true);
    public static final PriceTypeEnum DurationReduction = new PriceTypeEnum(_DurationReduction,
            true);
    public static final PriceTypeEnum ChildPrice = new PriceTypeEnum(_ChildPrice,
            true);
    public static final PriceTypeEnum OccupancyReduction = new PriceTypeEnum(_OccupancyReduction,
            true);
    public static final PriceTypeEnum OccupancySupplement = new PriceTypeEnum(_OccupancySupplement,
            true);
    public static final PriceTypeEnum BoardChildReduction = new PriceTypeEnum(_BoardChildReduction,
            true);
    public static final PriceTypeEnum BoardSupplement = new PriceTypeEnum(_BoardSupplement,
            true);
    public static final PriceTypeEnum SelfDrivingSupplement = new PriceTypeEnum(_SelfDrivingSupplement,
            true);
    public static final PriceTypeEnum GeneralSupplement = new PriceTypeEnum(_GeneralSupplement,
            true);
    public static final PriceTypeEnum GeneralDiscount = new PriceTypeEnum(_GeneralDiscount,
            true);
    public static final PriceTypeEnum FuelSurcharge = new PriceTypeEnum(_FuelSurcharge,
            true);
    public static final PriceTypeEnum AirPassengerDuty = new PriceTypeEnum(_AirPassengerDuty,
            true);
    public static final PriceTypeEnum AirportSurcharge = new PriceTypeEnum(_AirportSurcharge,
            true);
    public static final PriceTypeEnum FlightSupplement = new PriceTypeEnum(_FlightSupplement,
            true);
    public static final PriceTypeEnum FlightTax = new PriceTypeEnum(_FlightTax,
            true);
    public static final PriceTypeEnum SecurityCharge = new PriceTypeEnum(_SecurityCharge,
            true);
    public static final PriceTypeEnum FirstMinute = new PriceTypeEnum(_FirstMinute,
            true);
    public static final PriceTypeEnum LastMinute = new PriceTypeEnum(_LastMinute,
            true);
    public static final PriceTypeEnum UltraFirstMinute = new PriceTypeEnum(_UltraFirstMinute,
            true);
    public static final PriceTypeEnum UltraLastMinute = new PriceTypeEnum(_UltraLastMinute,
            true);
    public static final PriceTypeEnum CustomPriceType1 = new PriceTypeEnum(_CustomPriceType1,
            true);
    public static final PriceTypeEnum CustomPriceType2 = new PriceTypeEnum(_CustomPriceType2,
            true);
    public static final PriceTypeEnum CustomPriceType3 = new PriceTypeEnum(_CustomPriceType3,
            true);
    public static final PriceTypeEnum CustomPriceType4 = new PriceTypeEnum(_CustomPriceType4,
            true);
    public static final PriceTypeEnum CustomPriceType5 = new PriceTypeEnum(_CustomPriceType5,
            true);
    public static final PriceTypeEnum CustomPriceType6 = new PriceTypeEnum(_CustomPriceType6,
            true);
    public static final PriceTypeEnum CustomPriceType7 = new PriceTypeEnum(_CustomPriceType7,
            true);
    public static final PriceTypeEnum CustomPriceType8 = new PriceTypeEnum(_CustomPriceType8,
            true);
    public static final PriceTypeEnum CustomPriceType9 = new PriceTypeEnum(_CustomPriceType9,
            true);
    public static final PriceTypeEnum CustomPriceType10 = new PriceTypeEnum(_CustomPriceType10,
            true);
    public static final PriceTypeEnum CustomPriceType11 = new PriceTypeEnum(_CustomPriceType11,
            true);
    public static final PriceTypeEnum CustomPriceType12 = new PriceTypeEnum(_CustomPriceType12,
            true);
    public static final PriceTypeEnum CustomPriceType13 = new PriceTypeEnum(_CustomPriceType13,
            true);
    public static final PriceTypeEnum CustomPriceType14 = new PriceTypeEnum(_CustomPriceType14,
            true);
    public static final PriceTypeEnum CustomPriceType15 = new PriceTypeEnum(_CustomPriceType15,
            true);
    public static final PriceTypeEnum CustomPriceType16 = new PriceTypeEnum(_CustomPriceType16,
            true);
    public static final PriceTypeEnum CustomPriceType17 = new PriceTypeEnum(_CustomPriceType17,
            true);
    public static final PriceTypeEnum CustomPriceType18 = new PriceTypeEnum(_CustomPriceType18,
            true);
    public static final PriceTypeEnum CustomPriceType19 = new PriceTypeEnum(_CustomPriceType19,
            true);
    public static final PriceTypeEnum CustomPriceType20 = new PriceTypeEnum(_CustomPriceType20,
            true);
    public static final PriceTypeEnum CustomPriceType21 = new PriceTypeEnum(_CustomPriceType21,
            true);
    public static final PriceTypeEnum CustomPriceType22 = new PriceTypeEnum(_CustomPriceType22,
            true);
    public static final PriceTypeEnum CustomPriceType23 = new PriceTypeEnum(_CustomPriceType23,
            true);
    public static final PriceTypeEnum CustomPriceType24 = new PriceTypeEnum(_CustomPriceType24,
            true);
    public static final PriceTypeEnum CustomPriceType25 = new PriceTypeEnum(_CustomPriceType25,
            true);
    public static final PriceTypeEnum CustomPriceType26 = new PriceTypeEnum(_CustomPriceType26,
            true);
    public static final PriceTypeEnum CustomPriceType27 = new PriceTypeEnum(_CustomPriceType27,
            true);
    public static final PriceTypeEnum CustomPriceType28 = new PriceTypeEnum(_CustomPriceType28,
            true);
    public static final PriceTypeEnum CustomPriceType29 = new PriceTypeEnum(_CustomPriceType29,
            true);
    public static final PriceTypeEnum CustomPriceType30 = new PriceTypeEnum(_CustomPriceType30,
            true);
    public static final PriceTypeEnum CustomPriceType31 = new PriceTypeEnum(_CustomPriceType31,
            true);
    public static final PriceTypeEnum CustomPriceType32 = new PriceTypeEnum(_CustomPriceType32,
            true);
    public static final PriceTypeEnum CustomPriceType33 = new PriceTypeEnum(_CustomPriceType33,
            true);
    public static final PriceTypeEnum CustomPriceType34 = new PriceTypeEnum(_CustomPriceType34,
            true);
    public static final PriceTypeEnum CustomPriceType35 = new PriceTypeEnum(_CustomPriceType35,
            true);

    /**
     * field for PriceTypeEnum
     */
    protected java.lang.String localPriceTypeEnum;

    // Constructor
    protected PriceTypeEnum(java.lang.String value, boolean isRegisterValue) {
        localPriceTypeEnum = value;

        if (isRegisterValue) {
            _table_.put(localPriceTypeEnum, this);
        }
    }

    public java.lang.String getValue() {
        return localPriceTypeEnum;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj == this);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public java.lang.String toString() {
        return localPriceTypeEnum.toString();
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, MY_QNAME));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        //We can safely assume an element has only one type associated with it
        java.lang.String namespace = parentQName.getNamespaceURI();
        java.lang.String _localName = parentQName.getLocalPart();

        writeStartElement(null, namespace, _localName, xmlWriter);

        // add the type details if this is used in a simple type
        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://www.bewotec.de/bewotecws/Schema");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":PriceTypeEnum", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "PriceTypeEnum", xmlWriter);
            }
        }

        if (localPriceTypeEnum == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "PriceTypeEnum cannot be null !!");
        } else {
            xmlWriter.writeCharacters(localPriceTypeEnum);
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.bewotec.de/bewotecws/Schema")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        public static PriceTypeEnum fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
            PriceTypeEnum enumeration = (PriceTypeEnum) _table_.get(value);

            // handle unexpected enumeration values properly
            if (enumeration == null) {
                throw new java.lang.IllegalArgumentException();
            }

            return enumeration;
        }

        public static PriceTypeEnum fromString(java.lang.String value,
            java.lang.String namespaceURI)
            throws java.lang.IllegalArgumentException {
            try {
                return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        value));
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalArgumentException();
            }
        }

        public static PriceTypeEnum fromString(
            javax.xml.stream.XMLStreamReader xmlStreamReader,
            java.lang.String content) {
            if (content.indexOf(":") > -1) {
                java.lang.String prefix = content.substring(0,
                        content.indexOf(":"));
                java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext()
                                                               .getNamespaceURI(prefix);

                return PriceTypeEnum.Factory.fromString(content, namespaceUri);
            } else {
                return PriceTypeEnum.Factory.fromString(content, "");
            }
        }

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static PriceTypeEnum parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            PriceTypeEnum object = null;

            // initialize a hash map to keep values
            java.util.Map attributeMap = new java.util.HashMap();
            java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement() || reader.hasText()) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "PriceTypeEnum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        if (content.indexOf(":") > 0) {
                            // this seems to be a Qname so find the namespace and send
                            prefix = content.substring(0, content.indexOf(":"));
                            namespaceuri = reader.getNamespaceURI(prefix);
                            object = PriceTypeEnum.Factory.fromString(content,
                                    namespaceuri);
                        } else {
                            // this seems to be not a qname send and empty namespace incase of it is
                            // check is done in fromString method
                            object = PriceTypeEnum.Factory.fromString(content,
                                    "");
                        }
                    } else {
                        reader.next();
                    }
                } // end of while loop
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
