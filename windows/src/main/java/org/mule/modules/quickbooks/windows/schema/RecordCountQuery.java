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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordCountQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordCountQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}QueryBase">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.intuit.com/sb/cdm/v2}QueryObjects" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordCountQuery", propOrder = {
    "queryObjects"
})
public class RecordCountQuery
    extends QueryBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "QueryObjects", namespace = "http://www.intuit.com/sb/cdm/v2", type = JAXBElement.class)
    protected JAXBElement<? extends QueryBase> queryObjects;

    /**
     * Gets the value of the queryObjects property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditCardRefundQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerTypeQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link InvoiceQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesRepQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemConsolidatedQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemGroupComponentQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOrderQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmployeeQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventorySiteQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTaxPaymentCheckQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link PayrollNonWageItemQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccountQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventoryTransferQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExternalRoleQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventoryAdjustmentQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherNameQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalEntryQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link EstimateQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyInfoQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link QueryBase }{@code >}
     *     {@link JAXBElement }{@code <}{@link DepositQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseOrderQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTaxQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link BillPaymentCreditCardQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargeQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscountQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerMsgQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ClassQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditCardChargeQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentMethodQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShipMethodQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link FixedAssetQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateNameQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link TermQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link JobTypeQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link BillPaymentQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeActivityQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link UOMQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorTypeQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildAssemblyQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditMemoQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorCreditQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link PayrollItemQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditCardCreditQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link BillQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemReceiptQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link JobQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link BOMComponentQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesReceiptQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CheckQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTaxGroupQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTaxCodeQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaskQuery }{@code >}
     *     
     */
    public JAXBElement<? extends QueryBase> getQueryObjects() {
        return queryObjects;
    }

    /**
     * Sets the value of the queryObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditCardRefundQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerTypeQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link InvoiceQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesRepQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemConsolidatedQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemGroupComponentQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOrderQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmployeeQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventorySiteQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTaxPaymentCheckQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link PayrollNonWageItemQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccountQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventoryTransferQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExternalRoleQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventoryAdjustmentQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherNameQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalEntryQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link EstimateQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyInfoQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link QueryBase }{@code >}
     *     {@link JAXBElement }{@code <}{@link DepositQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseOrderQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTaxQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link BillPaymentCreditCardQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargeQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscountQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerMsgQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ClassQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditCardChargeQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentMethodQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShipMethodQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link FixedAssetQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateNameQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link TermQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link JobTypeQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link BillPaymentQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeActivityQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link UOMQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorTypeQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildAssemblyQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditMemoQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorCreditQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link PayrollItemQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditCardCreditQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link BillQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemReceiptQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link JobQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link BOMComponentQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesReceiptQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link CheckQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTaxGroupQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTaxCodeQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorQuery }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaskQuery }{@code >}
     *     
     */
    public void setQueryObjects(JAXBElement<? extends QueryBase> value) {
        this.queryObjects = ((JAXBElement<? extends QueryBase> ) value);
    }

}
