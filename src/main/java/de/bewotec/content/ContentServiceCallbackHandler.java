/**
 * ContentServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package de.bewotec.content;


/**
 *  ContentServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class ContentServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public ContentServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public ContentServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getAvailableValues method
     * override this method for handling normal response from getAvailableValues operation
     */
    public void receiveResultgetAvailableValues(
        de.bewotec.content.ContentServiceStub.GetAvailableValuesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAvailableValues operation
     */
    public void receiveErrorgetAvailableValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createOffer method
     * override this method for handling normal response from createOffer operation
     */
    public void receiveResultcreateOffer(
        de.bewotec.content.ContentServiceStub.CreateOfferResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createOffer operation
     */
    public void receiveErrorcreateOffer(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getHolidaysForFlight method
     * override this method for handling normal response from getHolidaysForFlight operation
     */
    public void receiveResultgetHolidaysForFlight(
        de.bewotec.content.ContentServiceStub.GetHolidaysForFlightResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getHolidaysForFlight operation
     */
    public void receiveErrorgetHolidaysForFlight(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for modifyOffer method
     * override this method for handling normal response from modifyOffer operation
     */
    public void receiveResultmodifyOffer(
        de.bewotec.content.ContentServiceStub.ModifyOfferResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from modifyOffer operation
     */
    public void receiveErrormodifyOffer(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getHolidaysForFlightNeighbourStates method
     * override this method for handling normal response from getHolidaysForFlightNeighbourStates operation
     */
    public void receiveResultgetHolidaysForFlightNeighbourStates(
        de.bewotec.content.ContentServiceStub.GetHolidaysForFlightNeighbourStatesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getHolidaysForFlightNeighbourStates operation
     */
    public void receiveErrorgetHolidaysForFlightNeighbourStates(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getContentForAccommodation method
     * override this method for handling normal response from getContentForAccommodation operation
     */
    public void receiveResultgetContentForAccommodation(
        de.bewotec.content.ContentServiceStub.GetContentForAccommodationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getContentForAccommodation operation
     */
    public void receiveErrorgetContentForAccommodation(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOffers method
     * override this method for handling normal response from getOffers operation
     */
    public void receiveResultgetOffers(
        de.bewotec.content.ContentServiceStub.GetOffersResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOffers operation
     */
    public void receiveErrorgetOffers(java.lang.Exception e) {
    }
}
