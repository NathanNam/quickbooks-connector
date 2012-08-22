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
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.mule.modules.quickbooks.utils.QBDateAdapter;


/**
 *  Describes the Party as a Customer Role view 
 * 
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}RoleBase">
 *       &lt;sequence>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}CustomerTypeReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}SalesTermReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}SalesRepReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}SalesTaxCodeReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}TaxChoiceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}PaymentMethodReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}PriceLevelReferenceGroup" minOccurs="0"/>
 *         &lt;element name="OpenBalance" type="{http://www.intuit.com/sb/cdm/v2}Money" minOccurs="0"/>
 *         &lt;element name="OpenBalanceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="OpenBalanceWithJobs" type="{http://www.intuit.com/sb/cdm/v2}Money" minOccurs="0"/>
 *         &lt;element name="CreditLimit" type="{http://www.intuit.com/sb/cdm/v2}Money" minOccurs="0"/>
 *         &lt;element name="AcctNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverDueBalance" type="{http://www.intuit.com/sb/cdm/v2}Money" minOccurs="0"/>
 *         &lt;element name="TotalRevenue" type="{http://www.intuit.com/sb/cdm/v2}Money" minOccurs="0"/>
 *         &lt;element name="TotalExpense" type="{http://www.intuit.com/sb/cdm/v2}Money" minOccurs="0"/>
 *         &lt;element name="JobInfo" type="{http://www.intuit.com/sb/cdm/v2}JobInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "active",
    "showAs",
    "customerTypeId",
    "customerTypeName",
    "salesTermId",
    "salesTermName",
    "salesRepId",
    "salesRepName",
    "salesTaxCodeId",
    "salesTaxCodeName",
    "taxId",
    "taxName",
    "taxGroupId",
    "taxGroupName",
    "paymentMethodId",
    "paymentMethodName",
    "priceLevelId",
    "priceLevelName",
    "openBalance",
    "openBalanceDate",
    "openBalanceWithJobs",
    "creditLimit",
    "acctNum",
    "overDueBalance",
    "totalRevenue",
    "totalExpense",
    "jobInfo"
})
@XmlSeeAlso({
    Job.class
})
public class Customer
    extends RoleBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "ShowAs")
    protected String showAs;
    @XmlElement(name = "CustomerTypeId")
    protected IdType customerTypeId;
    @XmlElement(name = "CustomerTypeName")
    protected String customerTypeName;
    @XmlElement(name = "SalesTermId")
    protected IdType salesTermId;
    @XmlElement(name = "SalesTermName")
    protected String salesTermName;
    @XmlElement(name = "SalesRepId")
    protected IdType salesRepId;
    @XmlElement(name = "SalesRepName")
    protected String salesRepName;
    @XmlElement(name = "SalesTaxCodeId")
    protected IdType salesTaxCodeId;
    @XmlElement(name = "SalesTaxCodeName")
    protected String salesTaxCodeName;
    @XmlElement(name = "TaxId")
    protected IdType taxId;
    @XmlElement(name = "TaxName")
    protected String taxName;
    @XmlElement(name = "TaxGroupId")
    protected IdType taxGroupId;
    @XmlElement(name = "TaxGroupName")
    protected String taxGroupName;
    @XmlElement(name = "PaymentMethodId")
    protected IdType paymentMethodId;
    @XmlElement(name = "PaymentMethodName")
    protected String paymentMethodName;
    @XmlElement(name = "PriceLevelId")
    protected IdType priceLevelId;
    @XmlElement(name = "PriceLevelName")
    protected String priceLevelName;
    @XmlElement(name = "OpenBalance")
    protected Money openBalance;
    @XmlElement(name = "OpenBalanceDate", type = String.class)
    @XmlJavaTypeAdapter(QBDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date openBalanceDate;
    @XmlElement(name = "OpenBalanceWithJobs")
    protected Money openBalanceWithJobs;
    @XmlElement(name = "CreditLimit")
    protected Money creditLimit;
    @XmlElement(name = "AcctNum")
    protected String acctNum;
    @XmlElement(name = "OverDueBalance")
    protected Money overDueBalance;
    @XmlElement(name = "TotalRevenue")
    protected Money totalRevenue;
    @XmlElement(name = "TotalExpense")
    protected Money totalExpense;
    @XmlElement(name = "JobInfo")
    protected JobInfo jobInfo;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the showAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowAs() {
        return showAs;
    }

    /**
     * Sets the value of the showAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowAs(String value) {
        this.showAs = value;
    }

    /**
     * Gets the value of the customerTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getCustomerTypeId() {
        return customerTypeId;
    }

    /**
     * Sets the value of the customerTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setCustomerTypeId(IdType value) {
        this.customerTypeId = value;
    }

    /**
     * Gets the value of the customerTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTypeName() {
        return customerTypeName;
    }

    /**
     * Sets the value of the customerTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTypeName(String value) {
        this.customerTypeName = value;
    }

    /**
     * Gets the value of the salesTermId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getSalesTermId() {
        return salesTermId;
    }

    /**
     * Sets the value of the salesTermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setSalesTermId(IdType value) {
        this.salesTermId = value;
    }

    /**
     * Gets the value of the salesTermName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTermName() {
        return salesTermName;
    }

    /**
     * Sets the value of the salesTermName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTermName(String value) {
        this.salesTermName = value;
    }

    /**
     * Gets the value of the salesRepId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getSalesRepId() {
        return salesRepId;
    }

    /**
     * Sets the value of the salesRepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setSalesRepId(IdType value) {
        this.salesRepId = value;
    }

    /**
     * Gets the value of the salesRepName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepName() {
        return salesRepName;
    }

    /**
     * Sets the value of the salesRepName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepName(String value) {
        this.salesRepName = value;
    }

    /**
     * Gets the value of the salesTaxCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getSalesTaxCodeId() {
        return salesTaxCodeId;
    }

    /**
     * Sets the value of the salesTaxCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setSalesTaxCodeId(IdType value) {
        this.salesTaxCodeId = value;
    }

    /**
     * Gets the value of the salesTaxCodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTaxCodeName() {
        return salesTaxCodeName;
    }

    /**
     * Sets the value of the salesTaxCodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTaxCodeName(String value) {
        this.salesTaxCodeName = value;
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
     * Gets the value of the paymentMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getPaymentMethodId() {
        return paymentMethodId;
    }

    /**
     * Sets the value of the paymentMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setPaymentMethodId(IdType value) {
        this.paymentMethodId = value;
    }

    /**
     * Gets the value of the paymentMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    /**
     * Sets the value of the paymentMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodName(String value) {
        this.paymentMethodName = value;
    }

    /**
     * Gets the value of the priceLevelId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getPriceLevelId() {
        return priceLevelId;
    }

    /**
     * Sets the value of the priceLevelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setPriceLevelId(IdType value) {
        this.priceLevelId = value;
    }

    /**
     * Gets the value of the priceLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceLevelName() {
        return priceLevelName;
    }

    /**
     * Sets the value of the priceLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceLevelName(String value) {
        this.priceLevelName = value;
    }

    /**
     * Gets the value of the openBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getOpenBalance() {
        return openBalance;
    }

    /**
     * Sets the value of the openBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setOpenBalance(Money value) {
        this.openBalance = value;
    }

    /**
     * Gets the value of the openBalanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getOpenBalanceDate() {
        return openBalanceDate;
    }

    /**
     * Sets the value of the openBalanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenBalanceDate(Date value) {
        this.openBalanceDate = value;
    }

    /**
     * Gets the value of the openBalanceWithJobs property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getOpenBalanceWithJobs() {
        return openBalanceWithJobs;
    }

    /**
     * Sets the value of the openBalanceWithJobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setOpenBalanceWithJobs(Money value) {
        this.openBalanceWithJobs = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCreditLimit(Money value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the acctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNum() {
        return acctNum;
    }

    /**
     * Sets the value of the acctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNum(String value) {
        this.acctNum = value;
    }

    /**
     * Gets the value of the overDueBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getOverDueBalance() {
        return overDueBalance;
    }

    /**
     * Sets the value of the overDueBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setOverDueBalance(Money value) {
        this.overDueBalance = value;
    }

    /**
     * Gets the value of the totalRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalRevenue() {
        return totalRevenue;
    }

    /**
     * Sets the value of the totalRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalRevenue(Money value) {
        this.totalRevenue = value;
    }

    /**
     * Gets the value of the totalExpense property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalExpense() {
        return totalExpense;
    }

    /**
     * Sets the value of the totalExpense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalExpense(Money value) {
        this.totalExpense = value;
    }

    /**
     * Gets the value of the jobInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JobInfo }
     *     
     */
    public JobInfo getJobInfo() {
        return jobInfo;
    }

    /**
     * Sets the value of the jobInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobInfo }
     *     
     */
    public void setJobInfo(JobInfo value) {
        this.jobInfo = value;
    }

}
