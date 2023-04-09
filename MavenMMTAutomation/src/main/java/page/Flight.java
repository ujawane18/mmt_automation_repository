package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight {
	
	//VARIABLE DECLARATION
		@FindBy (xpath = "//a[@href='https://www.makemytrip.com/flights/']")
		private WebElement flight ;
		
		@FindBy (xpath = "//input[@id='fromCity']")
		private WebElement from ;
		
		@FindBy (xpath = "//p[text()='Mumbai, India']")
		private WebElement city1 ;
		
		@FindBy (xpath = "//input[@data-cy='toCity']")
		private WebElement to ;
		
		@FindBy (xpath = "//p[text()='Goa - Dabolim Airport, India']")
		private WebElement city2 ;
		
		@FindBy (xpath = "(//p[text()='13'])[1]")
		private WebElement departure ;
		
		@FindBy (xpath = "//span[@class='lbl_input latoBold appendBottom5']")
		private WebElement traveller ;
		
		@FindBy (xpath = "//li[@data-cy='adults-4']")
		private WebElement adultCount ;
		
		@FindBy (xpath = "//li[@data-cy='children-2']")
		private WebElement childCount ;
		
		@FindBy (xpath = "//li[@data-cy='infants-1']")
		private WebElement infantsCount ;
		
		@FindBy (xpath = "//li[@data-cy='travelClass-1']")
		private WebElement pEconomy ;
		
		@FindBy (xpath = "//li[@data-cy='travelClass-2']")
		private WebElement bussiness ;
		
		@FindBy (xpath = "//button[@data-cy='travellerApplyBtn']")
		private WebElement apply ;
		
		
	//VARIABLE INITIALIZATION
		public Flight (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}		
		
		
	//VARIABLE USE
		public void ClickOnFlight() {
			flight.click();
		}
		
		public void ClickOnFrom() {
			from.click();;
		}
		
		public void ClickOnFromCity() {
			city1.click();
		}
		
		public void ClickOnTo() {
			to.click();
		}
		
		public void ClickOnToCity() {
			city2.click();
		}
		
		public void ClickOnDeparture() {
			departure.click();
		}
		
		public void ClickOnTraveller() {
			traveller.click();
		}
		
		public void ClickOnAdultCount() {
			adultCount.click();
			
		}
		
		public void ClickOnChildCount() {
			childCount.click();
		}
		
		public void ClickOnInfantCount() {
			infantsCount.click();
		}
		
		public void ClickOnPEconomy() {
			pEconomy.click();
		}
		
		public void ClickOnBussiness() {
			bussiness.click();
			
		}
		
		public void ClickOnApplyButton() {
			apply.click();
		}
		
	}


