package com.raj.testData;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.raj.testBase.baseTest;

public class testLogin extends baseTest{
	
	
	
	@Test
	public void loginpage() throws Exception
	{
		

		System.out.println(driver.getTitle());
		
	}
	
	

}
