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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.mule.modules.quickbooks.utils.QBDateAdapter;


/**
 * Provides the definition to hold all required information needed when canceling Payroll.
 * 
 * <p>Java class for PayrollTerminationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayrollTerminationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyId" type="{http://www.intuit.com/sb/cdm/v2}IdType" minOccurs="0"/>
 *         &lt;element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PayrollSubscriptionTerminationReason" type="{http://www.intuit.com/sb/cdm/qbopayroll/v1}PayrollSubscriptionTerminationReasonEnum" minOccurs="0"/>
 *         &lt;element name="TerminationDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferralRating" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReferralReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayrollTerminationInfo", namespace = "http://www.intuit.com/sb/cdm/qbopayroll/v1", propOrder = {
    "companyId",
    "terminationDate",
    "payrollSubscriptionTerminationReason",
    "terminationDetails",
    "referralRating",
    "referralReason"
})
public class PayrollTerminationInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CompanyId")
    protected IdType companyId;
    @XmlElement(name = "TerminationDate", type = String.class)
    @XmlJavaTypeAdapter(QBDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date terminationDate;
    @XmlElement(name = "PayrollSubscriptionTerminationReason")
    protected PayrollSubscriptionTerminationReasonEnum payrollSubscriptionTerminationReason;
    @XmlElement(name = "TerminationDetails")
    protected String terminationDetails;
    @XmlElement(name = "ReferralRating")
    protected Integer referralRating;
    @XmlElement(name = "ReferralReason")
    protected String referralReason;

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setCompanyId(IdType value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationDate(Date value) {
        this.terminationDate = value;
    }

    /**
     * Gets the value of the payrollSubscriptionTerminationReason property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollSubscriptionTerminationReasonEnum }
     *     
     */
    public PayrollSubscriptionTerminationReasonEnum getPayrollSubscriptionTerminationReason() {
        return payrollSubscriptionTerminationReason;
    }

    /**
     * Sets the value of the payrollSubscriptionTerminationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollSubscriptionTerminationReasonEnum }
     *     
     */
    public void setPayrollSubscriptionTerminationReason(PayrollSubscriptionTerminationReasonEnum value) {
        this.payrollSubscriptionTerminationReason = value;
    }

    /**
     * Gets the value of the terminationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationDetails() {
        return terminationDetails;
    }

    /**
     * Sets the value of the terminationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationDetails(String value) {
        this.terminationDetails = value;
    }

    /**
     * Gets the value of the referralRating property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferralRating() {
        return referralRating;
    }

    /**
     * Sets the value of the referralRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferralRating(Integer value) {
        this.referralRating = value;
    }

    /**
     * Gets the value of the referralReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralReason() {
        return referralReason;
    }

    /**
     * Sets the value of the referralReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralReason(String value) {
        this.referralReason = value;
    }

}
