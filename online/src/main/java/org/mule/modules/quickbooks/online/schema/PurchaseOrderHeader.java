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
 * Financial Transaction information that pertains to the entire PurchaseOrder.
 * 
 * <p>Java class for PurchaseOrderHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}HeaderPurchase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}ClassReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}SalesTermReferenceGroup" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExpectedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RemitToAddr" type="{http://www.intuit.com/sb/cdm/v2}PhysicalAddress" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="DropShipToCustomer" type="{http://www.intuit.com/sb/cdm/v2}CustomerRef" minOccurs="0"/>
 *           &lt;element name="DropShipToVendor" type="{http://www.intuit.com/sb/cdm/v2}VendorRef" minOccurs="0"/>
 *           &lt;element name="DropShipToEmployee" type="{http://www.intuit.com/sb/cdm/v2}EmployeeRef" minOccurs="0"/>
 *           &lt;element name="DropShipToOtherName" type="{http://www.intuit.com/sb/cdm/v2}OtherNameRef" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="ShipAddr" type="{http://www.intuit.com/sb/cdm/v2}PhysicalAddress" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}ShipMethodReferenceGroup" minOccurs="0"/>
 *         &lt;element name="FOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToBePrinted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ToBeEmailed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "PurchaseOrderHeader", propOrder = {
    "classId",
    "className",
    "salesTermId",
    "salesTermName",
    "dueDate",
    "expectedDate",
    "remitToAddr",
    "dropShipToCustomer",
    "dropShipToVendor",
    "dropShipToEmployee",
    "dropShipToOtherName",
    "shipAddr",
    "shipMethodId",
    "shipMethodName",
    "fob",
    "poEmail",
    "toBePrinted",
    "toBeEmailed",
    "custom1",
    "custom2"
})
public class PurchaseOrderHeader
    extends HeaderPurchase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClassId")
    protected IdType classId;
    @XmlElement(name = "ClassName")
    protected String className;
    @XmlElement(name = "SalesTermId")
    protected IdType salesTermId;
    @XmlElement(name = "SalesTermName")
    protected String salesTermName;
    @XmlElement(name = "DueDate", type = String.class)
    @XmlJavaTypeAdapter(QBDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date dueDate;
    @XmlElement(name = "ExpectedDate", type = String.class)
    @XmlJavaTypeAdapter(QBDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date expectedDate;
    @XmlElement(name = "RemitToAddr")
    protected PhysicalAddress remitToAddr;
    @XmlElement(name = "DropShipToCustomer")
    protected CustomerRef dropShipToCustomer;
    @XmlElement(name = "DropShipToVendor")
    protected VendorRef dropShipToVendor;
    @XmlElement(name = "DropShipToEmployee")
    protected EmployeeRef dropShipToEmployee;
    @XmlElement(name = "DropShipToOtherName")
    protected OtherNameRef dropShipToOtherName;
    @XmlElement(name = "ShipAddr")
    protected PhysicalAddress shipAddr;
    @XmlElement(name = "ShipMethodId")
    protected IdType shipMethodId;
    @XmlElement(name = "ShipMethodName")
    protected String shipMethodName;
    @XmlElement(name = "FOB")
    protected String fob;
    @XmlElement(name = "POEmail")
    protected String poEmail;
    @XmlElement(name = "ToBePrinted")
    protected Boolean toBePrinted;
    @XmlElement(name = "ToBeEmailed")
    protected Boolean toBeEmailed;
    @XmlElement(name = "Custom1")
    protected String custom1;
    @XmlElement(name = "Custom2")
    protected String custom2;

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
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(Date value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the expectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getExpectedDate() {
        return expectedDate;
    }

    /**
     * Sets the value of the expectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedDate(Date value) {
        this.expectedDate = value;
    }

    /**
     * Gets the value of the remitToAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getRemitToAddr() {
        return remitToAddr;
    }

    /**
     * Sets the value of the remitToAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setRemitToAddr(PhysicalAddress value) {
        this.remitToAddr = value;
    }

    /**
     * Gets the value of the dropShipToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRef }
     *     
     */
    public CustomerRef getDropShipToCustomer() {
        return dropShipToCustomer;
    }

    /**
     * Sets the value of the dropShipToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRef }
     *     
     */
    public void setDropShipToCustomer(CustomerRef value) {
        this.dropShipToCustomer = value;
    }

    /**
     * Gets the value of the dropShipToVendor property.
     * 
     * @return
     *     possible object is
     *     {@link VendorRef }
     *     
     */
    public VendorRef getDropShipToVendor() {
        return dropShipToVendor;
    }

    /**
     * Sets the value of the dropShipToVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorRef }
     *     
     */
    public void setDropShipToVendor(VendorRef value) {
        this.dropShipToVendor = value;
    }

    /**
     * Gets the value of the dropShipToEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeRef }
     *     
     */
    public EmployeeRef getDropShipToEmployee() {
        return dropShipToEmployee;
    }

    /**
     * Sets the value of the dropShipToEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeRef }
     *     
     */
    public void setDropShipToEmployee(EmployeeRef value) {
        this.dropShipToEmployee = value;
    }

    /**
     * Gets the value of the dropShipToOtherName property.
     * 
     * @return
     *     possible object is
     *     {@link OtherNameRef }
     *     
     */
    public OtherNameRef getDropShipToOtherName() {
        return dropShipToOtherName;
    }

    /**
     * Sets the value of the dropShipToOtherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherNameRef }
     *     
     */
    public void setDropShipToOtherName(OtherNameRef value) {
        this.dropShipToOtherName = value;
    }

    /**
     * Gets the value of the shipAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getShipAddr() {
        return shipAddr;
    }

    /**
     * Sets the value of the shipAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setShipAddr(PhysicalAddress value) {
        this.shipAddr = value;
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
     * Gets the value of the fob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOB() {
        return fob;
    }

    /**
     * Sets the value of the fob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOB(String value) {
        this.fob = value;
    }

    /**
     * Gets the value of the poEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOEmail() {
        return poEmail;
    }

    /**
     * Sets the value of the poEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOEmail(String value) {
        this.poEmail = value;
    }

    /**
     * Gets the value of the toBePrinted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getToBePrinted() {
        return toBePrinted;
    }

    /**
     * Sets the value of the toBePrinted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToBePrinted(Boolean value) {
        this.toBePrinted = value;
    }

    /**
     * Gets the value of the toBeEmailed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getToBeEmailed() {
        return toBeEmailed;
    }

    /**
     * Sets the value of the toBeEmailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToBeEmailed(Boolean value) {
        this.toBeEmailed = value;
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
