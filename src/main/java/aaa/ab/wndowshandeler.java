package aaa.ab;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class wndowshandeler {
	WebDriver driver;
	@Test
	public void test() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		//step 1
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section[2]/div/div/div[1]/div[1]/div/nav/ul/li[4]/a/span[3]")).click();
		driver.findElement(By.id("findAHome")).click();
		driver.findElement(By.name("home_36")).click();
		
		Set<String> handle = driver.getWindowHandles();
		//Iterator is giving us the method call next()
		Iterator<String> ite =handle.iterator();
		//String variable for parent windows
		String ParentWndow =ite.next();
		System.out.println(ParentWndow);
		//String variable for child windows
		String childwndows = ite.next();
		System.out.println(childwndows);
		
		driver.switchTo().window(childwndows);
	
	driver.findElement(By.linkText("//a[text()='Alabama (121)']")).click();
	driver.findElement(By.xpath("//a[text()='Anniston (4)']")).click();
	Thread.sleep(10000);
	driver.close();
	driver.switchTo().window(ParentWndow);
	Thread.sleep(10000);
	driver.quit();
	
	
		
	}

}
