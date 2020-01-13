/**
 * ProductGroupType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package de.bewotec.www.bewotecws.schema;


/**
 *  ProductGroupType bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ProductGroupType implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = ProductGroupType
       Namespace URI = http://www.bewotec.de/bewotecws/Schema
       Namespace Prefix = ns1
     */

    /**
     * field for Id
     */
    protected java.lang.String localId;

    /**
     * field for CountProductsInGroup
     */
    protected int localCountProductsInGroup;

    /**
     * field for Name
     */
    protected java.lang.String localName;

    /**
     * field for GiataCityIds
     */
    protected de.bewotec.www.bewotecws.schema.GiataCityIds_type0 localGiataCityIds;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGiataCityIdsTracker = false;

    /**
     * field for Airports
     */
    protected de.bewotec.www.bewotecws.schema.Airports_type0 localAirports;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAirportsTracker = false;

    /**
     * field for TopProducts
     */
    protected de.bewotec.www.bewotecws.schema.TopProducts_type0 localTopProducts;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTopProductsTracker = false;

    /**
     * field for ProductGroups
     */
    protected de.bewotec.www.bewotecws.schema.ProductGroups_type1 localProductGroups;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localProductGroupsTracker = false;

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getId() {
        return localId;
    }

    /**
     * Auto generated setter method
     * @param param Id
     */
    public void setId(java.lang.String param) {
        this.localId = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getCountProductsInGroup() {
        return localCountProductsInGroup;
    }

    /**
     * Auto generated setter method
     * @param param CountProductsInGroup
     */
    public void setCountProductsInGroup(int param) {
        this.localCountProductsInGroup = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     * @param param Name
     */
    public void setName(java.lang.String param) {
        this.localName = param;
    }

    public boolean isGiataCityIdsSpecified() {
        return localGiataCityIdsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.GiataCityIds_type0
     */
    public de.bewotec.www.bewotecws.schema.GiataCityIds_type0 getGiataCityIds() {
        return localGiataCityIds;
    }

    /**
     * Auto generated setter method
     * @param param GiataCityIds
     */
    public void setGiataCityIds(
        de.bewotec.www.bewotecws.schema.GiataCityIds_type0 param) {
        localGiataCityIdsTracker = param != null;

        this.localGiataCityIds = param;
    }

    public boolean isAirportsSpecified() {
        return localAirportsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Airports_type0
     */
    public de.bewotec.www.bewotecws.schema.Airports_type0 getAirports() {
        return localAirports;
    }

    /**
     * Auto generated setter method
     * @param param Airports
     */
    public void setAirports(
        de.bewotec.www.bewotecws.schema.Airports_type0 param) {
        localAirportsTracker = param != null;

        this.localAirports = param;
    }

    public boolean isTopProductsSpecified() {
        return localTopProductsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.TopProducts_type0
     */
    public de.bewotec.www.bewotecws.schema.TopProducts_type0 getTopProducts() {
        return localTopProducts;
    }

    /**
     * Auto generated setter method
     * @param param TopProducts
     */
    public void setTopProducts(
        de.bewotec.www.bewotecws.schema.TopProducts_type0 param) {
        localTopProductsTracker = param != null;

        this.localTopProducts = param;
    }

    public boolean isProductGroupsSpecified() {
        return localProductGroupsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.ProductGroups_type1
     */
    public de.bewotec.www.bewotecws.schema.ProductGroups_type1 getProductGroups() {
        return localProductGroups;
    }

    /**
     * Auto generated setter method
     * @param param ProductGroups
     */
    public void setProductGroups(
        de.bewotec.www.bewotecws.schema.ProductGroups_type1 param) {
        localProductGroupsTracker = true;

        this.localProductGroups = param;
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
                    namespacePrefix + ":ProductGroupType", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "ProductGroupType", xmlWriter);
            }
        }

        namespace = "http://www.bewotec.de/bewotecws/Schema";
        writeStartElement(null, namespace, "Id", xmlWriter);

        if (localId == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "Id cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localId);
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.bewotec.de/bewotecws/Schema";
        writeStartElement(null, namespace, "CountProductsInGroup", xmlWriter);

        if (localCountProductsInGroup == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "CountProductsInGroup cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCountProductsInGroup));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.bewotec.de/bewotecws/Schema";
        writeStartElement(null, namespace, "Name", xmlWriter);

        if (localName == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                "Name cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localName);
        }

        xmlWriter.writeEndElement();

        if (localGiataCityIdsTracker) {
            if (localGiataCityIds == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "GiataCityIds cannot be null!!");
            }

            localGiataCityIds.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "GiataCityIds"),
                xmlWriter);
        }

        if (localAirportsTracker) {
            if (localAirports == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Airports cannot be null!!");
            }

            localAirports.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "Airports"),
                xmlWriter);
        }

        if (localTopProductsTracker) {
            if (localTopProducts == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "TopProducts cannot be null!!");
            }

            localTopProducts.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "TopProducts"),
                xmlWriter);
        }

        if (localProductGroupsTracker) {
            if (localProductGroups == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "ProductGroups",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localProductGroups.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema",
                        "ProductGroups"), xmlWriter);
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
        public static ProductGroupType parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ProductGroupType object = new ProductGroupType();

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

                        if (!"ProductGroupType".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (ProductGroupType) de.bewotec.www.bewotecws.schema.ExtensionMapper.getTypeObject(nsUri,
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
                            "http://www.bewotec.de/bewotecws/Schema", "Id").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Id" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "CountProductsInGroup").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "CountProductsInGroup" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCountProductsInGroup(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Name").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Name" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "GiataCityIds").equals(reader.getName())) {
                    object.setGiataCityIds(de.bewotec.www.bewotecws.schema.GiataCityIds_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Airports").equals(
                            reader.getName())) {
                    object.setAirports(de.bewotec.www.bewotecws.schema.Airports_type0.Factory.parse(
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
                            "TopProducts").equals(reader.getName())) {
                    object.setTopProducts(de.bewotec.www.bewotecws.schema.TopProducts_type0.Factory.parse(
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
                            "ProductGroups").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setProductGroups(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setProductGroups(de.bewotec.www.bewotecws.schema.ProductGroups_type1.Factory.parse(
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
