package com.Tender.test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignIn {
	
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "/Users/activemac03/Documents/chromedriver");
	}
	
	@Test(dataProvider="loginPage" ,enabled=false )
	
	public void loginToLw(String username , String password) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://tenders.ekbazaar.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//a[@class='signin-btn']")).click();
	
	driver.findElement(By.xpath("//input[@id='MobileNumber']")).sendKeys(username);
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	
	driver.findElement(By.xpath("//input[@id='submit']")).click();
	
	driver.findElement(By.xpath("//span[contains(@class,'name-of-user')]")).click();
	
	Thread.sleep(500);
	
    driver.quit();
	}
	@DataProvider(name="loginPage")
	public Object[][]PassData()
	{
	Object[][] data=new Object[3][2];
	data[0][0]="6565465454";
	data[0][1]="monika@123";
	data[1][0]="123456656";
	data[1][1]="Active2111";
	data[2][0]="8770041250";
	data[2][1]="Active@123";
	return data;
	}

}
