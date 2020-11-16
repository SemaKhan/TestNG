package aaa.ab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dropdown {
	WebDriver driver;
	
	@Test
	public void dropdown() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("u_0_2")).click();
		 driver.findElement(By.name("firstname")).sendKeys("Sema");
		 driver.findElement(By.name("lastname")).sendKeys("Khan");
		 driver.findElement(By.name("reg_email__")).sendKeys("2144499530");
		 WebElement month = driver.findElement(By.name("birthday_month"));
		 Select sel = new Select(month);
		 sel.selectByVisibleText("Feb");
		 
		 //explecityWait
		 WebDriverWait wait = new WebDriverWait(driver,20);
		 WebElement day= driver.findElement(By.id("day"));
		 wait.until(ExpectedConditions.visibilityOf(day));
		 
		 Select seld= new Select(day);
		 seld.selectByVisibleText("9");
		 
		 
		 
		 
	}
	
}
