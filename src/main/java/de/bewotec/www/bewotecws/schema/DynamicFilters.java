/**
 * DynamicFilters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package de.bewotec.www.bewotecws.schema;


/**
 *  DynamicFilters bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class DynamicFilters implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = DynamicFilters
       Namespace URI = http://www.bewotec.de/bewotecws/Schema
       Namespace Prefix = ns1
     */

    /**
     * field for AttributesOverview
     */
    protected de.bewotec.www.bewotecws.schema.AttributesOverview_type0 localAttributesOverview;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAttributesOverviewTracker = false;

    /**
     * field for Durations
     */
    protected de.bewotec.www.bewotecws.schema.Durations_type1 localDurations;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDurationsTracker = false;

    /**
     * field for TravelStartDatesFrom
     */
    protected java.util.Calendar localTravelStartDatesFrom;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTravelStartDatesFromTracker = false;

    /**
     * field for TravelStartDatesTo
     */
    protected java.util.Calendar localTravelStartDatesTo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTravelStartDatesToTracker = false;

    /**
     * field for TravelStartDates
     */
    protected java.lang.String localTravelStartDates;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTravelStartDatesTracker = false;

    /**
     * field for MinPrice
     */
    protected java.math.BigDecimal localMinPrice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMinPriceTracker = false;

    /**
     * field for MaxPrice
     */
    protected java.math.BigDecimal localMaxPrice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMaxPriceTracker = false;

    /**
     * field for OutboundDepartureTimes
     */
    protected de.bewotec.www.bewotecws.schema.OutboundDepartureTimes_type0 localOutboundDepartureTimes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOutboundDepartureTimesTracker = false;

    /**
     * field for Airlines
     */
    protected de.bewotec.www.bewotecws.schema.Airlines_type1 localAirlines;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAirlinesTracker = false;

    /**
     * field for Ports
     */
    protected de.bewotec.www.bewotecws.schema.Ports_type3 localPorts;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPortsTracker = false;

    /**
     * field for DeparturePorts
     */
    protected de.bewotec.www.bewotecws.schema.DeparturePorts_type1 localDeparturePorts;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDeparturePortsTracker = false;

    /**
     * field for ArrivalPorts
     */
    protected de.bewotec.www.bewotecws.schema.ArrivalPorts_type1 localArrivalPorts;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localArrivalPortsTracker = false;

    /**
     * field for ProductCodes
     */
    protected de.bewotec.www.bewotecws.schema.ProductCodes_type3 localProductCodes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localProductCodesTracker = false;

    public boolean isAttributesOverviewSpecified() {
        return localAttributesOverviewTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.AttributesOverview_type0
     */
    public de.bewotec.www.bewotecws.schema.AttributesOverview_type0 getAttributesOverview() {
        return localAttributesOverview;
    }

    /**
     * Auto generated setter method
     * @param param AttributesOverview
     */
    public void setAttributesOverview(
        de.bewotec.www.bewotecws.schema.AttributesOverview_type0 param) {
        localAttributesOverviewTracker = param != null;

        this.localAttributesOverview = param;
    }

    public boolean isDurationsSpecified() {
        return localDurationsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Durations_type1
     */
    public de.bewotec.www.bewotecws.schema.Durations_type1 getDurations() {
        return localDurations;
    }

    /**
     * Auto generated setter method
     * @param param Durations
     */
    public void setDurations(
        de.bewotec.www.bewotecws.schema.Durations_type1 param) {
        localDurationsTracker = param != null;

        this.localDurations = param;
    }

    public boolean isTravelStartDatesFromSpecified() {
        return localTravelStartDatesFromTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getTravelStartDatesFrom() {
        return localTravelStartDatesFrom;
    }

    /**
     * Auto generated setter method
     * @param param TravelStartDatesFrom
     */
    public void setTravelStartDatesFrom(java.util.Calendar param) {
        localTravelStartDatesFromTracker = param != null;

        this.localTravelStartDatesFrom = param;
    }

    public boolean isTravelStartDatesToSpecified() {
        return localTravelStartDatesToTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getTravelStartDatesTo() {
        return localTravelStartDatesTo;
    }

    /**
     * Auto generated setter method
     * @param param TravelStartDatesTo
     */
    public void setTravelStartDatesTo(java.util.Calendar param) {
        localTravelStartDatesToTracker = param != null;

        this.localTravelStartDatesTo = param;
    }

    public boolean isTravelStartDatesSpecified() {
        return localTravelStartDatesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTravelStartDates() {
        return localTravelStartDates;
    }

    /**
     * Auto generated setter method
     * @param param TravelStartDates
     */
    public void setTravelStartDates(java.lang.String param) {
        localTravelStartDatesTracker = param != null;

        this.localTravelStartDates = param;
    }

    public boolean isMinPriceSpecified() {
        return localMinPriceTracker;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getMinPrice() {
        return localMinPrice;
    }

    /**
     * Auto generated setter method
     * @param param MinPrice
     */
    public void setMinPrice(java.math.BigDecimal param) {
        localMinPriceTracker = param != null;

        this.localMinPrice = param;
    }

    public boolean isMaxPriceSpecified() {
        return localMaxPriceTracker;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getMaxPrice() {
        return localMaxPrice;
    }

    /**
     * Auto generated setter method
     * @param param MaxPrice
     */
    public void setMaxPrice(java.math.BigDecimal param) {
        localMaxPriceTracker = param != null;

        this.localMaxPrice = param;
    }

    public boolean isOutboundDepartureTimesSpecified() {
        return localOutboundDepartureTimesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.OutboundDepartureTimes_type0
     */
    public de.bewotec.www.bewotecws.schema.OutboundDepartureTimes_type0 getOutboundDepartureTimes() {
        return localOutboundDepartureTimes;
    }

    /**
     * Auto generated setter method
     * @param param OutboundDepartureTimes
     */
    public void setOutboundDepartureTimes(
        de.bewotec.www.bewotecws.schema.OutboundDepartureTimes_type0 param) {
        localOutboundDepartureTimesTracker = param != null;

        this.localOutboundDepartureTimes = param;
    }

    public boolean isAirlinesSpecified() {
        return localAirlinesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Airlines_type1
     */
    public de.bewotec.www.bewotecws.schema.Airlines_type1 getAirlines() {
        return localAirlines;
    }

    /**
     * Auto generated setter method
     * @param param Airlines
     */
    public void setAirlines(
        de.bewotec.www.bewotecws.schema.Airlines_type1 param) {
        localAirlinesTracker = param != null;

        this.localAirlines = param;
    }

    public boolean isPortsSpecified() {
        return localPortsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Ports_type3
     */
    public de.bewotec.www.bewotecws.schema.Ports_type3 getPorts() {
        return localPorts;
    }

    /**
     * Auto generated setter method
     * @param param Ports
     */
    public void setPorts(de.bewotec.www.bewotecws.schema.Ports_type3 param) {
        localPortsTracker = true;

        this.localPorts = param;
    }

    public boolean isDeparturePortsSpecified() {
        return localDeparturePortsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.DeparturePorts_type1
     */
    public de.bewotec.www.bewotecws.schema.DeparturePorts_type1 getDeparturePorts() {
        return localDeparturePorts;
    }

    /**
     * Auto generated setter method
     * @param param DeparturePorts
     */
    public void setDeparturePorts(
        de.bewotec.www.bewotecws.schema.DeparturePorts_type1 param) {
        localDeparturePortsTracker = true;

        this.localDeparturePorts = param;
    }

    public boolean isArrivalPortsSpecified() {
        return localArrivalPortsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.ArrivalPorts_type1
     */
    public de.bewotec.www.bewotecws.schema.ArrivalPorts_type1 getArrivalPorts() {
        return localArrivalPorts;
    }

    /**
     * Auto generated setter method
     * @param param ArrivalPorts
     */
    public void setArrivalPorts(
        de.bewotec.www.bewotecws.schema.ArrivalPorts_type1 param) {
        localArrivalPortsTracker = true;

        this.localArrivalPorts = param;
    }

    public boolean isProductCodesSpecified() {
        return localProductCodesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.ProductCodes_type3
     */
    public de.bewotec.www.bewotecws.schema.ProductCodes_type3 getProductCodes() {
        return localProductCodes;
    }

    /**
     * Auto generated setter method
     * @param param ProductCodes
     */
    public void setProductCodes(
        de.bewotec.www.bewotecws.schema.ProductCodes_type3 param) {
        localProductCodesTracker = true;

        this.localProductCodes = param;
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
                this, parentQName));
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
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://www.bewotec.de/bewotecws/Schema");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":DynamicFilters", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "DynamicFilters", xmlWriter);
            }
        }

        if (localAttributesOverviewTracker) {
            if (localAttributesOverview == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AttributesOverview cannot be null!!");
            }

            localAttributesOverview.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema",
                    "AttributesOverview"), xmlWriter);
        }

        if (localDurationsTracker) {
            if (localDurations == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Durations cannot be null!!");
            }

            localDurations.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "Durations"),
                xmlWriter);
        }

        if (localTravelStartDatesFromTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "TravelStartDatesFrom", xmlWriter);

            if (localTravelStartDatesFrom == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TravelStartDatesFrom cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTravelStartDatesFrom));
            }

            xmlWriter.writeEndElement();
        }

        if (localTravelStartDatesToTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "TravelStartDatesTo", xmlWriter);

            if (localTravelStartDatesTo == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TravelStartDatesTo cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTravelStartDatesTo));
            }

            xmlWriter.writeEndElement();
        }

        if (localTravelStartDatesTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "TravelStartDates", xmlWriter);

            if (localTravelStartDates == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TravelStartDates cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTravelStartDates);
            }

            xmlWriter.writeEndElement();
        }

        if (localMinPriceTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "MinPrice", xmlWriter);

            if (localMinPrice == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MinPrice cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMinPrice));
            }

            xmlWriter.writeEndElement();
        }

        if (localMaxPriceTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "MaxPrice", xmlWriter);

            if (localMaxPrice == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MaxPrice cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMaxPrice));
            }

            xmlWriter.writeEndElement();
        }

        if (localOutboundDepartureTimesTracker) {
            if (localOutboundDepartureTimes == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "OutboundDepartureTimes cannot be null!!");
            }

            localOutboundDepartureTimes.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema",
                    "OutboundDepartureTimes"), xmlWriter);
        }

        if (localAirlinesTracker) {
            if (localAirlines == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Airlines cannot be null!!");
            }

            localAirlines.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "Airlines"),
                xmlWriter);
        }

        if (localPortsTracker) {
            if (localPorts == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "Ports", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localPorts.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "Ports"),
                    xmlWriter);
            }
        }

        if (localDeparturePortsTracker) {
            if (localDeparturePorts == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "DeparturePorts",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localDeparturePorts.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema",
                        "DeparturePorts"), xmlWriter);
            }
        }

        if (localArrivalPortsTracker) {
            if (localArrivalPorts == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "ArrivalPorts",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localArrivalPorts.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "ArrivalPorts"),
                    xmlWriter);
            }
        }

        if (localProductCodesTracker) {
            if (localProductCodes == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "ProductCodes",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localProductCodes.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "ProductCodes"),
                    xmlWriter);
            }
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

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static DynamicFilters parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            DynamicFilters object = new DynamicFilters();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"DynamicFilters".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (DynamicFilters) de.bewotec.www.bewotecws.schema.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "AttributesOverview").equals(reader.getName())) {
                    object.setAttributesOverview(de.bewotec.www.bewotecws.schema.AttributesOverview_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "Durations").equals(reader.getName())) {
                    object.setDurations(de.bewotec.www.bewotecws.schema.Durations_type1.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "TravelStartDatesFrom").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TravelStartDatesFrom" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTravelStartDatesFrom(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "TravelStartDatesTo").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TravelStartDatesTo" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTravelStartDatesTo(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "TravelStartDates").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TravelStartDates" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTravelStartDates(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "MinPrice").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MinPrice" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMinPrice(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "MaxPrice").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MaxPrice" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMaxPrice(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "OutboundDepartureTimes").equals(reader.getName())) {
                    object.setOutboundDepartureTimes(de.bewotec.www.bewotecws.schema.OutboundDepartureTimes_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Airlines").equals(
                            reader.getName())) {
                    object.setAirlines(de.bewotec.www.bewotecws.schema.Airlines_type1.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Ports").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setPorts(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setPorts(de.bewotec.www.bewotecws.schema.Ports_type3.Factory.parse(
                                reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "DeparturePorts").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setDeparturePorts(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setDeparturePorts(de.bewotec.www.bewotecws.schema.DeparturePorts_type1.Factory.parse(
                                reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "ArrivalPorts").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setArrivalPorts(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setArrivalPorts(de.bewotec.www.bewotecws.schema.ArrivalPorts_type1.Factory.parse(
                                reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "ProductCodes").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setProductCodes(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setProductCodes(de.bewotec.www.bewotecws.schema.ProductCodes_type3.Factory.parse(
                                reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
