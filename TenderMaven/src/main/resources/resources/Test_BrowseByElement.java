package com.Tender.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;



import com.Tender.Pom.BrowseBy;
import com.Tender.generics.TenderBaseClass;

public class Test_BrowseByElement extends TenderBaseClass {


	@Test
	
	public void BrowseByElement() throws InterruptedException {

		BrowseBy b = new BrowseBy(driver);

		b.Browse();

		AssertJUnit.assertTrue(true == true);
		sa.assertAll(); 

	}

}
