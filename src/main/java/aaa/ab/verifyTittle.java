package aaa.ab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verifyTittle {
	WebDriver driver;
	@Test
	public void titleverify() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Should be String variable for Expected Title 
		String expected ="Dell XPS Laptops  | Dell USA";
		//string variable for actual Title
		//String actual ;
		String actual = driver.getTitle();
		if(actual.equalsIgnoreCase(expected)) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		
		
	}

}
