/**
 * Mule QuickBooks Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.quickbooks.windows;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class RequestIdGeneratorTestDriver {

    @Test
    public void generate100000RequestIdDifferentsTest()
    {
        QuickBooksWindowsModule module = new QuickBooksWindowsModule();
        module.setBaseUri("test");
        module.init();
        
        Set<String> set = new HashSet<String>();
        
        for(int i=0; i < 100000; ++i)
        {
            assertTrue(null, set.add(module.generateANewRequestId()));
        }
    }
}
