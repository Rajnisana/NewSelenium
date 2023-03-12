package com.raj.testData;

import org.testng.annotations.Test;

import com.raj.testBase.baseTest;

public class getUrl extends baseTest{
	
	@Test
	public void displayUrl() {
		
		System.out.println(driver.getCurrentUrl());
		
	}

}
