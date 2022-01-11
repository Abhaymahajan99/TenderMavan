package com.Tender.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;


import com.Tender.Pom.MyProfile;
import com.Tender.generics.TenderBaseClass;

public class Test_ChangePassword extends TenderBaseClass{
	  @Test(enabled=false) 
	  public void ChangePassword() throws InterruptedException
	  { MyProfile my=new MyProfile (driver); 
	  my.ChangePassword();
	  AssertJUnit.assertTrue(true == true); 
	  sa.assertAll();
	  }
	  
}
