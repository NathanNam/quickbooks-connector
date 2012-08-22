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
 * definition of one or many offerings associated with each company
 * 
 * <p>Java class for Offering complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Offering">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferingId" type="{http://www.intuit.com/sb/cdm/v2}offeringId" minOccurs="0"/>
 *         &lt;element name="OfferingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TrialExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CancelationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Seats" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="SeatType" type="{http://www.intuit.com/sb/cdm/v2}seatType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Offering", propOrder = {
    "offeringId",
    "offeringName",
    "activationDate",
    "trialExpiryDate",
    "cancelationDate",
    "seats",
    "seatType"
})
public class Offering
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OfferingId")
    protected OfferingId offeringId;
    @XmlElement(name = "OfferingName")
    protected String offeringName;
    @XmlElement(name = "ActivationDate", type = String.class)
    @XmlJavaTypeAdapter(QBDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date activationDate;
    @XmlElement(name = "TrialExpiryDate", type = String.class)
    @XmlJavaTypeAdapter(QBDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date trialExpiryDate;
    @XmlElement(name = "CancelationDate", type = String.class)
    @XmlJavaTypeAdapter(QBDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date cancelationDate;
    @XmlElement(name = "Seats")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger seats;
    @XmlElement(name = "SeatType")
    protected SeatType seatType;

    /**
     * Gets the value of the offeringId property.
     * 
     * @return
     *     possible object is
     *     {@link OfferingId }
     *     
     */
    public OfferingId getOfferingId() {
        return offeringId;
    }

    /**
     * Sets the value of the offeringId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferingId }
     *     
     */
    public void setOfferingId(OfferingId value) {
        this.offeringId = value;
    }

    /**
     * Gets the value of the offeringName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferingName() {
        return offeringName;
    }

    /**
     * Sets the value of the offeringName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferingName(String value) {
        this.offeringName = value;
    }

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationDate(Date value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the trialExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTrialExpiryDate() {
        return trialExpiryDate;
    }

    /**
     * Sets the value of the trialExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrialExpiryDate(Date value) {
        this.trialExpiryDate = value;
    }

    /**
     * Gets the value of the cancelationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCancelationDate() {
        return cancelationDate;
    }

    /**
     * Sets the value of the cancelationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelationDate(Date value) {
        this.cancelationDate = value;
    }

    /**
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeats(BigInteger value) {
        this.seats = value;
    }

    /**
     * Gets the value of the seatType property.
     * 
     * @return
     *     possible object is
     *     {@link SeatType }
     *     
     */
    public SeatType getSeatType() {
        return seatType;
    }

    /**
     * Sets the value of the seatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatType }
     *     
     */
    public void setSeatType(SeatType value) {
        this.seatType = value;
    }

}
