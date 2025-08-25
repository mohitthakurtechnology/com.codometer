package com.codometer.geeksforgeek.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	String propertiesFilePath;
	
	PropertiesFile(String propertiesFilePath)
	{
		this.propertiesFilePath = propertiesFilePath;
	}
	
	Properties loadProperties()
	{
		try {
			
				FileInputStream fis = new FileInputStream(propertiesFilePath);
				Properties prop = new Properties();
				prop.load(fis);
				return prop;
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
