
package de.bewotec.bewotecws.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Giata Facts attribute
 * 
 * <p>Java class for GiataFactgroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiataFactgroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GiataFact" type="{http://www.bewotec.de/bewotecws/Schema}GiataFactType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiataFactgroupType", propOrder = {
    "code",
    "giataFact"
})
public class GiataFactgroupType {

    @XmlElement(name = "Code")
    protected int code;
    @XmlElement(name = "GiataFact", nillable = true)
    protected List<GiataFactType> giataFact;

    /**
     * Gets the value of the code property.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Gets the value of the giataFact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giataFact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiataFact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GiataFactType }
     * 
     * 
     */
    public List<GiataFactType> getGiataFact() {
        if (giataFact == null) {
            giataFact = new ArrayList<GiataFactType>();
        }
        return this.giataFact;
    }

}
