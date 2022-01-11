package com.Tender.test;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;


import com.Tender.Pom.Global_BrowseBy;
import com.Tender.generics.TenderBaseClass;

public class GlobalCheckList extends TenderBaseClass{
	
	@Test(enabled = false)
	public void Global_BrowseBy() throws Exception {
		
		ExtentTest = extent.startTest("Global_BrowseBy");

		Global_BrowseBy g= new Global_BrowseBy(driver);
		
		g.GlobalBrowse();
		
		AssertJUnit.assertTrue(true == true);
		sa.assertAll(); 
	}
	
	@Test(enabled = false)
	public void Global_LeftSideMenu() throws Exception
	{

}
}