
package de.bewotec.bewotecws.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Search for distance or size figures, e.G. distance to the beach, room size, amount of bedrooms, ...
 * 
 * <p>Java class for FigureRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FigureRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Figure" type="{http://www.bewotec.de/bewotecws/Schema}FigureTypeEnum"/>
 *         &lt;element name="Min" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FigureRequestType", propOrder = {
    "figure",
    "min",
    "max"
})
public class FigureRequestType {

    @XmlElement(name = "Figure", required = true)
    protected FigureTypeEnum figure;
    @XmlElement(name = "Min")
    protected BigDecimal min;
    @XmlElement(name = "Max")
    protected BigDecimal max;

    /**
     * Gets the value of the figure property.
     * 
     * @return
     *     possible object is
     *     {@link FigureTypeEnum }
     *     
     */
    public FigureTypeEnum getFigure() {
        return figure;
    }

    /**
     * Sets the value of the figure property.
     * 
     * @param value
     *     allowed object is
     *     {@link FigureTypeEnum }
     *     
     */
    public void setFigure(FigureTypeEnum value) {
        this.figure = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMin(BigDecimal value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMax(BigDecimal value) {
        this.max = value;
    }

}
