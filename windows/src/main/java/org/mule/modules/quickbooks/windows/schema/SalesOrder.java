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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Product: QBW
 *         Description: A sales order is a financial transaction that represents a request received from a customer to purchase products or services. Sales orders help you manage the sale of products and services your customers order. For example, a sales order tracks inventory that is on back order for a customer. Sales Orders are supported only in QuickBooks Premier (desktop) and above. However, if you are accessing a company file created in Premier and above from a lesser edition of QuickBooks (such as Pro), you can do queries against SalesOrders. Using sales orders is optional.
 *         Endpoint: services.intuit.com
 *         Business Rules: [li]A sales order must have at least one line that describes the item. [/li][li]A sales order must have a reference to a customer in the header. [/li][li]If you submit a query with the filter IncludeDiscountLineDetails, the system retrieves either DiscountAmount or DiscountRatePercent with associated values[/li]        
 *       
 * 
 * <p>Java class for SalesOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmBase">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.intuit.com/sb/cdm/v2}SalesOrderHeader" minOccurs="0"/>
 *         &lt;element name="Line" type="{http://www.intuit.com/sb/cdm/v2}SalesOrderLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxLine" type="{http://www.intuit.com/sb/cdm/v2}TaxLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrder", propOrder = {
    "header",
    "line",
    "taxLine"
})
public class SalesOrder
    extends CdmBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Header")
    protected SalesOrderHeader header;
    @XmlElement(name = "Line")
    protected List<SalesOrderLine> line;
    @XmlElement(name = "TaxLine")
    protected List<TaxLine> taxLine;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderHeader }
     *     
     */
    public SalesOrderHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderHeader }
     *     
     */
    public void setHeader(SalesOrderHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderLine }
     * 
     * 
     */
    public List<SalesOrderLine> getLine() {
        if (line == null) {
            line = new ArrayList<SalesOrderLine>();
        }
        return this.line;
    }

    /**
     * Gets the value of the taxLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxLine }
     * 
     * 
     */
    public List<TaxLine> getTaxLine() {
        if (taxLine == null) {
            taxLine = new ArrayList<TaxLine>();
        }
        return this.taxLine;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param line
     *     allowed object is
     *     {@link SalesOrderLine }
     *     
     */
    public void setLine(List<SalesOrderLine> line) {
        this.line = line;
    }

    /**
     * Sets the value of the taxLine property.
     * 
     * @param taxLine
     *     allowed object is
     *     {@link TaxLine }
     *     
     */
    public void setTaxLine(List<TaxLine> taxLine) {
        this.taxLine = taxLine;
    }

}