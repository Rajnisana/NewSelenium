package MyTest.JavaSeleniumtestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program1 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumtest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/"); 
		
	}
	@Test
	 public void verify() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		
		
	}

}
