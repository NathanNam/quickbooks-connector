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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to output customer phone/contact, vendor phone/contact, employee phone/contact, account list,
 *             recurring template list, item list, payment method list, terms list, compensation list, tax list,
 *             other payments and deductions list, pay schedule list.
 * 
 * <p>Java class for QboListReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QboListReportResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReportRow" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QboListReportResponse", namespace = "http://www.intuit.com/sb/cdm/qboReports", propOrder = {
    "reportTitle",
    "reportRow"
})
public class QboListReportResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ReportTitle", required = true)
    protected String reportTitle;
    @XmlElement(name = "ReportRow")
    protected List<QboListReportResponse.ReportRow> reportRow;

    /**
     * Gets the value of the reportTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * Sets the value of the reportTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportTitle(String value) {
        this.reportTitle = value;
    }

    /**
     * Gets the value of the reportRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QboListReportResponse.ReportRow }
     * 
     * 
     */
    public List<QboListReportResponse.ReportRow> getReportRow() {
        if (reportRow == null) {
            reportRow = new ArrayList<QboListReportResponse.ReportRow>();
        }
        return this.reportRow;
    }

    /**
     * Sets the value of the reportRow property.
     * 
     * @param reportRow
     *     allowed object is
     *     {@link QboListReportResponse.ReportRow }
     *     
     */
    public void setReportRow(List<QboListReportResponse.ReportRow> reportRow) {
        this.reportRow = reportRow;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "column",
        "value"
    })
    public static class ReportRow
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Column", namespace = "http://www.intuit.com/sb/cdm/qboReports", required = true)
        protected String column;
        @XmlElement(name = "Value", namespace = "http://www.intuit.com/sb/cdm/qboReports", required = true)
        protected String value;

        /**
         * Gets the value of the column property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColumn() {
            return column;
        }

        /**
         * Sets the value of the column property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColumn(String value) {
            this.column = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
