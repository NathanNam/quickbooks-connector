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
 *         Product: QBO
 *         Description: Financial transaction representing a request for payment for goods or services that have been sold. The Invoice entity represents an invoice to a customer. Invoice could be based on salesterm with invoice and due dates for payment. Invoice supports tax, but as of now shipping charges are not supported. Invoice can be printed and emailed to a customer.[br/] [br/] [br/] An invoice for QuickBooks must contain a valid customer reference in the CustomerId field and at least one line item. The referenced customer must already exist in the QuickBooks company at the desktop and any line items must also already exists in the QuickBooks company, or the attempt to sync will fail.[br/] [br/] In general, it is a good practice to specify all the QuickBooks header fields if you have the data.  You should always specify the ARAccountId; otherwise a default AR account will be used and this may give you unexpected results.[/br] [br/] If you want to apply one tax to all the transaction line items, use the TaxId or TaxGroupId field. If you want to use more than one tax, you need to use Tax Line items instead.[/br] [br/]
 *         EndPoint: qbo.intuit.com
 *         Business Rules: [li] An invoice must have at least one line that describes the item. [/li][li] If an account is specified in the header, the account must be of the Accounts Receivable (AR) type. [/li][li] An invoice must have a reference to a customer in the header.[/li]        
 *         Product: QBW
 *         Description: Financial transaction representing a request for payment for goods or services that have been sold.An invoice is a form that records the details of a customer's purchase, such as quantity and price of the goods or services. An invoice records the amount owed by a customer who does not pay in full at the time of purchase. If full payment is received at the time of purchase, the sale may be recorded as a sales receipt, not an invoice. See SalesReceipt. Note: You can now make Payments for Invoices that you created in the IDS cloud and simultaneously synchronize them back to QuickBooks. [br/] An invoice for QuickBooks must contain a valid customer reference in the CustomerId field and at least one line item. The referenced customer must already exist in the QuickBooks company at the desktop and any line items must also already exists in the QuickBooks company, or the attempt to sync will fail.[br/] [br/] In general, it is a good practice to specify all the QuickBooks header fields if you have the data.  You should always specify the ARAccountId; otherwise a default AR account will be used and this may give you unexpected results.[/br] [br/] If you want to apply one tax to all the transaction line items, use the TaxId or TaxGroupId field. If you want to use more than one tax, you need to use Tax Line items instead.[/br] [br/]
 *         EndPoint: services.intuit.com
 *         Business Rules: [li] An invoice must have at least one line that describes the item. [/li][li] If an account is specified in the header, the account must be of the Accounts Receivable (AR) type. [/li][li] An invoice must have a reference to a customer in the header.[/li]        
 * 			
 * 
 * <p>Java class for Invoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmBase">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.intuit.com/sb/cdm/v2}InvoiceHeader" minOccurs="0"/>
 *         &lt;element name="Line" type="{http://www.intuit.com/sb/cdm/v2}InvoiceLine" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Invoice", propOrder = {
    "header",
    "line",
    "taxLine"
})
public class Invoice
    extends CdmBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Header")
    protected InvoiceHeader header;
    @XmlElement(name = "Line")
    protected List<InvoiceLine> line;
    @XmlElement(name = "TaxLine")
    protected List<TaxLine> taxLine;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHeader }
     *     
     */
    public InvoiceHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHeader }
     *     
     */
    public void setHeader(InvoiceHeader value) {
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
     * {@link InvoiceLine }
     * 
     * 
     */
    public List<InvoiceLine> getLine() {
        if (line == null) {
            line = new ArrayList<InvoiceLine>();
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
     *     {@link InvoiceLine }
     *     
     */
    public void setLine(List<InvoiceLine> line) {
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
