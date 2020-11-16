package aaa.ab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alart_demo {
	WebDriver driver;
	@Test
	public void alart() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_win32\\chromedriver.exe");//setup browser and driver path
		driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");//Launch the Url
		
		//Selenium give method for maximize windows
		 driver.manage().window().maximize();
		
		 //implicitlyWait for wait all the web-element loading
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Selenium give code for handle alart
		driver.findElement(By.name("proceed")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("login1")).sendKeys("Sema");
		//one of the wait code is ___Thread.sleepTo(10000)
		Thread.sleep(10000);
	    driver.close();

}
}
