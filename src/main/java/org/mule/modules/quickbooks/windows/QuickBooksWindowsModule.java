/**
 * Mule QuickBooks Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * This file was automatically generated by the Mule Development Kit
 */
package org.mule.modules.quickbooks.windows;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Module;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.mule.modules.quickbooks.api.exception.QuickBooksRuntimeException;
import org.mule.modules.quickbooks.windows.api.DefaultQuickBooksWindowsClient;
import org.mule.modules.quickbooks.windows.api.QuickBooksWindowsClient;
import org.mule.modules.utils.mom.JaxbMapObjectMappers;

import com.zauberlabs.commons.mom.MapObjectMapper;



/**
 * QuickBooks software provides an interface that allows you to use forms such as checks, deposit slips and invoices,
 * making the accounting process more comfortable for the average business owner or manager. By using the built-in
 * functions that pertain to your business, you are able to perform your company accounting by simply recording your
 * vendor activities, customer activities, banking transactions, payroll checks and taxes. QuickBooks handles the
 * accounting portion of each transaction behind the scenes.
 *
 * Read more: QuickBooks Accounting Tutorial | eHow.com http://www.ehow.com/way_5462311_quickbooks-accounting-tutorial.html#ixzz1csaydwxl
 * @author MuleSoft, inc.
 */
@Module(name = "quickbooks-windows")
public class QuickBooksWindowsModule
{   
    /**
     * Quick-Books client. By default uses DefaultQuickBooksWindowsClient class.
     */
    @Configurable
    @Optional
    private QuickBooksWindowsClient client;
    
    private final MapObjectMapper mom = JaxbMapObjectMappers.defaultWithPackage("org.mule.modules.quickbooks.windows.schema").build();

