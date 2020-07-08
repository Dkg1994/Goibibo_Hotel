package  Hotel_Xpath;


public class hotel_xpath  {
 
	protected String baseurl = "https://www.goibibo.com";
	
	protected  String hotelIcon = "//*[@id=\"header\"]/div[1]/ul/li[2]";
	
	protected  String searchClick = "//input[@id='downshift-1-input']";
	
	protected String Checkin = "//div[contains(text(),'Check-in')]";
	
	protected String Checkindate = "//span[contains(text(),'27')]";

	protected  String Checkoutdate = "//span[@class='rightactive']";
  
	protected  String Searchbutton = "//button[@class='SearchBlockUIstyles__SearchButtonAutoSuggest-fity7j-12 kGmYkx']";
	
	protected  String Hotelselction = "//*[@id=\"root\"]/div[2]/div/section[2]/div[2]/div/div[3]/div/div";
	
	protected  String SelectHotel = "//div[@id='rooms']//div[2]//div[2]//div[1]//div[3]//div[2]//button[1]";
	
	protected  String Firstname = "//input[@placeholder='Enter First Name']";
	
	protected  String Lastname = "//input[@placeholder='Enter Last Name']";
	
	protected  String Email = "//input[@placeholder='Enter Email Address']";
	
	protected  String Mobile = "//input[@placeholder='Enter Phone Number']";
	
	protected  String Proc_to_Payment = "//button[@class='GuestDetailBlock__CustomButton-sc-6dnm3n-10 dRPsHE']";
	
	
	
//	Assertion Check Xpath
	
	
	
	
	protected  String Free_cancellation = "//span[@class='CheckBoxList__CheckBoxListText-sc-5k7440-7 jgCbXV'][contains(text(),'Free Cancellation')]";

	protected  String Expected_Val = "Free Cancellation";
	
	protected  String Pay_At_Hotel= "//span[@class='CheckBoxList__CheckBoxListText-sc-5k7440-7 jgCbXV'][contains(text(),'Pay At Hotel')]";
	
	protected  String Expected_Val2 = "Pay At Hotel";
	
	protected  String Free_breakfast = "//span[@class='CheckBoxList__CheckBoxListText-sc-5k7440-7 jgCbXV'][contains(text(),'Free Breakfast')]";
	
	protected  String Expected_Val3 = "Free Breakfast";
	
	
	
	protected  String go_safe = "//span[contains(text(),'goSafe')]";
	
	protected  String go_stays = "//span[contains(text(),'goStays Certified')]";
	
	protected  String couple_friendly = "//div[@class='dwebCommonstyles__CenteredDivWrap-sc-112ty3f-1 hvDXEU']//span[contains(text(),'Couple Friendly')]";
	
	protected  String all_hotel	= "//span[contains(text(),'All Hotels')]";
	
	protected  String GetSetGO = "//span[contains(text(),'GETSETGO')]";
	
	protected String Hotelsurprise = "//span[contains(text(),'HOTELSURPRISE')]";
	
	protected  String Debitcard = "//span[contains(text(),'Debit')]";
	
	protected  String Netbanking = "//span[contains(text(),'Netbanking')]";
	
	protected  String Googlepay = "//span[contains(text(),'Google Pay(Tez)')]";
	
	protected  String Wallet =  "//span[contains(text(),'Wallets')]";

	
	}
	


;