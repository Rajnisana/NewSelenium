package com.raj.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends demo{
	WebDriver driver = new ChromeDriver();
	
	@FindBy(id="userName")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	
	
	
	//create constructor for driver initiliazation
	public homePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	

}
