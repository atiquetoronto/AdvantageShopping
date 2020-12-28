package testcases;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Logcollector;
import utilities.browserEngine;
import utilities.userData;
import utilities.webelementLocator;

public class RedSpObjKeywords {
	
	
		
	public static WebDriver driver;
		
		@BeforeMethod (groups = {"regression"})
		//TS_001 Open the Browser
		  public static void BrowserOpen() throws MalformedURLException {
			
			driver=browserEngine.browsersetup();
		  }
		
		@Test (groups = {"regression"})
	 
		//TS_002 Navigate to Application 
		public static void UserApplication() throws InterruptedException 
		
		{
		driver.get(userData.homeURL);
		Thread.sleep(2000);
	  }
		//TS_003 User Menu Click
		public static void userMenu() throws InterruptedException
		{
				driver.findElement(By.id("menuUser")).click();
				Thread.sleep(2000);
		}		
		
		//TS_004 Send User ID
     	public static void Userid() throws InterruptedException
	{
     		driver.findElement(webelementLocator.loginPage_Username).sendKeys(userData.Username);
    		Thread.sleep(2000);
	}

	//TS_005 Send Password
	public static void Userpw() throws InterruptedException
	{
		driver.findElement(webelementLocator.loginPage_password).sendKeys(userData.Password);
		Thread.sleep(2000);
		
	}

	//TS_006 Sign in Button Click 
	public static void SigninClick() throws InterruptedException

	{
		driver.findElement(webelementLocator.LoginPage_SigninBtn).click();
		Thread.sleep(2000);
	}

	// TS_007 Speaker Button Click
	public static void SpeakerBtnClick() throws InterruptedException

	{
		driver.findElement(webelementLocator.Speaker_Btn).click();
		Thread.sleep(2000);
	}

	//TS_008 Red Speaker Click 

	public static void RdSpBtn() throws InterruptedException
	{
		driver.findElement(webelementLocator.RedSpeaker_Btn).click();
		Thread.sleep(2000);
	}
	 
	// TS_009 Red Speaker Add to Cart
		public static void RdAdCrtBtn() throws InterruptedException

		{
			driver.findElement(webelementLocator.RdAddCart_Btn).click();
			Thread.sleep(2000);
		}

		// TS_010 Red Speaker Menu Cart Click 
		public static void RdMeCrtBtn() throws InterruptedException

		{
			driver.findElement(webelementLocator.RdMenuCart_Btn).click();
			Thread.sleep(2000);
		}
		
		// TS_011 Red Speaker Check out Click
		public static void RedChOut() throws InterruptedException

		{
			driver.findElement(webelementLocator.RdChOut_Btn).click();
			Thread.sleep(2000);
		}
		
		// TS_012 Red Speaker Order Place Click
		public static void RedSpOrd() throws InterruptedException

		{
			driver.findElement(webelementLocator.RdSpOrdPay_Btn).click();
			Thread.sleep(2000);
		}
		
		// TS_013 Red Speaker MC Pay Click 
		public static void RedMCard() throws InterruptedException

		{
			driver.findElement(webelementLocator.RdMCard_Btn).click();
			Thread.sleep(2000);
		}
		
		// TS_014 Red Speaker Pay Complete Click 
		public static void RedSpPayment() throws InterruptedException

		{
			driver.findElement(webelementLocator.RdSpPay_Btn).click();
			Thread.sleep(2000);
			Logcollector.debug("Red Speaker Purchase Completed Successfully");
			System.out.println("Red Speaker Purchase Completed Successfully");
		}

	@AfterMethod (groups = {"regression"})
	  public static void closeBrowser() 
	  
	  {
		  //TS_014 closing the breowser 
		 // driver.close();
	  }

	}


