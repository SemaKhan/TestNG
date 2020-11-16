package aaa.ab;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Find_LinkCode {
	WebDriver driver;
	@Test
	public void findlink() {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\chrome_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.dell.com/en-us");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	//link 
    List<WebElement>links = driver.findElements(By.tagName("div"));
    for(int i=0;i<links.size();i++) {
    	System.out.println(links.get(i).getAttribute("href"));//href is working like link,
    	//get(i) is a method and also getAttribute(herf) method
    }
}
}