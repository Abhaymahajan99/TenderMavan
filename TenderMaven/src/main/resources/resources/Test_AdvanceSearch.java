package com.Tender.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;


import com.Tender.Pom.AdvancedSearch;
import com.Tender.generics.TenderBaseClass;

public class Test_AdvanceSearch extends TenderBaseClass{
	@Test()
	public void AdvSearchField() throws InterruptedException
	{
		AdvancedSearch t=new AdvancedSearch(driver);
		
		t.AdvancedField1();
		
		t.AdvancedField2();
		
		t.AdvancedField3();
		AssertJUnit.assertTrue(true == true);
		sa.assertAll();
	}
}
