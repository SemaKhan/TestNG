package aaa.ab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {
	 public void Csslocator(){
		 System.setProperty("webdriver.chrome.driver", "C:\\chrome_win32\\chromedriver.exe");//Setup browser and driver path
		 WebDriver driver = new ChromeDriver();//Create an object of Driver
		 driver.get("https://deals.dell.com/");
		 driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/ul/li[2]/div/a[1]/span/span")).click();
		 driver.findElement(By.cssSelector("button[type=\"submit\"][title=\"Sign In\"]")).click();
		 //driver.findElement(By.).click();
		 
		 
	}

}
