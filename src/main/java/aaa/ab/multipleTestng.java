package aaa.ab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class multipleTestng {
	WebDriver driverl;
	@BeforeTest
	
	public void browserWeb() {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_win32\\chromedriver.exe");
		driverl=new ChromeDriver();
		driverl.get("https://www.demo.iscripts.com/multicart/demo/index.php");}
		
	@Test
		public void launchD() {
		driverl.findElement(By.name("txtSearch")).sendKeys("Black Kajol");
		driverl.findElement(By.name("Submit")).click();
		
		boolean resultl = driverl.findElement(By.xpath("//a[text()='Clothing']")).isDisplayed();
		Assert.assertTrue(resultl);
		
		}
		
		@AfterTest
		
		public void closeT() {
			driverl.close();
		}
		
		
		
		
	}


