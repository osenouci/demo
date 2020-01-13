/**
 * BewotecHubService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package de.bewotec.service;


/*
 *  BewotecHubService java interface
 */
public interface BewotecHubService {
    /**
     * Auto generated method signature
     *
     * @param getFilters0
     * @throws de.bewotec.service.BewotecHubService_GetFilters_GenericFaultFault_FaultMessage :
     */
    public de.bewotec.www.bewotecws.schema.GetFiltersResponse getFilters(
        de.bewotec.www.bewotecws.schema.GetFilters getFilters0)
        throws java.rmi.RemoteException,
            de.bewotec.service.BewotecHubService_GetFilters_GenericFaultFault_FaultMessage;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getFilters0
     */
    public void startgetFilters(
        de.bewotec.www.bewotecws.schema.GetFilters getFilters0,
        final de.bewotec.service.BewotecHubServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getProductList2
     * @throws de.bewotec.service.BewotecHubService_GetProductList_GenericFaultFault_FaultMessage :
     */
    public de.bewotec.www.bewotecws.schema.GetProductListResponse getProductList(
        de.bewotec.www.bewotecws.schema.GetProductList getProductList2)
        throws java.rmi.RemoteException,
            de.bewotec.service.BewotecHubService_GetProductList_GenericFaultFault_FaultMessage;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getProductList2
     */
    public void startgetProductList(
        de.bewotec.www.bewotecws.schema.GetProductList getProductList2,
        final de.bewotec.service.BewotecHubServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getProductOffers4
     * @throws de.bewotec.service.BewotecHubService_GetProductOffers_GenericFaultFault_FaultMessage :
     */
    public de.bewotec.www.bewotecws.schema.GetProductOffersResponse getProductOffers(
        de.bewotec.www.bewotecws.schema.GetProductOffers getProductOffers4)
        throws java.rmi.RemoteException,
            de.bewotec.service.BewotecHubService_GetProductOffers_GenericFaultFault_FaultMessage;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getProductOffers4
     */
    public void startgetProductOffers(
        de.bewotec.www.bewotecws.schema.GetProductOffers getProductOffers4,
        final de.bewotec.service.BewotecHubServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getProductMatrix6
     * @throws de.bewotec.service.BewotecHubService_GetProductMatrix_GenericFaultFault_FaultMessage :
     */
    public de.bewotec.www.bewotecws.schema.GetProductMatrixResponse getProductMatrix(
        de.bewotec.www.bewotecws.schema.GetProductMatrix getProductMatrix6)
        throws java.rmi.RemoteException,
            de.bewotec.service.BewotecHubService_GetProductMatrix_GenericFaultFault_FaultMessage;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getProductMatrix6
     */
    public void startgetProductMatrix(
        de.bewotec.www.bewotecws.schema.GetProductMatrix getProductMatrix6,
        final de.bewotec.service.BewotecHubServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getProductAvailability8
     * @throws de.bewotec.service.BewotecHubService_GetProductAvailability_GenericFaultFault_FaultMessage :
     */
    public de.bewotec.www.bewotecws.schema.GetProductAvailabilityResponse getProductAvailability(
        de.bewotec.www.bewotecws.schema.GetProductAvailability getProductAvailability8)
        throws java.rmi.RemoteException,
            de.bewotec.service.BewotecHubService_GetProductAvailability_GenericFaultFault_FaultMessage;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getProductAvailability8
     */
    public void startgetProductAvailability(
        de.bewotec.www.bewotecws.schema.GetProductAvailability getProductAvailability8,
        final de.bewotec.service.BewotecHubServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getProductGroups10
     * @throws de.bewotec.service.BewotecHubService_GetProductGroups_GenericFaultFault_FaultMessage :
     */
    public de.bewotec.www.bewotecws.schema.GetProductGroupsResponse getProductGroups(
        de.bewotec.www.bewotecws.schema.GetProductGroups getProductGroups10)
        throws java.rmi.RemoteException,
            de.bewotec.service.BewotecHubService_GetProductGroups_GenericFaultFault_FaultMessage;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getProductGroups10
     */
    public void startgetProductGroups(
        de.bewotec.www.bewotecws.schema.GetProductGroups getProductGroups10,
        final de.bewotec.service.BewotecHubServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAvailableValues12
     * @throws de.bewotec.service.BewotecHubService_GetAvailableValues_GenericFaultFault_FaultMessage :
     */
    public de.bewotec.www.bewotecws.schema.GetAvailableValuesResponse getAvailableValues(
        de.bewotec.www.bewotecws.schema.GetAvailableValues getAvailableValues12)
        throws java.rmi.RemoteException,
            de.bewotec.service.BewotecHubService_GetAvailableValues_GenericFaultFault_FaultMessage;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAvailableValues12
     */
    public void startgetAvailableValues(
        de.bewotec.www.bewotecws.schema.GetAvailableValues getAvailableValues12,
        final de.bewotec.service.BewotecHubServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getProductVariant14
     * @throws de.bewotec.service.BewotecHubService_GetProductVariant_GenericFaultFault_FaultMessage :
     */
    public de.bewotec.www.bewotecws.schema.GetProductVariantResponse getProductVariant(
        de.bewotec.www.bewotecws.schema.GetProductVariant getProductVariant14)
        throws java.rmi.RemoteException,
            de.bewotec.service.BewotecHubService_GetProductVariant_GenericFaultFault_FaultMessage;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getProductVariant14
     */
    public void startgetProductVariant(
        de.bewotec.www.bewotecws.schema.GetProductVariant getProductVariant14,
        final de.bewotec.service.BewotecHubServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    //
}
