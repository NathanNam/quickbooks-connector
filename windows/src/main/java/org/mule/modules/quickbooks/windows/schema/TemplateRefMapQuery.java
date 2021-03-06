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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateRefMapQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateRefMapQuery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}QueryBase">
 *       &lt;sequence>
 *         &lt;element name="TemplateRefParam" type="{http://www.intuit.com/sb/cdm/v2}TemplateRefParam" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateRefMapQuery", propOrder = {
    "templateRefParam"
})
public class TemplateRefMapQuery
    extends QueryBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TemplateRefParam", required = true)
    protected List<TemplateRefParam> templateRefParam;

    /**
     * Gets the value of the templateRefParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateRefParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateRefParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateRefParam }
     * 
     * 
     */
    public List<TemplateRefParam> getTemplateRefParam() {
        if (templateRefParam == null) {
            templateRefParam = new ArrayList<TemplateRefParam>();
        }
        return this.templateRefParam;
    }

    /**
     * Sets the value of the templateRefParam property.
     * 
     * @param templateRefParam
     *     allowed object is
     *     {@link TemplateRefParam }
     *     
     */
    public void setTemplateRefParam(List<TemplateRefParam> templateRefParam) {
        this.templateRefParam = templateRefParam;
    }

}
