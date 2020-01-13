
package de.bewotec.bewotecws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductVariantRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductVariantRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bewotec.de/bewotecws/Schema}ProductRequestType">
 *       &lt;sequence>
 *         &lt;element name="Variant" type="{http://www.bewotec.de/bewotecws/Schema}VariantEnum"/>
 *         &lt;element name="VariantPerProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SecondVariant" type="{http://www.bewotec.de/bewotecws/Schema}VariantEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductVariantRequestType", propOrder = {
    "variant",
    "variantPerProduct",
    "secondVariant"
})
public class ProductVariantRequestType
    extends ProductRequestType
{

    @XmlElement(name = "Variant", required = true)
    protected VariantEnum variant;
    @XmlElement(name = "VariantPerProduct")
    protected Boolean variantPerProduct;
    @XmlElement(name = "SecondVariant")
    protected VariantEnum secondVariant;

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link VariantEnum }
     *     
     */
    public VariantEnum getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantEnum }
     *     
     */
    public void setVariant(VariantEnum value) {
        this.variant = value;
    }

    /**
     * Gets the value of the variantPerProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVariantPerProduct() {
        return variantPerProduct;
    }

    /**
     * Sets the value of the variantPerProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariantPerProduct(Boolean value) {
        this.variantPerProduct = value;
    }

    /**
     * Gets the value of the secondVariant property.
     * 
     * @return
     *     possible object is
     *     {@link VariantEnum }
     *     
     */
    public VariantEnum getSecondVariant() {
        return secondVariant;
    }

    /**
     * Sets the value of the secondVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantEnum }
     *     
     */
    public void setSecondVariant(VariantEnum value) {
        this.secondVariant = value;
    }

}
