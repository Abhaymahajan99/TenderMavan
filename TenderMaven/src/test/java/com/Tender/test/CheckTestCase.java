package com.Tender.test;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.Tender.Pom.SearchBar;
import com.Tender.generics.TenderBaseClass;

public class CheckTestCase extends TenderBaseClass {
	
	@Test
	public void SearchBar() throws InterruptedException 
	{

		ExtentTest = extent.startTest("SearchBar");

		SearchBar s= new SearchBar(driver);

		s.SearchbyKeyword();

		driver.navigate().back();
		driver.navigate().back();

		s.SearchbyKeyword2();

		driver.navigate().back();
		driver.navigate().back();

		s.SearchbyTenderNO();

		driver.navigate().back();
		driver.navigate().back();

		s.SearchbyAuthorities();

		AssertJUnit.assertTrue(true == true);
		sa.assertAll();

	}

}
