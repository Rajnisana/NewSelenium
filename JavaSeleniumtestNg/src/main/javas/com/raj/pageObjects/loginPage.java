package com.raj.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class loginPage {
	
	@FindBy(id="submitButton")
	WebElement loginButton;
	
	
public loginPage() {
	
}
}
