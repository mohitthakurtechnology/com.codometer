package com.codometer.apis.propertiesapi;

import org.testng.annotations.Test;

public class PropertiesAPITest {

	  PropertiesAPI propertiesapi = new PropertiesAPI(); 
	  
	  @Test
	  public void getPropertyTest() {
		  
		  propertiesapi.loadProperties("windowcmd");
		  String PortNumberFetchFromPID = propertiesapi.getProperty("PortNumberFetchFromPID");
		  System.out.println(PortNumberFetchFromPID);
	    
	  }
	
	  @Test
	  public void loadPropertiesTest() {
		  propertiesapi.loadProperties("windowcmd");
		  String PortNumberFetchFromPID = propertiesapi.getProperty("PortNumberFetchFromPID");
		  System.out.println(PortNumberFetchFromPID);
	  }
}
