/**
 * BewotecHubService_GetAvailableValues_GenericFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package de.bewotec.service;

public class BewotecHubService_GetAvailableValues_GenericFaultFault_FaultMessage
    extends java.lang.Exception {
    private static final long serialVersionUID = 1578925973352L;
    private de.bewotec.bewotecws.schema.GenericFaultType faultMessage;

    public BewotecHubService_GetAvailableValues_GenericFaultFault_FaultMessage() {
        super(
            "BewotecHubService_GetAvailableValues_GenericFaultFault_FaultMessage");
    }

    public BewotecHubService_GetAvailableValues_GenericFaultFault_FaultMessage(
        java.lang.String s) {
        super(s);
    }

    public BewotecHubService_GetAvailableValues_GenericFaultFault_FaultMessage(
        java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public BewotecHubService_GetAvailableValues_GenericFaultFault_FaultMessage(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        de.bewotec.bewotecws.schema.GenericFaultType msg) {
        faultMessage = msg;
    }

    public de.bewotec.bewotecws.schema.GenericFaultType getFaultMessage() {
        return faultMessage;
    }
}
