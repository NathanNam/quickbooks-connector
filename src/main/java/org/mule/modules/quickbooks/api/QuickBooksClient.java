/**
 * Mule QuickBooks Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.quickbooks.api;

import org.mule.modules.quickbooks.EntityType;
import org.mule.modules.quickbooks.schema.CdmBase;
import org.mule.modules.quickbooks.schema.IdType;


/**
 *   
 * 
 * 
 * @author Gaston Ponti
 * @since Aug 19, 2011
 */

public interface QuickBooksClient
{
    <T extends CdmBase> T create(final String realmId, final String appKey, final String accessToken, final EntityType type, T obj);
    
    <T extends CdmBase> T getObject(final String realmId, final String appKey, final String accessToken, final EntityType type, final IdType id);
    
    <T extends CdmBase> T update(final String realmId, final String appKey, final String accessToken, final EntityType type, T obj);
    
    <T extends CdmBase> void deleteObject(final String realmId, final String appKey, final String accessToken, final EntityType type, final IdType id, String syncToken);

    <T extends CdmBase> Iterable<T> findObjects(final String realmId, final String appKey, final String accessToken, final EntityType type, final String queryFilter, final String querySort);
    
    public String getAccessTokensFromSaml(String appKey, String realmIdPseudonym, String authIdPseudonym);
}

