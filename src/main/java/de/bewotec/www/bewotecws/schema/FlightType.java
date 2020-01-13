/**
 * FlightType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package de.bewotec.www.bewotecws.schema;


/**
 *  FlightType bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class FlightType implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = FlightType
       Namespace URI = http://www.bewotec.de/bewotecws/Schema
       Namespace Prefix = ns1
     */

    /**
     * field for StartAirport
     */
    protected de.bewotec.www.bewotecws.schema.AirportType localStartAirport;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStartAirportTracker = false;

    /**
     * field for EndAirport
     */
    protected de.bewotec.www.bewotecws.schema.AirportType localEndAirport;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEndAirportTracker = false;

    /**
     * field for Start
     */
    protected java.util.Calendar localStart;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStartTracker = false;

    /**
     * field for End
     */
    protected java.util.Calendar localEnd;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEndTracker = false;

    /**
     * field for Airline
     */
    protected java.lang.String localAirline;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAirlineTracker = false;

    /**
     * field for BookingClass
     */
    protected java.lang.String localBookingClass;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBookingClassTracker = false;

    /**
     * field for BookingCode
     */
    protected java.lang.String localBookingCode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBookingCodeTracker = false;

    /**
     * field for FlightClass
     */
    protected de.bewotec.www.bewotecws.schema.FlightClassEnum localFlightClass;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFlightClassTracker = false;

    /**
     * field for Overnight
     */
    protected boolean localOvernight;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOvernightTracker = false;

    /**
     * field for Stops
     */
    protected org.apache.axis2.databinding.types.UnsignedByte localStops;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStopsTracker = false;

    /**
     * field for FlightSegments
     */
    protected de.bewotec.www.bewotecws.schema.FlightSegments_type0 localFlightSegments;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFlightSegmentsTracker = false;

    /**
     * field for Outbound
     */
    protected boolean localOutbound;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOutboundTracker = false;

    /**
     * field for Baggages
     */
    protected de.bewotec.www.bewotecws.schema.Baggages_type0 localBaggages;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBaggagesTracker = false;

    public boolean isStartAirportSpecified() {
        return localStartAirportTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.AirportType
     */
    public de.bewotec.www.bewotecws.schema.AirportType getStartAirport() {
        return localStartAirport;
    }

    /**
     * Auto generated setter method
     * @param param StartAirport
     */
    public void setStartAirport(
        de.bewotec.www.bewotecws.schema.AirportType param) {
        localStartAirportTracker = param != null;

        this.localStartAirport = param;
    }

    public boolean isEndAirportSpecified() {
        return localEndAirportTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.AirportType
     */
    public de.bewotec.www.bewotecws.schema.AirportType getEndAirport() {
        return localEndAirport;
    }

    /**
     * Auto generated setter method
     * @param param EndAirport
     */
    public void setEndAirport(de.bewotec.www.bewotecws.schema.AirportType param) {
        localEndAirportTracker = param != null;

        this.localEndAirport = param;
    }

    public boolean isStartSpecified() {
        return localStartTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getStart() {
        return localStart;
    }

    /**
     * Auto generated setter method
     * @param param Start
     */
    public void setStart(java.util.Calendar param) {
        localStartTracker = param != null;

        this.localStart = param;
    }

    public boolean isEndSpecified() {
        return localEndTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getEnd() {
        return localEnd;
    }

    /**
     * Auto generated setter method
     * @param param End
     */
    public void setEnd(java.util.Calendar param) {
        localEndTracker = param != null;

        this.localEnd = param;
    }

    public boolean isAirlineSpecified() {
        return localAirlineTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAirline() {
        return localAirline;
    }

    /**
     * Auto generated setter method
     * @param param Airline
     */
    public void setAirline(java.lang.String param) {
        localAirlineTracker = param != null;

        this.localAirline = param;
    }

    public boolean isBookingClassSpecified() {
        return localBookingClassTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBookingClass() {
        return localBookingClass;
    }

    /**
     * Auto generated setter method
     * @param param BookingClass
     */
    public void setBookingClass(java.lang.String param) {
        localBookingClassTracker = param != null;

        this.localBookingClass = param;
    }

    public boolean isBookingCodeSpecified() {
        return localBookingCodeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBookingCode() {
        return localBookingCode;
    }

    /**
     * Auto generated setter method
     * @param param BookingCode
     */
    public void setBookingCode(java.lang.String param) {
        localBookingCodeTracker = param != null;

        this.localBookingCode = param;
    }

    public boolean isFlightClassSpecified() {
        return localFlightClassTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.FlightClassEnum
     */
    public de.bewotec.www.bewotecws.schema.FlightClassEnum getFlightClass() {
        return localFlightClass;
    }

    /**
     * Auto generated setter method
     * @param param FlightClass
     */
    public void setFlightClass(
        de.bewotec.www.bewotecws.schema.FlightClassEnum param) {
        localFlightClassTracker = param != null;

        this.localFlightClass = param;
    }

    public boolean isOvernightSpecified() {
        return localOvernightTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getOvernight() {
        return localOvernight;
    }

    /**
     * Auto generated setter method
     * @param param Overnight
     */
    public void setOvernight(boolean param) {
        // setting primitive attribute tracker to true
        localOvernightTracker = true;

        this.localOvernight = param;
    }

    public boolean isStopsSpecified() {
        return localStopsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedByte
     */
    public org.apache.axis2.databinding.types.UnsignedByte getStops() {
        return localStops;
    }

    /**
     * Auto generated setter method
     * @param param Stops
     */
    public void setStops(org.apache.axis2.databinding.types.UnsignedByte param) {
        localStopsTracker = param != null;

        this.localStops = param;
    }

    public boolean isFlightSegmentsSpecified() {
        return localFlightSegmentsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.FlightSegments_type0
     */
    public de.bewotec.www.bewotecws.schema.FlightSegments_type0 getFlightSegments() {
        return localFlightSegments;
    }

    /**
     * Auto generated setter method
     * @param param FlightSegments
     */
    public void setFlightSegments(
        de.bewotec.www.bewotecws.schema.FlightSegments_type0 param) {
        localFlightSegmentsTracker = true;

        this.localFlightSegments = param;
    }

    public boolean isOutboundSpecified() {
        return localOutboundTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getOutbound() {
        return localOutbound;
    }

    /**
     * Auto generated setter method
     * @param param Outbound
     */
    public void setOutbound(boolean param) {
        // setting primitive attribute tracker to true
        localOutboundTracker = true;

        this.localOutbound = param;
    }

    public boolean isBaggagesSpecified() {
        return localBaggagesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Baggages_type0
     */
    public de.bewotec.www.bewotecws.schema.Baggages_type0 getBaggages() {
        return localBaggages;
    }

    /**
     * Auto generated setter method
     * @param param Baggages
     */
    public void setBaggages(
        de.bewotec.www.bewotecws.schema.Baggages_type0 param) {
        localBaggagesTracker = param != null;

        this.localBaggages = param;
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
                    namespacePrefix + ":FlightType", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "FlightType", xmlWriter);
            }
        }

        if (localStartAirportTracker) {
            if (localStartAirport == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "StartAirport cannot be null!!");
            }

            localStartAirport.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "StartAirport"),
                xmlWriter);
        }

        if (localEndAirportTracker) {
            if (localEndAirport == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "EndAirport cannot be null!!");
            }

            localEndAirport.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "EndAirport"),
                xmlWriter);
        }

        if (localStartTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "Start", xmlWriter);

            if (localStart == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Start cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localStart));
            }

            xmlWriter.writeEndElement();
        }

        if (localEndTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "End", xmlWriter);

            if (localEnd == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "End cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localEnd));
            }

            xmlWriter.writeEndElement();
        }

        if (localAirlineTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "Airline", xmlWriter);

            if (localAirline == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Airline cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAirline);
            }

            xmlWriter.writeEndElement();
        }

        if (localBookingClassTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "BookingClass", xmlWriter);

            if (localBookingClass == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "BookingClass cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localBookingClass);
            }

            xmlWriter.writeEndElement();
        }

        if (localBookingCodeTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "BookingCode", xmlWriter);

            if (localBookingCode == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "BookingCode cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localBookingCode);
            }

            xmlWriter.writeEndElement();
        }

        if (localFlightClassTracker) {
            if (localFlightClass == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "FlightClass cannot be null!!");
            }

            localFlightClass.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "FlightClass"),
                xmlWriter);
        }

        if (localOvernightTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "Overnight", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Overnight cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localOvernight));
            }

            xmlWriter.writeEndElement();
        }

        if (localStopsTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "Stops", xmlWriter);

            if (localStops == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Stops cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localStops));
            }

            xmlWriter.writeEndElement();
        }

        if (localFlightSegmentsTracker) {
            if (localFlightSegments == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "FlightSegments",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localFlightSegments.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema",
                        "FlightSegments"), xmlWriter);
            }
        }

        if (localOutboundTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "Outbound", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Outbound cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localOutbound));
            }

            xmlWriter.writeEndElement();
        }

        if (localBaggagesTracker) {
            if (localBaggages == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Baggages cannot be null!!");
            }

            localBaggages.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "Baggages"),
                xmlWriter);
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
        public static FlightType parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            FlightType object = new FlightType();

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

                        if (!"FlightType".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (FlightType) de.bewotec.www.bewotecws.schema.ExtensionMapper.getTypeObject(nsUri,
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
                            "StartAirport").equals(reader.getName())) {
                    object.setStartAirport(de.bewotec.www.bewotecws.schema.AirportType.Factory.parse(
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
                            "EndAirport").equals(reader.getName())) {
                    object.setEndAirport(de.bewotec.www.bewotecws.schema.AirportType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Start").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Start" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setStart(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "End").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "End" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEnd(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Airline").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Airline" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAirline(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "BookingClass").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "BookingClass" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBookingClass(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "BookingCode").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "BookingCode" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBookingCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "FlightClass").equals(reader.getName())) {
                    object.setFlightClass(de.bewotec.www.bewotecws.schema.FlightClassEnum.Factory.parse(
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
                            "Overnight").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Overnight" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOvernight(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Stops").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Stops" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setStops(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedByte(
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
                            "FlightSegments").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setFlightSegments(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setFlightSegments(de.bewotec.www.bewotecws.schema.FlightSegments_type0.Factory.parse(
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
                            "http://www.bewotec.de/bewotecws/Schema", "Outbound").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Outbound" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOutbound(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Baggages").equals(
                            reader.getName())) {
                    object.setBaggages(de.bewotec.www.bewotecws.schema.Baggages_type0.Factory.parse(
                            reader));

                    reader.next();
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
