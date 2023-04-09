package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homestay {
	
	//VARIABLE DECLARATION
			@FindBy (xpath = "//a[@href='https://www.makemytrip.com/homestays/']")
			private WebElement homestay ;
			
			@FindBy (xpath = "//label[@for='city']")
			private WebElement staylocation ;
			
			@FindBy (xpath = "//p[text()='Dubai']")
			private WebElement selectstaylocation ;
			
			@FindBy (xpath = "//div[@aria-label='Wed Mar 15 2023']")
			private WebElement checkindate ;
			
			@FindBy (xpath = "//div[@aria-label='Fri Mar 17 2023']")
			private WebElement checkoutdate ;
			
			@FindBy (xpath = "//li[@data-cy='adults-5']")
			private WebElement guests ;
			
			@FindBy (xpath = "//li[@data-cy='children-2']")
			private WebElement childrens ;
			
			@FindBy (xpath = "//button[@class='primaryBtn btnApply']")
			private WebElement applybutton ;
			
			@FindBy (xpath = "//label[@for='travelFor']")
			private WebElement travellingfor ;
			
			@FindBy (xpath = "//li[text()='Leisure']")
			private WebElement reasonfortravelling ;
			
			@FindBy (xpath = "//button[@id='hsw_search_button']")
			private WebElement searchbutton ;
			
			
		//VARIABLE INITIALIZATION
			public Homestay (WebDriver driver) {
				PageFactory.initElements(driver, this);
			}		
			
			
		//VARIABLE USE
			public void ClickOnHomestay() {
				homestay.click();
			}
			
			public void ClickStayLocation() {
				staylocation.click();;
			}
			
			public void ClickOnSelectStayLocation() {
				selectstaylocation.click();
			}
			
			public void ClickOnCheckInDate() {
				checkindate.click();
			}
			
			public void ClickOnCheckOutDate() {
				checkoutdate.click();
			}
			
			public void ClickOnGuests() {
				guests.click();
			}
			
			public void ClickOnChildrens() {
				childrens.click();
			}
			
			public void ClickOnApplyButton1() {
				applybutton.click();	
			}
			
			public void ClickOnTravellingFor() {
				travellingfor.click();
			}
			
			public void ClickOnReasonForTravelling() {
				reasonfortravelling.click();
				
			}
			
			public void ClickOnSearchButton() {
				searchbutton.click();
			}
			
		}


