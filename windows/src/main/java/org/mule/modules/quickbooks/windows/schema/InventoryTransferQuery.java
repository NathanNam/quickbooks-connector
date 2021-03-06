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
// Generated on: 2014.08.15 at 05:31:44 PM GMT-03:00 
//


package org.mule.modules.quickbooks.windows.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryTransferQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryTransferQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}TransactionQueryBase">
 *       &lt;sequence>
 *         &lt;element name="SortByColumn" type="{http://www.intuit.com/sb/cdm/v2}SortByColumnInventoryTransferWithOrder" minOccurs="0"/>
 *         &lt;element name="IncludeLine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromSiteId" type="{http://www.intuit.com/sb/cdm/v2}IdSet" minOccurs="0"/>
 *         &lt;element name="ToSiteId" type="{http://www.intuit.com/sb/cdm/v2}IdSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryTransferQuery", propOrder = {
    "sortByColumn",
    "includeLine",
    "refNumber",
    "fromSiteId",
    "toSiteId"
})
public class InventoryTransferQuery
    extends TransactionQueryBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SortByColumn")
    protected SortByColumnInventoryTransferWithOrder sortByColumn;
    @XmlElement(name = "IncludeLine")
    protected Boolean includeLine;
    @XmlElement(name = "RefNumber")
    protected String refNumber;
    @XmlElement(name = "FromSiteId")
    protected IdSet fromSiteId;
    @XmlElement(name = "ToSiteId")
    protected IdSet toSiteId;

    /**
     * Gets the value of the sortByColumn property.
     * 
     * @return
     *     possible object is
     *     {@link SortByColumnInventoryTransferWithOrder }
     *     
     */
    public SortByColumnInventoryTransferWithOrder getSortByColumn() {
        return sortByColumn;
    }

    /**
     * Sets the value of the sortByColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortByColumnInventoryTransferWithOrder }
     *     
     */
    public void setSortByColumn(SortByColumnInventoryTransferWithOrder value) {
        this.sortByColumn = value;
    }

    /**
     * Gets the value of the includeLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIncludeLine() {
        return includeLine;
    }

    /**
     * Sets the value of the includeLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeLine(Boolean value) {
        this.includeLine = value;
    }

    /**
     * Gets the value of the refNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNumber() {
        return refNumber;
    }

    /**
     * Sets the value of the refNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNumber(String value) {
        this.refNumber = value;
    }

    /**
     * Gets the value of the fromSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link IdSet }
     *     
     */
    public IdSet getFromSiteId() {
        return fromSiteId;
    }

    /**
     * Sets the value of the fromSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdSet }
     *     
     */
    public void setFromSiteId(IdSet value) {
        this.fromSiteId = value;
    }

    /**
     * Gets the value of the toSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link IdSet }
     *     
     */
    public IdSet getToSiteId() {
        return toSiteId;
    }

    /**
     * Sets the value of the toSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdSet }
     *     
     */
    public void setToSiteId(IdSet value) {
        this.toSiteId = value;
    }

}
