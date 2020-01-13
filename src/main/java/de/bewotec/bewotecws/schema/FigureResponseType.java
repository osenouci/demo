
package de.bewotec.bewotecws.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Search for distance or size figures, e.G. distance to the beach, room size, amount of bedrooms, ...
 * 
 * <p>Java class for FigureResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FigureResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Figure" type="{http://www.bewotec.de/bewotecws/Schema}FigureTypeEnum"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FigureResponseType", propOrder = {
    "figure",
    "value"
})
public class FigureResponseType {

    @XmlElement(name = "Figure", required = true)
    protected FigureTypeEnum figure;
    @XmlElement(name = "Value", required = true)
    protected BigDecimal value;

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
