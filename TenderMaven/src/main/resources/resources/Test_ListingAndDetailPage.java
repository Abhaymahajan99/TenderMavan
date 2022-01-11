package com.Tender.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.Tender.Pom.Tenderlistingpage;
import com.Tender.generics.TenderBaseClass;

public class Test_ListingAndDetailPage extends TenderBaseClass{

	@Test()
	public void TenderlistingAndDetailPage() throws InterruptedException	
	{
		Tenderlistingpage t= new Tenderlistingpage(driver);

		t.Listingpage();


		List<WebElement> Price = driver.findElements(By.xpath("//div[@class=\"card-sol\"]"));

		int TotalCount = Price.size();

		for(int i=0;i<TotalCount;i++) 
		{

			String text = Price.get(i).getText();


			System.out.println("Listing Tenders :   "+text);

		}

		
		//Please disable when running scrept on live.
		
		t.AskAndExpert();

		t.ClickCart();
	
		WebElement element =driver.findElement(By.xpath("//button[text()='view more']"));

		actions.moveToElement(element).click().perform();
		 
		t.ViewMore();

		AssertJUnit.assertTrue(true == true);
		sa.assertAll();


	}

}
