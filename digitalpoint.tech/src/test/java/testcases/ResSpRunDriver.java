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
		 }
		 
		 else if ( keywords.equals("aut"))
		 {
			 RedSpObjKeywords.UserApplication();
		}
	
		 else if (keywords.equals("menuUser"))
		 {
	          RedSpObjKeywords.userMenu();
		 }
		 
		 else if (keywords.equals("uid"))
				 {
			 RedSpObjKeywords.Userid();
							 }
		 
		 else if (keywords.equals("upw"))
		 {
			 RedSpObjKeywords.Userpw(); 
		 }
		 else if (keywords.equals("clickSignin"))
		 {
			 RedSpObjKeywords.SigninClick();
		 }
		 
		 else if (keywords.equals("SpeakerBtn"))
		 {
			 RedSpObjKeywords.SpeakerBtnClick();
		 }
		 
		 else if (keywords.equals("RedSpeakerBtn"))
		 {
			 RedSpObjKeywords.RdSpBtn();
		 }
		 
		 else if (keywords.equals("RdAddCartBtn"))
		 {
			 RedSpObjKeywords.RdAdCrtBtn();
		 }
		 else if (keywords.equals("RdMenuCartBtn"))
		 {
			 RedSpObjKeywords.RdMeCrtBtn();
		 }
		 else if (keywords.equals("RdChOutBtn"))
		 {
			 RedSpObjKeywords.RedChOut();
		 }
		 else if (keywords.equals("RdSpOrdPayBtn"))
		 {
			 RedSpObjKeywords.RedSpOrd();
		 }
		 else if (keywords.equals("RdMCardBtn"))
		 {
			 RedSpObjKeywords.RedMCard();
		 }
		 else if (keywords.equals("RdSpPayBtn"))
		 {
			 RedSpObjKeywords.RedSpPayment();
		 }
		 
	}
	
	}

}
