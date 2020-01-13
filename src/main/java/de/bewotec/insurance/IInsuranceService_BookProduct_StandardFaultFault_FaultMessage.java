/**
 * IInsuranceService_BookProduct_StandardFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package de.bewotec.insurance;

public class IInsuranceService_BookProduct_StandardFaultFault_FaultMessage
    extends java.lang.Exception {
    private static final long serialVersionUID = 1578925624788L;
    private de.bewotec.insurance.InsurancesServiceStub.StandardFaultE faultMessage;

    public IInsuranceService_BookProduct_StandardFaultFault_FaultMessage() {
        super("IInsuranceService_BookProduct_StandardFaultFault_FaultMessage");
    }

    public IInsuranceService_BookProduct_StandardFaultFault_FaultMessage(
        java.lang.String s) {
        super(s);
    }

    public IInsuranceService_BookProduct_StandardFaultFault_FaultMessage(
        java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public IInsuranceService_BookProduct_StandardFaultFault_FaultMessage(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        de.bewotec.insurance.InsurancesServiceStub.StandardFaultE msg) {
        faultMessage = msg;
    }

    public de.bewotec.insurance.InsurancesServiceStub.StandardFaultE getFaultMessage() {
        return faultMessage;
    }
}
