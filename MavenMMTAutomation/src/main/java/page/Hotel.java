package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel {
	
	//VARIABLE DECLARATION
			@FindBy (xpath = "//a[@href='https://www.makemytrip.com/hotels/']")
			private WebElement hotel ;
			
			@FindBy (xpath = "//span[@data-cy='hotelCityLabel']")
			private WebElement location ;
			
			@FindBy (xpath = "(//p[text()='Goa'])[1]")
			private WebElement selectlocation ;
			
			@FindBy (xpath = "//div[@aria-label='Tue Mar 14 2023']")
			private WebElement checkin ;
			
			@FindBy (xpath = "//div[@aria-label='Wed Mar 15 2023']")
			private WebElement checkout ;
			
			@FindBy (xpath = "(//div[@class='gstSlct'])[1]")
			private WebElement rooms ;
			
			@FindBy (xpath = "(//li[text()='0'])[3]")
			private WebElement roomscount ;
			
			@FindBy (xpath = "(//div[@class='gstSlct'])[2]")
			private WebElement adult ;
			
			@FindBy (xpath = "(//li[text()='0'])[2]")
			private WebElement adultCount ;
			
			@FindBy (xpath = "(//div[@class='gstSlct'])[3]")
			private WebElement children ;
			
			@FindBy (xpath = "(//li[text()='0'])[3]")
			private WebElement childrencount ;
			
			@FindBy (xpath = "(//div[@class='gstSlct'])[4]")
			private WebElement ageofchild1 ;
			
			@FindBy (xpath = "(//li[text()='0'])[5]")
			private WebElement selectageofchild1 ;
			
			@FindBy (xpath = "(//div[@class='gstSlct'])[5]")
			private WebElement ageofchild2 ;
			
			@FindBy (xpath = "(//li[text()='0'])[3]")
			private WebElement selectageofchild2 ;
		
			@FindBy (xpath = "//button[@class='primaryBtn btnApplyNew pushRight capText']")
			private WebElement applybutton ;
			
			@FindBy (xpath = "//label[@for='appliedFilter']")
			private WebElement price ;
			
			@FindBy (xpath = "//li[text()='₹1500-₹2500']")
			private WebElement selectprice ;
			
			@FindBy (xpath = "//button[@id='hsw_search_button']")
			private WebElement searchbutton ;
			
			
		//VARIABLE INITIALIZATION
			public Hotel (WebDriver driver) {
				PageFactory.initElements(driver, this);
			}		
			
			
		//VARIABLE USE
			public void ClickOnHotel() {
				hotel.click();
			}
			
			public void ClickOnLocation() {
				location.click();;
			}
			
			public void SelectTheLocation() {
				selectlocation.click();
			}
			
			public void ClickOnCheckIN() {
				checkin.click();
			}
			
			public void ClickOnCheckOut() {
				checkout.click();
			}
			
			public void ClickOnRooms() {
				rooms.click();
			}
			
			public void ClickOnRoomsCount() {
				roomscount.click();
			}
			
			public void ClickOnAdult() {
				adult.click();
				
			}
			
			public void ClickOnAdultCount() {
				adultCount.click();
			}
			
			public void ClickOnChildren() {
				children.click();
			}
			
			public void ClickOnChildrenCount() {
				childrencount.click();
			}
			
			public void ClickOnAgeOfChild1() {
				ageofchild1.click();
				
			}
			
			public void ClickOnSelectageOfChild1() {
				selectageofchild1.click();
			}
			
			public void ClickOnAgeOfChild2() {
				ageofchild2.click();
			}
			
			public void ClickOnSelectageOfChild2() {
				selectageofchild2.click();;
			}
			
			public void ClickOnApplyButton() {
				applybutton.click();
			}
			
			public void ClickOnPrice() {
				price.click();
			}
			
			public void ClickOnSelectPrice() {
				selectprice.click();
			}
			
			public void ClickOnSearchButton() {
				searchbutton.click();
			}
			
		}


