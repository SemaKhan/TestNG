package aaa.ab;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class windows_Handler {
	WebDriver driver;
	@Test
	public void windows() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		//step 1,2,3 for search element
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section[2]/div/div/div[1]/div[1]/div/nav/ul/li[4]/a/span[3]")).click();
		driver.findElement(By.xpath("//a[text()='Find a home']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'New construction')]")).click();
		
		//using set interface for make iterator interface for WinDowsHandle
		Set<String> handle = driver.getWindowHandles();
		//Iterator is giving us the method call next()
		Iterator<String> ite =handle.iterator();
		//String variable for parent windows
		String Parentwndows =ite.next();
		System.out.println(Parentwndows);
		//String variable for child windows
		String childwndows = ite.next();
		System.out.println(childwndows);
		
		driver.switchTo().window(childwndows);
		driver.findElement(By.xpath("//a[text()='Alabama (122)']")).click();
		boolean resultT = driver.findElement(By.xpath("//a[text()='Anniston(4)']")).isDisplayed();
		Assert.assertTrue(resultT);
				
		
	}

}
