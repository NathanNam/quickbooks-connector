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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.mule.modules.quickbooks.utils.QBDateAdapter;


/**
 * <p>Java class for Preferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Preferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}PrefsAccountingGroup"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}PrefsMultiCurrency"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}PrefsPurchaseAndVendor"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}PrefsSalesAndCustomers"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}PrefsSalesTax"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preferences", propOrder = {
    "usingAccountNumbers",
    "requiringAccounts",
    "usingClasses",
    "closingDate",
    "usingMultiCurrency",
    "homeCurrency",
    "usingInventory",
    "daysBillsAreDue",
    "discountAccountId",
    "discountAccountName",
    "shipMethodId",
    "shipMethodName",
    "defaultMarkup",
    "trackReimbursableExpenses",
    "autoApplyPayments",
    "taxId",
    "taxName",
    "taxGroupId",
    "taxGroupName",
    "paySalesTax"
})
public class Preferences
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UsingAccountNumbers")
    protected boolean usingAccountNumbers;
    @XmlElement(name = "RequiringAccounts")
    protected boolean requiringAccounts;
    @XmlElement(name = "UsingClasses")
    protected boolean usingClasses;
    @XmlElement(name = "ClosingDate", type = String.class)
    @XmlJavaTypeAdapter(QBDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date closingDate;
    @XmlElement(name = "UsingMultiCurrency")
    protected boolean usingMultiCurrency;
    @XmlElement(name = "HomeCurrency")
    protected CurrencyCode homeCurrency;
    @XmlElement(name = "UsingInventory")
    protected boolean usingInventory;
    @XmlElement(name = "DaysBillsAreDue", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger daysBillsAreDue;
    @XmlElement(name = "DiscountAccountId")
    protected IdType discountAccountId;
    @XmlElement(name = "DiscountAccountName")
    protected String discountAccountName;
    @XmlElement(name = "ShipMethodId")
    protected IdType shipMethodId;
    @XmlElement(name = "ShipMethodName")
    protected String shipMethodName;
    @XmlElement(name = "DefaultMarkup", required = true)
    protected BigDecimal defaultMarkup;
    @XmlElement(name = "TrackReimbursableExpenses")
    protected boolean trackReimbursableExpenses;
    @XmlElement(name = "AutoApplyPayments")
    protected boolean autoApplyPayments;
    @XmlElement(name = "TaxId")
    protected IdType taxId;
    @XmlElement(name = "TaxName")
    protected String taxName;
    @XmlElement(name = "TaxGroupId")
    protected IdType taxGroupId;
    @XmlElement(name = "TaxGroupName")
    protected String taxGroupName;
    @XmlElement(name = "PaySalesTax")
    protected PaySalesTaxEnum paySalesTax;

    /**
     * Gets the value of the usingAccountNumbers property.
     * 
     */
    public boolean isUsingAccountNumbers() {
        return usingAccountNumbers;
    }

    /**
     * Sets the value of the usingAccountNumbers property.
     * 
     */
    public void setUsingAccountNumbers(boolean value) {
        this.usingAccountNumbers = value;
    }

    /**
     * Gets the value of the requiringAccounts property.
     * 
     */
    public boolean isRequiringAccounts() {
        return requiringAccounts;
    }

    /**
     * Sets the value of the requiringAccounts property.
     * 
     */
    public void setRequiringAccounts(boolean value) {
        this.requiringAccounts = value;
    }

    /**
     * Gets the value of the usingClasses property.
     * 
     */
    public boolean isUsingClasses() {
        return usingClasses;
    }

    /**
     * Sets the value of the usingClasses property.
     * 
     */
    public void setUsingClasses(boolean value) {
        this.usingClasses = value;
    }

    /**
     * Gets the value of the closingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getClosingDate() {
        return closingDate;
    }

    /**
     * Sets the value of the closingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingDate(Date value) {
        this.closingDate = value;
    }

    /**
     * Gets the value of the usingMultiCurrency property.
     * 
     */
    public boolean isUsingMultiCurrency() {
        return usingMultiCurrency;
    }

    /**
     * Sets the value of the usingMultiCurrency property.
     * 
     */
    public void setUsingMultiCurrency(boolean value) {
        this.usingMultiCurrency = value;
    }

    /**
     * Gets the value of the homeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getHomeCurrency() {
        return homeCurrency;
    }

    /**
     * Sets the value of the homeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setHomeCurrency(CurrencyCode value) {
        this.homeCurrency = value;
    }

    /**
     * Gets the value of the usingInventory property.
     * 
     */
    public boolean isUsingInventory() {
        return usingInventory;
    }

    /**
     * Sets the value of the usingInventory property.
     * 
     */
    public void setUsingInventory(boolean value) {
        this.usingInventory = value;
    }

    /**
     * Gets the value of the daysBillsAreDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysBillsAreDue() {
        return daysBillsAreDue;
    }

    /**
     * Sets the value of the daysBillsAreDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysBillsAreDue(BigInteger value) {
        this.daysBillsAreDue = value;
    }

    /**
     * Gets the value of the discountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getDiscountAccountId() {
        return discountAccountId;
    }

    /**
     * Sets the value of the discountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setDiscountAccountId(IdType value) {
        this.discountAccountId = value;
    }

    /**
     * Gets the value of the discountAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAccountName() {
        return discountAccountName;
    }

    /**
     * Sets the value of the discountAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAccountName(String value) {
        this.discountAccountName = value;
    }

    /**
     * Gets the value of the shipMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getShipMethodId() {
        return shipMethodId;
    }

    /**
     * Sets the value of the shipMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setShipMethodId(IdType value) {
        this.shipMethodId = value;
    }

    /**
     * Gets the value of the shipMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipMethodName() {
        return shipMethodName;
    }

    /**
     * Sets the value of the shipMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipMethodName(String value) {
        this.shipMethodName = value;
    }

    /**
     * Gets the value of the defaultMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultMarkup() {
        return defaultMarkup;
    }

    /**
     * Sets the value of the defaultMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultMarkup(BigDecimal value) {
        this.defaultMarkup = value;
    }

    /**
     * Gets the value of the trackReimbursableExpenses property.
     * 
     */
    public boolean isTrackReimbursableExpenses() {
        return trackReimbursableExpenses;
    }

    /**
     * Sets the value of the trackReimbursableExpenses property.
     * 
     */
    public void setTrackReimbursableExpenses(boolean value) {
        this.trackReimbursableExpenses = value;
    }

    /**
     * Gets the value of the autoApplyPayments property.
     * 
     */
    public boolean isAutoApplyPayments() {
        return autoApplyPayments;
    }

    /**
     * Sets the value of the autoApplyPayments property.
     * 
     */
    public void setAutoApplyPayments(boolean value) {
        this.autoApplyPayments = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setTaxId(IdType value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the taxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxName() {
        return taxName;
    }

    /**
     * Sets the value of the taxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    /**
     * Gets the value of the taxGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getTaxGroupId() {
        return taxGroupId;
    }

    /**
     * Sets the value of the taxGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setTaxGroupId(IdType value) {
        this.taxGroupId = value;
    }

    /**
     * Gets the value of the taxGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxGroupName() {
        return taxGroupName;
    }

    /**
     * Sets the value of the taxGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxGroupName(String value) {
        this.taxGroupName = value;
    }

    /**
     * Gets the value of the paySalesTax property.
     * 
     * @return
     *     possible object is
     *     {@link PaySalesTaxEnum }
     *     
     */
    public PaySalesTaxEnum getPaySalesTax() {
        return paySalesTax;
    }

    /**
     * Sets the value of the paySalesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySalesTaxEnum }
     *     
     */
    public void setPaySalesTax(PaySalesTaxEnum value) {
        this.paySalesTax = value;
    }

}
