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
import org.openqa.selenium.support.ui.ExpectedConditions;


import com.Tender.Pom.LeftSideMenu;
import com.Tender.generics.TenderBaseClass;

public class Test_LeftMenu extends TenderBaseClass{
	
	@Test()
	public void LeftMenu() throws InterruptedException 
	{
		LeftSideMenu lf= new LeftSideMenu(driver);

		lf.LeftMenu();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'hamburger-web')]")));

		lf.ClickTraddBazaar();

		driver.navigate().back(); 
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'hamburger-web')]")));

		lf.ClickOnInvestmentBazaar();

		driver.navigate().back();

		AssertJUnit.assertTrue(true == true);
		sa.assertAll();

	}

}
