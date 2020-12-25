package utilities;

import org.openqa.selenium.By;

public class webelementLocator {
	
	
	//Login Page & Red Speaker Locators
		public static By loginPage_Username = By.name("username");
		public static By loginPage_password = By.name("password");
	    public static By loginPage_loginBtn = By.xpath("/html/body/header/nav/ul/li[3]/a/a/svg");
        public static By LoginPage_SigninBtn = By.id("sign_in_btnundefined");
        public static By Speaker_Btn = By.id("speakersImg");
        public static By RedSpeaker_Btn = By.id("24");
        public static By RdAddCart_Btn = By.name("save_to_cart");
        public static By RdMenuCart_Btn = By.id("menuCart");
        public static By RdChOut_Btn = By.id("checkOutPopUp");
        public static By RdSpOrdPay_Btn = By.id("next_btn");
        public static By RdMCard_Btn = By.name("masterCredit");
        public static By RdSpCrd_Num = By.name("card_number");
        public static By RdSPCVV_Num = By.name("cvv_number");
        public static By RdSpExMn = By.name("mmListbox");
        public static By RdSpExYr = By.name("yyyyListbox");
        public static By RdSpCrdName = By.name("cardholder_name");
        public static By RdSpPay_Btn = By.xpath("//*[@id='pay_now_btn_MasterCredit']");
        
     //HPx2Tab
        public static By HpTab_Btn = By.id("tabletsImg");
        public static By Hpx2_Btn = By.id("17");
        public static By HpAddCart_Btn = By.name("save_to_cart");
        public static By HpMenuCart_Btn = By.id("menuCart");
        public static By HpChOut_Btn = By.id("checkOutPopUp");
        public static By HpTabOrdPay_Btn = By.id("next_btn");
        public static By HpMCard_Btn = By.name("masterCredit");
        public static By HpTabPay_Btn = By.id("pay_now_btn_MasterCredit");
       
     //HeaddPhPurchase
        public static By HeadPh_Btn = By.id("headphonesImg");
        public static By BlHeadPh_Btn = By.id("14");
        public static By HeadPhAddCart_Btn = By.name("save_to_cart");
        public static By HeadPhMenuCart_Btn = By.id("menuCart");
        public static By HeadPhChOut_Btn = By.id("checkOutPopUp");
        public static By HeadPhOrdPay_Btn = By.id("next_btn");
        public static By HeadPhMCard_Btn = By.name("masterCredit");
        public static By HeadPhPay_Btn = By.id("pay_now_btn_MasterCredit");
                
     //MicePurchase
        public static By Mice_Btn = By.id("miceImg");
        public static By Z3200Mice_Btn = By.id("28");
        public static By MiceAddCart_Btn = By.name("save_to_cart");
        public static By MiceMenuCart_Btn = By.id("menuCart");
        public static By MiceChOut_Btn = By.name("check_out_btn");
        public static By MiceOrdPay_Btn = By.id("next_btn");
        public static By MiceMCard_Btn = By.name("masterCredit");
        public static By MicePay_Btn = By.id("pay_now_btn_MasterCredit"); 
        
      // SearchOption
        public static By Search_Btn = By.id("menuSearch");
        
        
        
        
 
        
        
        
        
}