    /**
     * The base uri of the quickbooks endpoint,
     * used to fetch the company uri. 
     * 
     * Quickbooks connector will first use this uri and the realmId to
     * get a second uri, called company uri, 
     * which is the actual quickbooks endpoint for the connector 
     *  
     */
    @Optional
    @Default("https://services.intuit.com/sb")
    @Configurable
    private String baseUri;
    
    
    /**
     * Creates.
     * 
     * For details of the supported objects and its fields: 
     * <a href="https://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/0050_Data_Services/
     * 0500_QuickBooks_Windows/0500_Supported_Objects">Supported Objects and Operations</a>
     * 
     * {@sample.xml ../../../doc/mule-module-quick-books-windows.xml.sample quickbooks-windows:create}
     *
     * @param realmId The realmID, also known as the Company ID, uniquely identifies the data for a company.
     *                In QuickBooks Online, the Company ID  appears on the My Account page.
     *                In Data Services for QuickBooks Online, the realmID is required in the URL for most calls.
     * @param appKey Application Id.
     * @param realmIdPseudonym Pseudonym Realm Id, obtained from the gateway that represents the company.
     * @param authIdPseudonym Pseudonym Auth Id, obtained from the gateway that represents the user.
     * @param type WindowsEntityType of the object.
     * @param obj Map that represents the object to be created.
     * @param draft Boolean draft
     * @param fullResponse Boolean fullResponse
     * @return The created Object.
     * 
     * @throws QuickBooksRuntimeException when there is a problem with the server. It has a code 
     *         and a message provided by quickbooks about the error.
     */
    @Processor
    public Object create(String realmId,
                         String appKey,
                         String realmIdPseudonym, 
                         String authIdPseudonym,
                         WindowsEntityType type,
                         Map<String, Object> obj,
                         String requestId,
                         @Optional @Default("false") Boolean draft,
                         @Optional @Default("false") Boolean fullResponse)
    {
        return client.create(realmId, appKey, realmIdPseudonym, authIdPseudonym, 
                             unmap(type.getType(), obj), requestId, draft, fullResponse);
        
//        return null;
//        return client.create(realmId, appKey, realmIdPseudonym, authIdPseudonym,EntityType.VENDOR,
//            unmap(Vendor.class,
//                new MapBuilder()
//                .with("name", name)
//                .with("givenName", givenName)
//                .with("middleName", middleName)
//                .with("familyName", familyName)
//                .with("DBAName", dBAName)
//                .with("showAs", showAs)
//                .with("webSite", webSites)
//                .with("taxIdentifier", taxIdentifier)
//                .with("acctNum", acctNum)
//                .with("vendor1099", vendor1099)
//                .with("email", emails)
//                .with("phone", phones)
//                .with("address", addresses)
//                .build()
//            )
//        );
    }
    
//    /**
//     * Retrieve objects by ID.
//     * 
//     * {@sample.xml ../../../doc/mule-module-quick-books-online.xml.sample quickbooks:get-object}
//     * {@sample.xml ../../../doc/mule-module-quick-books-online.xml.sample quickbooks:get-object2}
//     *
//     * @param realmId The realmID, also known as the Company ID, uniquely identifies the data for a company.
//     *                In QuickBooks Online, the Company ID  appears on the My Account page.
//     *                In Data Services for QuickBooks Online, the realmID is required in the URL for most calls.
//     * @param appKey Application Id.
//     * @param realmIdPseudonym Pseudonym Realm Id, obtained from the gateway that represents the company.
//     * @param authIdPseudonym Pseudonym Auth Id, obtained from the gateway that represents the user.
//     * @param type EntityType of the object.
//     * @param id Id which is assigned by Data Services when the object is created.
//     * @return The object.
//     * 
//     * @throws QuickBooksRuntimeException when there is a problem with the server. It has a code 
//     *         and a message provided by quickbooks about the error.
//     */
//    @Processor
//    public Object getObject(String realmId,
//                            String appKey,
//                            String realmIdPseudonym, String authIdPseudonym,
//                            //EntityType type,
//                            Map<String, Object> id)
//    {
//        //return client.getObject(realmId, appKey, realmIdPseudonym, authIdPseudonym,type, unmap(IdType.class, id));
//        return null;
//    }
//    
//    /**
//     * Updates a Vendor.
//     * The Vendor object represents the buyer from whom you purchase any service or product 
//     * for your organization.
//     * 
//     * Specify all the parameters for the object, not just the new or changed elements.
//     * If you omit an element, it is removed from the object by the update operation.
//     * 
//     * For details see: 
//     * <a href="https://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/0050_Data_Services/
//     * 0400_QuickBooks_Online/Vendor">Vendor Especification</a>
//     * 
//     * {@sample.xml ../../../doc/mule-module-quick-books-online.xml.sample quickbooks:update-vendor}
//     * {@sample.xml ../../../doc/mule-module-quick-books-online.xml.sample quickbooks:update-vendor2}
//     *
//     * @param realmId The realmID, also known as the Company ID, uniquely identifies the data for a company.
//     *                In QuickBooks Online, the Company ID  appears on the My Account page.
//     *                In Data Services for QuickBooks Online, the realmID is required in the URL for most calls.
//     * @param appKey Application Id.
//     * @param realmIdPseudonym Pseudonym Realm Id, obtained from the gateway that represents the company.
//     * @param authIdPseudonym Pseudonym Auth Id, obtained from the gateway that represents the user.
//     * @param id Id which is assigned by Data Services when the object is created.
//     * @param syncToken Optional. Integer that indicates how many times the object has been updated.
//     *                  Before performing the update, Data Services verifies that the SyncToken in the
//     *                  request has the same value as the SyncToken in the Data Service's repository.
//     * @param name Optional. Specifies the full name of the vendor. If the FullName is specified, 
//     *             then GivenName, MiddleName, and FamilyName values are ignored.
//     * @param givenName Specifies the given name or first name of a person. GivenName is a required 
//     *                  field only if Name is not sent in the request. If a Name is sent, then the 
//     *                  GivenName field is optional.
//     * @param middleName Optional. Specifies the middle name of the vendor. A person can have zero 
//     *                   or more middle names.
//     * @param familyName Optional. Specifies the family name or the last name of the vendor.
//     * @param dBAName Optional. Specifies the "Doing Business As" name of the vendor.
//     * @param showAs Optional. Specifies the name of the vendor to be displayed.
//     * @param webSites Optional. Valid URI strings. Specifies the vendor's Web site.
//     * @param taxIdentifier Optional. Specifies the Tax ID of the person or the organization. This 
//     *                      is a Personally Identifiable Information (PII) attribute.
//     * @param acctNum Optional. Specifies the account name or the account number that is associated 
//     *                with the vendor.
//     * @param vendor1099 Optional. Specifies that the Vendor is an independent contractor, someone 
//     *                   who is given a 1099-MISC form at the end of the year. The "1099 Vendor" is 
//     *                   paid with regular checks, and taxes are not withheld on the vendor's behalf.
//     * @param emails Optional. Valid email. Specifies the vendors's email addresses.
//     * @param phones Optional. Specifies the phone numbers of the vendor. QBO allows mapping of up to 
//     *              5 phone numbers but only one phone number is permitted for one device type.
//     * @param addresses Optional. Specifies the physical addresses.
//     * @return The updated Vendor.
//     * 
//     * @throws QuickBooksRuntimeException when there is a problem with the server. It has a code 
//     *         and a message provided by quickbooks about the error.
//     */
//    @Processor
//    public void updateVendor(String realmId,
//                               String appKey,
//                               String realmIdPseudonym, String authIdPseudonym,
//                               Map<String, Object> id, 
//                               @Optional String syncToken,
//                               @Optional String name, 
//                               @Optional String givenName, 
//                               @Optional String middleName, 
//                               @Optional String familyName,
//                               @Optional String dBAName, 
//                               @Optional String showAs, 
//                               @Optional List<Map<String, Object>> webSites,
//                               @Optional String taxIdentifier, 
//                               @Optional String acctNum, 
//                               @Optional Boolean vendor1099,
//                               @Optional List<Map<String, Object>> emails, 
//                               @Optional List<Map<String, Object>> phones, 
//                               @Optional List<Map<String, Object>> addresses)
//    {
//        webSites = coalesceList(webSites);
//        emails = coalesceList(emails);
//        phones = coalesceList(phones);
//        addresses = coalesceList(addresses);
//        
////        return client.update(realmId, appKey, realmIdPseudonym, authIdPseudonym,EntityType.VENDOR,
////            unmap(Vendor.class,
////                new MapBuilder()
////                .with("id", id)
////                .with("syncToken", syncToken)
////                .with("name", name)
////                .with("givenName", givenName)
////                .with("middleName", middleName)
////                .with("familyName", familyName)
////                .with("DBAName", dBAName)
////                .with("showAs", showAs)
////                .with("webSite", webSites)
////                .with("taxIdentifier", taxIdentifier)
////                .with("acctNum", acctNum)
////                .with("vendor1099", vendor1099)
////                .with("email", emails)
////                .with("phone", phones)
////                .with("address", addresses)
////                .build()
////            )
////        );
//    }
//    
//    /**
//     * Deletes an object.
//     * 
//     * {@sample.xml ../../../doc/mule-module-quick-books-online.xml.sample quickbooks:delete-object}
//     * {@sample.xml ../../../doc/mule-module-quick-books-online.xml.sample quickbooks:delete-object2}
//     *
//     * @param realmId The realmID, also known as the Company ID, uniquely identifies the data for a company.
//     *                In QuickBooks Online, the Company ID  appears on the My Account page.
//     *                In Data Services for QuickBooks Online, the realmID is required in the URL for most calls.
//     * @param appKey Application Id.
//     * @param realmIdPseudonym Pseudonym Realm Id, obtained from the gateway that represents the company.
//     * @param authIdPseudonym Pseudonym Auth Id, obtained from the gateway that represents the user.
//     * @param type EntityType of the object.
//     * @param id Id which is assigned by Data Services when the object is created.
//     * @param syncToken Optional. Integer that indicates how many times the object has been updated.
//     *                  Before performing the update, Data Services verifies that the SyncToken in the
//     *                  request has the same value as the SyncToken in the Data Service's repository.
//     * 
//     * @throws QuickBooksRuntimeException when there is a problem with the server. It has a code 
//     *         and a message provided by quickbooks about the error.
//     */
//    @Processor
//    public void deleteObject(String realmId,
//                             String appKey,
//                             String realmIdPseudonym, String authIdPseudonym,
//                             //EntityType type, 
//                             Map<String, Object> id, 
//                             @Optional String syncToken)
//    {
//        //client.deleteObject(realmId, appKey, realmIdPseudonym, authIdPseudonym,type, unmap(IdType.class, id), syncToken);
//    }
//
//    /**
//     * Lazily retrieves Objects
//     *
//     * For details see: 
//     * <a href="https://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/0050_Data_Services/
//     * 0400_QuickBooks_Online/Vendor">Vendor Especification</a>
//     * 
//     * {@sample.xml ../../../doc/mule-module-quick-books-online.xml.sample quickbooks:find-objects}
//     * {@sample.xml ../../../doc/mule-module-quick-books-online.xml.sample quickbooks:find-objects2}
//     * {@sample.xml ../../../doc/mule-module-quick-books-online.xml.sample quickbooks:find-objects3}
//     * {@sample.xml ../../../doc/mule-module-quick-books-online.xml.sample quickbooks:find-objects4}
//     * {@sample.xml ../../../doc/mule-module-quick-books-online.xml.sample quickbooks:find-objects5}
//     *
//     * @param realmId The realmID, also known as the Company ID, uniquely identifies the data for a company.
//     *                In QuickBooks Online, the Company ID  appears on the My Account page.
//     *                In Data Services for QuickBooks Online, the realmID is required in the URL for most calls.
//     * @param appKey Application Id.
//     * @param realmIdPseudonym Pseudonym Realm Id, obtained from the gateway that represents the company.
//     * @param authIdPseudonym Pseudonym Auth Id, obtained from the gateway that represents the user.
//     * @param type EntityType of the object.
//     * @param queryFilter String with a filter format (see details). Each type of object to be 
//     *                    retrieved, has a list of attributes for which it can be filtered (See this 
//     *                    list following the link in the details of the documentation of the create
//     *                    or update method of that object).
//     * @param querySort String with a sort format (see details). Each type of object to be 
//     *                    retrieved, has a list of attributes for which it can be sorted (See this 
//     *                    list following the link in the details of the documentation of the create
//     *                    or update method of that object).
//     * @return Iterable of the objects to be retrieved.
//     * 
//     * @throws QuickBooksRuntimeException when there is a problem with the server. It has a code 
//     *         and a message provided by quickbooks about the error.
//     */
//    @SuppressWarnings("rawtypes")
//    @Processor
//    public Iterable findObjects(String realmId,
//                                String appKey,
//                                String realmIdPseudonym, String authIdPseudonym,
//                                //EntityType type, 
//                                @Optional String queryFilter,
//                                @Optional String querySort)
//    {
//        //return client.findObjects(realmId, appKey, realmIdPseudonym, authIdPseudonym,type, queryFilter, querySort);
//        return null;
//    }
    /**
     * 
     */
    @PostConstruct
    public void init()
    {
        if (client == null )
        {
            client = new DefaultQuickBooksWindowsClient(baseUri);
        }
    }
        
    @SuppressWarnings("unchecked")
    private <T> List<T> coalesceList(List<T> list )
    {
        return (List<T>) (list == null ? Collections.emptyList() : list);
    }
    
    private Map<String, Object> coalesceMap(Map<String, Object> map )
    {
        return map == null ? new HashMap<String, Object>() : map;
    }
    
    public void setBaseUri(String baseUri)
    {
        this.baseUri = baseUri;
    }
    
    public String getBaseUri()
    {
        return baseUri;
    }

    @SuppressWarnings("unchecked")
    private <A> A  unmap(Class<A> class1, Map<String, Object> id)
    {
        return (A) mom.unmap(id, class1);
    }
}