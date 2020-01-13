/**
 * FlightRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package de.bewotec.www.bewotecws.schema;


/**
 *  FlightRequestType bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class FlightRequestType implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = FlightRequestType
       Namespace URI = http://www.bewotec.de/bewotecws/Schema
       Namespace Prefix = ns1
     */

    /**
     * field for DepartureAirports
     */
    protected de.bewotec.www.bewotecws.schema.AirportListType localDepartureAirports;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDepartureAirportsTracker = false;

    /**
     * field for ArrivalAirports
     */
    protected de.bewotec.www.bewotecws.schema.AirportListType localArrivalAirports;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localArrivalAirportsTracker = false;

    /**
     * field for FlightNumbers
     */
    protected de.bewotec.www.bewotecws.schema.FlightNumbers_type0 localFlightNumbers;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFlightNumbersTracker = false;

    /**
     * field for DurationMin
     */
    protected org.apache.axis2.databinding.types.UnsignedInt localDurationMin;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDurationMinTracker = false;

    /**
     * field for DurationMax
     */
    protected org.apache.axis2.databinding.types.UnsignedInt localDurationMax;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDurationMaxTracker = false;

    /**
     * field for NoAlternatives
     */
    protected boolean localNoAlternatives;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNoAlternativesTracker = false;

    /**
     * field for ProductCodes
     */
    protected de.bewotec.www.bewotecws.schema.ProductCodes_type1 localProductCodes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localProductCodesTracker = false;

    /**
     * field for FlightTime
     */
    protected de.bewotec.www.bewotecws.schema.FlightTimeType localFlightTime;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFlightTimeTracker = false;

    /**
     * field for OpenYawAllowed
     */
    protected boolean localOpenYawAllowed;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOpenYawAllowedTracker = false;

    /**
     * field for Airlines
     */
    protected de.bewotec.www.bewotecws.schema.Airlines_type0 localAirlines;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAirlinesTracker = false;

    /**
     * field for DurationMinInbound
     */
    protected org.apache.axis2.databinding.types.UnsignedInt localDurationMinInbound;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDurationMinInboundTracker = false;

    /**
     * field for DurationMaxInbound
     */
    protected org.apache.axis2.databinding.types.UnsignedInt localDurationMaxInbound;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDurationMaxInboundTracker = false;

    /**
     * field for FlightTimeInbound
     */
    protected de.bewotec.www.bewotecws.schema.FlightTimeType localFlightTimeInbound;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFlightTimeInboundTracker = false;

    /**
     * field for MinStops
     */
    protected org.apache.axis2.databinding.types.UnsignedInt localMinStops;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMinStopsTracker = false;

    /**
     * field for MaxStops
     */
    protected org.apache.axis2.databinding.types.UnsignedInt localMaxStops;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMaxStopsTracker = false;

    /**
     * field for MinStopsInbound
     */
    protected org.apache.axis2.databinding.types.UnsignedInt localMinStopsInbound;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMinStopsInboundTracker = false;

    /**
     * field for MaxStopsInbound
     */
    protected org.apache.axis2.databinding.types.UnsignedInt localMaxStopsInbound;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMaxStopsInboundTracker = false;

    /**
     * field for Types
     */
    protected de.bewotec.www.bewotecws.schema.Types_type0 localTypes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTypesTracker = false;

    /**
     * field for DepartureAirportsInbound
     */
    protected de.bewotec.www.bewotecws.schema.AirportListType localDepartureAirportsInbound;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDepartureAirportsInboundTracker = false;

    /**
     * field for ArrivalAirportsInbound
     */
    protected de.bewotec.www.bewotecws.schema.AirportListType localArrivalAirportsInbound;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localArrivalAirportsInboundTracker = false;

    public boolean isDepartureAirportsSpecified() {
        return localDepartureAirportsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.AirportListType
     */
    public de.bewotec.www.bewotecws.schema.AirportListType getDepartureAirports() {
        return localDepartureAirports;
    }

    /**
     * Auto generated setter method
     * @param param DepartureAirports
     */
    public void setDepartureAirports(
        de.bewotec.www.bewotecws.schema.AirportListType param) {
        localDepartureAirportsTracker = true;

        this.localDepartureAirports = param;
    }

    public boolean isArrivalAirportsSpecified() {
        return localArrivalAirportsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.AirportListType
     */
    public de.bewotec.www.bewotecws.schema.AirportListType getArrivalAirports() {
        return localArrivalAirports;
    }

    /**
     * Auto generated setter method
     * @param param ArrivalAirports
     */
    public void setArrivalAirports(
        de.bewotec.www.bewotecws.schema.AirportListType param) {
        localArrivalAirportsTracker = true;

        this.localArrivalAirports = param;
    }

    public boolean isFlightNumbersSpecified() {
        return localFlightNumbersTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.FlightNumbers_type0
     */
    public de.bewotec.www.bewotecws.schema.FlightNumbers_type0 getFlightNumbers() {
        return localFlightNumbers;
    }

    /**
     * Auto generated setter method
     * @param param FlightNumbers
     */
    public void setFlightNumbers(
        de.bewotec.www.bewotecws.schema.FlightNumbers_type0 param) {
        localFlightNumbersTracker = true;

        this.localFlightNumbers = param;
    }

    public boolean isDurationMinSpecified() {
        return localDurationMinTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedInt
     */
    public org.apache.axis2.databinding.types.UnsignedInt getDurationMin() {
        return localDurationMin;
    }

    /**
     * Auto generated setter method
     * @param param DurationMin
     */
    public void setDurationMin(
        org.apache.axis2.databinding.types.UnsignedInt param) {
        localDurationMinTracker = param != null;

        this.localDurationMin = param;
    }

    public boolean isDurationMaxSpecified() {
        return localDurationMaxTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedInt
     */
    public org.apache.axis2.databinding.types.UnsignedInt getDurationMax() {
        return localDurationMax;
    }

    /**
     * Auto generated setter method
     * @param param DurationMax
     */
    public void setDurationMax(
        org.apache.axis2.databinding.types.UnsignedInt param) {
        localDurationMaxTracker = param != null;

        this.localDurationMax = param;
    }

    public boolean isNoAlternativesSpecified() {
        return localNoAlternativesTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getNoAlternatives() {
        return localNoAlternatives;
    }

    /**
     * Auto generated setter method
     * @param param NoAlternatives
     */
    public void setNoAlternatives(boolean param) {
        // setting primitive attribute tracker to true
        localNoAlternativesTracker = true;

        this.localNoAlternatives = param;
    }

    public boolean isProductCodesSpecified() {
        return localProductCodesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.ProductCodes_type1
     */
    public de.bewotec.www.bewotecws.schema.ProductCodes_type1 getProductCodes() {
        return localProductCodes;
    }

    /**
     * Auto generated setter method
     * @param param ProductCodes
     */
    public void setProductCodes(
        de.bewotec.www.bewotecws.schema.ProductCodes_type1 param) {
        localProductCodesTracker = param != null;

        this.localProductCodes = param;
    }

    public boolean isFlightTimeSpecified() {
        return localFlightTimeTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.FlightTimeType
     */
    public de.bewotec.www.bewotecws.schema.FlightTimeType getFlightTime() {
        return localFlightTime;
    }

    /**
     * Auto generated setter method
     * @param param FlightTime
     */
    public void setFlightTime(
        de.bewotec.www.bewotecws.schema.FlightTimeType param) {
        localFlightTimeTracker = param != null;

        this.localFlightTime = param;
    }

    public boolean isOpenYawAllowedSpecified() {
        return localOpenYawAllowedTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getOpenYawAllowed() {
        return localOpenYawAllowed;
    }

    /**
     * Auto generated setter method
     * @param param OpenYawAllowed
     */
    public void setOpenYawAllowed(boolean param) {
        // setting primitive attribute tracker to true
        localOpenYawAllowedTracker = true;

        this.localOpenYawAllowed = param;
    }

    public boolean isAirlinesSpecified() {
        return localAirlinesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Airlines_type0
     */
    public de.bewotec.www.bewotecws.schema.Airlines_type0 getAirlines() {
        return localAirlines;
    }

    /**
     * Auto generated setter method
     * @param param Airlines
     */
    public void setAirlines(
        de.bewotec.www.bewotecws.schema.Airlines_type0 param) {
        localAirlinesTracker = param != null;

        this.localAirlines = param;
    }

    public boolean isDurationMinInboundSpecified() {
        return localDurationMinInboundTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedInt
     */
    public org.apache.axis2.databinding.types.UnsignedInt getDurationMinInbound() {
        return localDurationMinInbound;
    }

    /**
     * Auto generated setter method
     * @param param DurationMinInbound
     */
    public void setDurationMinInbound(
        org.apache.axis2.databinding.types.UnsignedInt param) {
        localDurationMinInboundTracker = param != null;

        this.localDurationMinInbound = param;
    }

    public boolean isDurationMaxInboundSpecified() {
        return localDurationMaxInboundTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedInt
     */
    public org.apache.axis2.databinding.types.UnsignedInt getDurationMaxInbound() {
        return localDurationMaxInbound;
    }

    /**
     * Auto generated setter method
     * @param param DurationMaxInbound
     */
    public void setDurationMaxInbound(
        org.apache.axis2.databinding.types.UnsignedInt param) {
        localDurationMaxInboundTracker = param != null;

        this.localDurationMaxInbound = param;
    }

    public boolean isFlightTimeInboundSpecified() {
        return localFlightTimeInboundTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.FlightTimeType
     */
    public de.bewotec.www.bewotecws.schema.FlightTimeType getFlightTimeInbound() {
        return localFlightTimeInbound;
    }

    /**
     * Auto generated setter method
     * @param param FlightTimeInbound
     */
    public void setFlightTimeInbound(
        de.bewotec.www.bewotecws.schema.FlightTimeType param) {
        localFlightTimeInboundTracker = param != null;

        this.localFlightTimeInbound = param;
    }

    public boolean isMinStopsSpecified() {
        return localMinStopsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedInt
     */
    public org.apache.axis2.databinding.types.UnsignedInt getMinStops() {
        return localMinStops;
    }

    /**
     * Auto generated setter method
     * @param param MinStops
     */
    public void setMinStops(
        org.apache.axis2.databinding.types.UnsignedInt param) {
        localMinStopsTracker = param != null;

        this.localMinStops = param;
    }

    public boolean isMaxStopsSpecified() {
        return localMaxStopsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedInt
     */
    public org.apache.axis2.databinding.types.UnsignedInt getMaxStops() {
        return localMaxStops;
    }

    /**
     * Auto generated setter method
     * @param param MaxStops
     */
    public void setMaxStops(
        org.apache.axis2.databinding.types.UnsignedInt param) {
        localMaxStopsTracker = param != null;

        this.localMaxStops = param;
    }

    public boolean isMinStopsInboundSpecified() {
        return localMinStopsInboundTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedInt
     */
    public org.apache.axis2.databinding.types.UnsignedInt getMinStopsInbound() {
        return localMinStopsInbound;
    }

    /**
     * Auto generated setter method
     * @param param MinStopsInbound
     */
    public void setMinStopsInbound(
        org.apache.axis2.databinding.types.UnsignedInt param) {
        localMinStopsInboundTracker = param != null;

        this.localMinStopsInbound = param;
    }

    public boolean isMaxStopsInboundSpecified() {
        return localMaxStopsInboundTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedInt
     */
    public org.apache.axis2.databinding.types.UnsignedInt getMaxStopsInbound() {
        return localMaxStopsInbound;
    }

    /**
     * Auto generated setter method
     * @param param MaxStopsInbound
     */
    public void setMaxStopsInbound(
        org.apache.axis2.databinding.types.UnsignedInt param) {
        localMaxStopsInboundTracker = param != null;

        this.localMaxStopsInbound = param;
    }

    public boolean isTypesSpecified() {
        return localTypesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Types_type0
     */
    public de.bewotec.www.bewotecws.schema.Types_type0 getTypes() {
        return localTypes;
    }

    /**
     * Auto generated setter method
     * @param param Types
     */
    public void setTypes(de.bewotec.www.bewotecws.schema.Types_type0 param) {
        localTypesTracker = param != null;

        this.localTypes = param;
    }

    public boolean isDepartureAirportsInboundSpecified() {
        return localDepartureAirportsInboundTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.AirportListType
     */
    public de.bewotec.www.bewotecws.schema.AirportListType getDepartureAirportsInbound() {
        return localDepartureAirportsInbound;
    }

    /**
     * Auto generated setter method
     * @param param DepartureAirportsInbound
     */
    public void setDepartureAirportsInbound(
        de.bewotec.www.bewotecws.schema.AirportListType param) {
        localDepartureAirportsInboundTracker = true;

        this.localDepartureAirportsInbound = param;
    }

    public boolean isArrivalAirportsInboundSpecified() {
        return localArrivalAirportsInboundTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.AirportListType
     */
    public de.bewotec.www.bewotecws.schema.AirportListType getArrivalAirportsInbound() {
        return localArrivalAirportsInbound;
    }

    /**
     * Auto generated setter method
     * @param param ArrivalAirportsInbound
     */
    public void setArrivalAirportsInbound(
        de.bewotec.www.bewotecws.schema.AirportListType param) {
        localArrivalAirportsInboundTracker = true;

        this.localArrivalAirportsInbound = param;
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
                    namespacePrefix + ":FlightRequestType", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "FlightRequestType", xmlWriter);
            }
        }

        if (localDepartureAirportsTracker) {
            if (localDepartureAirports == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema",
                    "DepartureAirports", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localDepartureAirports.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema",
                        "DepartureAirports"), xmlWriter);
            }
        }

        if (localArrivalAirportsTracker) {
            if (localArrivalAirports == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema",
                    "ArrivalAirports", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localArrivalAirports.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema",
                        "ArrivalAirports"), xmlWriter);
            }
        }

        if (localFlightNumbersTracker) {
            if (localFlightNumbers == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "FlightNumbers",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localFlightNumbers.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema",
                        "FlightNumbers"), xmlWriter);
            }
        }

        if (localDurationMinTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "DurationMin", xmlWriter);

            if (localDurationMin == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "DurationMin cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDurationMin));
            }

            xmlWriter.writeEndElement();
        }

        if (localDurationMaxTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "DurationMax", xmlWriter);

            if (localDurationMax == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "DurationMax cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDurationMax));
            }

            xmlWriter.writeEndElement();
        }

        if (localNoAlternativesTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "NoAlternatives", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "NoAlternatives cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNoAlternatives));
            }

            xmlWriter.writeEndElement();
        }

        if (localProductCodesTracker) {
            if (localProductCodes == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ProductCodes cannot be null!!");
            }

            localProductCodes.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "ProductCodes"),
                xmlWriter);
        }

        if (localFlightTimeTracker) {
            if (localFlightTime == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "FlightTime cannot be null!!");
            }

            localFlightTime.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "FlightTime"),
                xmlWriter);
        }

        if (localOpenYawAllowedTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "OpenYawAllowed", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "OpenYawAllowed cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localOpenYawAllowed));
            }

            xmlWriter.writeEndElement();
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

        if (localDurationMinInboundTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "DurationMinInbound", xmlWriter);

            if (localDurationMinInbound == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "DurationMinInbound cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDurationMinInbound));
            }

            xmlWriter.writeEndElement();
        }

        if (localDurationMaxInboundTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "DurationMaxInbound", xmlWriter);

            if (localDurationMaxInbound == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "DurationMaxInbound cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDurationMaxInbound));
            }

            xmlWriter.writeEndElement();
        }

        if (localFlightTimeInboundTracker) {
            if (localFlightTimeInbound == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "FlightTimeInbound cannot be null!!");
            }

            localFlightTimeInbound.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema",
                    "FlightTimeInbound"), xmlWriter);
        }

        if (localMinStopsTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "MinStops", xmlWriter);

            if (localMinStops == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MinStops cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMinStops));
            }

            xmlWriter.writeEndElement();
        }

        if (localMaxStopsTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "MaxStops", xmlWriter);

            if (localMaxStops == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MaxStops cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMaxStops));
            }

            xmlWriter.writeEndElement();
        }

        if (localMinStopsInboundTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "MinStopsInbound", xmlWriter);

            if (localMinStopsInbound == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MinStopsInbound cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMinStopsInbound));
            }

            xmlWriter.writeEndElement();
        }

        if (localMaxStopsInboundTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "MaxStopsInbound", xmlWriter);

            if (localMaxStopsInbound == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MaxStopsInbound cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMaxStopsInbound));
            }

            xmlWriter.writeEndElement();
        }

        if (localTypesTracker) {
            if (localTypes == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Types cannot be null!!");
            }

            localTypes.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "Types"),
                xmlWriter);
        }

        if (localDepartureAirportsInboundTracker) {
            if (localDepartureAirportsInbound == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema",
                    "DepartureAirportsInbound", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localDepartureAirportsInbound.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema",
                        "DepartureAirportsInbound"), xmlWriter);
            }
        }

        if (localArrivalAirportsInboundTracker) {
            if (localArrivalAirportsInbound == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema",
                    "ArrivalAirportsInbound", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localArrivalAirportsInbound.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema",
                        "ArrivalAirportsInbound"), xmlWriter);
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
        public static FlightRequestType parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            FlightRequestType object = new FlightRequestType();

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

                        if (!"FlightRequestType".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (FlightRequestType) de.bewotec.www.bewotecws.schema.ExtensionMapper.getTypeObject(nsUri,
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
                            "DepartureAirports").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setDepartureAirports(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setDepartureAirports(de.bewotec.www.bewotecws.schema.AirportListType.Factory.parse(
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
                            "ArrivalAirports").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setArrivalAirports(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setArrivalAirports(de.bewotec.www.bewotecws.schema.AirportListType.Factory.parse(
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
                            "FlightNumbers").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setFlightNumbers(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setFlightNumbers(de.bewotec.www.bewotecws.schema.FlightNumbers_type0.Factory.parse(
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
                            "DurationMin").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "DurationMin" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDurationMin(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(
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
                            "DurationMax").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "DurationMax" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDurationMax(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(
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
                            "NoAlternatives").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "NoAlternatives" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNoAlternatives(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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
                            "ProductCodes").equals(reader.getName())) {
                    object.setProductCodes(de.bewotec.www.bewotecws.schema.ProductCodes_type1.Factory.parse(
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
                            "FlightTime").equals(reader.getName())) {
                    object.setFlightTime(de.bewotec.www.bewotecws.schema.FlightTimeType.Factory.parse(
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
                            "OpenYawAllowed").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "OpenYawAllowed" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOpenYawAllowed(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

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
                    object.setAirlines(de.bewotec.www.bewotecws.schema.Airlines_type0.Factory.parse(
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
                            "DurationMinInbound").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "DurationMinInbound" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDurationMinInbound(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(
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
                            "DurationMaxInbound").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "DurationMaxInbound" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDurationMaxInbound(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(
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
                            "FlightTimeInbound").equals(reader.getName())) {
                    object.setFlightTimeInbound(de.bewotec.www.bewotecws.schema.FlightTimeType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "MinStops").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MinStops" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMinStops(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "MaxStops").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MaxStops" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMaxStops(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(
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
                            "MinStopsInbound").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MinStopsInbound" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMinStopsInbound(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(
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
                            "MaxStopsInbound").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MaxStopsInbound" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMaxStopsInbound(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Types").equals(
                            reader.getName())) {
                    object.setTypes(de.bewotec.www.bewotecws.schema.Types_type0.Factory.parse(
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
                            "DepartureAirportsInbound").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setDepartureAirportsInbound(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setDepartureAirportsInbound(de.bewotec.www.bewotecws.schema.AirportListType.Factory.parse(
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
                            "ArrivalAirportsInbound").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setArrivalAirportsInbound(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setArrivalAirportsInbound(de.bewotec.www.bewotecws.schema.AirportListType.Factory.parse(
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
