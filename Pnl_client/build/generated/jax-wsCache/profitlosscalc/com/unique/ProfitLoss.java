
package com.unique;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfitLoss complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfitLoss"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sp" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cp" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfitLoss", propOrder = {
    "sp",
    "cp"
})
public class ProfitLoss {

    protected int sp;
    protected int cp;

    /**
     * Gets the value of the sp property.
     * 
     */
    public int getSp() {
        return sp;
    }

    /**
     * Sets the value of the sp property.
     * 
     */
    public void setSp(int value) {
        this.sp = value;
    }

    /**
     * Gets the value of the cp property.
     * 
     */
    public int getCp() {
        return cp;
    }

    /**
     * Sets the value of the cp property.
     * 
     */
    public void setCp(int value) {
        this.cp = value;
    }

}
