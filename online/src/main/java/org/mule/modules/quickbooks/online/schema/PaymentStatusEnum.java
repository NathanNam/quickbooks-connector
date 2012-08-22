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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Draft"/>
 *     &lt;enumeration value="Overdue"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Payable"/>
 *     &lt;enumeration value="Paid"/>
 *     &lt;enumeration value="Trash"/>
 *     &lt;enumeration value="UnPaid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentStatusEnum")
@XmlEnum
public enum PaymentStatusEnum {

    @XmlEnumValue("Draft")
    DRAFT("Draft"),
    @XmlEnumValue("Overdue")
    OVERDUE("Overdue"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Payable")
    PAYABLE("Payable"),
    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("Trash")
    TRASH("Trash"),
    @XmlEnumValue("UnPaid")
    UN_PAID("UnPaid");
    private final String value;

    PaymentStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentStatusEnum fromValue(String v) {
        for (PaymentStatusEnum c: PaymentStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
