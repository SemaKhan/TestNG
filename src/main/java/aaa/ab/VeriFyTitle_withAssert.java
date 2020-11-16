package aaa.ab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VeriFyTitle_withAssert {
	WebDriver driver;
	@Test
	public void titleverify() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		String Title = driver.getTitle();
		Assert.assertTrue(Title.contains("Dell XPS Laptops  | Dell USA"));

}
}