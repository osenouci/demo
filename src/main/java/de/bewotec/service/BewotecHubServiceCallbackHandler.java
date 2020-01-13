/**
 * BewotecHubServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package de.bewotec.service;


/**
 *  BewotecHubServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class BewotecHubServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public BewotecHubServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public BewotecHubServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getFilters method
     * override this method for handling normal response from getFilters operation
     */
    public void receiveResultgetFilters(
        de.bewotec.www.bewotecws.schema.GetFiltersResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFilters operation
     */
    public void receiveErrorgetFilters(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProductList method
     * override this method for handling normal response from getProductList operation
     */
    public void receiveResultgetProductList(
        de.bewotec.www.bewotecws.schema.GetProductListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProductList operation
     */
    public void receiveErrorgetProductList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProductOffers method
     * override this method for handling normal response from getProductOffers operation
     */
    public void receiveResultgetProductOffers(
        de.bewotec.www.bewotecws.schema.GetProductOffersResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProductOffers operation
     */
    public void receiveErrorgetProductOffers(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProductMatrix method
     * override this method for handling normal response from getProductMatrix operation
     */
    public void receiveResultgetProductMatrix(
        de.bewotec.www.bewotecws.schema.GetProductMatrixResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProductMatrix operation
     */
    public void receiveErrorgetProductMatrix(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProductAvailability method
     * override this method for handling normal response from getProductAvailability operation
     */
    public void receiveResultgetProductAvailability(
        de.bewotec.www.bewotecws.schema.GetProductAvailabilityResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProductAvailability operation
     */
    public void receiveErrorgetProductAvailability(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProductGroups method
     * override this method for handling normal response from getProductGroups operation
     */
    public void receiveResultgetProductGroups(
        de.bewotec.www.bewotecws.schema.GetProductGroupsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProductGroups operation
     */
    public void receiveErrorgetProductGroups(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAvailableValues method
     * override this method for handling normal response from getAvailableValues operation
     */
    public void receiveResultgetAvailableValues(
        de.bewotec.www.bewotecws.schema.GetAvailableValuesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAvailableValues operation
     */
    public void receiveErrorgetAvailableValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProductVariant method
     * override this method for handling normal response from getProductVariant operation
     */
    public void receiveResultgetProductVariant(
        de.bewotec.www.bewotecws.schema.GetProductVariantResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProductVariant operation
     */
    public void receiveErrorgetProductVariant(java.lang.Exception e) {
    }
}
