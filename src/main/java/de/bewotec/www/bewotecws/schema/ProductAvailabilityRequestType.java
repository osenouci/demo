/**
 * ProductAvailabilityRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package de.bewotec.www.bewotecws.schema;


/**
 *  ProductAvailabilityRequestType bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ProductAvailabilityRequestType extends de.bewotec.www.bewotecws.schema.ProductRequestType
    implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = ProductAvailabilityRequestType
       Namespace URI = http://www.bewotec.de/bewotecws/Schema
       Namespace Prefix = ns1
     */

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

        java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                "http://www.bewotec.de/bewotecws/Schema");

        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", namespacePrefix + ":ProductAvailabilityRequestType",
                xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", "ProductAvailabilityRequestType", xmlWriter);
        }

        namespace = "http://www.bewotec.de/bewotecws/Schema";
        writeStartElement(null, namespace, "AuthKey", xmlWriter);

        if (localAuthKey == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "AuthKey cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localAuthKey);
        }

        xmlWriter.writeEndElement();

        if (localCurrencyTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "Currency", xmlWriter);

            if (localCurrency == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Currency cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCurrency);
            }

            xmlWriter.writeEndElement();
        }

        if (localLangTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "Lang", xmlWriter);

            if (localLang == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Lang cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localLang);
            }

            xmlWriter.writeEndElement();
        }

        if (localProductType == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "ProductType cannot be null!!");
        }

        localProductType.serialize(new javax.xml.namespace.QName(
                "http://www.bewotec.de/bewotecws/Schema", "ProductType"),
            xmlWriter);

        if (localTouroperatorCodesTracker) {
            if (localTouroperatorCodes == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "TouroperatorCodes cannot be null!!");
            }

            localTouroperatorCodes.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema",
                    "TouroperatorCodes"), xmlWriter);
        }

        if (localTreeIdTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "TreeId", xmlWriter);

            if (localTreeId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TreeId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTreeId);
            }

            xmlWriter.writeEndElement();
        }

        if (localAccommodationTracker) {
            if (localAccommodation == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "Accommodation",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localAccommodation.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema",
                        "Accommodation"), xmlWriter);
            }
        }

        if (localFlightTracker) {
            if (localFlight == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "Flight",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localFlight.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "Flight"),
                    xmlWriter);
            }
        }

        if (localExtraTracker) {
            if (localExtra == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "Extra", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localExtra.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "Extra"),
                    xmlWriter);
            }
        }

        if (localCruiseTracker) {
            if (localCruise == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Cruise cannot be null!!");
            }

            localCruise.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "Cruise"),
                xmlWriter);
        }

        if (localPassengers == null) {
            writeStartElement(null, "http://www.bewotec.de/bewotecws/Schema",
                "Passengers", xmlWriter);

            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "nil", "1", xmlWriter);
            xmlWriter.writeEndElement();
        } else {
            localPassengers.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "Passengers"),
                xmlWriter);
        }

        if (localPeriod == null) {
            writeStartElement(null, "http://www.bewotec.de/bewotecws/Schema",
                "Period", xmlWriter);

            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "nil", "1", xmlWriter);
            xmlWriter.writeEndElement();
        } else {
            localPeriod.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "Period"),
                xmlWriter);
        }

        if (localGeoLocationTracker) {
            if (localGeoLocation == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "GeoLocation",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localGeoLocation.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "GeoLocation"),
                    xmlWriter);
            }
        }

        if (localGroupIdsTracker) {
            if (localGroupIds == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "GroupIds",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localGroupIds.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "GroupIds"),
                    xmlWriter);
            }
        }

        if (localPriceTracker) {
            if (localPrice == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "Price", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localPrice.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "Price"),
                    xmlWriter);
            }
        }

        if (localRequestBookingTracker) {
            if (localRequestBooking == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "RequestBooking",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localRequestBooking.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema",
                        "RequestBooking"), xmlWriter);
            }
        }

        if (localResultsFromTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "ResultsFrom", xmlWriter);

            if (localResultsFrom == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ResultsFrom cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localResultsFrom);
            }

            xmlWriter.writeEndElement();
        }

        if (localResultsToTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "ResultsTo", xmlWriter);

            if (localResultsTo == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ResultsTo cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localResultsTo);
            }

            xmlWriter.writeEndElement();
        }

        if (localResultsTotalTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "ResultsTotal", xmlWriter);

            if (localResultsTotal == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ResultsTotal cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localResultsTotal);
            }

            xmlWriter.writeEndElement();
        }

        if (localDetailLevelTracker) {
            if (localDetailLevel == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "DetailLevel cannot be null!!");
            }

            localDetailLevel.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "DetailLevel"),
                xmlWriter);
        }

        if (localSortedByTracker) {
            if (localSortedBy == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SortedBy cannot be null!!");
            }

            localSortedBy.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "SortedBy"),
                xmlWriter);
        }

        if (localDescendingSortTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "DescendingSort", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "DescendingSort cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDescendingSort));
            }

            xmlWriter.writeEndElement();
        }

        if (localResultSetTracker) {
            if (localResultSet == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ResultSet cannot be null!!");
            }

            localResultSet.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "ResultSet"),
                xmlWriter);
        }

        if (localMetaDataTracker) {
            if (localMetaData == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "MetaData cannot be null!!");
            }

            localMetaData.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "MetaData"),
                xmlWriter);
        }

        if (localShowSoldOutTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "ShowSoldOut", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ShowSoldOut cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localShowSoldOut));
            }

            xmlWriter.writeEndElement();
        }

        if (localParameterSetTracker) {
            if (localParameterSet == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ParameterSet cannot be null!!");
            }

            localParameterSet.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "ParameterSet"),
                xmlWriter);
        }

        if (localRequestIdTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "RequestId", xmlWriter);

            if (localRequestId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "RequestId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localRequestId);
            }

            xmlWriter.writeEndElement();
        }

        if (localPeriodEmptyStayTracker) {
            if (localPeriodEmptyStay == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "PeriodEmptyStay cannot be null!!");
            }

            localPeriodEmptyStay.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "PeriodEmptyStay"),
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
        public static ProductAvailabilityRequestType parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ProductAvailabilityRequestType object = new ProductAvailabilityRequestType();

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

                        if (!"ProductAvailabilityRequestType".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (ProductAvailabilityRequestType) de.bewotec.www.bewotecws.schema.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement()) {
                        if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "AuthKey").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "AuthKey" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setAuthKey(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "Currency").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Currency" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setCurrency(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "Lang").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Lang" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setLang(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "ProductType").equals(reader.getName())) {
                            object.setProductType(de.bewotec.www.bewotecws.schema.ProductEnum.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "TouroperatorCodes").equals(
                                    reader.getName())) {
                            object.setTouroperatorCodes(de.bewotec.www.bewotecws.schema.TouroperatorCodes_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "TreeId").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "TreeId" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setTreeId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "Accommodation").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                object.setAccommodation(null);
                                reader.next();

                                reader.next();
                            } else {
                                object.setAccommodation(de.bewotec.www.bewotecws.schema.AccommodationRequestType.Factory.parse(
                                        reader));

                                reader.next();
                            }
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "Flight").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                object.setFlight(null);
                                reader.next();

                                reader.next();
                            } else {
                                object.setFlight(de.bewotec.www.bewotecws.schema.FlightRequestType.Factory.parse(
                                        reader));

                                reader.next();
                            }
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "Extra").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                object.setExtra(null);
                                reader.next();

                                reader.next();
                            } else {
                                object.setExtra(de.bewotec.www.bewotecws.schema.ExtraRequestType.Factory.parse(
                                        reader));

                                reader.next();
                            }
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "Cruise").equals(reader.getName())) {
                            object.setCruise(de.bewotec.www.bewotecws.schema.CruiseRequestType.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "Passengers").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                object.setPassengers(null);
                                reader.next();

                                reader.next();
                            } else {
                                object.setPassengers(de.bewotec.www.bewotecws.schema.Passengers_type2.Factory.parse(
                                        reader));

                                reader.next();
                            }
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "Period").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                object.setPeriod(null);
                                reader.next();

                                reader.next();
                            } else {
                                object.setPeriod(de.bewotec.www.bewotecws.schema.PeriodRequestType.Factory.parse(
                                        reader));

                                reader.next();
                            }
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "GeoLocation").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                object.setGeoLocation(null);
                                reader.next();

                                reader.next();
                            } else {
                                object.setGeoLocation(de.bewotec.www.bewotecws.schema.GeoLocationRequestType.Factory.parse(
                                        reader));

                                reader.next();
                            }
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "GroupIds").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                object.setGroupIds(null);
                                reader.next();

                                reader.next();
                            } else {
                                object.setGroupIds(de.bewotec.www.bewotecws.schema.GroupIds_type0.Factory.parse(
                                        reader));

                                reader.next();
                            }
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "Price").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                object.setPrice(null);
                                reader.next();

                                reader.next();
                            } else {
                                object.setPrice(de.bewotec.www.bewotecws.schema.PriceRequestType.Factory.parse(
                                        reader));

                                reader.next();
                            }
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "RequestBooking").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                object.setRequestBooking(null);
                                reader.next();

                                reader.next();
                            } else {
                                object.setRequestBooking(de.bewotec.www.bewotecws.schema.IncludeExcludeOnlyEnum.Factory.parse(
                                        reader));

                                reader.next();
                            }
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "ResultsFrom").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ResultsFrom" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setResultsFrom(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "ResultsTo").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ResultsTo" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setResultsTo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "ResultsTotal").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ResultsTotal" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setResultsTotal(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "DetailLevel").equals(reader.getName())) {
                            object.setDetailLevel(de.bewotec.www.bewotecws.schema.DetailLevel_type1.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "SortedBy").equals(reader.getName())) {
                            object.setSortedBy(de.bewotec.www.bewotecws.schema.SortedByEnum.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "DescendingSort").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "DescendingSort" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDescendingSort(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "ResultSet").equals(reader.getName())) {
                            object.setResultSet(de.bewotec.www.bewotecws.schema.ResultSetEnum.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "MetaData").equals(reader.getName())) {
                            object.setMetaData(de.bewotec.www.bewotecws.schema.MetaDataType.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "ShowSoldOut").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ShowSoldOut" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setShowSoldOut(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "ParameterSet").equals(reader.getName())) {
                            object.setParameterSet(de.bewotec.www.bewotecws.schema.ParameterSetType.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "RequestId").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "RequestId" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setRequestId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://www.bewotec.de/bewotecws/Schema",
                                    "PeriodEmptyStay").equals(reader.getName())) {
                            object.setPeriodEmptyStay(de.bewotec.www.bewotecws.schema.PeriodEmptyStayType.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else {
                            // 3 - A start element we are not expecting indicates an invalid parameter was passed
                            throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());
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
