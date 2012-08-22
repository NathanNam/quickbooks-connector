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
 * <p>Java class for SalesRep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesRep">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmBase">
 *       &lt;sequence>
 *         &lt;element name="NameOf" type="{http://www.intuit.com/sb/cdm/v2}SalesRepTypeEnum" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Employee" type="{http://www.intuit.com/sb/cdm/v2}EmployeeRef" minOccurs="0"/>
 *           &lt;element name="Vendor" type="{http://www.intuit.com/sb/cdm/v2}VendorRef" minOccurs="0"/>
 *           &lt;element name="OtherName" type="{http://www.intuit.com/sb/cdm/v2}OtherNameRef" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Initials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesRep", propOrder = {
    "nameOf",
    "employee",
    "vendor",
    "otherName",
    "initials"
})
public class SalesRep
    extends CdmBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NameOf")
    protected SalesRepTypeEnum nameOf;
    @XmlElement(name = "Employee")
    protected EmployeeRef employee;
    @XmlElement(name = "Vendor")
    protected VendorRef vendor;
    @XmlElement(name = "OtherName")
    protected OtherNameRef otherName;
    @XmlElement(name = "Initials")
    protected String initials;

    /**
     * Gets the value of the nameOf property.
     * 
     * @return
     *     possible object is
     *     {@link SalesRepTypeEnum }
     *     
     */
    public SalesRepTypeEnum getNameOf() {
        return nameOf;
    }

    /**
     * Sets the value of the nameOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesRepTypeEnum }
     *     
     */
    public void setNameOf(SalesRepTypeEnum value) {
        this.nameOf = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeRef }
     *     
     */
    public EmployeeRef getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeRef }
     *     
     */
    public void setEmployee(EmployeeRef value) {
        this.employee = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link VendorRef }
     *     
     */
    public VendorRef getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorRef }
     *     
     */
    public void setVendor(VendorRef value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the otherName property.
     * 
     * @return
     *     possible object is
     *     {@link OtherNameRef }
     *     
     */
    public OtherNameRef getOtherName() {
        return otherName;
    }

    /**
     * Sets the value of the otherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherNameRef }
     *     
     */
    public void setOtherName(OtherNameRef value) {
        this.otherName = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

}
