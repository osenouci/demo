/**
 * BewotecHubService_GetProductVariant_GenericFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package de.bewotec.service;

public class BewotecHubService_GetProductVariant_GenericFaultFault_FaultMessage
    extends java.lang.Exception {
    private static final long serialVersionUID = 1578900033414L;
    private de.bewotec.service.BewotecHubServiceStub.GenericFault faultMessage;

    public BewotecHubService_GetProductVariant_GenericFaultFault_FaultMessage() {
        super(
            "BewotecHubService_GetProductVariant_GenericFaultFault_FaultMessage");
    }

    public BewotecHubService_GetProductVariant_GenericFaultFault_FaultMessage(
        java.lang.String s) {
        super(s);
    }

    public BewotecHubService_GetProductVariant_GenericFaultFault_FaultMessage(
        java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public BewotecHubService_GetProductVariant_GenericFaultFault_FaultMessage(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        de.bewotec.service.BewotecHubServiceStub.GenericFault msg) {
        faultMessage = msg;
    }

    public de.bewotec.service.BewotecHubServiceStub.GenericFault getFaultMessage() {
        return faultMessage;
    }
}