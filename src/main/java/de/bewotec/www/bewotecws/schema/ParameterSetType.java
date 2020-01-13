/**
 * ParameterSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package de.bewotec.www.bewotecws.schema;


/**
 *  ParameterSetType bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ParameterSetType implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = ParameterSetType
       Namespace URI = http://www.bewotec.de/bewotecws/Schema
       Namespace Prefix = ns1
     */

    /**
     * field for CrsSystem
     */
    protected de.bewotec.www.bewotecws.schema.CrsSystemEnum localCrsSystem;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCrsSystemTracker = false;

    /**
     * field for AgencyCode
     */
    protected java.lang.String localAgencyCode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAgencyCodeTracker = false;

    /**
     * field for SalesChannel
     */
    protected de.bewotec.www.bewotecws.schema.SalesChannelEnum localSalesChannel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSalesChannelTracker = false;

    /**
     * field for DistributionChannel
     */
    protected de.bewotec.www.bewotecws.schema.DistributionChannelEnum localDistributionChannel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDistributionChannelTracker = false;

    /**
     * field for SalesMarket
     */
    protected java.lang.String localSalesMarket;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSalesMarketTracker = false;

    public boolean isCrsSystemSpecified() {
        return localCrsSystemTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.CrsSystemEnum
     */
    public de.bewotec.www.bewotecws.schema.CrsSystemEnum getCrsSystem() {
        return localCrsSystem;
    }

    /**
     * Auto generated setter method
     * @param param CrsSystem
     */
    public void setCrsSystem(
        de.bewotec.www.bewotecws.schema.CrsSystemEnum param) {
        localCrsSystemTracker = param != null;

        this.localCrsSystem = param;
    }

    public boolean isAgencyCodeSpecified() {
        return localAgencyCodeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAgencyCode() {
        return localAgencyCode;
    }

    /**
     * Auto generated setter method
     * @param param AgencyCode
     */
    public void setAgencyCode(java.lang.String param) {
        localAgencyCodeTracker = param != null;

        this.localAgencyCode = param;
    }

    public boolean isSalesChannelSpecified() {
        return localSalesChannelTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.SalesChannelEnum
     */
    public de.bewotec.www.bewotecws.schema.SalesChannelEnum getSalesChannel() {
        return localSalesChannel;
    }

    /**
     * Auto generated setter method
     * @param param SalesChannel
     */
    public void setSalesChannel(
        de.bewotec.www.bewotecws.schema.SalesChannelEnum param) {
        localSalesChannelTracker = param != null;

        this.localSalesChannel = param;
    }

    public boolean isDistributionChannelSpecified() {
        return localDistributionChannelTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.DistributionChannelEnum
     */
    public de.bewotec.www.bewotecws.schema.DistributionChannelEnum getDistributionChannel() {
        return localDistributionChannel;
    }

    /**
     * Auto generated setter method
     * @param param DistributionChannel
     */
    public void setDistributionChannel(
        de.bewotec.www.bewotecws.schema.DistributionChannelEnum param) {
        localDistributionChannelTracker = param != null;

        this.localDistributionChannel = param;
    }

    public boolean isSalesMarketSpecified() {
        return localSalesMarketTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSalesMarket() {
        return localSalesMarket;
    }

    /**
     * Auto generated setter method
     * @param param SalesMarket
     */
    public void setSalesMarket(java.lang.String param) {
        localSalesMarketTracker = param != null;

        this.localSalesMarket = param;
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
                    namespacePrefix + ":ParameterSetType", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "ParameterSetType", xmlWriter);
            }
        }

        if (localCrsSystemTracker) {
            if (localCrsSystem == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CrsSystem cannot be null!!");
            }

            localCrsSystem.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "CrsSystem"),
                xmlWriter);
        }

        if (localAgencyCodeTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "AgencyCode", xmlWriter);

            if (localAgencyCode == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "AgencyCode cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAgencyCode);
            }

            xmlWriter.writeEndElement();
        }

        if (localSalesChannelTracker) {
            if (localSalesChannel == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SalesChannel cannot be null!!");
            }

            localSalesChannel.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "SalesChannel"),
                xmlWriter);
        }

        if (localDistributionChannelTracker) {
            if (localDistributionChannel == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "DistributionChannel cannot be null!!");
            }

            localDistributionChannel.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema",
                    "DistributionChannel"), xmlWriter);
        }

        if (localSalesMarketTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "SalesMarket", xmlWriter);

            if (localSalesMarket == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SalesMarket cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSalesMarket);
            }

            xmlWriter.writeEndElement();
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
        public static ParameterSetType parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ParameterSetType object = new ParameterSetType();

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

                        if (!"ParameterSetType".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (ParameterSetType) de.bewotec.www.bewotecws.schema.ExtensionMapper.getTypeObject(nsUri,
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
                            "CrsSystem").equals(reader.getName())) {
                    object.setCrsSystem(de.bewotec.www.bewotecws.schema.CrsSystemEnum.Factory.parse(
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
                            "AgencyCode").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "AgencyCode" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAgencyCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "SalesChannel").equals(reader.getName())) {
                    object.setSalesChannel(de.bewotec.www.bewotecws.schema.SalesChannelEnum.Factory.parse(
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
                            "DistributionChannel").equals(reader.getName())) {
                    object.setDistributionChannel(de.bewotec.www.bewotecws.schema.DistributionChannelEnum.Factory.parse(
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
                            "SalesMarket").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "SalesMarket" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSalesMarket(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

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
