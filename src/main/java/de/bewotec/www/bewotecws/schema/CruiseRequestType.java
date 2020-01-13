/**
 * CruiseRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package de.bewotec.www.bewotecws.schema;


/**
 *  CruiseRequestType bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class CruiseRequestType implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = CruiseRequestType
       Namespace URI = http://www.bewotec.de/bewotecws/Schema
       Namespace Prefix = ns1
     */

    /**
     * field for ProductCodes
     */
    protected de.bewotec.www.bewotecws.schema.ProductCodes_type2 localProductCodes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localProductCodesTracker = false;

    /**
     * field for Identities
     */
    protected de.bewotec.www.bewotecws.schema.Identities_type4 localIdentities;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIdentitiesTracker = false;

    /**
     * field for Name
     */
    protected java.lang.String localName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNameTracker = false;

    /**
     * field for MinCategory
     */
    protected float localMinCategory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMinCategoryTracker = false;

    /**
     * field for Cabins
     */
    protected de.bewotec.www.bewotecws.schema.Cabins_type1 localCabins;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCabinsTracker = false;

    /**
     * field for Boards
     */
    protected de.bewotec.www.bewotecws.schema.Boards_type2 localBoards;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBoardsTracker = false;

    /**
     * field for AccommodationProperties
     */
    protected de.bewotec.www.bewotecws.schema.AccommodationProperties_type2 localAccommodationProperties;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAccommodationPropertiesTracker = false;

    /**
     * field for Recommendations
     */
    protected de.bewotec.www.bewotecws.schema.Recommendations_type3 localRecommendations;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRecommendationsTracker = false;

    /**
     * field for Ports
     */
    protected de.bewotec.www.bewotecws.schema.Ports_type2 localPorts;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPortsTracker = false;

    /**
     * field for DeparturePorts
     */
    protected de.bewotec.www.bewotecws.schema.DeparturePorts_type0 localDeparturePorts;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDeparturePortsTracker = false;

    /**
     * field for ArrivalPorts
     */
    protected de.bewotec.www.bewotecws.schema.ArrivalPorts_type0 localArrivalPorts;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localArrivalPortsTracker = false;

    /**
     * field for TariffTypes
     */
    protected de.bewotec.www.bewotecws.schema.TariffTypes_type1 localTariffTypes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTariffTypesTracker = false;

    public boolean isProductCodesSpecified() {
        return localProductCodesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.ProductCodes_type2
     */
    public de.bewotec.www.bewotecws.schema.ProductCodes_type2 getProductCodes() {
        return localProductCodes;
    }

    /**
     * Auto generated setter method
     * @param param ProductCodes
     */
    public void setProductCodes(
        de.bewotec.www.bewotecws.schema.ProductCodes_type2 param) {
        localProductCodesTracker = true;

        this.localProductCodes = param;
    }

    public boolean isIdentitiesSpecified() {
        return localIdentitiesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Identities_type4
     */
    public de.bewotec.www.bewotecws.schema.Identities_type4 getIdentities() {
        return localIdentities;
    }

    /**
     * Auto generated setter method
     * @param param Identities
     */
    public void setIdentities(
        de.bewotec.www.bewotecws.schema.Identities_type4 param) {
        localIdentitiesTracker = true;

        this.localIdentities = param;
    }

    public boolean isNameSpecified() {
        return localNameTracker;
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
        localNameTracker = true;

        this.localName = param;
    }

    public boolean isMinCategorySpecified() {
        return localMinCategoryTracker;
    }

    /**
     * Auto generated getter method
     * @return float
     */
    public float getMinCategory() {
        return localMinCategory;
    }

    /**
     * Auto generated setter method
     * @param param MinCategory
     */
    public void setMinCategory(float param) {
        localMinCategoryTracker = true;

        this.localMinCategory = param;
    }

    public boolean isCabinsSpecified() {
        return localCabinsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Cabins_type1
     */
    public de.bewotec.www.bewotecws.schema.Cabins_type1 getCabins() {
        return localCabins;
    }

    /**
     * Auto generated setter method
     * @param param Cabins
     */
    public void setCabins(de.bewotec.www.bewotecws.schema.Cabins_type1 param) {
        localCabinsTracker = true;

        this.localCabins = param;
    }

    public boolean isBoardsSpecified() {
        return localBoardsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Boards_type2
     */
    public de.bewotec.www.bewotecws.schema.Boards_type2 getBoards() {
        return localBoards;
    }

    /**
     * Auto generated setter method
     * @param param Boards
     */
    public void setBoards(de.bewotec.www.bewotecws.schema.Boards_type2 param) {
        localBoardsTracker = true;

        this.localBoards = param;
    }

    public boolean isAccommodationPropertiesSpecified() {
        return localAccommodationPropertiesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.AccommodationProperties_type2
     */
    public de.bewotec.www.bewotecws.schema.AccommodationProperties_type2 getAccommodationProperties() {
        return localAccommodationProperties;
    }

    /**
     * Auto generated setter method
     * @param param AccommodationProperties
     */
    public void setAccommodationProperties(
        de.bewotec.www.bewotecws.schema.AccommodationProperties_type2 param) {
        localAccommodationPropertiesTracker = param != null;

        this.localAccommodationProperties = param;
    }

    public boolean isRecommendationsSpecified() {
        return localRecommendationsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Recommendations_type3
     */
    public de.bewotec.www.bewotecws.schema.Recommendations_type3 getRecommendations() {
        return localRecommendations;
    }

    /**
     * Auto generated setter method
     * @param param Recommendations
     */
    public void setRecommendations(
        de.bewotec.www.bewotecws.schema.Recommendations_type3 param) {
        localRecommendationsTracker = param != null;

        this.localRecommendations = param;
    }

    public boolean isPortsSpecified() {
        return localPortsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Ports_type2
     */
    public de.bewotec.www.bewotecws.schema.Ports_type2 getPorts() {
        return localPorts;
    }

    /**
     * Auto generated setter method
     * @param param Ports
     */
    public void setPorts(de.bewotec.www.bewotecws.schema.Ports_type2 param) {
        localPortsTracker = true;

        this.localPorts = param;
    }

    public boolean isDeparturePortsSpecified() {
        return localDeparturePortsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.DeparturePorts_type0
     */
    public de.bewotec.www.bewotecws.schema.DeparturePorts_type0 getDeparturePorts() {
        return localDeparturePorts;
    }

    /**
     * Auto generated setter method
     * @param param DeparturePorts
     */
    public void setDeparturePorts(
        de.bewotec.www.bewotecws.schema.DeparturePorts_type0 param) {
        localDeparturePortsTracker = true;

        this.localDeparturePorts = param;
    }

    public boolean isArrivalPortsSpecified() {
        return localArrivalPortsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.ArrivalPorts_type0
     */
    public de.bewotec.www.bewotecws.schema.ArrivalPorts_type0 getArrivalPorts() {
        return localArrivalPorts;
    }

    /**
     * Auto generated setter method
     * @param param ArrivalPorts
     */
    public void setArrivalPorts(
        de.bewotec.www.bewotecws.schema.ArrivalPorts_type0 param) {
        localArrivalPortsTracker = true;

        this.localArrivalPorts = param;
    }

    public boolean isTariffTypesSpecified() {
        return localTariffTypesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.TariffTypes_type1
     */
    public de.bewotec.www.bewotecws.schema.TariffTypes_type1 getTariffTypes() {
        return localTariffTypes;
    }

    /**
     * Auto generated setter method
     * @param param TariffTypes
     */
    public void setTariffTypes(
        de.bewotec.www.bewotecws.schema.TariffTypes_type1 param) {
        localTariffTypesTracker = true;

        this.localTariffTypes = param;
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
                    namespacePrefix + ":CruiseRequestType", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "CruiseRequestType", xmlWriter);
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

        if (localIdentitiesTracker) {
            if (localIdentities == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "Identities",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localIdentities.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "Identities"),
                    xmlWriter);
            }
        }

        if (localNameTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "Name", xmlWriter);

            if (localName == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localName);
            }

            xmlWriter.writeEndElement();
        }

        if (localMinCategoryTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "MinCategory", xmlWriter);

            if (java.lang.Float.isNaN(localMinCategory)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMinCategory));
            }

            xmlWriter.writeEndElement();
        }

        if (localCabinsTracker) {
            if (localCabins == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "Cabins",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localCabins.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "Cabins"),
                    xmlWriter);
            }
        }

        if (localBoardsTracker) {
            if (localBoards == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "Boards",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localBoards.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "Boards"),
                    xmlWriter);
            }
        }

        if (localAccommodationPropertiesTracker) {
            if (localAccommodationProperties == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AccommodationProperties cannot be null!!");
            }

            localAccommodationProperties.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema",
                    "AccommodationProperties"), xmlWriter);
        }

        if (localRecommendationsTracker) {
            if (localRecommendations == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Recommendations cannot be null!!");
            }

            localRecommendations.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "Recommendations"),
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

        if (localTariffTypesTracker) {
            if (localTariffTypes == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "TariffTypes",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localTariffTypes.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "TariffTypes"),
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
        public static CruiseRequestType parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            CruiseRequestType object = new CruiseRequestType();

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

                        if (!"CruiseRequestType".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (CruiseRequestType) de.bewotec.www.bewotecws.schema.ExtensionMapper.getTypeObject(nsUri,
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
                            "ProductCodes").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setProductCodes(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setProductCodes(de.bewotec.www.bewotecws.schema.ProductCodes_type2.Factory.parse(
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
                            "Identities").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setIdentities(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setIdentities(de.bewotec.www.bewotecws.schema.Identities_type4.Factory.parse(
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
                            "http://www.bewotec.de/bewotecws/Schema", "Name").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "MinCategory").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setMinCategory(org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(
                                content));
                    } else {
                        object.setMinCategory(java.lang.Float.NaN);

                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setMinCategory(java.lang.Float.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Cabins").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setCabins(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setCabins(de.bewotec.www.bewotecws.schema.Cabins_type1.Factory.parse(
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
                            "http://www.bewotec.de/bewotecws/Schema", "Boards").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setBoards(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setBoards(de.bewotec.www.bewotecws.schema.Boards_type2.Factory.parse(
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
                            "AccommodationProperties").equals(reader.getName())) {
                    object.setAccommodationProperties(de.bewotec.www.bewotecws.schema.AccommodationProperties_type2.Factory.parse(
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
                            "Recommendations").equals(reader.getName())) {
                    object.setRecommendations(de.bewotec.www.bewotecws.schema.Recommendations_type3.Factory.parse(
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
                        object.setPorts(de.bewotec.www.bewotecws.schema.Ports_type2.Factory.parse(
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
                        object.setDeparturePorts(de.bewotec.www.bewotecws.schema.DeparturePorts_type0.Factory.parse(
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
                        object.setArrivalPorts(de.bewotec.www.bewotecws.schema.ArrivalPorts_type0.Factory.parse(
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
                            "TariffTypes").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setTariffTypes(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setTariffTypes(de.bewotec.www.bewotecws.schema.TariffTypes_type1.Factory.parse(
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
