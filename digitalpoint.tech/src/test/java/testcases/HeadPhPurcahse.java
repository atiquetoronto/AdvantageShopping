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

public class HeadPhPurcahse {
	public static WebDriver driver;

	@BeforeMethod (groups = {"regression"})
	public static void openBrowser() throws MalformedURLException
	{
			driver=browserEngine.browsersetup();
	}
	
	@Test (groups = {"regression"})
	
	public static void loginValidation() throws InterruptedException
	{
		driver.get(userData.homeURL);
		Thread.sleep(2000);
		System.out.println("Login Page Opened Successfully");
		Thread.sleep(2000);
		Logcollector.debug("Login Page Opened Successfully");
		driver.findElement(By.id("menuUser")).click();
		Thread.sleep(2000);
		driver.findElement(webelementLocator.loginPage_Username).sendKeys(userData.Username);
		Thread.sleep(2000);
		driver.findElement(webelementLocator.loginPage_password).sendKeys(userData.Password);
		Thread.sleep(2000);
		driver.findElement(webelementLocator.LoginPage_SigninBtn).click();
		System.out.println("Login Process Completed Successfully");
		Logcollector.debug("Login Process Completed Successfully");
		driver.findElement(webelementLocator.HeadPh_Btn).click();
		Thread.sleep(2000);
		driver.findElement(webelementLocator.BlHeadPh_Btn).click();
		Thread.sleep(2000);
		driver.findElement(webelementLocator.HeadPhAddCart_Btn).click();
		Thread.sleep(2000);
		driver.findElement(webelementLocator.HeadPhMenuCart_Btn).click();
		Thread.sleep(2000);
		driver.findElement(webelementLocator.HeadPhChOut_Btn).click();
		Thread.sleep(2000);
		driver.findElement(webelementLocator.HeadPhOrdPay_Btn).click();
		Thread.sleep(2000);
		driver.findElement(webelementLocator.HeadPhMCard_Btn).click();
		Thread.sleep(2000);
		driver.findElement(webelementLocator.HeadPhPay_Btn).click();
		Logcollector.debug("Head Phone Purchase Completed Successfully");
		System.out.println("Head Phone Purchase Completed Successfully");
		}
	
	@AfterMethod (groups = {"regression"})
	public static void closeBrowser()
	
	{
		//driver.close();
		System.out.println("Browser is closed");		
	}
}
