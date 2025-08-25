package com.codometer.geeksforgeek.filehandling;

import java.io.File;
import org.testng.annotations.Test;

public class PropertiesFileTest {
	
	  static PropertiesFile propertiesfile;
	  
	  static String filePath;
	  
	  static {
		  
		  filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "companiesData.properties";
		  propertiesfile = new PropertiesFile(filePath);
	  }

	  @Test
	  public void loadPropertiesTest() {
		  
		  System.out.println("propertiesfile companies data => " + propertiesfile.loadProperties().get("companies"));
		  
	  }
	  
}
