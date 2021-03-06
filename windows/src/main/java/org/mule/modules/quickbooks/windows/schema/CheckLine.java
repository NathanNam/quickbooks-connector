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
// Generated on: 2014.08.15 at 05:31:44 PM GMT-03:00 
//


package org.mule.modules.quickbooks.windows.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Product: ALL
 *         Description: Information about a specific good or service for which the check is being issued.
 *       
 * 
 * <p>Java class for CheckLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}LinePurchase">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckLine")
public class CheckLine
    extends LinePurchase
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
