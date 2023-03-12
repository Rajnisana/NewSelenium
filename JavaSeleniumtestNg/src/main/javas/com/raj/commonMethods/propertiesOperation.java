package com.raj.commonMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public  class propertiesOperation{
	static Properties prop =new Properties();
	
	public static String getPropertyValue(String key) throws IOException {
		
		
		
		String filepath = System.getProperty("user.dir")+"/src/test/resources/config.properties";
		
		FileInputStream fis = new FileInputStream(filepath);
		
		prop.load(fis);
		
		String value = prop.get(key).toString();
		
		System.out.println(value);
		
		
		return value;
		
				
		}
		

		
		
	}


