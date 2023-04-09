package testsample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import page.Flight;
import page.Homestay;
import page.Hotel;

public class Testclass1 {
	
	public static void main(String[] args) throws InterruptedException {
				
System.setProperty("webdriver.chrome.driver","C:\\Users\\gaura\\OneDrive\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		
		Flight flight = new Flight(driver);
		flight.ClickOnFlight();
		Thread.sleep(2000);
		flight.ClickOnFrom();
		Thread.sleep(2000);
		flight.ClickOnFromCity();
		Thread.sleep(2000);
		flight.ClickOnTo();
		Thread.sleep(2000);
		flight.ClickOnToCity();
		Thread.sleep(2000);
		flight.ClickOnDeparture();
		Thread.sleep(2000);
		flight.ClickOnTraveller();
		Thread.sleep(2000);
		flight.ClickOnAdultCount();
		Thread.sleep(2000);
		flight.ClickOnChildCount();
		Thread.sleep(2000);
		flight.ClickOnInfantCount();
		Thread.sleep(2000);
		flight.ClickOnPEconomy();
		Thread.sleep(2000);
		flight.ClickOnBussiness();
		Thread.sleep(2000);
		flight.ClickOnApplyButton();
		Thread.sleep(2000);
			
		
		Hotel hotel = new Hotel(driver);
		hotel.ClickOnHotel();
		Thread.sleep(2000);
		hotel.ClickOnLocation();
		Thread.sleep(2000);
		hotel.SelectTheLocation();
		Thread.sleep(2000);
		hotel.ClickOnCheckIN();
		Thread.sleep(2000);
		hotel.ClickOnCheckOut();
		Thread.sleep(2000);
		hotel.ClickOnRooms();
		Thread.sleep(2000);
		hotel.ClickOnRoomsCount();
		Thread.sleep(2000);
		hotel.ClickOnAdult();
		Thread.sleep(2000);
		hotel.ClickOnAdultCount();
		Thread.sleep(2000);
		hotel.ClickOnChildren();
		Thread.sleep(2000);
		hotel.ClickOnChildrenCount();
		Thread.sleep(2000);
		hotel.ClickOnAgeOfChild1();
		Thread.sleep(2000);
		hotel.ClickOnSelectageOfChild1();
		Thread.sleep(2000);
		hotel.ClickOnAgeOfChild2();
		Thread.sleep(2000);
		hotel.ClickOnSelectageOfChild2();
		Thread.sleep(2000);
		hotel.ClickOnApplyButton();
		Thread.sleep(2000);
		hotel.ClickOnPrice();
		Thread.sleep(2000);
		hotel.ClickOnSelectPrice();
		Thread.sleep(2000);
		hotel.ClickOnSearchButton();
		Thread.sleep(2000);
		
		
		
		Homestay homestay = new Homestay(driver);
		homestay.ClickOnHomestay();
		//Thread.sleep(2000);
		homestay.ClickStayLocation();
		//Thread.sleep(2000);
		homestay.ClickOnSelectStayLocation();
		//Thread.sleep(2000);
		homestay.ClickOnCheckInDate();
		//Thread.sleep(2000);
		homestay.ClickOnCheckOutDate();
		//Thread.sleep(2000);
		homestay.ClickOnGuests();
		//Thread.sleep(2000);
		homestay.ClickOnChildrens();
		//Thread.sleep(2000);
		homestay.ClickOnApplyButton1();
		//Thread.sleep(2000);
		homestay.ClickOnTravellingFor();
		//Thread.sleep(2000);
		homestay.ClickOnReasonForTravelling();
		//Thread.sleep(2000);
		homestay.ClickOnSearchButton();
		//Thread.sleep(2000);
		
		
	}

}
