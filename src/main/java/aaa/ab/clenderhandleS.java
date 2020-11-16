package aaa.ab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class clenderhandleS {
	WebDriver driver;
	@Test
	public void calendar() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(" https://www.southwest.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//for scroll down need to use java script executor 
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	
		//for choose calendar date and time
		JavascriptExecutor date =(JavascriptExecutor)driver;
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value='09/20/2020'");
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='10/13/2020'");
		
		Thread.sleep(10000);
		driver.close();
	}

}
