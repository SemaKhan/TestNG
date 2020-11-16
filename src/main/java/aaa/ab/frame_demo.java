package aaa.ab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frame_demo {
	WebDriver driver;
	@Test
	public void framecontrol() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(" https://docs.oracle.com/javase/7/docs/api");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//switch to the frame
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		
	}

}
