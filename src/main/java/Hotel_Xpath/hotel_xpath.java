package  Hotel_Xpath;


public class hotel_xpath  {
 
	protected String baseurl = "https://www.goibibo.com";
	
	protected  String hotelIcon = "//*[@id=\"header\"]/div[1]/ul/li[2]";
	
	protected  String searchClick = "//input[@id='downshift-1-input']";
	
	protected String Checkin = "//div[contains(text(),'Check-in')]";
	
	protected String Checkindate = "//span[contains(text(),'27')]";

	protected  String Checkoutdate = "//span[@class='rightactive']";
  
	protected  String Searchbutton = "//*[@id=\"root\"]/section/div/div[3]/section[1]/div[1]/div/button";
	
	protected  String Hotelselction = "//*[@id=\"root\"]/span/div/section[2]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[1]";
	
	protected  String SelectHotel = "//div[@id='rooms']//div[2]//div[2]//div[1]//div[3]//div[2]//button[1]";
	
	protected  String Firstname = "//input[@placeholder='Enter First Name']";
	
	protected  String Lastname = "//input[@placeholder='Enter Last Name']";
	
	protected  String Email = "//input[@placeholder='Enter Email Address']";
	
	protected  String Mobile = "//input[@placeholder='Enter Phone Number']";
	
	protected  String Proc_to_Payment = "//button[@class='GuestDetailBlock__CustomButton-sc-6dnm3n-10 dRPsHE']";
	
	
	
//	Assertion Check Xpath
	
	
	
	
	protected  String Free_cancellation = "//*[@id=\"root\"]/span/div/section[1]/div[1]/div[2]/div[1]/div[2]/div/span";

	protected  String Expected_Val = "Free Cancellation";
	
	protected  String Pay_At_Hotel= "//*[@id=\"root\"]/span/div/section[1]/div[1]/div[2]/div[1]/div[3]/div/span";
	
	protected  String Expected_Val2 = "Pay At Hotel";
	
	protected  String Free_breakfast = "//span[@class='CheckBoxList__CheckBoxListText-sc-5k7440-10 eEcsXD'][contains(text(),'Free Breakfast')]";
	
	protected  String Expected_Val3 = "Free Breakfast";
	
	
	
	protected  String go_safe = "//*[@id=\"root\"]/span/section/div[1]/span[1]/ul/ul/li[2]/span/span";
	
	protected  String go_stays = "//span[contains(text(),'goStays Certified')]";
	
	protected  String couple_friendly = "//*[@id=\"root\"]/span/section/div[1]/span[1]/ul/ul/li[4]/span/span";
	
	protected  String all_hotel	= "//span[contains(text(),'All Hotels')]";
	
	protected  String GetSetGO = "//span[contains(text(),'GETSETGO')]";
	
	protected String Hotelsurprise = "//span[contains(text(),'HOTELSURPRISE')]";
	
	protected  String Debitcard = "//span[contains(text(),'Debit')]";
	
	protected  String Netbanking = "//span[contains(text(),'Netbanking')]";
	
	protected  String Googlepay = "//span[contains(text(),'Google Pay(Tez)')]";
	
	protected  String Wallet =  "//span[contains(text(),'Wallets')]";

	public void onTestFailure() {
		// TODO Auto-generated method stub
		
	}
	
}

;