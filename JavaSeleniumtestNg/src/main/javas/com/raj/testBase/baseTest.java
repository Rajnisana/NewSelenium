package com.raj.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.raj.commonMethods.propertiesOperation;

import io.github.bonigarcia.wdm.WebDriverManager;



public class baseTest{
	
	public static WebDriver driver;
	
	public void launchBrowser() throws Exception {
		
		String browser = propertiesOperation.getPropertyValue("browser");
		String url = propertiesOperation.getPropertyValue("url");
		
		System.out.println(url);
		
		
		if(browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","D:\\Seleniumtest\\chromedriver.exe");

			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();

			options.addArguments("--disable-notifications");

			options.addArguments("--disable-gpu");

			options.addArguments("--disable-extensions");

			options.addArguments("--no-sandbox");

			options.addArguments("--disable-dev-shm-usage");

			options.addArguments("--remote-allow-origins=*");  // this i added  this and it worked, Thanks a ton  xinchao zhang !! 

			DesiredCapabilities capabilities = new DesiredCapabilities();

			capabilities.setCapability(ChromeOptions.CAPABILITY, options);

			options.merge(capabilities);

			driver = new ChromeDriver(options);

			driver.manage().window().maximize();

			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Seleniumtest\\geckodriver.exe");
			driver = new FirefoxDriver();
		
		
	    }

		driver.get(url);
	
	}
	@BeforeMethod
	public void setAndLaunchBrowser() throws Exception {
		launchBrowser();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
