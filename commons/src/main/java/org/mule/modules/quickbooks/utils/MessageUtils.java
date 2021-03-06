/**
 * Mule QuickBooks Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.quickbooks.utils;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public abstract class MessageUtils
{      
    /**
     * Create Marshaller from the JAXB context. 
     * @return Marshaller 
     */
    public Marshaller createMarshaller()
    {
        try {
            Marshaller marshaller = getJaxbContext().createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            return marshaller;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Get object of ObjectFactory class generated using JAXB and XSD
     * @return ObjectFactory Class object.
     */
    protected abstract Object getObjectFactory();
    
    protected abstract JAXBContext getJaxbContext();
    
    /**
     * Create UnMarshaller from the JAXB context. 
     * @return UnMarshaller 
     */
    public Unmarshaller createUnmarshaller()
    {
        try {
            return getJaxbContext().createUnmarshaller();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * This method JAXBElement object to XML String.
     * IDS REST Services process XML string and Responds in XML.
     * @param objectToMarshall
     * @return
     * @throws JAXBException
     */
    public String getXmlDocument(JAXBElement<? extends Object> objectToMarshall) throws JAXBException
    {
        StringWriter writer = new StringWriter();
        Marshaller marshaller = createMarshaller();
        marshaller.marshal(objectToMarshall, writer);
        String documentToPost = writer.toString();
        return documentToPost;
    }
    
    /**
     * Clients of this method must make their own determination as to the contents of the response.
     * Generally this can be safely achieved by checking the instanceof.
     * @param responseString
     * @return The unmarshalled response object.
     * @throws JAXBException If the response unmarshaling fails.
     * @throws Exception
     */
    public abstract Object parseResponse(String responseString) throws JAXBException;
    
    public JAXBElement createJaxbElement(Object obj)
    {
        try
        {
            return (JAXBElement) getObjectFactory().getClass()
                .getMethod("create" + obj.getClass().getSimpleName(), obj.getClass())
                .invoke(getObjectFactory(), obj);
        }
        catch (Exception e)
        {
            throw new AssertionError(e);
        }
    }
}
