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
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.mule.modules.quickbooks.utils.QBDateAdapter;


/**
 * Information about a specific good or service purchased for which payment is being demanded, as part of a PurchaseOrder
 * 
 * <p>Java class for PurchaseOrderLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}LineBase">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}ClassReferenceGroup" minOccurs="0"/>
 *         &lt;element name="ReimbursableInfo" type="{http://www.intuit.com/sb/cdm/v2}ReimbursableInfo" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}SellableItemGroup" minOccurs="0"/>
 *         &lt;element name="ManPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Custom1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custom2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseOrderLine", propOrder = {
    "amount",
    "classId",
    "className",
    "reimbursableInfo",
    "itemId",
    "itemName",
    "itemType",
    "unitPrice",
    "qty",
    "uomId",
    "uomAbbrv",
    "overrideItemAccountId",
    "overrideItemAccountName",
    "manPartNum",
    "serviceDate",
    "custom1",
    "custom2"
})
public class PurchaseOrderLine
    extends LineBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "ClassId")
    protected IdType classId;
    @XmlElement(name = "ClassName")
    protected String className;
    @XmlElement(name = "ReimbursableInfo")
    protected ReimbursableInfo reimbursableInfo;
    @XmlElement(name = "ItemId")
    protected IdType itemId;
    @XmlElement(name = "ItemName")
    protected String itemName;
    @XmlElement(name = "ItemType")
    protected ItemTypeEnum itemType;
    @XmlElement(name = "UnitPrice")
    protected BigDecimal unitPrice;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "UOMId")
    protected IdType uomId;
    @XmlElement(name = "UOMAbbrv")
    protected String uomAbbrv;
    @XmlElement(name = "OverrideItemAccountId")
    protected IdType overrideItemAccountId;
    @XmlElement(name = "OverrideItemAccountName")
    protected String overrideItemAccountName;
    @XmlElement(name = "ManPartNum")
    protected String manPartNum;
    @XmlElement(name = "ServiceDate", type = String.class)
    @XmlJavaTypeAdapter(QBDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date serviceDate;
    @XmlElement(name = "Custom1")
    protected String custom1;
    @XmlElement(name = "Custom2")
    protected String custom2;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setClassId(IdType value) {
        this.classId = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the reimbursableInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReimbursableInfo }
     *     
     */
    public ReimbursableInfo getReimbursableInfo() {
        return reimbursableInfo;
    }

    /**
     * Sets the value of the reimbursableInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReimbursableInfo }
     *     
     */
    public void setReimbursableInfo(ReimbursableInfo value) {
        this.reimbursableInfo = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setItemId(IdType value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link ItemTypeEnum }
     *     
     */
    public ItemTypeEnum getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTypeEnum }
     *     
     */
    public void setItemType(ItemTypeEnum value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the uomId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getUOMId() {
        return uomId;
    }

    /**
     * Sets the value of the uomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setUOMId(IdType value) {
        this.uomId = value;
    }

    /**
     * Gets the value of the uomAbbrv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOMAbbrv() {
        return uomAbbrv;
    }

    /**
     * Sets the value of the uomAbbrv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOMAbbrv(String value) {
        this.uomAbbrv = value;
    }

    /**
     * Gets the value of the overrideItemAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getOverrideItemAccountId() {
        return overrideItemAccountId;
    }

    /**
     * Sets the value of the overrideItemAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setOverrideItemAccountId(IdType value) {
        this.overrideItemAccountId = value;
    }

    /**
     * Gets the value of the overrideItemAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideItemAccountName() {
        return overrideItemAccountName;
    }

    /**
     * Sets the value of the overrideItemAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideItemAccountName(String value) {
        this.overrideItemAccountName = value;
    }

    /**
     * Gets the value of the manPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManPartNum() {
        return manPartNum;
    }

    /**
     * Sets the value of the manPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManPartNum(String value) {
        this.manPartNum = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDate(Date value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the custom1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom1() {
        return custom1;
    }

    /**
     * Sets the value of the custom1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom1(String value) {
        this.custom1 = value;
    }

    /**
     * Gets the value of the custom2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom2() {
        return custom2;
    }

    /**
     * Sets the value of the custom2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom2(String value) {
        this.custom2 = value;
    }

}
