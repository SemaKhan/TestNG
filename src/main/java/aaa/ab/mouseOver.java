package aaa.ab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mouseOver {
	WebDriver driver;
	@Test
	public void mouseover() throws Exception {
		//step 1
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//step 2 mouseover
		//here is Actions is the class, and I need to create a class
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//button[@id='l6']"))).build().perform();
		
		//step3;
		driver.findElement(By.xpath("/html/body/main/header/div[3]/nav/ul/li[1]/ul/li[5]/a")).click();
		//step4
		boolean tr= driver.findElement(By.xpath("//h1[text()='Dell Financial Services']")).isDisplayed();
		
		Assert.assertTrue(tr);
		Thread.sleep(10000);
		
		
		
	}
	

}
