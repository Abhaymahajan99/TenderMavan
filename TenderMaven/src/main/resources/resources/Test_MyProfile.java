package com.Tender.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;


import com.Tender.Pom.MyProfile;
import com.Tender.generics.TenderBaseClass;

public class Test_MyProfile extends TenderBaseClass{
	@Test() 
	public void MyProfile() throws InterruptedException	
	{
		MyProfile my= new MyProfile(driver);
		
		my.Myprofile();
		 Thread.sleep(500);

		AssertJUnit.assertTrue(true == true);
		sa.assertAll();
	}
}
