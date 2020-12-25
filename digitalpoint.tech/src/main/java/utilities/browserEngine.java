package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserEngine {

		
		public static WebDriver driver;
		
		public static WebDriver browsersetup()
		{
		
		       //open chrome browser 
				System.setProperty("webdriver.chrome.driver", "C:\\alljava\\Projects\\AdvShop_DDF\\digitalpoint.tech\\Drivers\\chromedriver.exe");
				
				driver= new ChromeDriver();
				
				// Maximize the browser 
				driver.manage().window().maximize();
				//delete all cookies 
				driver.manage().deleteAllCookies();
	           return driver; 
	}

}
