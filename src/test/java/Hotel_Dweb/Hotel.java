package Hotel_Dweb;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


import Hotel_Xpath.hotel_xpath;



public class Hotel extends hotel_xpath  {
	

	
	
	WebDriver driver ;

	SoftAssert softAssert =new SoftAssert();

	
	
@BeforeMethod
public void SetupApplication() throws InterruptedException {
	
Reporter.log("========= Browser Seesion Started=======",true);
	
	System.setProperty("webdriver.chrome.driver", "D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver_win32\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().timeouts();
	
	driver.manage().window().maximize();
	

	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	driver.manage().deleteAllCookies();
	

Reporter.log("=====Website Url is opening=====",true);
	
	driver.get(baseurl);
	
	 Thread.sleep(3000);
	 
	 }



@Test(dataProvider="hoteldata")

public void main(String City) throws InterruptedException, ParseException {
	// TODO Auto-generated method stub


			Reporter.log(" ========== TestCase Started on homepage ======",true);
				  
				  Reporter.log("Hotelicon passed",true);
				  
				  driver.findElement(By.xpath(hotelIcon)).click();

				  		Thread.sleep(2000);	  
				  	
				  Reporter.log("Enter the location passed",true);

				  driver.findElement(By.xpath(searchClick)).sendKeys(City);
				  
				  Thread.sleep(2000);

				  Reporter.log("Select dropdown passed ",true);

				  driver.findElement(By.id("downshift-1-item-0")).click();
				  
				  Thread.sleep(1000);
				  
				  
				  Reporter.log("Checkin passed",true);

				  
				     driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div[3]/section[1]/div[1]/div/div[3]/div/div[1]/div")).click();
				        String setDatestr="17/12/2020";
				        String currDatestr=driver.findElement(By.xpath("//p[@class='dcalendarstyles__MonthNamePara-r2jz2t-3 bVBYQn']")).getText();
				        Date setDate =new SimpleDateFormat("dd/MM/yyyy").parse(setDatestr);
//				        Date setDate =new SimpleDateFormat("yyyy-MM-dd").parse(LocalDate.now().plusDays(2).toString());
				        Date currdate =new SimpleDateFormat("MMMM yyyy").parse(currDatestr);

				        int monthDiff= Months.monthsBetween(new DateTime(currdate).withDayOfMonth(1),new DateTime(setDate).withDayOfMonth(1)).getMonths();
				        boolean isFuture=true;
				        if(monthDiff<0) {
				            isFuture=false;
				            monthDiff = -1 * monthDiff;
				        }
				        for (int i=0;i<monthDiff;i++)
				        {
				            if(isFuture)
				                driver.findElement(By.xpath("//div[@class='dcalendarstyles__MonthChangeRightArrowDiv-r2jz2t-16 eVCvYn']//div[@class='dcalendarstyles__SliderArrow-r2jz2t-14 jGviQM']//*[local-name()='svg']")).click();
				            else
				                driver.findElement(By.xpath("//div[@class='dcalendarstyles__MonthChangeLeftArrowDiv-r2jz2t-15 jxjYIU']//div[@class='dcalendarstyles__SliderArrow-r2jz2t-14 jGviQM']//*[local-name()='svg']")).click();
				        }
				      
 
				        String day;
				        day=new SimpleDateFormat("dd").format(setDate);
				        driver.findElement(By.xpath("//span[contains(text(),'"+day+"')]")).click();
				  
				       		  
				  driver.findElement(By.xpath(Checkoutdate)).click();
				  
				  Thread.sleep(2000);
				  
				  Reporter.log("Searchbutton passed",true);
			 
				  driver.findElement(By.xpath(Searchbutton)).click();
				  
		//=================================================================================//
				  Reporter.log("======Test case start on SRP page", true);

					  Thread.sleep(2000);
					  
					  
		//=================================================================================
				  
					Reporter.log("Check all filters on SRP page",true);
					  
//					Popular Filters

				String 	Free_cancellation_Actu =  driver.findElement(By.xpath(Free_cancellation)).getText();
				
			softAssert.assertEquals(Free_cancellation_Actu, Expected_Val, "Free Cancellation not found");
				
				String 	Pay_At_Hotel_Actu = driver.findElement(By.xpath(Pay_At_Hotel)).getText();
				
			softAssert.assertEquals(Pay_At_Hotel_Actu, Expected_Val2, "PayAtHotel not found");
			
				String Free_breakfast_Actu = driver.findElement(By.xpath(Free_breakfast)).getText();

			softAssert.assertEquals(Free_breakfast_Actu, Expected_Val3, "Free Breakfast not found");

//			========================Click on variety of Hotels==============================
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath(go_safe)).click();
			
			Thread.sleep(2000);
			
		driver.findElement(By.xpath("//section[@class='SRPstyles__RightSectionWrapperStyle-sc-19ucfhx-3 eYQdmB']")).isDisplayed();

			Thread.sleep(1000);

			driver.findElement(By.xpath(go_stays)).click(); //check go_stays option from SRP page
			
			Thread.sleep(1000);
			
		driver.findElement(By.xpath("//section[@class='SRPstyles__RightSectionWrapperStyle-sc-19ucfhx-3 eYQdmB']")).isDisplayed();//Hotel is display or not	
			
			Thread.sleep(1000);

			driver.findElement(By.xpath(couple_friendly)).click();
			
			Thread.sleep(1000);

			driver.findElement(By.xpath("//section[@class='SRPstyles__RightSectionWrapperStyle-sc-19ucfhx-3 eYQdmB']")).isDisplayed();

			driver.findElement(By.xpath(all_hotel)).click();

			Thread.sleep(1000);

			
//==========================Check dropdown filter==========================================
			
			
		driver.findElement(By.xpath("//div[@class='NavigationHeaderstyles__QuickFiltersWrapper-m6ew4i-5 iClheF']//div[1]//div[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Top landmark')]")).click();

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Top transit')]")).click();
		
		
			
		//===========================================================================================
			
				  Reporter.log("Hotelselection passed",true);

				  driver.findElement(By.xpath(Hotelselction)).click();
				  
				  Thread.sleep(7000);
				  
				  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

					driver.switchTo().window(tabs.get(1));
			
		//======================================================================================//
					

				Reporter.log("SelectHotel passed",true);
					
				  driver.findElement(By.xpath(SelectHotel)).click();

		//===========================================================================================
			
					Reporter.log("======= Assertion check on Review page =======",true);

					
					  
					  System.out.println("Assertion started");
				  
				String GetSetGo_actu =  driver.findElement(By.xpath(GetSetGO)).getText();
				  
				String Expected = "GETSETGO";
				
				softAssert.assertEquals(GetSetGo_actu, Expected,"GETSETGO Offer not found");  
				  
				  Thread.sleep(2000);
				  
				  
				  driver.findElement(By.linkText("Booking and Cancellation Policy")).click();
				  
				  Thread.sleep(1000);
				  
				  driver.findElement(By.xpath("//div[@class='HotelsModal__CloseButtonWrapper-rgix69-3 bYksdo']//*[local-name()='svg']")).click();
				  
				  
				  
				  
				  Reporter.log("Traveller details passed",true);

				  driver.findElement(By.xpath(Firstname)).sendKeys("Test");
				  
				  Thread.sleep(1000);
				  
				  driver.findElement(By.xpath(Lastname)).sendKeys("Noc");
				  
				  Thread.sleep(1000);
				  
				  driver.findElement(By.xpath(Email)).sendKeys("testnoc009@gmail.com");
				  
				  Thread.sleep(1000);
				  
				  driver.findElement(By.xpath(Mobile)).sendKeys("9999999999");
				  
				  Thread.sleep(1000);
				  
				  Reporter.log("Proc_To_Payment passed",true);

				  
				  driver.findElement(By.xpath(Proc_to_Payment)).click();

				  

			

				  Reporter.log("=======Assertion Check start on Payment page=======",true);

				  
				 String card_actu = driver.findElement(By.xpath(Debitcard)).getText();
				  
				 String card_expec = "Debit/Credit Card";
				  
				  softAssert.assertEquals(card_actu, card_expec, "Debit/Credit Card is not found");
				  
				String netbanking_actu = driver.findElement(By.xpath(Netbanking)).getText();
				
				String netbanking_expec = "Netbanking";
				  
				  softAssert.assertEquals(netbanking_actu, netbanking_expec, "Netbanking is not found");
				  
				 String GoogleTez_actu = driver.findElement(By.xpath(Googlepay)).getText();
				 
				 String GoogleTez_Expec = "Google Pay(Tez)";
				  
				  softAssert.assertEquals(GoogleTez_actu, GoogleTez_Expec , "Google Pay(Tez) is not found");
				  
				 String Wallet_actu = driver.findElement(By.xpath(Wallet)).getText();
				 
				 String Wallet_expec = "Wallets";
				  
				  softAssert.assertEquals(Wallet_actu, Wallet_expec, "Wallets is not found");
				  
				  
				  Thread.sleep(2000);
				  		  softAssert.assertAll();
					}
		
		 @DataProvider(name="hoteldata")
		 public Object[][] passData(){
		 	
		 	Object[][] data =new Object[3][1];

		 	data[0][0]="Delhi";
		 	data[1][0]="Amritsar";
		 	data[2][0]="Gurgaon";
//		 	data[3][0]="Mumbai";
		 	
		 	return data;
		 }

		
@AfterMethod

public void sessionclose(){
	
	driver.quit();
	
}
		 	
		}
		
		
