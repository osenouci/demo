/**
 * ProductRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package de.bewotec.www.bewotecws.schema;


/**
 *  ProductRequestType bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ProductRequestType extends de.bewotec.www.bewotecws.schema.BaseRequestType
    implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = ProductRequestType
       Namespace URI = http://www.bewotec.de/bewotecws/Schema
       Namespace Prefix = ns1
     */

    /**
     * field for Accommodation
     */
    protected de.bewotec.www.bewotecws.schema.AccommodationRequestType localAccommodation;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAccommodationTracker = false;

    /**
     * field for Flight
     */
    protected de.bewotec.www.bewotecws.schema.FlightRequestType localFlight;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFlightTracker = false;

    /**
     * field for Extra
     */
    protected de.bewotec.www.bewotecws.schema.ExtraRequestType localExtra;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExtraTracker = false;

    /**
     * field for Cruise
     */
    protected de.bewotec.www.bewotecws.schema.CruiseRequestType localCruise;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCruiseTracker = false;

    /**
     * field for Passengers
     */
    protected de.bewotec.www.bewotecws.schema.Passengers_type2 localPassengers;

    /**
     * field for Period
     */
    protected de.bewotec.www.bewotecws.schema.PeriodRequestType localPeriod;

    /**
     * field for GeoLocation
     */
    protected de.bewotec.www.bewotecws.schema.GeoLocationRequestType localGeoLocation;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGeoLocationTracker = false;

    /**
     * field for GroupIds
     */
    protected de.bewotec.www.bewotecws.schema.GroupIds_type0 localGroupIds;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGroupIdsTracker = false;

    /**
     * field for Price
     */
    protected de.bewotec.www.bewotecws.schema.PriceRequestType localPrice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPriceTracker = false;

    /**
     * field for RequestBooking
     */
    protected de.bewotec.www.bewotecws.schema.IncludeExcludeOnlyEnum localRequestBooking;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRequestBookingTracker = false;

    /**
     * field for ResultsFrom
     */
    protected java.lang.String localResultsFrom;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localResultsFromTracker = false;

    /**
     * field for ResultsTo
     */
    protected java.lang.String localResultsTo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localResultsToTracker = false;

    /**
     * field for ResultsTotal
     */
    protected java.lang.String localResultsTotal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localResultsTotalTracker = false;

    /**
     * field for DetailLevel
     */
    protected de.bewotec.www.bewotecws.schema.DetailLevel_type1 localDetailLevel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDetailLevelTracker = false;

    /**
     * field for SortedBy
     */
    protected de.bewotec.www.bewotecws.schema.SortedByEnum localSortedBy;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSortedByTracker = false;

    /**
     * field for DescendingSort
     */
    protected boolean localDescendingSort;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDescendingSortTracker = false;

    /**
     * field for ResultSet
     */
    protected de.bewotec.www.bewotecws.schema.ResultSetEnum localResultSet;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localResultSetTracker = false;

    /**
     * field for MetaData
     */
    protected de.bewotec.www.bewotecws.schema.MetaDataType localMetaData;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMetaDataTracker = false;

    /**
     * field for ShowSoldOut
     */
    protected boolean localShowSoldOut;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localShowSoldOutTracker = false;

    /**
     * field for ParameterSet
     */
    protected de.bewotec.www.bewotecws.schema.ParameterSetType localParameterSet;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localParameterSetTracker = false;

    /**
     * field for RequestId
     */
    protected java.lang.String localRequestId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRequestIdTracker = false;

    /**
     * field for PeriodEmptyStay
     */
    protected de.bewotec.www.bewotecws.schema.PeriodEmptyStayType localPeriodEmptyStay;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPeriodEmptyStayTracker = false;

    public boolean isAccommodationSpecified() {
        return localAccommodationTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.AccommodationRequestType
     */
    public de.bewotec.www.bewotecws.schema.AccommodationRequestType getAccommodation() {
        return localAccommodation;
    }

    /**
     * Auto generated setter method
     * @param param Accommodation
     */
    public void setAccommodation(
        de.bewotec.www.bewotecws.schema.AccommodationRequestType param) {
        localAccommodationTracker = true;

        this.localAccommodation = param;
    }

    public boolean isFlightSpecified() {
        return localFlightTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.FlightRequestType
     */
    public de.bewotec.www.bewotecws.schema.FlightRequestType getFlight() {
        return localFlight;
    }

    /**
     * Auto generated setter method
     * @param param Flight
     */
    public void setFlight(
        de.bewotec.www.bewotecws.schema.FlightRequestType param) {
        localFlightTracker = true;

        this.localFlight = param;
    }

    public boolean isExtraSpecified() {
        return localExtraTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.ExtraRequestType
     */
    public de.bewotec.www.bewotecws.schema.ExtraRequestType getExtra() {
        return localExtra;
    }

    /**
     * Auto generated setter method
     * @param param Extra
     */
    public void setExtra(de.bewotec.www.bewotecws.schema.ExtraRequestType param) {
        localExtraTracker = true;

        this.localExtra = param;
    }

    public boolean isCruiseSpecified() {
        return localCruiseTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.CruiseRequestType
     */
    public de.bewotec.www.bewotecws.schema.CruiseRequestType getCruise() {
        return localCruise;
    }

    /**
     * Auto generated setter method
     * @param param Cruise
     */
    public void setCruise(
        de.bewotec.www.bewotecws.schema.CruiseRequestType param) {
        localCruiseTracker = param != null;

        this.localCruise = param;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Passengers_type2
     */
    public de.bewotec.www.bewotecws.schema.Passengers_type2 getPassengers() {
        return localPassengers;
    }

    /**
     * Auto generated setter method
     * @param param Passengers
     */
    public void setPassengers(
        de.bewotec.www.bewotecws.schema.Passengers_type2 param) {
        this.localPassengers = param;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.PeriodRequestType
     */
    public de.bewotec.www.bewotecws.schema.PeriodRequestType getPeriod() {
        return localPeriod;
    }

    /**
     * Auto generated setter method
     * @param param Period
     */
    public void setPeriod(
        de.bewotec.www.bewotecws.schema.PeriodRequestType param) {
        this.localPeriod = param;
    }

    public boolean isGeoLocationSpecified() {
        return localGeoLocationTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.GeoLocationRequestType
     */
    public de.bewotec.www.bewotecws.schema.GeoLocationRequestType getGeoLocation() {
        return localGeoLocation;
    }

    /**
     * Auto generated setter method
     * @param param GeoLocation
     */
    public void setGeoLocation(
        de.bewotec.www.bewotecws.schema.GeoLocationRequestType param) {
        localGeoLocationTracker = true;

        this.localGeoLocation = param;
    }

    public boolean isGroupIdsSpecified() {
        return localGroupIdsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.GroupIds_type0
     */
    public de.bewotec.www.bewotecws.schema.GroupIds_type0 getGroupIds() {
        return localGroupIds;
    }

    /**
     * Auto generated setter method
     * @param param GroupIds
     */
    public void setGroupIds(
        de.bewotec.www.bewotecws.schema.GroupIds_type0 param) {
        localGroupIdsTracker = true;

        this.localGroupIds = param;
    }

    public boolean isPriceSpecified() {
        return localPriceTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.PriceRequestType
     */
    public de.bewotec.www.bewotecws.schema.PriceRequestType getPrice() {
        return localPrice;
    }

    /**
     * Auto generated setter method
     * @param param Price
     */
    public void setPrice(de.bewotec.www.bewotecws.schema.PriceRequestType param) {
        localPriceTracker = true;

        this.localPrice = param;
    }

    public boolean isRequestBookingSpecified() {
        return localRequestBookingTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.IncludeExcludeOnlyEnum
     */
    public de.bewotec.www.bewotecws.schema.IncludeExcludeOnlyEnum getRequestBooking() {
        return localRequestBooking;
    }

    /**
     * Auto generated setter method
     * @param param RequestBooking
     */
    public void setRequestBooking(
        de.bewotec.www.bewotecws.schema.IncludeExcludeOnlyEnum param) {
        localRequestBookingTracker = true;

        this.localRequestBooking = param;
    }

    public boolean isResultsFromSpecified() {
        return localResultsFromTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getResultsFrom() {
        return localResultsFrom;
    }

    /**
     * Auto generated setter method
     * @param param ResultsFrom
     */
    public void setResultsFrom(java.lang.String param) {
        localResultsFromTracker = param != null;

        this.localResultsFrom = param;
    }

    public boolean isResultsToSpecified() {
        return localResultsToTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getResultsTo() {
        return localResultsTo;
    }

    /**
     * Auto generated setter method
     * @param param ResultsTo
     */
    public void setResultsTo(java.lang.String param) {
        localResultsToTracker = param != null;

        this.localResultsTo = param;
    }

    public boolean isResultsTotalSpecified() {
        return localResultsTotalTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getResultsTotal() {
        return localResultsTotal;
    }

    /**
     * Auto generated setter method
     * @param param ResultsTotal
     */
    public void setResultsTotal(java.lang.String param) {
        localResultsTotalTracker = param != null;

        this.localResultsTotal = param;
    }

    public boolean isDetailLevelSpecified() {
        return localDetailLevelTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.DetailLevel_type1
     */
    public de.bewotec.www.bewotecws.schema.DetailLevel_type1 getDetailLevel() {
        return localDetailLevel;
    }

    /**
     * Auto generated setter method
     * @param param DetailLevel
     */
    public void setDetailLevel(
        de.bewotec.www.bewotecws.schema.DetailLevel_type1 param) {
        localDetailLevelTracker = param != null;

        this.localDetailLevel = param;
    }

    public boolean isSortedBySpecified() {
        return localSortedByTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.SortedByEnum
     */
    public de.bewotec.www.bewotecws.schema.SortedByEnum getSortedBy() {
        return localSortedBy;
    }

    /**
     * Auto generated setter method
     * @param param SortedBy
     */
    public void setSortedBy(de.bewotec.www.bewotecws.schema.SortedByEnum param) {
        localSortedByTracker = param != null;

        this.localSortedBy = param;
    }

    public boolean isDescendingSortSpecified() {
        return localDescendingSortTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getDescendingSort() {
        return localDescendingSort;
    }

    /**
     * Auto generated setter method
     * @param param DescendingSort
     */
    public void setDescendingSort(boolean param) {
        // setting primitive attribute tracker to true
        localDescendingSortTracker = true;

        this.localDescendingSort = param;
    }

    public boolean isResultSetSpecified() {
        return localResultSetTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.ResultSetEnum
     */
    public de.bewotec.www.bewotecws.schema.ResultSetEnum getResultSet() {
        return localResultSet;
    }

    /**
     * Auto generated setter method
     * @param param ResultSet
     */
    public void setResultSet(
        de.bewotec.www.bewotecws.schema.ResultSetEnum param) {
        localResultSetTracker = param != null;

        this.localResultSet = param;
    }

    public boolean isMetaDataSpecified() {
        return localMetaDataTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.MetaDataType
     */
    public de.bewotec.www.bewotecws.schema.MetaDataType getMetaData() {
        return localMetaData;
    }

    /**
     * Auto generated setter method
     * @param param MetaData
     */
    public void setMetaData(de.bewotec.www.bewotecws.schema.MetaDataType param) {
        localMetaDataTracker = param != null;

        this.localMetaData = param;
    }

    public boolean isShowSoldOutSpecified() {
        return localShowSoldOutTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getShowSoldOut() {
        return localShowSoldOut;
    }

    /**
     * Auto generated setter method
     * @param param ShowSoldOut
     */
    public void setShowSoldOut(boolean param) {
        // setting primitive attribute tracker to true
        localShowSoldOutTracker = true;

        this.localShowSoldOut = param;
    }

    public boolean isParameterSetSpecified() {
        return localParameterSetTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.ParameterSetType
     */
    public de.bewotec.www.bewotecws.schema.ParameterSetType getParameterSet() {
        return localParameterSet;
    }

    /**
     * Auto generated setter method
     * @param param ParameterSet
     */
    public void setParameterSet(
        de.bewotec.www.bewotecws.schema.ParameterSetType param) {
        localParameterSetTracker = param != null;

        this.localParameterSet = param;
    }

    public boolean isRequestIdSpecified() {
        return localRequestIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRequestId() {
        return localRequestId;
    }

    /**
     * Auto generated setter method
     * @param param RequestId
     */
    public void setRequestId(java.lang.String param) {
        localRequestIdTracker = param != null;

        this.localRequestId = param;
    }

    public boolean isPeriodEmptyStaySpecified() {
        return localPeriodEmptyStayTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.PeriodEmptyStayType
     */
    public de.bewotec.www.bewotecws.schema.PeriodEmptyStayType getPeriodEmptyStay() {
        return localPeriodEmptyStay;
    }

    /**
     * Auto generated setter method
     * @param param PeriodEmptyStay
     */
    public void setPeriodEmptyStay(
        de.bewotec.www.bewotecws.schema.PeriodEmptyStayType param) {
        localPeriodEmptyStayTracker = param != null;

        this.localPeriodEmptyStay = param;
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

        java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                "http://www.bewotec.de/bewotecws/Schema");

        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", namespacePrefix + ":ProductRequestType", xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", "ProductRequestType", xmlWriter);
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
        public static ProductRequestType parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ProductRequestType object = new ProductRequestType();

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

                        if (!"ProductRequestType".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (ProductRequestType) de.bewotec.www.bewotecws.schema.ExtensionMapper.getTypeObject(nsUri,
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
                            "http://www.bewotec.de/bewotecws/Schema", "AuthKey").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "AuthKey" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAuthKey(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "http://www.bewotec.de/bewotecws/Schema", "Currency").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Currency" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCurrency(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Lang").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Lang" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLang(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "ProductType").equals(reader.getName())) {
                    object.setProductType(de.bewotec.www.bewotecws.schema.ProductEnum.Factory.parse(
                            reader));

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
                            "TouroperatorCodes").equals(reader.getName())) {
                    object.setTouroperatorCodes(de.bewotec.www.bewotecws.schema.TouroperatorCodes_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "TreeId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TreeId" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTreeId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Flight").equals(
                            reader.getName())) {
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

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Extra").equals(
                            reader.getName())) {
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

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Cruise").equals(
                            reader.getName())) {
                    object.setCruise(de.bewotec.www.bewotecws.schema.CruiseRequestType.Factory.parse(
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

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Period").equals(
                            reader.getName())) {
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

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "GroupIds").equals(
                            reader.getName())) {
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

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Price").equals(
                            reader.getName())) {
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

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

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

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

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

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "ResultsTo").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "ResultsTo" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setResultsTo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "DetailLevel").equals(reader.getName())) {
                    object.setDetailLevel(de.bewotec.www.bewotecws.schema.DetailLevel_type1.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "SortedBy").equals(
                            reader.getName())) {
                    object.setSortedBy(de.bewotec.www.bewotecws.schema.SortedByEnum.Factory.parse(
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

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "ResultSet").equals(reader.getName())) {
                    object.setResultSet(de.bewotec.www.bewotecws.schema.ResultSetEnum.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "MetaData").equals(
                            reader.getName())) {
                    object.setMetaData(de.bewotec.www.bewotecws.schema.MetaDataType.Factory.parse(
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

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema",
                            "ParameterSet").equals(reader.getName())) {
                    object.setParameterSet(de.bewotec.www.bewotecws.schema.ParameterSetType.Factory.parse(
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
                            "RequestId").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "RequestId" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRequestId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            "PeriodEmptyStay").equals(reader.getName())) {
                    object.setPeriodEmptyStay(de.bewotec.www.bewotecws.schema.PeriodEmptyStayType.Factory.parse(
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
