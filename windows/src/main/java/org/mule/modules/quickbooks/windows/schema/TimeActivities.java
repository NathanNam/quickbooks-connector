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
 * 
 *         Product: QBW
 *         Description: Provides the definition that allows bulk data transfer of Time Activities
 *       
 * 
 * <p>Java class for TimeActivities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeActivities">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmCollections">
 *       &lt;sequence>
 *         &lt;element name="TimeActivity" type="{http://www.intuit.com/sb/cdm/v2}TimeActivity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeActivities", propOrder = {
    "timeActivity"
})
public class TimeActivities
    extends CdmCollections
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TimeActivity")
    protected List<TimeActivity> timeActivity;

    /**
     * Gets the value of the timeActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeActivity }
     * 
     * 
     */
    public List<TimeActivity> getTimeActivity() {
        if (timeActivity == null) {
            timeActivity = new ArrayList<TimeActivity>();
        }
        return this.timeActivity;
    }

    /**
     * Sets the value of the timeActivity property.
     * 
     * @param timeActivity
     *     allowed object is
     *     {@link TimeActivity }
     *     
     */
    public void setTimeActivity(List<TimeActivity> timeActivity) {
        this.timeActivity = timeActivity;
    }

}
