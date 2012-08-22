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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Financial Transaction information that pertains to the entire CreditCardCharge.
 * 
 * <p>Java class for CreditCardChargeHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardChargeHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}HeaderBase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}CreditCardAccountReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}EntityReferenceGroup" minOccurs="0"/>
 *         &lt;element name="TotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardChargeHeader", propOrder = {
    "ccAccountId",
    "ccAccountName",
    "entityId",
    "entityName",
    "entityType",
    "totalAmt"
})
public class CreditCardChargeHeader
    extends HeaderBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CCAccountId")
    protected IdType ccAccountId;
    @XmlElement(name = "CCAccountName")
    protected String ccAccountName;
    @XmlElement(name = "EntityId")
    protected IdType entityId;
    @XmlElement(name = "EntityName")
    protected String entityName;
    @XmlElement(name = "EntityType")
    protected EntityTypeEnum entityType;
    @XmlElement(name = "TotalAmt")
    protected BigDecimal totalAmt;

    /**
     * Gets the value of the ccAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getCCAccountId() {
        return ccAccountId;
    }

    /**
     * Sets the value of the ccAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setCCAccountId(IdType value) {
        this.ccAccountId = value;
    }

    /**
     * Gets the value of the ccAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCAccountName() {
        return ccAccountName;
    }

    /**
     * Sets the value of the ccAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCAccountName(String value) {
        this.ccAccountName = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setEntityId(IdType value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeEnum }
     *     
     */
    public EntityTypeEnum getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeEnum }
     *     
     */
    public void setEntityType(EntityTypeEnum value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

}
