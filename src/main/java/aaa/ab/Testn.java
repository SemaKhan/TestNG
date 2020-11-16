package aaa.ab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testn {
//do not need a main method for testNG because TestNG giving Annotations @TEST
	//If I have to Write two test-case I need write @Test for Every test-case.
	//so 1 @Test for 1 test-case make 
	//1 method for 1 test-case
	 @Test
	
	 public void verifytestresult(){
		 System.setProperty("webdriver.chrome.driver", "C:\\chrome_win32\\chromedriver.exe");//Setup browser and driver path
		 WebDriver driver = new ChromeDriver();//Create an object of Driver
		 driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
		 driver.findElement(By.name("txtSearch")).sendKeys("Black Kajal");
		 driver.findElement(By.id("search_header_btt")).click();
		 
		 
	}

}
