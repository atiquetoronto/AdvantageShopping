package testcases;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Logcollector;
import utilities.browserEngine;
import utilities.userData;

public class T01_HP_Validation {
	
public static WebDriver driver;
	
	@BeforeMethod (groups = {"regression"})
	
	public static void openBrowser() throws MalformedURLException
	
	{
		driver=browserEngine.browsersetup();	
	}
	
	
	@Test (groups = {"regression"})
	
	public static void homeValidation() throws InterruptedException
	
	{
		driver.get(userData.homeURL);
		System.out.println("Home Page Opened Succesfully");
		Thread.sleep(2000);
		String expectedTitle = "&nbsp;Advantage Shopping";
		String actualTitle = driver.getTitle();
		/*if (expectedTitle.equals(actualTitle))
        {
               System.out.println("Verification Successful - The correct title is displayed on the web page.");
        }
        else
        {
               System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
               Logcollector.debug("Home Page Validated Successfully");
       */ }	
	
	
	@AfterMethod (groups = {"regression"})
	
	public static void closeBrowser()
	{
		//driver.close();
	}

}
	