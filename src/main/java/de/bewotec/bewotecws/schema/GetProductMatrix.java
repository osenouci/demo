
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetProductMatrixRequest">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.bewotec.de/bewotecws/Schema}ProductRequestType">
 *                 &lt;sequence>
 *                   &lt;element name="VariantX" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="VariantY" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getProductMatrixRequest"
})
@XmlRootElement(name = "GetProductMatrix")
public class GetProductMatrix {

    @XmlElement(name = "GetProductMatrixRequest", required = true)
    protected GetProductMatrix.GetProductMatrixRequest getProductMatrixRequest;

    /**
     * Gets the value of the getProductMatrixRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetProductMatrix.GetProductMatrixRequest }
     *     
     */
    public GetProductMatrix.GetProductMatrixRequest getGetProductMatrixRequest() {
        return getProductMatrixRequest;
    }

    /**
     * Sets the value of the getProductMatrixRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProductMatrix.GetProductMatrixRequest }
     *     
     */
    public void setGetProductMatrixRequest(GetProductMatrix.GetProductMatrixRequest value) {
        this.getProductMatrixRequest = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.bewotec.de/bewotecws/Schema}ProductRequestType">
     *       &lt;sequence>
     *         &lt;element name="VariantX" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="VariantY" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "variantX",
        "variantY"
    })
    public static class GetProductMatrixRequest
        extends ProductRequestType
    {

        @XmlElement(name = "VariantX", required = true)
        protected Object variantX;
        @XmlElement(name = "VariantY", required = true)
        protected Object variantY;

        /**
         * Gets the value of the variantX property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getVariantX() {
            return variantX;
        }

        /**
         * Sets the value of the variantX property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setVariantX(Object value) {
            this.variantX = value;
        }

        /**
         * Gets the value of the variantY property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getVariantY() {
            return variantY;
        }

        /**
         * Sets the value of the variantY property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setVariantY(Object value) {
            this.variantY = value;
        }

    }

}
