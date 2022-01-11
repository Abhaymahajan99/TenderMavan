package com.Tender.Pom;

import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Global_BrowseBy {
	
	@FindBy(xpath="//a[.=\"Go to Global Tenders\"]")
	private WebElement GlobalTenders;
	
	@FindBy(xpath="//a[text()='All']")
	private WebElement All;
	
	@FindBy(xpath="//div[@class=\"card-sol\"][1]")
	private WebElement LiveTenders;
	
	@FindBy(xpath="//a[text()='Country']")
	private WebElement Country;
	@FindBy(xpath="//h2[text()='Search Tenders By Country']")
	private WebElement SearchTendersbyCountry;
	
	@FindBy(xpath="//a[text()='Authorities']")
	private WebElement Authorities;
	@FindBy(xpath="//h2[text()='(//label[@class=\"test\"])[1]")
	private WebElement SearchTendersbyAuthorities;
	
	@FindBy(xpath="//div[@class=\"wiseby\"]")
	private WebElement Authoritieslist;
	
	@FindBy(xpath="//a[text()=\" Latest \"]")
	private WebElement Latest;
	@FindBy(xpath="//div[@class=\"card-sol\"]")
	private WebElement LatestTenders;
	
	
	@FindBy(xpath="//a[text()=' Favourites']")
	private WebElement Favourites;
	
	@FindBy(xpath="//div[@class='card-sol'][1]")
	private WebElement FavouritesTenders;
	
	
	@FindBy(xpath="//a[text()='My Interests']")
	private WebElement MyInterests;
	@FindBy(xpath="//div[@class=\"card-sol\"]")
	private WebElement MyInterestsPage;
	
	
	

	public Global_BrowseBy(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void GlobalBrowse() throws Exception 
	{
		Thread.sleep(500);
		GlobalTenders.click();
		
		All.click();
		
		try {
	        if (LiveTenders.isDisplayed()) {
	        	String text = LiveTenders.getText();
	    		System.out.println("LiveTenders :"+text);
	        } else {
	        	Reporter.log("BrowseBy All",true);
	        	     
	        
	        }
	    } catch(NoSuchElementException e) {
	    	
	    	Reporter.log("Some thing wrong in BrowseBy : All",true);
	    }
		
		
		LiveTenders.isDisplayed();
		Reporter.log("BrowseBy All",true);
		
		Country.click();
		SearchTendersbyCountry.isDisplayed();
		Reporter.log("BrowseBy Country",true);
		
		Authorities.click();
		try {
	        if (SearchTendersbyAuthorities.isDisplayed()) {
	        	String text = SearchTendersbyAuthorities.getText();
	    		System.out.println("Authorities :"+text);
	        } else {
	           
	        	System.out.println("No Authorities");      
	        
	        }
	    } catch(NoSuchElementException e) {
	    	
	        Reporter.log("Some thing wrong in BrowseBy : All Authorities",true);
	       
	    }
		
		Latest.click();
		try {
	        if (LatestTenders.isDisplayed()) {
	        	String text = LatestTenders.getText();
	    		System.out.println("LatestTenders :"+text);
	        } else {
	           
	        	Reporter.log("BrowseBy LatestTenders",true);    
	        
	        }
	    } catch(NoSuchElementException e) {
	    	e.printStackTrace();
	        Reporter.log("Some thing wrong in BrowseBy : LatestTenders",true);
	       
	    }
		
		
		
		Favourites.click();
		
		try {
	        if (FavouritesTenders.isDisplayed()) {
	        	String text = FavouritesTenders.getText();
	    		System.out.println("FavouritesTenders :"+text);
	        } else {
	           
	        	Reporter.log("BrowseBy Favourites",true);    
	        
	        }
	    } catch(NoSuchElementException e) {
	    	e.printStackTrace();
	        Reporter.log("Some thing wrong in BrowseBy : FavouritesTenders",true);
	       
	    }
		
		
		
		
		MyInterests.click();
		
		try {
	        if (MyInterestsPage.isDisplayed()) {
	        	String text = MyInterestsPage.getText();
	    		System.out.println("MyInterestsPage :"+text);
	        } else {
	           
	        	Reporter.log("BrowseBy MyInterestsPage",true);    
	        
	        }
	    } catch(NoSuchElementException e) {
	    	e.printStackTrace();
	        Reporter.log("Some thing wrong in BrowseBy : FavouritesTenders",true);
	       
	    }
		Thread.sleep(500);
		
		
	}

}
