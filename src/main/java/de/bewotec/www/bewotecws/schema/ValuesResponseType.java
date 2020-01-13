/**
 * ValuesResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package de.bewotec.www.bewotecws.schema;


/**
 *  ValuesResponseType bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ValuesResponseType extends de.bewotec.www.bewotecws.schema.BaseResponseType
    implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = ValuesResponseType
       Namespace URI = http://www.bewotec.de/bewotecws/Schema
       Namespace Prefix = ns1
     */

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
     * field for DepartureAirports
     */
    protected de.bewotec.www.bewotecws.schema.AirportListType localDepartureAirports;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDepartureAirportsTracker = false;

    /**
     * field for Countries
     */
    protected de.bewotec.www.bewotecws.schema.Countries_type0 localCountries;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCountriesTracker = false;

    /**
     * field for Regions
     */
    protected de.bewotec.www.bewotecws.schema.Regions_type0 localRegions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRegionsTracker = false;

    /**
     * field for ProductGroups
     */
    protected de.bewotec.www.bewotecws.schema.ProductGroups_type2 localProductGroups;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localProductGroupsTracker = false;

    /**
     * field for AccommodationProperties
     */
    protected de.bewotec.www.bewotecws.schema.AccommodationProperties_type0 localAccommodationProperties;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAccommodationPropertiesTracker = false;

    /**
     * field for MinDate
     */
    protected java.util.Calendar localMinDate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMinDateTracker = false;

    /**
     * field for MaxDate
     */
    protected java.util.Calendar localMaxDate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMaxDateTracker = false;

    /**
     * field for HotelNames
     */
    protected de.bewotec.www.bewotecws.schema.HotelNames_type0 localHotelNames;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localHotelNamesTracker = false;

    /**
     * field for Cities
     */
    protected de.bewotec.www.bewotecws.schema.Cities_type0 localCities;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCitiesTracker = false;

    /**
     * field for RoomTypes
     */
    protected de.bewotec.www.bewotecws.schema.RoomTypes_type1 localRoomTypes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRoomTypesTracker = false;

    /**
     * field for BoardTypes
     */
    protected de.bewotec.www.bewotecws.schema.BoardTypes_type0 localBoardTypes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBoardTypesTracker = false;

    /**
     * field for GeoLocations
     */
    protected de.bewotec.www.bewotecws.schema.ValuesDescendantsType localGeoLocations;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGeoLocationsTracker = false;

    /**
     * field for TouroperatorCodes
     */
    protected de.bewotec.www.bewotecws.schema.TouroperatorCodes_type1 localTouroperatorCodes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTouroperatorCodesTracker = false;

    /**
     * field for Destinations
     */
    protected de.bewotec.www.bewotecws.schema.Destinations_type0 localDestinations;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDestinationsTracker = false;

    /**
     * field for Cruise
     */
    protected de.bewotec.www.bewotecws.schema.ValuesCruiseType localCruise;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCruiseTracker = false;

    /**
     * field for Hotels
     */
    protected de.bewotec.www.bewotecws.schema.Hotels_type0 localHotels;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localHotelsTracker = false;

    /**
     * field for PriceTypes
     */
    protected de.bewotec.www.bewotecws.schema.PriceTypes_type1 localPriceTypes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPriceTypesTracker = false;

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

    public boolean isCountriesSpecified() {
        return localCountriesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Countries_type0
     */
    public de.bewotec.www.bewotecws.schema.Countries_type0 getCountries() {
        return localCountries;
    }

    /**
     * Auto generated setter method
     * @param param Countries
     */
    public void setCountries(
        de.bewotec.www.bewotecws.schema.Countries_type0 param) {
        localCountriesTracker = true;

        this.localCountries = param;
    }

    public boolean isRegionsSpecified() {
        return localRegionsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Regions_type0
     */
    public de.bewotec.www.bewotecws.schema.Regions_type0 getRegions() {
        return localRegions;
    }

    /**
     * Auto generated setter method
     * @param param Regions
     */
    public void setRegions(de.bewotec.www.bewotecws.schema.Regions_type0 param) {
        localRegionsTracker = true;

        this.localRegions = param;
    }

    public boolean isProductGroupsSpecified() {
        return localProductGroupsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.ProductGroups_type2
     */
    public de.bewotec.www.bewotecws.schema.ProductGroups_type2 getProductGroups() {
        return localProductGroups;
    }

    /**
     * Auto generated setter method
     * @param param ProductGroups
     */
    public void setProductGroups(
        de.bewotec.www.bewotecws.schema.ProductGroups_type2 param) {
        localProductGroupsTracker = true;

        this.localProductGroups = param;
    }

    public boolean isAccommodationPropertiesSpecified() {
        return localAccommodationPropertiesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.AccommodationProperties_type0
     */
    public de.bewotec.www.bewotecws.schema.AccommodationProperties_type0 getAccommodationProperties() {
        return localAccommodationProperties;
    }

    /**
     * Auto generated setter method
     * @param param AccommodationProperties
     */
    public void setAccommodationProperties(
        de.bewotec.www.bewotecws.schema.AccommodationProperties_type0 param) {
        localAccommodationPropertiesTracker = param != null;

        this.localAccommodationProperties = param;
    }

    public boolean isMinDateSpecified() {
        return localMinDateTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getMinDate() {
        return localMinDate;
    }

    /**
     * Auto generated setter method
     * @param param MinDate
     */
    public void setMinDate(java.util.Calendar param) {
        localMinDateTracker = param != null;

        this.localMinDate = param;
    }

    public boolean isMaxDateSpecified() {
        return localMaxDateTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getMaxDate() {
        return localMaxDate;
    }

    /**
     * Auto generated setter method
     * @param param MaxDate
     */
    public void setMaxDate(java.util.Calendar param) {
        localMaxDateTracker = param != null;

        this.localMaxDate = param;
    }

    public boolean isHotelNamesSpecified() {
        return localHotelNamesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.HotelNames_type0
     */
    public de.bewotec.www.bewotecws.schema.HotelNames_type0 getHotelNames() {
        return localHotelNames;
    }

    /**
     * Auto generated setter method
     * @param param HotelNames
     */
    public void setHotelNames(
        de.bewotec.www.bewotecws.schema.HotelNames_type0 param) {
        localHotelNamesTracker = param != null;

        this.localHotelNames = param;
    }

    public boolean isCitiesSpecified() {
        return localCitiesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Cities_type0
     */
    public de.bewotec.www.bewotecws.schema.Cities_type0 getCities() {
        return localCities;
    }

    /**
     * Auto generated setter method
     * @param param Cities
     */
    public void setCities(de.bewotec.www.bewotecws.schema.Cities_type0 param) {
        localCitiesTracker = param != null;

        this.localCities = param;
    }

    public boolean isRoomTypesSpecified() {
        return localRoomTypesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.RoomTypes_type1
     */
    public de.bewotec.www.bewotecws.schema.RoomTypes_type1 getRoomTypes() {
        return localRoomTypes;
    }

    /**
     * Auto generated setter method
     * @param param RoomTypes
     */
    public void setRoomTypes(
        de.bewotec.www.bewotecws.schema.RoomTypes_type1 param) {
        localRoomTypesTracker = param != null;

        this.localRoomTypes = param;
    }

    public boolean isBoardTypesSpecified() {
        return localBoardTypesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.BoardTypes_type0
     */
    public de.bewotec.www.bewotecws.schema.BoardTypes_type0 getBoardTypes() {
        return localBoardTypes;
    }

    /**
     * Auto generated setter method
     * @param param BoardTypes
     */
    public void setBoardTypes(
        de.bewotec.www.bewotecws.schema.BoardTypes_type0 param) {
        localBoardTypesTracker = param != null;

        this.localBoardTypes = param;
    }

    public boolean isGeoLocationsSpecified() {
        return localGeoLocationsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.ValuesDescendantsType
     */
    public de.bewotec.www.bewotecws.schema.ValuesDescendantsType getGeoLocations() {
        return localGeoLocations;
    }

    /**
     * Auto generated setter method
     * @param param GeoLocations
     */
    public void setGeoLocations(
        de.bewotec.www.bewotecws.schema.ValuesDescendantsType param) {
        localGeoLocationsTracker = param != null;

        this.localGeoLocations = param;
    }

    public boolean isTouroperatorCodesSpecified() {
        return localTouroperatorCodesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.TouroperatorCodes_type1
     */
    public de.bewotec.www.bewotecws.schema.TouroperatorCodes_type1 getTouroperatorCodes() {
        return localTouroperatorCodes;
    }

    /**
     * Auto generated setter method
     * @param param TouroperatorCodes
     */
    public void setTouroperatorCodes(
        de.bewotec.www.bewotecws.schema.TouroperatorCodes_type1 param) {
        localTouroperatorCodesTracker = param != null;

        this.localTouroperatorCodes = param;
    }

    public boolean isDestinationsSpecified() {
        return localDestinationsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Destinations_type0
     */
    public de.bewotec.www.bewotecws.schema.Destinations_type0 getDestinations() {
        return localDestinations;
    }

    /**
     * Auto generated setter method
     * @param param Destinations
     */
    public void setDestinations(
        de.bewotec.www.bewotecws.schema.Destinations_type0 param) {
        localDestinationsTracker = true;

        this.localDestinations = param;
    }

    public boolean isCruiseSpecified() {
        return localCruiseTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.ValuesCruiseType
     */
    public de.bewotec.www.bewotecws.schema.ValuesCruiseType getCruise() {
        return localCruise;
    }

    /**
     * Auto generated setter method
     * @param param Cruise
     */
    public void setCruise(
        de.bewotec.www.bewotecws.schema.ValuesCruiseType param) {
        localCruiseTracker = param != null;

        this.localCruise = param;
    }

    public boolean isHotelsSpecified() {
        return localHotelsTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.Hotels_type0
     */
    public de.bewotec.www.bewotecws.schema.Hotels_type0 getHotels() {
        return localHotels;
    }

    /**
     * Auto generated setter method
     * @param param Hotels
     */
    public void setHotels(de.bewotec.www.bewotecws.schema.Hotels_type0 param) {
        localHotelsTracker = param != null;

        this.localHotels = param;
    }

    public boolean isPriceTypesSpecified() {
        return localPriceTypesTracker;
    }

    /**
     * Auto generated getter method
     * @return de.bewotec.www.bewotecws.schema.PriceTypes_type1
     */
    public de.bewotec.www.bewotecws.schema.PriceTypes_type1 getPriceTypes() {
        return localPriceTypes;
    }

    /**
     * Auto generated setter method
     * @param param PriceTypes
     */
    public void setPriceTypes(
        de.bewotec.www.bewotecws.schema.PriceTypes_type1 param) {
        localPriceTypesTracker = param != null;

        this.localPriceTypes = param;
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
                "type", namespacePrefix + ":ValuesResponseType", xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "type", "ValuesResponseType", xmlWriter);
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

        namespace = "http://www.bewotec.de/bewotecws/Schema";
        writeStartElement(null, namespace, "Success", xmlWriter);

        if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                "Success cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localSuccess));
        }

        xmlWriter.writeEndElement();

        if (localProcessMessagesTracker) {
            if (localProcessMessages == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ProcessMessages cannot be null!!");
            }

            localProcessMessages.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "ProcessMessages"),
                xmlWriter);
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

        if (localCountriesTracker) {
            if (localCountries == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "Countries",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localCountries.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "Countries"),
                    xmlWriter);
            }
        }

        if (localRegionsTracker) {
            if (localRegions == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "Regions",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localRegions.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "Regions"),
                    xmlWriter);
            }
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

        if (localAccommodationPropertiesTracker) {
            if (localAccommodationProperties == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AccommodationProperties cannot be null!!");
            }

            localAccommodationProperties.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema",
                    "AccommodationProperties"), xmlWriter);
        }

        if (localMinDateTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "MinDate", xmlWriter);

            if (localMinDate == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MinDate cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMinDate));
            }

            xmlWriter.writeEndElement();
        }

        if (localMaxDateTracker) {
            namespace = "http://www.bewotec.de/bewotecws/Schema";
            writeStartElement(null, namespace, "MaxDate", xmlWriter);

            if (localMaxDate == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MaxDate cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMaxDate));
            }

            xmlWriter.writeEndElement();
        }

        if (localHotelNamesTracker) {
            if (localHotelNames == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "HotelNames cannot be null!!");
            }

            localHotelNames.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "HotelNames"),
                xmlWriter);
        }

        if (localCitiesTracker) {
            if (localCities == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Cities cannot be null!!");
            }

            localCities.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "Cities"),
                xmlWriter);
        }

        if (localRoomTypesTracker) {
            if (localRoomTypes == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "RoomTypes cannot be null!!");
            }

            localRoomTypes.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "RoomTypes"),
                xmlWriter);
        }

        if (localBoardTypesTracker) {
            if (localBoardTypes == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "BoardTypes cannot be null!!");
            }

            localBoardTypes.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "BoardTypes"),
                xmlWriter);
        }

        if (localGeoLocationsTracker) {
            if (localGeoLocations == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "GeoLocations cannot be null!!");
            }

            localGeoLocations.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "GeoLocations"),
                xmlWriter);
        }

        if (localTouroperatorCodesTracker) {
            if (localTouroperatorCodes == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "TouroperatorCodes cannot be null!!");
            }

            localTouroperatorCodes.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema",
                    "TouroperatorCodes"), xmlWriter);
        }

        if (localDestinationsTracker) {
            if (localDestinations == null) {
                writeStartElement(null,
                    "http://www.bewotec.de/bewotecws/Schema", "Destinations",
                    xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localDestinations.serialize(new javax.xml.namespace.QName(
                        "http://www.bewotec.de/bewotecws/Schema", "Destinations"),
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

        if (localHotelsTracker) {
            if (localHotels == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Hotels cannot be null!!");
            }

            localHotels.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "Hotels"),
                xmlWriter);
        }

        if (localPriceTypesTracker) {
            if (localPriceTypes == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "PriceTypes cannot be null!!");
            }

            localPriceTypes.serialize(new javax.xml.namespace.QName(
                    "http://www.bewotec.de/bewotecws/Schema", "PriceTypes"),
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
        public static ValuesResponseType parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ValuesResponseType object = new ValuesResponseType();

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

                        if (!"ValuesResponseType".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (ValuesResponseType) de.bewotec.www.bewotecws.schema.ExtensionMapper.getTypeObject(nsUri,
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
                            "http://www.bewotec.de/bewotecws/Schema", "Success").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Success" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSuccess(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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
                            "ProcessMessages").equals(reader.getName())) {
                    object.setProcessMessages(de.bewotec.www.bewotecws.schema.ProcessMessages_type0.Factory.parse(
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
                            "Countries").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setCountries(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setCountries(de.bewotec.www.bewotecws.schema.Countries_type0.Factory.parse(
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
                            "http://www.bewotec.de/bewotecws/Schema", "Regions").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setRegions(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setRegions(de.bewotec.www.bewotecws.schema.Regions_type0.Factory.parse(
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
                            "ProductGroups").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setProductGroups(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setProductGroups(de.bewotec.www.bewotecws.schema.ProductGroups_type2.Factory.parse(
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
                    object.setAccommodationProperties(de.bewotec.www.bewotecws.schema.AccommodationProperties_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "MinDate").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MinDate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMinDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "MaxDate").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "MaxDate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMaxDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
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
                            "HotelNames").equals(reader.getName())) {
                    object.setHotelNames(de.bewotec.www.bewotecws.schema.HotelNames_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Cities").equals(
                            reader.getName())) {
                    object.setCities(de.bewotec.www.bewotecws.schema.Cities_type0.Factory.parse(
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
                            "RoomTypes").equals(reader.getName())) {
                    object.setRoomTypes(de.bewotec.www.bewotecws.schema.RoomTypes_type1.Factory.parse(
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
                            "BoardTypes").equals(reader.getName())) {
                    object.setBoardTypes(de.bewotec.www.bewotecws.schema.BoardTypes_type0.Factory.parse(
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
                            "GeoLocations").equals(reader.getName())) {
                    object.setGeoLocations(de.bewotec.www.bewotecws.schema.ValuesDescendantsType.Factory.parse(
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
                            "TouroperatorCodes").equals(reader.getName())) {
                    object.setTouroperatorCodes(de.bewotec.www.bewotecws.schema.TouroperatorCodes_type1.Factory.parse(
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
                            "Destinations").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setDestinations(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setDestinations(de.bewotec.www.bewotecws.schema.Destinations_type0.Factory.parse(
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
                    object.setCruise(de.bewotec.www.bewotecws.schema.ValuesCruiseType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.bewotec.de/bewotecws/Schema", "Hotels").equals(
                            reader.getName())) {
                    object.setHotels(de.bewotec.www.bewotecws.schema.Hotels_type0.Factory.parse(
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
                            "PriceTypes").equals(reader.getName())) {
                    object.setPriceTypes(de.bewotec.www.bewotecws.schema.PriceTypes_type1.Factory.parse(
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
