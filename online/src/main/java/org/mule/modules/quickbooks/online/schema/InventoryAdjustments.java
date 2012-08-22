/**
 * Mule QuickBooks Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.22 at 04:21:03 PM GMT-03:00 
//


package org.mule.modules.quickbooks.online.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides the definition that allows bulk data transfer of Inventory Adjustments
 * 
 * <p>Java class for InventoryAdjustments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryAdjustments">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmCollections">
 *       &lt;sequence>
 *         &lt;element name="InventoryAdjustment" type="{http://www.intuit.com/sb/cdm/v2}InventoryAdjustment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryAdjustments", propOrder = {
    "inventoryAdjustment"
})
public class InventoryAdjustments
    extends CdmCollections
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InventoryAdjustment")
    protected List<InventoryAdjustment> inventoryAdjustment;

    /**
     * Gets the value of the inventoryAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryAdjustment }
     * 
     * 
     */
    public List<InventoryAdjustment> getInventoryAdjustment() {
        if (inventoryAdjustment == null) {
            inventoryAdjustment = new ArrayList<InventoryAdjustment>();
        }
        return this.inventoryAdjustment;
    }

    /**
     * Sets the value of the inventoryAdjustment property.
     * 
     * @param inventoryAdjustment
     *     allowed object is
     *     {@link InventoryAdjustment }
     *     
     */
    public void setInventoryAdjustment(List<InventoryAdjustment> inventoryAdjustment) {
        this.inventoryAdjustment = inventoryAdjustment;
    }

}
