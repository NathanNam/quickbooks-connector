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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about a payment received, choosing and detailing a payment method (check,credit card, etc...)
 * 
 * <p>Java class for PaymentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Cash" type="{http://www.intuit.com/sb/cdm/v2}CashPayment" minOccurs="0"/>
 *         &lt;element name="CreditCard" type="{http://www.intuit.com/sb/cdm/v2}CreditCardPayment" minOccurs="0"/>
 *         &lt;element name="Check" type="{http://www.intuit.com/sb/cdm/v2}CheckPayment" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetail", propOrder = {
    "cash",
    "creditCard",
    "check"
})
public class PaymentDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Cash")
    protected CashPayment cash;
    @XmlElement(name = "CreditCard")
    protected CreditCardPayment creditCard;
    @XmlElement(name = "Check")
    protected CheckPayment check;

    /**
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link CashPayment }
     *     
     */
    public CashPayment getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashPayment }
     *     
     */
    public void setCash(CashPayment value) {
        this.cash = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardPayment }
     *     
     */
    public CreditCardPayment getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardPayment }
     *     
     */
    public void setCreditCard(CreditCardPayment value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPayment }
     *     
     */
    public CheckPayment getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPayment }
     *     
     */
    public void setCheck(CheckPayment value) {
        this.check = value;
    }

}