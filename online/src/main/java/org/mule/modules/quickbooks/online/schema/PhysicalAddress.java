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
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.mule.modules.quickbooks.utils.QBDateAdapter;


/**
 * Specifies the Physical address type, this object is always manipulated in context of another parent object like Person, Organization etc
 * 
 * <p>Java class for PhysicalAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.intuit.com/sb/cdm/v2}IdType" minOccurs="0"/>
 *         &lt;element name="Line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountrySubDivisionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCodeSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastVerified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalAddress", propOrder = {
    "id",
    "line1",
    "line2",
    "line3",
    "line4",
    "line5",
    "city",
    "county",
    "countyCode",
    "country",
    "countryCode",
    "countrySubDivisionCode",
    "postalCode",
    "postalCodeSuffix",
    "geoCode",
    "dateLastVerified",
    "_default",
    "tag"
})
public class PhysicalAddress
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Id")
    protected IdType id;
    @XmlElement(name = "Line1")
    protected String line1;
    @XmlElement(name = "Line2")
    protected String line2;
    @XmlElement(name = "Line3")
    protected String line3;
    @XmlElement(name = "Line4")
    protected String line4;
    @XmlElement(name = "Line5")
    protected String line5;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "CountyCode")
    protected String countyCode;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "CountrySubDivisionCode")
    protected String countrySubDivisionCode;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "PostalCodeSuffix")
    protected String postalCodeSuffix;
    @XmlElement(name = "GeoCode")
    protected String geoCode;
    @XmlElement(name = "DateLastVerified", type = String.class)
    @XmlJavaTypeAdapter(QBDateAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date dateLastVerified;
    @XmlElement(name = "Default")
    protected Boolean _default;
    @XmlElement(name = "Tag")
    protected List<String> tag;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setId(IdType value) {
        this.id = value;
    }

    /**
     * Gets the value of the line1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine1(String value) {
        this.line1 = value;
    }

    /**
     * Gets the value of the line2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine2(String value) {
        this.line2 = value;
    }

    /**
     * Gets the value of the line3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine3() {
        return line3;
    }

    /**
     * Sets the value of the line3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine3(String value) {
        this.line3 = value;
    }

    /**
     * Gets the value of the line4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine4() {
        return line4;
    }

    /**
     * Sets the value of the line4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine4(String value) {
        this.line4 = value;
    }

    /**
     * Gets the value of the line5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine5() {
        return line5;
    }

    /**
     * Sets the value of the line5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine5(String value) {
        this.line5 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the countyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * Sets the value of the countyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyCode(String value) {
        this.countyCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countrySubDivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubDivisionCode() {
        return countrySubDivisionCode;
    }

    /**
     * Sets the value of the countrySubDivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubDivisionCode(String value) {
        this.countrySubDivisionCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the postalCodeSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCodeSuffix() {
        return postalCodeSuffix;
    }

    /**
     * Sets the value of the postalCodeSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCodeSuffix(String value) {
        this.postalCodeSuffix = value;
    }

    /**
     * Gets the value of the geoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoCode() {
        return geoCode;
    }

    /**
     * Sets the value of the geoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoCode(String value) {
        this.geoCode = value;
    }

    /**
     * Gets the value of the dateLastVerified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDateLastVerified() {
        return dateLastVerified;
    }

    /**
     * Sets the value of the dateLastVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLastVerified(Date value) {
        this.dateLastVerified = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefault(Boolean value) {
        this._default = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTag() {
        if (tag == null) {
            tag = new ArrayList<String>();
        }
        return this.tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param tag
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(List<String> tag) {
        this.tag = tag;
    }

}
