/**
 * IContentService_GetAvailableValues_StandardFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package de.bewotec.content;

public class IContentService_GetAvailableValues_StandardFaultFault_FaultMessage
    extends java.lang.Exception {
    private static final long serialVersionUID = 1578900408830L;
    private de.bewotec.content.ContentServiceStub.StandardFaultE faultMessage;

    public IContentService_GetAvailableValues_StandardFaultFault_FaultMessage() {
        super(
            "IContentService_GetAvailableValues_StandardFaultFault_FaultMessage");
    }

    public IContentService_GetAvailableValues_StandardFaultFault_FaultMessage(
        java.lang.String s) {
        super(s);
    }

    public IContentService_GetAvailableValues_StandardFaultFault_FaultMessage(
        java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public IContentService_GetAvailableValues_StandardFaultFault_FaultMessage(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        de.bewotec.content.ContentServiceStub.StandardFaultE msg) {
        faultMessage = msg;
    }

    public de.bewotec.content.ContentServiceStub.StandardFaultE getFaultMessage() {
        return faultMessage;
    }
}
