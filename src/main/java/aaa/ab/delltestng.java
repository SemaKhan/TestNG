package aaa.ab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class delltestng {
	
	WebDriver driver;
	@BeforeTest
	
	public void launchbrowsers() {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_win32\\chromedriver.exe");//Setup browser and driver path
	    driver = new ChromeDriver();//Create Object of WebDriver
		driver.get("https://www.dell.com/en-us");//Step 1 Launch URL
	}
	@Test
    public void Dellresult() {
		
		driver.findElement(By.xpath("//input[@class='mh-search-input']")).sendKeys("XPS");//Enter XPS in Search field
		driver.findElement(By.xpath("//span[text()='Search']")).click();//Click Search Button
		
		// Verify Search result
		// TestNg gave us one of the class Assert- a lot of building 
	   boolean searchR = driver.findElement(By.xpath("//a[text()='Designed to be the best.']")).isDisplayed();
	   Assert.assertTrue(searchR);
}
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
}
