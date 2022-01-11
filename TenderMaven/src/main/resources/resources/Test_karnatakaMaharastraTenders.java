package com.Tender.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.Tender.Pom.karnatakaMaharastratenders;
import com.Tender.generics.TenderBaseClass;

public class Test_karnatakaMaharastraTenders extends TenderBaseClass{
	@Test()
	public void karnatakaMaharastraTenders() throws InterruptedException 
	{
		karnatakaMaharastratenders t= new karnatakaMaharastratenders(driver);

		WebElement element = driver.findElement(By.xpath("//h2[text()='Karnataka Tenders']")); 

		js.executeScript("arguments[0].scrollIntoView(true);", element);

		t.karnatakaTenders1();
		t.karnatakaTenders2();
		t.karnatakaTenders3();
		t.MaharastraTenders1();
		t.MaharastraTenders2();
		t.MaharastraTenders3();

		AssertJUnit.assertTrue(true == true);
		sa.assertAll();
	}
}
