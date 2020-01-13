
package de.bewotec.bewotecws.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.bewotec.bewotecws.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GenericFault_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "GenericFault");
    private final static QName _ExtraServiceTypeProperties_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Properties");
    private final static QName _ExtraServiceTypeLocation_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Location");
    private final static QName _ExtraServiceTypeExtraVariants_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "ExtraVariants");
    private final static QName _ExtraServiceTypeDescription_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Description");
    private final static QName _ExtraServiceTypeType_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Type");
    private final static QName _PeriodRequestTypeDurations_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Durations");
    private final static QName _PeriodRequestTypeEnd_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "End");
    private final static QName _ProductRequestTypeAccommodation_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Accommodation");
    private final static QName _ProductRequestTypeGeoLocation_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "GeoLocation");
    private final static QName _ProductRequestTypePrice_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Price");
    private final static QName _ProductRequestTypeRequestBooking_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "RequestBooking");
    private final static QName _ProductRequestTypeExtra_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Extra");
    private final static QName _ProductRequestTypeFlight_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Flight");
    private final static QName _ProductRequestTypeGroupIds_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "GroupIds");
    private final static QName _ResultProductTypeServiceReferences_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "ServiceReferences");
    private final static QName _CruiseServiceTypeIdentities_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Identities");
    private final static QName _CruiseServiceTypeCruiseVariants_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "CruiseVariants");
    private final static QName _CruiseServiceTypeCruiseSpecifics_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "CruiseSpecifics");
    private final static QName _ProductResponseTypeServices_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Services");
    private final static QName _ProductResponseTypeProducts_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Products");
    private final static QName _ValuesCruiseTypePorts_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Ports");
    private final static QName _GeoLocationResponseTypeAirports_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Airports");
    private final static QName _GeoLocationResponseTypeCountry_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Country");
    private final static QName _GeoLocationResponseTypeCity_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "City");
    private final static QName _GeoLocationResponseTypeGeoCoordinate_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "GeoCoordinate");
    private final static QName _PriceInformationTypePassengers_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Passengers");
    private final static QName _CruiseVariantTypeCabins_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Cabins");
    private final static QName _ExtraRequestTypeName_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Name");
    private final static QName _ExtraRequestTypeCategory_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Category");
    private final static QName _ExtraRequestTypeCodes_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Codes");
    private final static QName _AccommodationVariantTypeRooms_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Rooms");
    private final static QName _AccommodationVariantTypeBoards_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Boards");
    private final static QName _AccommodationSpecificTypeGiataFacts_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "GiataFacts");
    private final static QName _AccommodationSpecificTypeProductGroups_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "ProductGroups");
    private final static QName _AccommodationSpecificTypeAccommodationAttributes_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "AccommodationAttributes");
    private final static QName _CruiseRequestTypeMinCategory_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "MinCategory");
    private final static QName _CruiseRequestTypeArrivalPorts_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "ArrivalPorts");
    private final static QName _CruiseRequestTypeDeparturePorts_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "DeparturePorts");
    private final static QName _CruiseRequestTypeProductCodes_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "ProductCodes");
    private final static QName _CruiseRequestTypeTariffTypes_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "TariffTypes");
    private final static QName _AccommodationServiceTypeAccommodationSpecifics_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "AccommodationSpecifics");
    private final static QName _AccommodationServiceTypeAccommodationVariants_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "AccommodationVariants");
    private final static QName _FlightTypeFlightSegments_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "FlightSegments");
    private final static QName _FlightServiceTypeFlightVariants_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "FlightVariants");
    private final static QName _GeoLocationRequestTypeRegions_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Regions");
    private final static QName _GeoLocationCruiseResponseTypeOriginAirports_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "OriginAirports");
    private final static QName _GeoLocationCruiseResponseTypeDestinationAirports_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "DestinationAirports");
    private final static QName _ExtraVariantTypePriceInformation_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "PriceInformation");
    private final static QName _RoomTypeShortDescription_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "ShortDescription");
    private final static QName _RoomTypeRoomTypes_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "RoomTypes");
    private final static QName _RoomTypeRoomAttributes_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "RoomAttributes");
    private final static QName _FlightVariantTypeFlights_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Flights");
    private final static QName _GenericFaultTypeErrorMessage_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "ErrorMessage");
    private final static QName _GenericFaultTypePlayerName_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "PlayerName");
    private final static QName _FlightRequestTypeArrivalAirportsInbound_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "ArrivalAirportsInbound");
    private final static QName _FlightRequestTypeDepartureAirportsInbound_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "DepartureAirportsInbound");
    private final static QName _FlightRequestTypeArrivalAirports_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "ArrivalAirports");
    private final static QName _FlightRequestTypeDepartureAirports_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "DepartureAirports");
    private final static QName _FlightRequestTypeFlightNumbers_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "FlightNumbers");
    private final static QName _CabinTypePassengerIds_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "PassengerIds");
    private final static QName _CabinTypeCabinAttributes_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "CabinAttributes");
    private final static QName _CabinTypeCabinTypes_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "CabinTypes");
    private final static QName _ValuesResponseTypeDestinations_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Destinations");
    private final static QName _ValuesResponseTypeCountries_QNAME = new QName("http://www.bewotec.de/bewotecws/Schema", "Countries");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.bewotec.bewotecws.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductMatrix }
     * 
     */
    public GetProductMatrix createGetProductMatrix() {
        return new GetProductMatrix();
    }

    /**
     * Create an instance of {@link ValuesCruiseType }
     * 
     */
    public ValuesCruiseType createValuesCruiseType() {
        return new ValuesCruiseType();
    }

    /**
     * Create an instance of {@link AccommodationSpecificType }
     * 
     */
    public AccommodationSpecificType createAccommodationSpecificType() {
        return new AccommodationSpecificType();
    }

    /**
     * Create an instance of {@link PriceInformationType }
     * 
     */
    public PriceInformationType createPriceInformationType() {
        return new PriceInformationType();
    }

    /**
     * Create an instance of {@link ProductGroupType }
     * 
     */
    public ProductGroupType createProductGroupType() {
        return new ProductGroupType();
    }

    /**
     * Create an instance of {@link AccommodationVariantType }
     * 
     */
    public AccommodationVariantType createAccommodationVariantType() {
        return new AccommodationVariantType();
    }

    /**
     * Create an instance of {@link CruiseVariantType }
     * 
     */
    public CruiseVariantType createCruiseVariantType() {
        return new CruiseVariantType();
    }

    /**
     * Create an instance of {@link ServiceReferenceType }
     * 
     */
    public ServiceReferenceType createServiceReferenceType() {
        return new ServiceReferenceType();
    }

    /**
     * Create an instance of {@link BoardRequestType }
     * 
     */
    public BoardRequestType createBoardRequestType() {
        return new BoardRequestType();
    }

    /**
     * Create an instance of {@link AvailabilityResponseType }
     * 
     */
    public AvailabilityResponseType createAvailabilityResponseType() {
        return new AvailabilityResponseType();
    }

    /**
     * Create an instance of {@link FlightServiceType }
     * 
     */
    public FlightServiceType createFlightServiceType() {
        return new FlightServiceType();
    }

    /**
     * Create an instance of {@link ExtraServiceType }
     * 
     */
    public ExtraServiceType createExtraServiceType() {
        return new ExtraServiceType();
    }

    /**
     * Create an instance of {@link RoomRequestType }
     * 
     */
    public RoomRequestType createRoomRequestType() {
        return new RoomRequestType();
    }

    /**
     * Create an instance of {@link PeriodRequestType }
     * 
     */
    public PeriodRequestType createPeriodRequestType() {
        return new PeriodRequestType();
    }

    /**
     * Create an instance of {@link CruiseRequestType }
     * 
     */
    public CruiseRequestType createCruiseRequestType() {
        return new CruiseRequestType();
    }

    /**
     * Create an instance of {@link AccommodationRequestType }
     * 
     */
    public AccommodationRequestType createAccommodationRequestType() {
        return new AccommodationRequestType();
    }

    /**
     * Create an instance of {@link CabinRequestType }
     * 
     */
    public CabinRequestType createCabinRequestType() {
        return new CabinRequestType();
    }

    /**
     * Create an instance of {@link TopProductType }
     * 
     */
    public TopProductType createTopProductType() {
        return new TopProductType();
    }

    /**
     * Create an instance of {@link ValuesDescendantsType }
     * 
     */
    public ValuesDescendantsType createValuesDescendantsType() {
        return new ValuesDescendantsType();
    }

    /**
     * Create an instance of {@link GeoLocationCruiseResponseType }
     * 
     */
    public GeoLocationCruiseResponseType createGeoLocationCruiseResponseType() {
        return new GeoLocationCruiseResponseType();
    }

    /**
     * Create an instance of {@link PriceRequestType }
     * 
     */
    public PriceRequestType createPriceRequestType() {
        return new PriceRequestType();
    }

    /**
     * Create an instance of {@link ResultProductType }
     * 
     */
    public ResultProductType createResultProductType() {
        return new ResultProductType();
    }

    /**
     * Create an instance of {@link GeoLocationRequestType }
     * 
     */
    public GeoLocationRequestType createGeoLocationRequestType() {
        return new GeoLocationRequestType();
    }

    /**
     * Create an instance of {@link CabinType }
     * 
     */
    public CabinType createCabinType() {
        return new CabinType();
    }

    /**
     * Create an instance of {@link FlightRequestType }
     * 
     */
    public FlightRequestType createFlightRequestType() {
        return new FlightRequestType();
    }

    /**
     * Create an instance of {@link DynamicFilters }
     * 
     */
    public DynamicFilters createDynamicFilters() {
        return new DynamicFilters();
    }

    /**
     * Create an instance of {@link RoomType }
     * 
     */
    public RoomType createRoomType() {
        return new RoomType();
    }

    /**
     * Create an instance of {@link CruiseServiceType }
     * 
     */
    public CruiseServiceType createCruiseServiceType() {
        return new CruiseServiceType();
    }

    /**
     * Create an instance of {@link FlightVariantType }
     * 
     */
    public FlightVariantType createFlightVariantType() {
        return new FlightVariantType();
    }

    /**
     * Create an instance of {@link BaseRequestType }
     * 
     */
    public BaseRequestType createBaseRequestType() {
        return new BaseRequestType();
    }

    /**
     * Create an instance of {@link FlightType }
     * 
     */
    public FlightType createFlightType() {
        return new FlightType();
    }

    /**
     * Create an instance of {@link MetaDataType }
     * 
     */
    public MetaDataType createMetaDataType() {
        return new MetaDataType();
    }

    /**
     * Create an instance of {@link ExtraRequestType }
     * 
     */
    public ExtraRequestType createExtraRequestType() {
        return new ExtraRequestType();
    }

    /**
     * Create an instance of {@link AccommodationServiceType }
     * 
     */
    public AccommodationServiceType createAccommodationServiceType() {
        return new AccommodationServiceType();
    }

    /**
     * Create an instance of {@link BaseResponseType }
     * 
     */
    public BaseResponseType createBaseResponseType() {
        return new BaseResponseType();
    }

    /**
     * Create an instance of {@link ValuesResponseType }
     * 
     */
    public ValuesResponseType createValuesResponseType() {
        return new ValuesResponseType();
    }

    /**
     * Create an instance of {@link ProductRequestType }
     * 
     */
    public ProductRequestType createProductRequestType() {
        return new ProductRequestType();
    }

    /**
     * Create an instance of {@link ValuesRequestType }
     * 
     */
    public ValuesRequestType createValuesRequestType() {
        return new ValuesRequestType();
    }

    /**
     * Create an instance of {@link FiltersResponseType }
     * 
     */
    public FiltersResponseType createFiltersResponseType() {
        return new FiltersResponseType();
    }

    /**
     * Create an instance of {@link ProductResponseType }
     * 
     */
    public ProductResponseType createProductResponseType() {
        return new ProductResponseType();
    }

    /**
     * Create an instance of {@link ProductAvailabilityResponseType }
     * 
     */
    public ProductAvailabilityResponseType createProductAvailabilityResponseType() {
        return new ProductAvailabilityResponseType();
    }

    /**
     * Create an instance of {@link GetProductAvailabilityResponse }
     * 
     */
    public GetProductAvailabilityResponse createGetProductAvailabilityResponse() {
        return new GetProductAvailabilityResponse();
    }

    /**
     * Create an instance of {@link GetProductOffers }
     * 
     */
    public GetProductOffers createGetProductOffers() {
        return new GetProductOffers();
    }

    /**
     * Create an instance of {@link GetProductList }
     * 
     */
    public GetProductList createGetProductList() {
        return new GetProductList();
    }

    /**
     * Create an instance of {@link GetProductOffersResponse }
     * 
     */
    public GetProductOffersResponse createGetProductOffersResponse() {
        return new GetProductOffersResponse();
    }

    /**
     * Create an instance of {@link GetFilters }
     * 
     */
    public GetFilters createGetFilters() {
        return new GetFilters();
    }

    /**
     * Create an instance of {@link FiltersRequestType }
     * 
     */
    public FiltersRequestType createFiltersRequestType() {
        return new FiltersRequestType();
    }

    /**
     * Create an instance of {@link GetFiltersResponse }
     * 
     */
    public GetFiltersResponse createGetFiltersResponse() {
        return new GetFiltersResponse();
    }

    /**
     * Create an instance of {@link GetProductGroupsResponse }
     * 
     */
    public GetProductGroupsResponse createGetProductGroupsResponse() {
        return new GetProductGroupsResponse();
    }

    /**
     * Create an instance of {@link GroupResponseType }
     * 
     */
    public GroupResponseType createGroupResponseType() {
        return new GroupResponseType();
    }

    /**
     * Create an instance of {@link GetProductGroups }
     * 
     */
    public GetProductGroups createGetProductGroups() {
        return new GetProductGroups();
    }

    /**
     * Create an instance of {@link GroupRequestType }
     * 
     */
    public GroupRequestType createGroupRequestType() {
        return new GroupRequestType();
    }

    /**
     * Create an instance of {@link GenericFaultType }
     * 
     */
    public GenericFaultType createGenericFaultType() {
        return new GenericFaultType();
    }

    /**
     * Create an instance of {@link GetAvailableValues }
     * 
     */
    public GetAvailableValues createGetAvailableValues() {
        return new GetAvailableValues();
    }

    /**
     * Create an instance of {@link GetProductVariant }
     * 
     */
    public GetProductVariant createGetProductVariant() {
        return new GetProductVariant();
    }

    /**
     * Create an instance of {@link ProductVariantRequestType }
     * 
     */
    public ProductVariantRequestType createProductVariantRequestType() {
        return new ProductVariantRequestType();
    }

    /**
     * Create an instance of {@link GetProductMatrix.GetProductMatrixRequest }
     * 
     */
    public GetProductMatrix.GetProductMatrixRequest createGetProductMatrixGetProductMatrixRequest() {
        return new GetProductMatrix.GetProductMatrixRequest();
    }

    /**
     * Create an instance of {@link GetProductAvailability }
     * 
     */
    public GetProductAvailability createGetProductAvailability() {
        return new GetProductAvailability();
    }

    /**
     * Create an instance of {@link ProductAvailabilityRequestType }
     * 
     */
    public ProductAvailabilityRequestType createProductAvailabilityRequestType() {
        return new ProductAvailabilityRequestType();
    }

    /**
     * Create an instance of {@link GetAvailableValuesResponse }
     * 
     */
    public GetAvailableValuesResponse createGetAvailableValuesResponse() {
        return new GetAvailableValuesResponse();
    }

    /**
     * Create an instance of {@link GetProductMatrixResponse }
     * 
     */
    public GetProductMatrixResponse createGetProductMatrixResponse() {
        return new GetProductMatrixResponse();
    }

    /**
     * Create an instance of {@link GetProductListResponse }
     * 
     */
    public GetProductListResponse createGetProductListResponse() {
        return new GetProductListResponse();
    }

    /**
     * Create an instance of {@link GetProductVariantResponse }
     * 
     */
    public GetProductVariantResponse createGetProductVariantResponse() {
        return new GetProductVariantResponse();
    }

    /**
     * Create an instance of {@link ExtraVariantType }
     * 
     */
    public ExtraVariantType createExtraVariantType() {
        return new ExtraVariantType();
    }

    /**
     * Create an instance of {@link GiataFactAttributeType }
     * 
     */
    public GiataFactAttributeType createGiataFactAttributeType() {
        return new GiataFactAttributeType();
    }

    /**
     * Create an instance of {@link AttributeCountType }
     * 
     */
    public AttributeCountType createAttributeCountType() {
        return new AttributeCountType();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link RecommendationType }
     * 
     */
    public RecommendationType createRecommendationType() {
        return new RecommendationType();
    }

    /**
     * Create an instance of {@link TagType }
     * 
     */
    public TagType createTagType() {
        return new TagType();
    }

    /**
     * Create an instance of {@link CodeNameDescendantsType }
     * 
     */
    public CodeNameDescendantsType createCodeNameDescendantsType() {
        return new CodeNameDescendantsType();
    }

    /**
     * Create an instance of {@link PriceDetailType }
     * 
     */
    public PriceDetailType createPriceDetailType() {
        return new PriceDetailType();
    }

    /**
     * Create an instance of {@link PortType }
     * 
     */
    public PortType createPortType() {
        return new PortType();
    }

    /**
     * Create an instance of {@link PassengerRequestType }
     * 
     */
    public PassengerRequestType createPassengerRequestType() {
        return new PassengerRequestType();
    }

    /**
     * Create an instance of {@link RegionType }
     * 
     */
    public RegionType createRegionType() {
        return new RegionType();
    }

    /**
     * Create an instance of {@link CityType }
     * 
     */
    public CityType createCityType() {
        return new CityType();
    }

    /**
     * Create an instance of {@link BoardTypeAndCodeType }
     * 
     */
    public BoardTypeAndCodeType createBoardTypeAndCodeType() {
        return new BoardTypeAndCodeType();
    }

    /**
     * Create an instance of {@link AccommodationAttributeType }
     * 
     */
    public AccommodationAttributeType createAccommodationAttributeType() {
        return new AccommodationAttributeType();
    }

    /**
     * Create an instance of {@link PeriodEmptyStayType }
     * 
     */
    public PeriodEmptyStayType createPeriodEmptyStayType() {
        return new PeriodEmptyStayType();
    }

    /**
     * Create an instance of {@link GiataFactType }
     * 
     */
    public GiataFactType createGiataFactType() {
        return new GiataFactType();
    }

    /**
     * Create an instance of {@link AirportListType }
     * 
     */
    public AirportListType createAirportListType() {
        return new AirportListType();
    }

    /**
     * Create an instance of {@link ClimateType }
     * 
     */
    public ClimateType createClimateType() {
        return new ClimateType();
    }

    /**
     * Create an instance of {@link CodeNameType }
     * 
     */
    public CodeNameType createCodeNameType() {
        return new CodeNameType();
    }

    /**
     * Create an instance of {@link PriceInformationPassengerType }
     * 
     */
    public PriceInformationPassengerType createPriceInformationPassengerType() {
        return new PriceInformationPassengerType();
    }

    /**
     * Create an instance of {@link FlightProductCodeType }
     * 
     */
    public FlightProductCodeType createFlightProductCodeType() {
        return new FlightProductCodeType();
    }

    /**
     * Create an instance of {@link KeyType }
     * 
     */
    public KeyType createKeyType() {
        return new KeyType();
    }

    /**
     * Create an instance of {@link GeoCoordinateType }
     * 
     */
    public GeoCoordinateType createGeoCoordinateType() {
        return new GeoCoordinateType();
    }

    /**
     * Create an instance of {@link FigureRequestType }
     * 
     */
    public FigureRequestType createFigureRequestType() {
        return new FigureRequestType();
    }

    /**
     * Create an instance of {@link BoardType }
     * 
     */
    public BoardType createBoardType() {
        return new BoardType();
    }

    /**
     * Create an instance of {@link RoomOccupancyType }
     * 
     */
    public RoomOccupancyType createRoomOccupancyType() {
        return new RoomOccupancyType();
    }

    /**
     * Create an instance of {@link PeriodDelimiterType }
     * 
     */
    public PeriodDelimiterType createPeriodDelimiterType() {
        return new PeriodDelimiterType();
    }

    /**
     * Create an instance of {@link ClimateRequestType }
     * 
     */
    public ClimateRequestType createClimateRequestType() {
        return new ClimateRequestType();
    }

    /**
     * Create an instance of {@link FigureResponseType }
     * 
     */
    public FigureResponseType createFigureResponseType() {
        return new FigureResponseType();
    }

    /**
     * Create an instance of {@link CatalogType }
     * 
     */
    public CatalogType createCatalogType() {
        return new CatalogType();
    }

    /**
     * Create an instance of {@link CountryType }
     * 
     */
    public CountryType createCountryType() {
        return new CountryType();
    }

    /**
     * Create an instance of {@link RoomAttributeType }
     * 
     */
    public RoomAttributeType createRoomAttributeType() {
        return new RoomAttributeType();
    }

    /**
     * Create an instance of {@link DestinationType }
     * 
     */
    public DestinationType createDestinationType() {
        return new DestinationType();
    }

    /**
     * Create an instance of {@link ProcessMessageType }
     * 
     */
    public ProcessMessageType createProcessMessageType() {
        return new ProcessMessageType();
    }

    /**
     * Create an instance of {@link GiataFactgroupType }
     * 
     */
    public GiataFactgroupType createGiataFactgroupType() {
        return new GiataFactgroupType();
    }

    /**
     * Create an instance of {@link FlightSegmentType }
     * 
     */
    public FlightSegmentType createFlightSegmentType() {
        return new FlightSegmentType();
    }

    /**
     * Create an instance of {@link AddOnType }
     * 
     */
    public AddOnType createAddOnType() {
        return new AddOnType();
    }

    /**
     * Create an instance of {@link BaggageType }
     * 
     */
    public BaggageType createBaggageType() {
        return new BaggageType();
    }

    /**
     * Create an instance of {@link RoomTypeAndCodeType }
     * 
     */
    public RoomTypeAndCodeType createRoomTypeAndCodeType() {
        return new RoomTypeAndCodeType();
    }

    /**
     * Create an instance of {@link CruiseSpecificType }
     * 
     */
    public CruiseSpecificType createCruiseSpecificType() {
        return new CruiseSpecificType();
    }

    /**
     * Create an instance of {@link ParameterSetType }
     * 
     */
    public ParameterSetType createParameterSetType() {
        return new ParameterSetType();
    }

    /**
     * Create an instance of {@link GeoLocationResponseType }
     * 
     */
    public GeoLocationResponseType createGeoLocationResponseType() {
        return new GeoLocationResponseType();
    }

    /**
     * Create an instance of {@link ServiceIdentityType }
     * 
     */
    public ServiceIdentityType createServiceIdentityType() {
        return new ServiceIdentityType();
    }

    /**
     * Create an instance of {@link FlightTimeType }
     * 
     */
    public FlightTimeType createFlightTimeType() {
        return new FlightTimeType();
    }

    /**
     * Create an instance of {@link ValuesHotelType }
     * 
     */
    public ValuesHotelType createValuesHotelType() {
        return new ValuesHotelType();
    }

    /**
     * Create an instance of {@link ValuesCruiseType.Ports }
     * 
     */
    public ValuesCruiseType.Ports createValuesCruiseTypePorts() {
        return new ValuesCruiseType.Ports();
    }

    /**
     * Create an instance of {@link ValuesCruiseType.CabinTypes }
     * 
     */
    public ValuesCruiseType.CabinTypes createValuesCruiseTypeCabinTypes() {
        return new ValuesCruiseType.CabinTypes();
    }

    /**
     * Create an instance of {@link ValuesCruiseType.TariffTypes }
     * 
     */
    public ValuesCruiseType.TariffTypes createValuesCruiseTypeTariffTypes() {
        return new ValuesCruiseType.TariffTypes();
    }

    /**
     * Create an instance of {@link AccommodationSpecificType.AccommodationAttributes }
     * 
     */
    public AccommodationSpecificType.AccommodationAttributes createAccommodationSpecificTypeAccommodationAttributes() {
        return new AccommodationSpecificType.AccommodationAttributes();
    }

    /**
     * Create an instance of {@link AccommodationSpecificType.AccommodationFigures }
     * 
     */
    public AccommodationSpecificType.AccommodationFigures createAccommodationSpecificTypeAccommodationFigures() {
        return new AccommodationSpecificType.AccommodationFigures();
    }

    /**
     * Create an instance of {@link AccommodationSpecificType.GiataFacts }
     * 
     */
    public AccommodationSpecificType.GiataFacts createAccommodationSpecificTypeGiataFacts() {
        return new AccommodationSpecificType.GiataFacts();
    }

    /**
     * Create an instance of {@link AccommodationSpecificType.ProductGroups }
     * 
     */
    public AccommodationSpecificType.ProductGroups createAccommodationSpecificTypeProductGroups() {
        return new AccommodationSpecificType.ProductGroups();
    }

    /**
     * Create an instance of {@link AccommodationSpecificType.Catalogs }
     * 
     */
    public AccommodationSpecificType.Catalogs createAccommodationSpecificTypeCatalogs() {
        return new AccommodationSpecificType.Catalogs();
    }

    /**
     * Create an instance of {@link PriceInformationType.Passengers }
     * 
     */
    public PriceInformationType.Passengers createPriceInformationTypePassengers() {
        return new PriceInformationType.Passengers();
    }

    /**
     * Create an instance of {@link PriceInformationType.PriceTypes }
     * 
     */
    public PriceInformationType.PriceTypes createPriceInformationTypePriceTypes() {
        return new PriceInformationType.PriceTypes();
    }

    /**
     * Create an instance of {@link PriceInformationType.PriceDetails }
     * 
     */
    public PriceInformationType.PriceDetails createPriceInformationTypePriceDetails() {
        return new PriceInformationType.PriceDetails();
    }

    /**
     * Create an instance of {@link ProductGroupType.GiataCityIds }
     * 
     */
    public ProductGroupType.GiataCityIds createProductGroupTypeGiataCityIds() {
        return new ProductGroupType.GiataCityIds();
    }

    /**
     * Create an instance of {@link ProductGroupType.Airports }
     * 
     */
    public ProductGroupType.Airports createProductGroupTypeAirports() {
        return new ProductGroupType.Airports();
    }

    /**
     * Create an instance of {@link ProductGroupType.TopProducts }
     * 
     */
    public ProductGroupType.TopProducts createProductGroupTypeTopProducts() {
        return new ProductGroupType.TopProducts();
    }

    /**
     * Create an instance of {@link ProductGroupType.ProductGroups }
     * 
     */
    public ProductGroupType.ProductGroups createProductGroupTypeProductGroups() {
        return new ProductGroupType.ProductGroups();
    }

    /**
     * Create an instance of {@link AccommodationVariantType.Rooms }
     * 
     */
    public AccommodationVariantType.Rooms createAccommodationVariantTypeRooms() {
        return new AccommodationVariantType.Rooms();
    }

    /**
     * Create an instance of {@link AccommodationVariantType.Boards }
     * 
     */
    public AccommodationVariantType.Boards createAccommodationVariantTypeBoards() {
        return new AccommodationVariantType.Boards();
    }

    /**
     * Create an instance of {@link AccommodationVariantType.AddOns }
     * 
     */
    public AccommodationVariantType.AddOns createAccommodationVariantTypeAddOns() {
        return new AccommodationVariantType.AddOns();
    }

    /**
     * Create an instance of {@link CruiseVariantType.Cabins }
     * 
     */
    public CruiseVariantType.Cabins createCruiseVariantTypeCabins() {
        return new CruiseVariantType.Cabins();
    }

    /**
     * Create an instance of {@link CruiseVariantType.Identities }
     * 
     */
    public CruiseVariantType.Identities createCruiseVariantTypeIdentities() {
        return new CruiseVariantType.Identities();
    }

    /**
     * Create an instance of {@link ServiceReferenceType.PassengerIds }
     * 
     */
    public ServiceReferenceType.PassengerIds createServiceReferenceTypePassengerIds() {
        return new ServiceReferenceType.PassengerIds();
    }

    /**
     * Create an instance of {@link BoardRequestType.BoardCodes }
     * 
     */
    public BoardRequestType.BoardCodes createBoardRequestTypeBoardCodes() {
        return new BoardRequestType.BoardCodes();
    }

    /**
     * Create an instance of {@link BoardRequestType.BoardTypes }
     * 
     */
    public BoardRequestType.BoardTypes createBoardRequestTypeBoardTypes() {
        return new BoardRequestType.BoardTypes();
    }

    /**
     * Create an instance of {@link AvailabilityResponseType.Rooms }
     * 
     */
    public AvailabilityResponseType.Rooms createAvailabilityResponseTypeRooms() {
        return new AvailabilityResponseType.Rooms();
    }

    /**
     * Create an instance of {@link AvailabilityResponseType.Boards }
     * 
     */
    public AvailabilityResponseType.Boards createAvailabilityResponseTypeBoards() {
        return new AvailabilityResponseType.Boards();
    }

    /**
     * Create an instance of {@link AvailabilityResponseType.Durations }
     * 
     */
    public AvailabilityResponseType.Durations createAvailabilityResponseTypeDurations() {
        return new AvailabilityResponseType.Durations();
    }

    /**
     * Create an instance of {@link FlightServiceType.FlightVariants }
     * 
     */
    public FlightServiceType.FlightVariants createFlightServiceTypeFlightVariants() {
        return new FlightServiceType.FlightVariants();
    }

    /**
     * Create an instance of {@link ExtraServiceType.ExtraVariants }
     * 
     */
    public ExtraServiceType.ExtraVariants createExtraServiceTypeExtraVariants() {
        return new ExtraServiceType.ExtraVariants();
    }

    /**
     * Create an instance of {@link RoomRequestType.RoomCodes }
     * 
     */
    public RoomRequestType.RoomCodes createRoomRequestTypeRoomCodes() {
        return new RoomRequestType.RoomCodes();
    }

    /**
     * Create an instance of {@link RoomRequestType.RoomTypes }
     * 
     */
    public RoomRequestType.RoomTypes createRoomRequestTypeRoomTypes() {
        return new RoomRequestType.RoomTypes();
    }

    /**
     * Create an instance of {@link RoomRequestType.Passengers }
     * 
     */
    public RoomRequestType.Passengers createRoomRequestTypePassengers() {
        return new RoomRequestType.Passengers();
    }

    /**
     * Create an instance of {@link RoomRequestType.RoomFigures }
     * 
     */
    public RoomRequestType.RoomFigures createRoomRequestTypeRoomFigures() {
        return new RoomRequestType.RoomFigures();
    }

    /**
     * Create an instance of {@link PeriodRequestType.Durations }
     * 
     */
    public PeriodRequestType.Durations createPeriodRequestTypeDurations() {
        return new PeriodRequestType.Durations();
    }

    /**
     * Create an instance of {@link PeriodRequestType.PreferredDurations }
     * 
     */
    public PeriodRequestType.PreferredDurations createPeriodRequestTypePreferredDurations() {
        return new PeriodRequestType.PreferredDurations();
    }

    /**
     * Create an instance of {@link CruiseRequestType.ProductCodes }
     * 
     */
    public CruiseRequestType.ProductCodes createCruiseRequestTypeProductCodes() {
        return new CruiseRequestType.ProductCodes();
    }

    /**
     * Create an instance of {@link CruiseRequestType.Identities }
     * 
     */
    public CruiseRequestType.Identities createCruiseRequestTypeIdentities() {
        return new CruiseRequestType.Identities();
    }

    /**
     * Create an instance of {@link CruiseRequestType.Cabins }
     * 
     */
    public CruiseRequestType.Cabins createCruiseRequestTypeCabins() {
        return new CruiseRequestType.Cabins();
    }

    /**
     * Create an instance of {@link CruiseRequestType.Boards }
     * 
     */
    public CruiseRequestType.Boards createCruiseRequestTypeBoards() {
        return new CruiseRequestType.Boards();
    }

    /**
     * Create an instance of {@link CruiseRequestType.AccommodationProperties }
     * 
     */
    public CruiseRequestType.AccommodationProperties createCruiseRequestTypeAccommodationProperties() {
        return new CruiseRequestType.AccommodationProperties();
    }

    /**
     * Create an instance of {@link CruiseRequestType.Recommendations }
     * 
     */
    public CruiseRequestType.Recommendations createCruiseRequestTypeRecommendations() {
        return new CruiseRequestType.Recommendations();
    }

    /**
     * Create an instance of {@link CruiseRequestType.Ports }
     * 
     */
    public CruiseRequestType.Ports createCruiseRequestTypePorts() {
        return new CruiseRequestType.Ports();
    }

    /**
     * Create an instance of {@link CruiseRequestType.DeparturePorts }
     * 
     */
    public CruiseRequestType.DeparturePorts createCruiseRequestTypeDeparturePorts() {
        return new CruiseRequestType.DeparturePorts();
    }

    /**
     * Create an instance of {@link CruiseRequestType.ArrivalPorts }
     * 
     */
    public CruiseRequestType.ArrivalPorts createCruiseRequestTypeArrivalPorts() {
        return new CruiseRequestType.ArrivalPorts();
    }

    /**
     * Create an instance of {@link CruiseRequestType.TariffTypes }
     * 
     */
    public CruiseRequestType.TariffTypes createCruiseRequestTypeTariffTypes() {
        return new CruiseRequestType.TariffTypes();
    }

    /**
     * Create an instance of {@link AccommodationRequestType.ProductCodes }
     * 
     */
    public AccommodationRequestType.ProductCodes createAccommodationRequestTypeProductCodes() {
        return new AccommodationRequestType.ProductCodes();
    }

    /**
     * Create an instance of {@link AccommodationRequestType.Identities }
     * 
     */
    public AccommodationRequestType.Identities createAccommodationRequestTypeIdentities() {
        return new AccommodationRequestType.Identities();
    }

    /**
     * Create an instance of {@link AccommodationRequestType.Rooms }
     * 
     */
    public AccommodationRequestType.Rooms createAccommodationRequestTypeRooms() {
        return new AccommodationRequestType.Rooms();
    }

    /**
     * Create an instance of {@link AccommodationRequestType.Boards }
     * 
     */
    public AccommodationRequestType.Boards createAccommodationRequestTypeBoards() {
        return new AccommodationRequestType.Boards();
    }

    /**
     * Create an instance of {@link AccommodationRequestType.AccommodationProperties }
     * 
     */
    public AccommodationRequestType.AccommodationProperties createAccommodationRequestTypeAccommodationProperties() {
        return new AccommodationRequestType.AccommodationProperties();
    }

    /**
     * Create an instance of {@link AccommodationRequestType.AccommodationFigures }
     * 
     */
    public AccommodationRequestType.AccommodationFigures createAccommodationRequestTypeAccommodationFigures() {
        return new AccommodationRequestType.AccommodationFigures();
    }

    /**
     * Create an instance of {@link AccommodationRequestType.Recommendations }
     * 
     */
    public AccommodationRequestType.Recommendations createAccommodationRequestTypeRecommendations() {
        return new AccommodationRequestType.Recommendations();
    }

    /**
     * Create an instance of {@link CabinRequestType.CabinCodes }
     * 
     */
    public CabinRequestType.CabinCodes createCabinRequestTypeCabinCodes() {
        return new CabinRequestType.CabinCodes();
    }

    /**
     * Create an instance of {@link CabinRequestType.CabinTypes }
     * 
     */
    public CabinRequestType.CabinTypes createCabinRequestTypeCabinTypes() {
        return new CabinRequestType.CabinTypes();
    }

    /**
     * Create an instance of {@link TopProductType.Products }
     * 
     */
    public TopProductType.Products createTopProductTypeProducts() {
        return new TopProductType.Products();
    }

    /**
     * Create an instance of {@link TopProductType.Services }
     * 
     */
    public TopProductType.Services createTopProductTypeServices() {
        return new TopProductType.Services();
    }

    /**
     * Create an instance of {@link ValuesDescendantsType.Values }
     * 
     */
    public ValuesDescendantsType.Values createValuesDescendantsTypeValues() {
        return new ValuesDescendantsType.Values();
    }

    /**
     * Create an instance of {@link GeoLocationCruiseResponseType.Ports }
     * 
     */
    public GeoLocationCruiseResponseType.Ports createGeoLocationCruiseResponseTypePorts() {
        return new GeoLocationCruiseResponseType.Ports();
    }

    /**
     * Create an instance of {@link PriceRequestType.PriceTypes }
     * 
     */
    public PriceRequestType.PriceTypes createPriceRequestTypePriceTypes() {
        return new PriceRequestType.PriceTypes();
    }

    /**
     * Create an instance of {@link ResultProductType.ServiceReferences }
     * 
     */
    public ResultProductType.ServiceReferences createResultProductTypeServiceReferences() {
        return new ResultProductType.ServiceReferences();
    }

    /**
     * Create an instance of {@link GeoLocationRequestType.Regions }
     * 
     */
    public GeoLocationRequestType.Regions createGeoLocationRequestTypeRegions() {
        return new GeoLocationRequestType.Regions();
    }

    /**
     * Create an instance of {@link GeoLocationRequestType.GiataCityIds }
     * 
     */
    public GeoLocationRequestType.GiataCityIds createGeoLocationRequestTypeGiataCityIds() {
        return new GeoLocationRequestType.GiataCityIds();
    }

    /**
     * Create an instance of {@link GeoLocationRequestType.GiataDestinationIds }
     * 
     */
    public GeoLocationRequestType.GiataDestinationIds createGeoLocationRequestTypeGiataDestinationIds() {
        return new GeoLocationRequestType.GiataDestinationIds();
    }

    /**
     * Create an instance of {@link GeoLocationRequestType.Cities }
     * 
     */
    public GeoLocationRequestType.Cities createGeoLocationRequestTypeCities() {
        return new GeoLocationRequestType.Cities();
    }

    /**
     * Create an instance of {@link GeoLocationRequestType.Countries }
     * 
     */
    public GeoLocationRequestType.Countries createGeoLocationRequestTypeCountries() {
        return new GeoLocationRequestType.Countries();
    }

    /**
     * Create an instance of {@link GeoLocationRequestType.DestinationCodes }
     * 
     */
    public GeoLocationRequestType.DestinationCodes createGeoLocationRequestTypeDestinationCodes() {
        return new GeoLocationRequestType.DestinationCodes();
    }

    /**
     * Create an instance of {@link CabinType.CabinTypes }
     * 
     */
    public CabinType.CabinTypes createCabinTypeCabinTypes() {
        return new CabinType.CabinTypes();
    }

    /**
     * Create an instance of {@link CabinType.CabinAttributes }
     * 
     */
    public CabinType.CabinAttributes createCabinTypeCabinAttributes() {
        return new CabinType.CabinAttributes();
    }

    /**
     * Create an instance of {@link CabinType.PassengerIds }
     * 
     */
    public CabinType.PassengerIds createCabinTypePassengerIds() {
        return new CabinType.PassengerIds();
    }

    /**
     * Create an instance of {@link FlightRequestType.FlightNumbers }
     * 
     */
    public FlightRequestType.FlightNumbers createFlightRequestTypeFlightNumbers() {
        return new FlightRequestType.FlightNumbers();
    }

    /**
     * Create an instance of {@link FlightRequestType.ProductCodes }
     * 
     */
    public FlightRequestType.ProductCodes createFlightRequestTypeProductCodes() {
        return new FlightRequestType.ProductCodes();
    }

    /**
     * Create an instance of {@link FlightRequestType.Airlines }
     * 
     */
    public FlightRequestType.Airlines createFlightRequestTypeAirlines() {
        return new FlightRequestType.Airlines();
    }

    /**
     * Create an instance of {@link FlightRequestType.Types }
     * 
     */
    public FlightRequestType.Types createFlightRequestTypeTypes() {
        return new FlightRequestType.Types();
    }

    /**
     * Create an instance of {@link DynamicFilters.AttributesOverview }
     * 
     */
    public DynamicFilters.AttributesOverview createDynamicFiltersAttributesOverview() {
        return new DynamicFilters.AttributesOverview();
    }

    /**
     * Create an instance of {@link DynamicFilters.Durations }
     * 
     */
    public DynamicFilters.Durations createDynamicFiltersDurations() {
        return new DynamicFilters.Durations();
    }

    /**
     * Create an instance of {@link DynamicFilters.OutboundDepartureTimes }
     * 
     */
    public DynamicFilters.OutboundDepartureTimes createDynamicFiltersOutboundDepartureTimes() {
        return new DynamicFilters.OutboundDepartureTimes();
    }

    /**
     * Create an instance of {@link DynamicFilters.Airlines }
     * 
     */
    public DynamicFilters.Airlines createDynamicFiltersAirlines() {
        return new DynamicFilters.Airlines();
    }

    /**
     * Create an instance of {@link DynamicFilters.Ports }
     * 
     */
    public DynamicFilters.Ports createDynamicFiltersPorts() {
        return new DynamicFilters.Ports();
    }

    /**
     * Create an instance of {@link DynamicFilters.DeparturePorts }
     * 
     */
    public DynamicFilters.DeparturePorts createDynamicFiltersDeparturePorts() {
        return new DynamicFilters.DeparturePorts();
    }

    /**
     * Create an instance of {@link DynamicFilters.ArrivalPorts }
     * 
     */
    public DynamicFilters.ArrivalPorts createDynamicFiltersArrivalPorts() {
        return new DynamicFilters.ArrivalPorts();
    }

    /**
     * Create an instance of {@link DynamicFilters.ProductCodes }
     * 
     */
    public DynamicFilters.ProductCodes createDynamicFiltersProductCodes() {
        return new DynamicFilters.ProductCodes();
    }

    /**
     * Create an instance of {@link RoomType.RoomTypes }
     * 
     */
    public RoomType.RoomTypes createRoomTypeRoomTypes() {
        return new RoomType.RoomTypes();
    }

    /**
     * Create an instance of {@link RoomType.RoomAttributes }
     * 
     */
    public RoomType.RoomAttributes createRoomTypeRoomAttributes() {
        return new RoomType.RoomAttributes();
    }

    /**
     * Create an instance of {@link RoomType.RoomFigures }
     * 
     */
    public RoomType.RoomFigures createRoomTypeRoomFigures() {
        return new RoomType.RoomFigures();
    }

    /**
     * Create an instance of {@link CruiseServiceType.Identities }
     * 
     */
    public CruiseServiceType.Identities createCruiseServiceTypeIdentities() {
        return new CruiseServiceType.Identities();
    }

    /**
     * Create an instance of {@link CruiseServiceType.CruiseSpecifics }
     * 
     */
    public CruiseServiceType.CruiseSpecifics createCruiseServiceTypeCruiseSpecifics() {
        return new CruiseServiceType.CruiseSpecifics();
    }

    /**
     * Create an instance of {@link CruiseServiceType.CruiseVariants }
     * 
     */
    public CruiseServiceType.CruiseVariants createCruiseServiceTypeCruiseVariants() {
        return new CruiseServiceType.CruiseVariants();
    }

    /**
     * Create an instance of {@link CruiseServiceType.Recommendations }
     * 
     */
    public CruiseServiceType.Recommendations createCruiseServiceTypeRecommendations() {
        return new CruiseServiceType.Recommendations();
    }

    /**
     * Create an instance of {@link FlightVariantType.Flights }
     * 
     */
    public FlightVariantType.Flights createFlightVariantTypeFlights() {
        return new FlightVariantType.Flights();
    }

    /**
     * Create an instance of {@link BaseRequestType.TouroperatorCodes }
     * 
     */
    public BaseRequestType.TouroperatorCodes createBaseRequestTypeTouroperatorCodes() {
        return new BaseRequestType.TouroperatorCodes();
    }

    /**
     * Create an instance of {@link FlightType.FlightSegments }
     * 
     */
    public FlightType.FlightSegments createFlightTypeFlightSegments() {
        return new FlightType.FlightSegments();
    }

    /**
     * Create an instance of {@link FlightType.Baggages }
     * 
     */
    public FlightType.Baggages createFlightTypeBaggages() {
        return new FlightType.Baggages();
    }

    /**
     * Create an instance of {@link MetaDataType.Keys }
     * 
     */
    public MetaDataType.Keys createMetaDataTypeKeys() {
        return new MetaDataType.Keys();
    }

    /**
     * Create an instance of {@link MetaDataType.Tags }
     * 
     */
    public MetaDataType.Tags createMetaDataTypeTags() {
        return new MetaDataType.Tags();
    }

    /**
     * Create an instance of {@link ExtraRequestType.Codes }
     * 
     */
    public ExtraRequestType.Codes createExtraRequestTypeCodes() {
        return new ExtraRequestType.Codes();
    }

    /**
     * Create an instance of {@link ExtraRequestType.Properties }
     * 
     */
    public ExtraRequestType.Properties createExtraRequestTypeProperties() {
        return new ExtraRequestType.Properties();
    }

    /**
     * Create an instance of {@link AccommodationServiceType.Identities }
     * 
     */
    public AccommodationServiceType.Identities createAccommodationServiceTypeIdentities() {
        return new AccommodationServiceType.Identities();
    }

    /**
     * Create an instance of {@link AccommodationServiceType.AccommodationSpecifics }
     * 
     */
    public AccommodationServiceType.AccommodationSpecifics createAccommodationServiceTypeAccommodationSpecifics() {
        return new AccommodationServiceType.AccommodationSpecifics();
    }

    /**
     * Create an instance of {@link AccommodationServiceType.AccommodationVariants }
     * 
     */
    public AccommodationServiceType.AccommodationVariants createAccommodationServiceTypeAccommodationVariants() {
        return new AccommodationServiceType.AccommodationVariants();
    }

    /**
     * Create an instance of {@link AccommodationServiceType.Recommendations }
     * 
     */
    public AccommodationServiceType.Recommendations createAccommodationServiceTypeRecommendations() {
        return new AccommodationServiceType.Recommendations();
    }

    /**
     * Create an instance of {@link BaseResponseType.ProcessMessages }
     * 
     */
    public BaseResponseType.ProcessMessages createBaseResponseTypeProcessMessages() {
        return new BaseResponseType.ProcessMessages();
    }

    /**
     * Create an instance of {@link ValuesResponseType.Countries }
     * 
     */
    public ValuesResponseType.Countries createValuesResponseTypeCountries() {
        return new ValuesResponseType.Countries();
    }

    /**
     * Create an instance of {@link ValuesResponseType.Regions }
     * 
     */
    public ValuesResponseType.Regions createValuesResponseTypeRegions() {
        return new ValuesResponseType.Regions();
    }

    /**
     * Create an instance of {@link ValuesResponseType.ProductGroups }
     * 
     */
    public ValuesResponseType.ProductGroups createValuesResponseTypeProductGroups() {
        return new ValuesResponseType.ProductGroups();
    }

    /**
     * Create an instance of {@link ValuesResponseType.AccommodationProperties }
     * 
     */
    public ValuesResponseType.AccommodationProperties createValuesResponseTypeAccommodationProperties() {
        return new ValuesResponseType.AccommodationProperties();
    }

    /**
     * Create an instance of {@link ValuesResponseType.HotelNames }
     * 
     */
    public ValuesResponseType.HotelNames createValuesResponseTypeHotelNames() {
        return new ValuesResponseType.HotelNames();
    }

    /**
     * Create an instance of {@link ValuesResponseType.Cities }
     * 
     */
    public ValuesResponseType.Cities createValuesResponseTypeCities() {
        return new ValuesResponseType.Cities();
    }

    /**
     * Create an instance of {@link ValuesResponseType.RoomTypes }
     * 
     */
    public ValuesResponseType.RoomTypes createValuesResponseTypeRoomTypes() {
        return new ValuesResponseType.RoomTypes();
    }

    /**
     * Create an instance of {@link ValuesResponseType.BoardTypes }
     * 
     */
    public ValuesResponseType.BoardTypes createValuesResponseTypeBoardTypes() {
        return new ValuesResponseType.BoardTypes();
    }

    /**
     * Create an instance of {@link ValuesResponseType.TouroperatorCodes }
     * 
     */
    public ValuesResponseType.TouroperatorCodes createValuesResponseTypeTouroperatorCodes() {
        return new ValuesResponseType.TouroperatorCodes();
    }

    /**
     * Create an instance of {@link ValuesResponseType.Destinations }
     * 
     */
    public ValuesResponseType.Destinations createValuesResponseTypeDestinations() {
        return new ValuesResponseType.Destinations();
    }

    /**
     * Create an instance of {@link ValuesResponseType.Hotels }
     * 
     */
    public ValuesResponseType.Hotels createValuesResponseTypeHotels() {
        return new ValuesResponseType.Hotels();
    }

    /**
     * Create an instance of {@link ValuesResponseType.PriceTypes }
     * 
     */
    public ValuesResponseType.PriceTypes createValuesResponseTypePriceTypes() {
        return new ValuesResponseType.PriceTypes();
    }

    /**
     * Create an instance of {@link ProductRequestType.Passengers }
     * 
     */
    public ProductRequestType.Passengers createProductRequestTypePassengers() {
        return new ProductRequestType.Passengers();
    }

    /**
     * Create an instance of {@link ProductRequestType.GroupIds }
     * 
     */
    public ProductRequestType.GroupIds createProductRequestTypeGroupIds() {
        return new ProductRequestType.GroupIds();
    }

    /**
     * Create an instance of {@link ValuesRequestType.CriteriaTypes }
     * 
     */
    public ValuesRequestType.CriteriaTypes createValuesRequestTypeCriteriaTypes() {
        return new ValuesRequestType.CriteriaTypes();
    }

    /**
     * Create an instance of {@link FiltersResponseType.Attributes }
     * 
     */
    public FiltersResponseType.Attributes createFiltersResponseTypeAttributes() {
        return new FiltersResponseType.Attributes();
    }

    /**
     * Create an instance of {@link ProductResponseType.Products }
     * 
     */
    public ProductResponseType.Products createProductResponseTypeProducts() {
        return new ProductResponseType.Products();
    }

    /**
     * Create an instance of {@link ProductResponseType.Services }
     * 
     */
    public ProductResponseType.Services createProductResponseTypeServices() {
        return new ProductResponseType.Services();
    }

    /**
     * Create an instance of {@link ProductAvailabilityResponseType.ProcessMessages }
     * 
     */
    public ProductAvailabilityResponseType.ProcessMessages createProductAvailabilityResponseTypeProcessMessages() {
        return new ProductAvailabilityResponseType.ProcessMessages();
    }

    /**
     * Create an instance of {@link ProductAvailabilityResponseType.Availabilities }
     * 
     */
    public ProductAvailabilityResponseType.Availabilities createProductAvailabilityResponseTypeAvailabilities() {
        return new ProductAvailabilityResponseType.Availabilities();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "GenericFault")
    public JAXBElement<GenericFaultType> createGenericFault(GenericFaultType value) {
        return new JAXBElement<GenericFaultType>(_GenericFault_QNAME, GenericFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Properties", scope = ExtraServiceType.class)
    public JAXBElement<String> createExtraServiceTypeProperties(String value) {
        return new JAXBElement<String>(_ExtraServiceTypeProperties_QNAME, String.class, ExtraServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoLocationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Location", scope = ExtraServiceType.class)
    public JAXBElement<GeoLocationResponseType> createExtraServiceTypeLocation(GeoLocationResponseType value) {
        return new JAXBElement<GeoLocationResponseType>(_ExtraServiceTypeLocation_QNAME, GeoLocationResponseType.class, ExtraServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraServiceType.ExtraVariants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ExtraVariants", scope = ExtraServiceType.class)
    public JAXBElement<ExtraServiceType.ExtraVariants> createExtraServiceTypeExtraVariants(ExtraServiceType.ExtraVariants value) {
        return new JAXBElement<ExtraServiceType.ExtraVariants>(_ExtraServiceTypeExtraVariants_QNAME, ExtraServiceType.ExtraVariants.class, ExtraServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Description", scope = ExtraServiceType.class)
    public JAXBElement<String> createExtraServiceTypeDescription(String value) {
        return new JAXBElement<String>(_ExtraServiceTypeDescription_QNAME, String.class, ExtraServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Type", scope = ExtraServiceType.class)
    public JAXBElement<String> createExtraServiceTypeType(String value) {
        return new JAXBElement<String>(_ExtraServiceTypeType_QNAME, String.class, ExtraServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodRequestType.Durations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Durations", scope = PeriodRequestType.class)
    public JAXBElement<PeriodRequestType.Durations> createPeriodRequestTypeDurations(PeriodRequestType.Durations value) {
        return new JAXBElement<PeriodRequestType.Durations>(_PeriodRequestTypeDurations_QNAME, PeriodRequestType.Durations.class, PeriodRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodDelimiterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "End", scope = PeriodRequestType.class)
    public JAXBElement<PeriodDelimiterType> createPeriodRequestTypeEnd(PeriodDelimiterType value) {
        return new JAXBElement<PeriodDelimiterType>(_PeriodRequestTypeEnd_QNAME, PeriodDelimiterType.class, PeriodRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Accommodation", scope = ProductRequestType.class)
    public JAXBElement<AccommodationRequestType> createProductRequestTypeAccommodation(AccommodationRequestType value) {
        return new JAXBElement<AccommodationRequestType>(_ProductRequestTypeAccommodation_QNAME, AccommodationRequestType.class, ProductRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoLocationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "GeoLocation", scope = ProductRequestType.class)
    public JAXBElement<GeoLocationRequestType> createProductRequestTypeGeoLocation(GeoLocationRequestType value) {
        return new JAXBElement<GeoLocationRequestType>(_ProductRequestTypeGeoLocation_QNAME, GeoLocationRequestType.class, ProductRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Price", scope = ProductRequestType.class)
    public JAXBElement<PriceRequestType> createProductRequestTypePrice(PriceRequestType value) {
        return new JAXBElement<PriceRequestType>(_ProductRequestTypePrice_QNAME, PriceRequestType.class, ProductRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncludeExcludeOnlyEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "RequestBooking", scope = ProductRequestType.class)
    public JAXBElement<IncludeExcludeOnlyEnum> createProductRequestTypeRequestBooking(IncludeExcludeOnlyEnum value) {
        return new JAXBElement<IncludeExcludeOnlyEnum>(_ProductRequestTypeRequestBooking_QNAME, IncludeExcludeOnlyEnum.class, ProductRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Extra", scope = ProductRequestType.class)
    public JAXBElement<ExtraRequestType> createProductRequestTypeExtra(ExtraRequestType value) {
        return new JAXBElement<ExtraRequestType>(_ProductRequestTypeExtra_QNAME, ExtraRequestType.class, ProductRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Flight", scope = ProductRequestType.class)
    public JAXBElement<FlightRequestType> createProductRequestTypeFlight(FlightRequestType value) {
        return new JAXBElement<FlightRequestType>(_ProductRequestTypeFlight_QNAME, FlightRequestType.class, ProductRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductRequestType.GroupIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "GroupIds", scope = ProductRequestType.class)
    public JAXBElement<ProductRequestType.GroupIds> createProductRequestTypeGroupIds(ProductRequestType.GroupIds value) {
        return new JAXBElement<ProductRequestType.GroupIds>(_ProductRequestTypeGroupIds_QNAME, ProductRequestType.GroupIds.class, ProductRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultProductType.ServiceReferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ServiceReferences", scope = ResultProductType.class)
    public JAXBElement<ResultProductType.ServiceReferences> createResultProductTypeServiceReferences(ResultProductType.ServiceReferences value) {
        return new JAXBElement<ResultProductType.ServiceReferences>(_ResultProductTypeServiceReferences_QNAME, ResultProductType.ServiceReferences.class, ResultProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CruiseServiceType.Identities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Identities", scope = CruiseServiceType.class)
    public JAXBElement<CruiseServiceType.Identities> createCruiseServiceTypeIdentities(CruiseServiceType.Identities value) {
        return new JAXBElement<CruiseServiceType.Identities>(_CruiseServiceTypeIdentities_QNAME, CruiseServiceType.Identities.class, CruiseServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CruiseServiceType.CruiseVariants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "CruiseVariants", scope = CruiseServiceType.class)
    public JAXBElement<CruiseServiceType.CruiseVariants> createCruiseServiceTypeCruiseVariants(CruiseServiceType.CruiseVariants value) {
        return new JAXBElement<CruiseServiceType.CruiseVariants>(_CruiseServiceTypeCruiseVariants_QNAME, CruiseServiceType.CruiseVariants.class, CruiseServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoLocationCruiseResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Location", scope = CruiseServiceType.class)
    public JAXBElement<GeoLocationCruiseResponseType> createCruiseServiceTypeLocation(GeoLocationCruiseResponseType value) {
        return new JAXBElement<GeoLocationCruiseResponseType>(_ExtraServiceTypeLocation_QNAME, GeoLocationCruiseResponseType.class, CruiseServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CruiseServiceType.CruiseSpecifics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "CruiseSpecifics", scope = CruiseServiceType.class)
    public JAXBElement<CruiseServiceType.CruiseSpecifics> createCruiseServiceTypeCruiseSpecifics(CruiseServiceType.CruiseSpecifics value) {
        return new JAXBElement<CruiseServiceType.CruiseSpecifics>(_CruiseServiceTypeCruiseSpecifics_QNAME, CruiseServiceType.CruiseSpecifics.class, CruiseServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductResponseType.Services }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Services", scope = ProductResponseType.class)
    public JAXBElement<ProductResponseType.Services> createProductResponseTypeServices(ProductResponseType.Services value) {
        return new JAXBElement<ProductResponseType.Services>(_ProductResponseTypeServices_QNAME, ProductResponseType.Services.class, ProductResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductResponseType.Products }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Products", scope = ProductResponseType.class)
    public JAXBElement<ProductResponseType.Products> createProductResponseTypeProducts(ProductResponseType.Products value) {
        return new JAXBElement<ProductResponseType.Products>(_ProductResponseTypeProducts_QNAME, ProductResponseType.Products.class, ProductResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValuesCruiseType.Ports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Ports", scope = ValuesCruiseType.class)
    public JAXBElement<ValuesCruiseType.Ports> createValuesCruiseTypePorts(ValuesCruiseType.Ports value) {
        return new JAXBElement<ValuesCruiseType.Ports>(_ValuesCruiseTypePorts_QNAME, ValuesCruiseType.Ports.class, ValuesCruiseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Airports", scope = GeoLocationResponseType.class)
    public JAXBElement<String> createGeoLocationResponseTypeAirports(String value) {
        return new JAXBElement<String>(_GeoLocationResponseTypeAirports_QNAME, String.class, GeoLocationResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Country", scope = GeoLocationResponseType.class)
    public JAXBElement<CountryType> createGeoLocationResponseTypeCountry(CountryType value) {
        return new JAXBElement<CountryType>(_GeoLocationResponseTypeCountry_QNAME, CountryType.class, GeoLocationResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "City", scope = GeoLocationResponseType.class)
    public JAXBElement<CityType> createGeoLocationResponseTypeCity(CityType value) {
        return new JAXBElement<CityType>(_GeoLocationResponseTypeCity_QNAME, CityType.class, GeoLocationResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoCoordinateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "GeoCoordinate", scope = GeoLocationResponseType.class)
    public JAXBElement<GeoCoordinateType> createGeoLocationResponseTypeGeoCoordinate(GeoCoordinateType value) {
        return new JAXBElement<GeoCoordinateType>(_GeoLocationResponseTypeGeoCoordinate_QNAME, GeoCoordinateType.class, GeoLocationResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceInformationType.Passengers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Passengers", scope = PriceInformationType.class)
    public JAXBElement<PriceInformationType.Passengers> createPriceInformationTypePassengers(PriceInformationType.Passengers value) {
        return new JAXBElement<PriceInformationType.Passengers>(_PriceInformationTypePassengers_QNAME, PriceInformationType.Passengers.class, PriceInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CruiseVariantType.Identities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Identities", scope = CruiseVariantType.class)
    public JAXBElement<CruiseVariantType.Identities> createCruiseVariantTypeIdentities(CruiseVariantType.Identities value) {
        return new JAXBElement<CruiseVariantType.Identities>(_CruiseServiceTypeIdentities_QNAME, CruiseVariantType.Identities.class, CruiseVariantType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CruiseVariantType.Cabins }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Cabins", scope = CruiseVariantType.class)
    public JAXBElement<CruiseVariantType.Cabins> createCruiseVariantTypeCabins(CruiseVariantType.Cabins value) {
        return new JAXBElement<CruiseVariantType.Cabins>(_CruiseVariantTypeCabins_QNAME, CruiseVariantType.Cabins.class, CruiseVariantType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Name", scope = ExtraRequestType.class)
    public JAXBElement<String> createExtraRequestTypeName(String value) {
        return new JAXBElement<String>(_ExtraRequestTypeName_QNAME, String.class, ExtraRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Category", scope = ExtraRequestType.class)
    public JAXBElement<String> createExtraRequestTypeCategory(String value) {
        return new JAXBElement<String>(_ExtraRequestTypeCategory_QNAME, String.class, ExtraRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraRequestType.Codes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Codes", scope = ExtraRequestType.class)
    public JAXBElement<ExtraRequestType.Codes> createExtraRequestTypeCodes(ExtraRequestType.Codes value) {
        return new JAXBElement<ExtraRequestType.Codes>(_ExtraRequestTypeCodes_QNAME, ExtraRequestType.Codes.class, ExtraRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationVariantType.Rooms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Rooms", scope = AccommodationVariantType.class)
    public JAXBElement<AccommodationVariantType.Rooms> createAccommodationVariantTypeRooms(AccommodationVariantType.Rooms value) {
        return new JAXBElement<AccommodationVariantType.Rooms>(_AccommodationVariantTypeRooms_QNAME, AccommodationVariantType.Rooms.class, AccommodationVariantType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationVariantType.Boards }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Boards", scope = AccommodationVariantType.class)
    public JAXBElement<AccommodationVariantType.Boards> createAccommodationVariantTypeBoards(AccommodationVariantType.Boards value) {
        return new JAXBElement<AccommodationVariantType.Boards>(_AccommodationVariantTypeBoards_QNAME, AccommodationVariantType.Boards.class, AccommodationVariantType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationSpecificType.GiataFacts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "GiataFacts", scope = AccommodationSpecificType.class)
    public JAXBElement<AccommodationSpecificType.GiataFacts> createAccommodationSpecificTypeGiataFacts(AccommodationSpecificType.GiataFacts value) {
        return new JAXBElement<AccommodationSpecificType.GiataFacts>(_AccommodationSpecificTypeGiataFacts_QNAME, AccommodationSpecificType.GiataFacts.class, AccommodationSpecificType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationSpecificType.ProductGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ProductGroups", scope = AccommodationSpecificType.class)
    public JAXBElement<AccommodationSpecificType.ProductGroups> createAccommodationSpecificTypeProductGroups(AccommodationSpecificType.ProductGroups value) {
        return new JAXBElement<AccommodationSpecificType.ProductGroups>(_AccommodationSpecificTypeProductGroups_QNAME, AccommodationSpecificType.ProductGroups.class, AccommodationSpecificType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationSpecificType.AccommodationAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "AccommodationAttributes", scope = AccommodationSpecificType.class)
    public JAXBElement<AccommodationSpecificType.AccommodationAttributes> createAccommodationSpecificTypeAccommodationAttributes(AccommodationSpecificType.AccommodationAttributes value) {
        return new JAXBElement<AccommodationSpecificType.AccommodationAttributes>(_AccommodationSpecificTypeAccommodationAttributes_QNAME, AccommodationSpecificType.AccommodationAttributes.class, AccommodationSpecificType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "MinCategory", scope = CruiseRequestType.class)
    public JAXBElement<Float> createCruiseRequestTypeMinCategory(Float value) {
        return new JAXBElement<Float>(_CruiseRequestTypeMinCategory_QNAME, Float.class, CruiseRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CruiseRequestType.Identities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Identities", scope = CruiseRequestType.class)
    public JAXBElement<CruiseRequestType.Identities> createCruiseRequestTypeIdentities(CruiseRequestType.Identities value) {
        return new JAXBElement<CruiseRequestType.Identities>(_CruiseServiceTypeIdentities_QNAME, CruiseRequestType.Identities.class, CruiseRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Name", scope = CruiseRequestType.class)
    public JAXBElement<String> createCruiseRequestTypeName(String value) {
        return new JAXBElement<String>(_ExtraRequestTypeName_QNAME, String.class, CruiseRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CruiseRequestType.ArrivalPorts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ArrivalPorts", scope = CruiseRequestType.class)
    public JAXBElement<CruiseRequestType.ArrivalPorts> createCruiseRequestTypeArrivalPorts(CruiseRequestType.ArrivalPorts value) {
        return new JAXBElement<CruiseRequestType.ArrivalPorts>(_CruiseRequestTypeArrivalPorts_QNAME, CruiseRequestType.ArrivalPorts.class, CruiseRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CruiseRequestType.Ports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Ports", scope = CruiseRequestType.class)
    public JAXBElement<CruiseRequestType.Ports> createCruiseRequestTypePorts(CruiseRequestType.Ports value) {
        return new JAXBElement<CruiseRequestType.Ports>(_ValuesCruiseTypePorts_QNAME, CruiseRequestType.Ports.class, CruiseRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CruiseRequestType.DeparturePorts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "DeparturePorts", scope = CruiseRequestType.class)
    public JAXBElement<CruiseRequestType.DeparturePorts> createCruiseRequestTypeDeparturePorts(CruiseRequestType.DeparturePorts value) {
        return new JAXBElement<CruiseRequestType.DeparturePorts>(_CruiseRequestTypeDeparturePorts_QNAME, CruiseRequestType.DeparturePorts.class, CruiseRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CruiseRequestType.Boards }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Boards", scope = CruiseRequestType.class)
    public JAXBElement<CruiseRequestType.Boards> createCruiseRequestTypeBoards(CruiseRequestType.Boards value) {
        return new JAXBElement<CruiseRequestType.Boards>(_AccommodationVariantTypeBoards_QNAME, CruiseRequestType.Boards.class, CruiseRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CruiseRequestType.ProductCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ProductCodes", scope = CruiseRequestType.class)
    public JAXBElement<CruiseRequestType.ProductCodes> createCruiseRequestTypeProductCodes(CruiseRequestType.ProductCodes value) {
        return new JAXBElement<CruiseRequestType.ProductCodes>(_CruiseRequestTypeProductCodes_QNAME, CruiseRequestType.ProductCodes.class, CruiseRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CruiseRequestType.TariffTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "TariffTypes", scope = CruiseRequestType.class)
    public JAXBElement<CruiseRequestType.TariffTypes> createCruiseRequestTypeTariffTypes(CruiseRequestType.TariffTypes value) {
        return new JAXBElement<CruiseRequestType.TariffTypes>(_CruiseRequestTypeTariffTypes_QNAME, CruiseRequestType.TariffTypes.class, CruiseRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CruiseRequestType.Cabins }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Cabins", scope = CruiseRequestType.class)
    public JAXBElement<CruiseRequestType.Cabins> createCruiseRequestTypeCabins(CruiseRequestType.Cabins value) {
        return new JAXBElement<CruiseRequestType.Cabins>(_CruiseVariantTypeCabins_QNAME, CruiseRequestType.Cabins.class, CruiseRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationServiceType.Identities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Identities", scope = AccommodationServiceType.class)
    public JAXBElement<AccommodationServiceType.Identities> createAccommodationServiceTypeIdentities(AccommodationServiceType.Identities value) {
        return new JAXBElement<AccommodationServiceType.Identities>(_CruiseServiceTypeIdentities_QNAME, AccommodationServiceType.Identities.class, AccommodationServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoLocationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Location", scope = AccommodationServiceType.class)
    public JAXBElement<GeoLocationResponseType> createAccommodationServiceTypeLocation(GeoLocationResponseType value) {
        return new JAXBElement<GeoLocationResponseType>(_ExtraServiceTypeLocation_QNAME, GeoLocationResponseType.class, AccommodationServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationServiceType.AccommodationSpecifics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "AccommodationSpecifics", scope = AccommodationServiceType.class)
    public JAXBElement<AccommodationServiceType.AccommodationSpecifics> createAccommodationServiceTypeAccommodationSpecifics(AccommodationServiceType.AccommodationSpecifics value) {
        return new JAXBElement<AccommodationServiceType.AccommodationSpecifics>(_AccommodationServiceTypeAccommodationSpecifics_QNAME, AccommodationServiceType.AccommodationSpecifics.class, AccommodationServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationServiceType.AccommodationVariants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "AccommodationVariants", scope = AccommodationServiceType.class)
    public JAXBElement<AccommodationServiceType.AccommodationVariants> createAccommodationServiceTypeAccommodationVariants(AccommodationServiceType.AccommodationVariants value) {
        return new JAXBElement<AccommodationServiceType.AccommodationVariants>(_AccommodationServiceTypeAccommodationVariants_QNAME, AccommodationServiceType.AccommodationVariants.class, AccommodationServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductGroupType.ProductGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ProductGroups", scope = ProductGroupType.class)
    public JAXBElement<ProductGroupType.ProductGroups> createProductGroupTypeProductGroups(ProductGroupType.ProductGroups value) {
        return new JAXBElement<ProductGroupType.ProductGroups>(_AccommodationSpecificTypeProductGroups_QNAME, ProductGroupType.ProductGroups.class, ProductGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ProductGroups", scope = GroupResponseType.class)
    public JAXBElement<ProductGroupType> createGroupResponseTypeProductGroups(ProductGroupType value) {
        return new JAXBElement<ProductGroupType>(_AccommodationSpecificTypeProductGroups_QNAME, ProductGroupType.class, GroupResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightType.FlightSegments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "FlightSegments", scope = FlightType.class)
    public JAXBElement<FlightType.FlightSegments> createFlightTypeFlightSegments(FlightType.FlightSegments value) {
        return new JAXBElement<FlightType.FlightSegments>(_FlightTypeFlightSegments_QNAME, FlightType.FlightSegments.class, FlightType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightServiceType.FlightVariants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "FlightVariants", scope = FlightServiceType.class)
    public JAXBElement<FlightServiceType.FlightVariants> createFlightServiceTypeFlightVariants(FlightServiceType.FlightVariants value) {
        return new JAXBElement<FlightServiceType.FlightVariants>(_FlightServiceTypeFlightVariants_QNAME, FlightServiceType.FlightVariants.class, FlightServiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoLocationRequestType.Regions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Regions", scope = GeoLocationRequestType.class)
    public JAXBElement<GeoLocationRequestType.Regions> createGeoLocationRequestTypeRegions(GeoLocationRequestType.Regions value) {
        return new JAXBElement<GeoLocationRequestType.Regions>(_GeoLocationRequestTypeRegions_QNAME, GeoLocationRequestType.Regions.class, GeoLocationRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "OriginAirports", scope = GeoLocationCruiseResponseType.class)
    public JAXBElement<String> createGeoLocationCruiseResponseTypeOriginAirports(String value) {
        return new JAXBElement<String>(_GeoLocationCruiseResponseTypeOriginAirports_QNAME, String.class, GeoLocationCruiseResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "DestinationAirports", scope = GeoLocationCruiseResponseType.class)
    public JAXBElement<String> createGeoLocationCruiseResponseTypeDestinationAirports(String value) {
        return new JAXBElement<String>(_GeoLocationCruiseResponseTypeDestinationAirports_QNAME, String.class, GeoLocationCruiseResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "MinCategory", scope = AccommodationRequestType.class)
    public JAXBElement<Float> createAccommodationRequestTypeMinCategory(Float value) {
        return new JAXBElement<Float>(_CruiseRequestTypeMinCategory_QNAME, Float.class, AccommodationRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationRequestType.Identities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Identities", scope = AccommodationRequestType.class)
    public JAXBElement<AccommodationRequestType.Identities> createAccommodationRequestTypeIdentities(AccommodationRequestType.Identities value) {
        return new JAXBElement<AccommodationRequestType.Identities>(_CruiseServiceTypeIdentities_QNAME, AccommodationRequestType.Identities.class, AccommodationRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Name", scope = AccommodationRequestType.class)
    public JAXBElement<String> createAccommodationRequestTypeName(String value) {
        return new JAXBElement<String>(_ExtraRequestTypeName_QNAME, String.class, AccommodationRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationRequestType.Rooms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Rooms", scope = AccommodationRequestType.class)
    public JAXBElement<AccommodationRequestType.Rooms> createAccommodationRequestTypeRooms(AccommodationRequestType.Rooms value) {
        return new JAXBElement<AccommodationRequestType.Rooms>(_AccommodationVariantTypeRooms_QNAME, AccommodationRequestType.Rooms.class, AccommodationRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationRequestType.Boards }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Boards", scope = AccommodationRequestType.class)
    public JAXBElement<AccommodationRequestType.Boards> createAccommodationRequestTypeBoards(AccommodationRequestType.Boards value) {
        return new JAXBElement<AccommodationRequestType.Boards>(_AccommodationVariantTypeBoards_QNAME, AccommodationRequestType.Boards.class, AccommodationRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationRequestType.ProductCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ProductCodes", scope = AccommodationRequestType.class)
    public JAXBElement<AccommodationRequestType.ProductCodes> createAccommodationRequestTypeProductCodes(AccommodationRequestType.ProductCodes value) {
        return new JAXBElement<AccommodationRequestType.ProductCodes>(_CruiseRequestTypeProductCodes_QNAME, AccommodationRequestType.ProductCodes.class, AccommodationRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Properties", scope = ExtraVariantType.class)
    public JAXBElement<String> createExtraVariantTypeProperties(String value) {
        return new JAXBElement<String>(_ExtraServiceTypeProperties_QNAME, String.class, ExtraVariantType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "PriceInformation", scope = ExtraVariantType.class)
    public JAXBElement<PriceInformationType> createExtraVariantTypePriceInformation(PriceInformationType value) {
        return new JAXBElement<PriceInformationType>(_ExtraVariantTypePriceInformation_QNAME, PriceInformationType.class, ExtraVariantType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Type", scope = ExtraVariantType.class)
    public JAXBElement<String> createExtraVariantTypeType(String value) {
        return new JAXBElement<String>(_ExtraServiceTypeType_QNAME, String.class, ExtraVariantType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ShortDescription", scope = RoomType.class)
    public JAXBElement<String> createRoomTypeShortDescription(String value) {
        return new JAXBElement<String>(_RoomTypeShortDescription_QNAME, String.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomType.RoomTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "RoomTypes", scope = RoomType.class)
    public JAXBElement<RoomType.RoomTypes> createRoomTypeRoomTypes(RoomType.RoomTypes value) {
        return new JAXBElement<RoomType.RoomTypes>(_RoomTypeRoomTypes_QNAME, RoomType.RoomTypes.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Description", scope = RoomType.class)
    public JAXBElement<String> createRoomTypeDescription(String value) {
        return new JAXBElement<String>(_ExtraServiceTypeDescription_QNAME, String.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomType.RoomAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "RoomAttributes", scope = RoomType.class)
    public JAXBElement<RoomType.RoomAttributes> createRoomTypeRoomAttributes(RoomType.RoomAttributes value) {
        return new JAXBElement<RoomType.RoomAttributes>(_RoomTypeRoomAttributes_QNAME, RoomType.RoomAttributes.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightVariantType.Flights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Flights", scope = FlightVariantType.class)
    public JAXBElement<FlightVariantType.Flights> createFlightVariantTypeFlights(FlightVariantType.Flights value) {
        return new JAXBElement<FlightVariantType.Flights>(_FlightVariantTypeFlights_QNAME, FlightVariantType.Flights.class, FlightVariantType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ErrorMessage", scope = GenericFaultType.class)
    public JAXBElement<String> createGenericFaultTypeErrorMessage(String value) {
        return new JAXBElement<String>(_GenericFaultTypeErrorMessage_QNAME, String.class, GenericFaultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "PlayerName", scope = GenericFaultType.class)
    public JAXBElement<String> createGenericFaultTypePlayerName(String value) {
        return new JAXBElement<String>(_GenericFaultTypePlayerName_QNAME, String.class, GenericFaultType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ArrivalAirportsInbound", scope = FlightRequestType.class)
    public JAXBElement<AirportListType> createFlightRequestTypeArrivalAirportsInbound(AirportListType value) {
        return new JAXBElement<AirportListType>(_FlightRequestTypeArrivalAirportsInbound_QNAME, AirportListType.class, FlightRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "DepartureAirportsInbound", scope = FlightRequestType.class)
    public JAXBElement<AirportListType> createFlightRequestTypeDepartureAirportsInbound(AirportListType value) {
        return new JAXBElement<AirportListType>(_FlightRequestTypeDepartureAirportsInbound_QNAME, AirportListType.class, FlightRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ArrivalAirports", scope = FlightRequestType.class)
    public JAXBElement<AirportListType> createFlightRequestTypeArrivalAirports(AirportListType value) {
        return new JAXBElement<AirportListType>(_FlightRequestTypeArrivalAirports_QNAME, AirportListType.class, FlightRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "DepartureAirports", scope = FlightRequestType.class)
    public JAXBElement<AirportListType> createFlightRequestTypeDepartureAirports(AirportListType value) {
        return new JAXBElement<AirportListType>(_FlightRequestTypeDepartureAirports_QNAME, AirportListType.class, FlightRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightRequestType.FlightNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "FlightNumbers", scope = FlightRequestType.class)
    public JAXBElement<FlightRequestType.FlightNumbers> createFlightRequestTypeFlightNumbers(FlightRequestType.FlightNumbers value) {
        return new JAXBElement<FlightRequestType.FlightNumbers>(_FlightRequestTypeFlightNumbers_QNAME, FlightRequestType.FlightNumbers.class, FlightRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CabinType.PassengerIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "PassengerIds", scope = CabinType.class)
    public JAXBElement<CabinType.PassengerIds> createCabinTypePassengerIds(CabinType.PassengerIds value) {
        return new JAXBElement<CabinType.PassengerIds>(_CabinTypePassengerIds_QNAME, CabinType.PassengerIds.class, CabinType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CabinType.CabinAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "CabinAttributes", scope = CabinType.class)
    public JAXBElement<CabinType.CabinAttributes> createCabinTypeCabinAttributes(CabinType.CabinAttributes value) {
        return new JAXBElement<CabinType.CabinAttributes>(_CabinTypeCabinAttributes_QNAME, CabinType.CabinAttributes.class, CabinType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CabinType.CabinTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "CabinTypes", scope = CabinType.class)
    public JAXBElement<CabinType.CabinTypes> createCabinTypeCabinTypes(CabinType.CabinTypes value) {
        return new JAXBElement<CabinType.CabinTypes>(_CabinTypeCabinTypes_QNAME, CabinType.CabinTypes.class, CabinType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Description", scope = CabinType.class)
    public JAXBElement<String> createCabinTypeDescription(String value) {
        return new JAXBElement<String>(_ExtraServiceTypeDescription_QNAME, String.class, CabinType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicFilters.ArrivalPorts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ArrivalPorts", scope = DynamicFilters.class)
    public JAXBElement<DynamicFilters.ArrivalPorts> createDynamicFiltersArrivalPorts(DynamicFilters.ArrivalPorts value) {
        return new JAXBElement<DynamicFilters.ArrivalPorts>(_CruiseRequestTypeArrivalPorts_QNAME, DynamicFilters.ArrivalPorts.class, DynamicFilters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicFilters.Ports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Ports", scope = DynamicFilters.class)
    public JAXBElement<DynamicFilters.Ports> createDynamicFiltersPorts(DynamicFilters.Ports value) {
        return new JAXBElement<DynamicFilters.Ports>(_ValuesCruiseTypePorts_QNAME, DynamicFilters.Ports.class, DynamicFilters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicFilters.DeparturePorts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "DeparturePorts", scope = DynamicFilters.class)
    public JAXBElement<DynamicFilters.DeparturePorts> createDynamicFiltersDeparturePorts(DynamicFilters.DeparturePorts value) {
        return new JAXBElement<DynamicFilters.DeparturePorts>(_CruiseRequestTypeDeparturePorts_QNAME, DynamicFilters.DeparturePorts.class, DynamicFilters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicFilters.ProductCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ProductCodes", scope = DynamicFilters.class)
    public JAXBElement<DynamicFilters.ProductCodes> createDynamicFiltersProductCodes(DynamicFilters.ProductCodes value) {
        return new JAXBElement<DynamicFilters.ProductCodes>(_CruiseRequestTypeProductCodes_QNAME, DynamicFilters.ProductCodes.class, DynamicFilters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceReferenceType.PassengerIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "PassengerIds", scope = ServiceReferenceType.class)
    public JAXBElement<ServiceReferenceType.PassengerIds> createServiceReferenceTypePassengerIds(ServiceReferenceType.PassengerIds value) {
        return new JAXBElement<ServiceReferenceType.PassengerIds>(_CabinTypePassengerIds_QNAME, ServiceReferenceType.PassengerIds.class, ServiceReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ArrivalAirports", scope = ValuesResponseType.class)
    public JAXBElement<AirportListType> createValuesResponseTypeArrivalAirports(AirportListType value) {
        return new JAXBElement<AirportListType>(_FlightRequestTypeArrivalAirports_QNAME, AirportListType.class, ValuesResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValuesResponseType.Destinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Destinations", scope = ValuesResponseType.class)
    public JAXBElement<ValuesResponseType.Destinations> createValuesResponseTypeDestinations(ValuesResponseType.Destinations value) {
        return new JAXBElement<ValuesResponseType.Destinations>(_ValuesResponseTypeDestinations_QNAME, ValuesResponseType.Destinations.class, ValuesResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValuesResponseType.ProductGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "ProductGroups", scope = ValuesResponseType.class)
    public JAXBElement<ValuesResponseType.ProductGroups> createValuesResponseTypeProductGroups(ValuesResponseType.ProductGroups value) {
        return new JAXBElement<ValuesResponseType.ProductGroups>(_AccommodationSpecificTypeProductGroups_QNAME, ValuesResponseType.ProductGroups.class, ValuesResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "DepartureAirports", scope = ValuesResponseType.class)
    public JAXBElement<AirportListType> createValuesResponseTypeDepartureAirports(AirportListType value) {
        return new JAXBElement<AirportListType>(_FlightRequestTypeDepartureAirports_QNAME, AirportListType.class, ValuesResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValuesResponseType.Regions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Regions", scope = ValuesResponseType.class)
    public JAXBElement<ValuesResponseType.Regions> createValuesResponseTypeRegions(ValuesResponseType.Regions value) {
        return new JAXBElement<ValuesResponseType.Regions>(_GeoLocationRequestTypeRegions_QNAME, ValuesResponseType.Regions.class, ValuesResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValuesResponseType.Countries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bewotec.de/bewotecws/Schema", name = "Countries", scope = ValuesResponseType.class)
    public JAXBElement<ValuesResponseType.Countries> createValuesResponseTypeCountries(ValuesResponseType.Countries value) {
        return new JAXBElement<ValuesResponseType.Countries>(_ValuesResponseTypeCountries_QNAME, ValuesResponseType.Countries.class, ValuesResponseType.class, value);
    }

}
