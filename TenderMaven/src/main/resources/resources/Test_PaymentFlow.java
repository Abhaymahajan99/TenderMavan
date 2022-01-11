package com.Tender.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.Tender.Pom.HomePageBrowseTenders;
import com.Tender.generics.TenderBaseClass;

public class Test_PaymentFlow extends TenderBaseClass{
	@Test()
	public void PaymentFlow() throws InterruptedException
	{
		HomePageBrowseTenders t=new HomePageBrowseTenders(driver);
		
		t.State();
		t.Industry();
		t.Authorities();
		//t.Department();
		t.MyInterests();
		AssertJUnit.assertTrue(true == true);
		sa.assertAll();
	}
}
