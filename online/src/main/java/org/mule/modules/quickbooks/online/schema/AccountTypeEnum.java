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
 * <p>Java class for AccountTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Asset"/>
 *     &lt;enumeration value="Equity"/>
 *     &lt;enumeration value="Expense"/>
 *     &lt;enumeration value="Liability"/>
 *     &lt;enumeration value="Revenue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountTypeEnum")
@XmlEnum
public enum AccountTypeEnum {

    @XmlEnumValue("Asset")
    ASSET("Asset"),
    @XmlEnumValue("Equity")
    EQUITY("Equity"),
    @XmlEnumValue("Expense")
    EXPENSE("Expense"),
    @XmlEnumValue("Liability")
    LIABILITY("Liability"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue");
    private final String value;

    AccountTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountTypeEnum fromValue(String v) {
        for (AccountTypeEnum c: AccountTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
