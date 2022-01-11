package com.Tender.Pom;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Global_LeftSideMenu {
	
	@FindBy(xpath="//a[.=\"Go to Global Tenders\"]")
	private WebElement GlobalTenders;

	@FindBy(xpath="//div[contains(@class,'hamburger-web')]")
	private WebElement LeftMenuButton;

	@FindBy(xpath="//ul[@class='tender']//a[normalize-space()='Pricing']")
	private WebElement Pricing;

	@FindBy(xpath="//a[normalize-space()='Buy Now']")
	private WebElement BuyNow;

	@FindBy(xpath="//a[text()='Authorities '][1]")
	private WebElement Authorities;
	@FindBy(xpath="//div[@class=\"common-component\"]")
	private WebElement SearchTendersByAuthorities;

	@FindBy(xpath="(//a[text()='Latest'])[1]")
	private WebElement Latest;
	@FindBy(xpath="//li[contains(text(),'new')]")
	private WebElement LatestTenders;

	@FindBy(xpath="(//a[text()='Favourites'])[1]")
	private WebElement Favourites;
	@FindBy(xpath="//div[@class='card-sol'][1]")
	private WebElement FavouritesTenders;

	@FindBy(xpath="(//a[text()='My Interests'])[1]")
	private WebElement MyInterests;
	@FindBy(xpath="//li[text()='All']")
	private WebElement MyInterestsPage;

	@FindBy(xpath="(//a[.='Trade Bazaar'])[1]")
	private WebElement TraddBazaar;
	@FindBy(xpath="(//a[.='Investment Bazaar'])[1]")
	private WebElement InvestmentBazaar;

	@FindBy(xpath="//img[@alt='logo']")

	private WebElement EkBazaarlogo;



	public Global_LeftSideMenu(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void LeftMenu() throws InterruptedException
	{
		Thread.sleep(500);

        GlobalTenders.click();
        
        LeftMenuButton.click();
		
Pricing.click();
		
		try {
	        if (BuyNow.isDisplayed()) {
	        	
	    		Reporter.log("LeftSideMenu Pricing",true);
	        }
	        	     
	    } catch(NoSuchElementException e) {
	    	
	    	Reporter.log("Some thing wrong in LeftSideMenu Pricing",true);
	    }
		
		Thread.sleep(200);
		 LeftMenuButton.click();
        Authorities.click();
		
		try {
	        if (SearchTendersByAuthorities.isDisplayed()) {
	        	String text = SearchTendersByAuthorities.getText();
	    		System.out.println("SearchTendersByAuthorities :"+text);
	    		Reporter.log("LeftSideMenu Authorities",true);
	        }
	        	     
	    } catch(NoSuchElementException e) {
	    	
	    	Reporter.log("Some thing wrong in LeftSideMenu : Authorities",true);
	    }
		
		Thread.sleep(200);

		LeftMenuButton.click();
		Latest.click();
		
		try {
	        if (LatestTenders.isDisplayed()) {
	        	String text = LatestTenders.getText();
	    		System.out.println("LatestTenders :"+text);
	    		Reporter.log("LeftSideMenu LatestTenders",true);
	        }
	        	     
	    } catch(NoSuchElementException e) {
	    	
	    	Reporter.log("Some thing wrong in LeftSideMenu : LatestTenders",true);
	    }

		Thread.sleep(200);
	

		
		
		LeftMenuButton.click();
		
		if(	Favourites.isDisplayed()){

			Favourites.click();
		}else {

			Favourites.click();
		}
		
		try {
	        if (FavouritesTenders.isDisplayed()) {
	        	String text = FavouritesTenders.getText();
	    		System.out.println("FavouritesTenders :"+text);
	    		Reporter.log("LeftSideMenu FavouritesTenders",true);
	        }
	        	     
	    } catch(NoSuchElementException e) {
	    	
	    	Reporter.log("Some thing wrong in LeftSideMenu : FavouritesTenders",true);
	    }

		Thread.sleep(200);
		
		LeftMenuButton.click();


		if(	MyInterests.isDisplayed()){
			MyInterests.click();
		}else {

			MyInterests.click();
		}
			
		try {
	        if (FavouritesTenders.isDisplayed()) {
	        	String text = FavouritesTenders.getText();
	    		System.out.println("FavouritesTenders :"+text);
	    		Reporter.log("LeftSideMenu FavouritesTenders",true);
	        }
	        	     
	    } catch(NoSuchElementException e) {
	    	
	    	Reporter.log("Some thing wrong in LeftSideMenu : FavouritesTenders",true);
	    }

	}


	public void ClickTraddBazaar() throws InterruptedException {
		Thread.sleep(200);
		LeftMenuButton.click();

		TraddBazaar.click();
		Reporter.log("TraddBazaar",true);

	}

	public void ClickOnInvestmentBazaar() throws InterruptedException {

		Thread.sleep(300);

		LeftMenuButton.click();
		InvestmentBazaar.click();
		Reporter.log("InvestmentBazaar",true);



	}


}
