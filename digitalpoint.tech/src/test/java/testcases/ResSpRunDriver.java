package testcases;

import org.testng.annotations.Test;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import utilities.readexcelData;
import utilities.userData;

public class ResSpRunDriver {
	
public static WebDriver driver;
		
	@Test (groups = {"regression"})
	public static void userlogin() throws IOException, InterruptedException
	
	{
		// declare to read excel data file 
		String path=userData.datafilePath;
		
		//declare the excel sheet name 
		String SheetName=readexcelData.setexcelData(path,"Redspeaker");
		
		
		for ( int i=1; i<=14; i++)		
		{
			String keywords=readexcelData.readcellData(i, 3);
		 if (keywords.equals("openBrowser"))
		 {
			 RedSpObjKeywords.BrowserOpen();
			 Thread.sleep(2000);
		 }
		 
		 else if ( keywords.equals("aut"))
		 {
			 RedSpObjKeywords.UserApplication();
			 Thread.sleep(2000);
		}
	
		 else if (keywords.equals("menuUser"))
		 {
	          RedSpObjKeywords.userMenu();
	          Thread.sleep(2000);
		 }
		 
		 else if (keywords.equals("uid"))
				 {
			 RedSpObjKeywords.Userid();
			 Thread.sleep(2000);
							 }
		 
		 else if (keywords.equals("upw"))
		 {
			 RedSpObjKeywords.Userpw(); 
			 Thread.sleep(2000);
		 }
		 else if (keywords.equals("clickSignin"))
		 {
			 RedSpObjKeywords.SigninClick();
			 Thread.sleep(2000);
		 }
		 
		 else if (keywords.equals("SpeakerBtn"))
		 {
			 RedSpObjKeywords.SpeakerBtnClick();
			 Thread.sleep(2000);
		 }
		 
		 else if (keywords.equals("RedSpeakerBtn"))
		 {
			 RedSpObjKeywords.RdSpBtn();
			 Thread.sleep(2000);
		 }
		 
		 else if (keywords.equals("RdAddCartBtn"))
		 {
			 RedSpObjKeywords.RdAdCrtBtn();
			 Thread.sleep(2000);
		 }
		 else if (keywords.equals("RdMenuCartBtn"))
		 {
			 RedSpObjKeywords.RdMeCrtBtn();
			 Thread.sleep(2000);
		 }
		 else if (keywords.equals("RdChOutBtn"))
		 {
			 RedSpObjKeywords.RedChOut();
			 Thread.sleep(2000);
		 }
		 else if (keywords.equals("RdSpOrdPayBtn"))
		 {
			 RedSpObjKeywords.RedSpOrd();
			 Thread.sleep(2000);
		 }
		 else if (keywords.equals("RdMCardBtn"))
		 {
			 RedSpObjKeywords.RedMCard();
			 Thread.sleep(2000);
		 }
		 else if (keywords.equals("RdSpPayBtn"))
		 {
			 RedSpObjKeywords.RedSpPayment();
			 Thread.sleep(2000);
			 
		 }
		 
	}
	
	}

}
