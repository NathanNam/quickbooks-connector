/**
 * Mule QuickBooks Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.quickbooks.online.automation.testrunners;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.quickbooks.online.automation.RegressionTests;
import org.mule.modules.quickbooks.online.automation.testcases.CreateCustomerTestCases;
import org.mule.modules.quickbooks.online.automation.testcases.CreateInvoiceTestCases;
import org.mule.modules.quickbooks.online.automation.testcases.DeleteInvoiceTestCases;
import org.mule.modules.quickbooks.online.automation.testcases.GetBlueDotInformationTestCases;
import org.mule.modules.quickbooks.online.automation.testcases.GetCompanyInfoTestCases;
import org.mule.modules.quickbooks.online.automation.testcases.GetCurrentUserTestCases;
import org.mule.modules.quickbooks.online.automation.testcases.GetCustomerTestCases;
import org.mule.modules.quickbooks.online.automation.testcases.GetInvoiceTestCases;
import org.mule.modules.quickbooks.online.automation.testcases.PaginatedQueryTestCases;
import org.mule.modules.quickbooks.online.automation.testcases.QueryTestCases;
import org.mule.modules.quickbooks.online.automation.testcases.UpdateCustomerTestCases;
import org.mule.modules.quickbooks.online.automation.testcases.UpdateInvoiceTestCases;

@RunWith(Categories.class)
@IncludeCategory(RegressionTests.class)

@SuiteClasses({
	CreateCustomerTestCases.class,
	CreateInvoiceTestCases.class,
	DeleteInvoiceTestCases.class,
	GetBlueDotInformationTestCases.class,
	GetCompanyInfoTestCases.class,
	GetCurrentUserTestCases.class,
	GetCustomerTestCases.class,
	GetInvoiceTestCases.class,
	PaginatedQueryTestCases.class,
	QueryTestCases.class,
	UpdateCustomerTestCases.class,
	UpdateInvoiceTestCases.class
})

public class RegressionTestSuite {
	
}
