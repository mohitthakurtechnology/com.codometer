package com.codometer.apis.clients;

import java.util.HashMap;

import org.testng.annotations.Test;

public class HTTPClientTest {
	
	HTTPClient client = new HTTPClient();
	
	static HashMap<Object,Object> config;

	static {
		
		config = new HashMap<>();
		config.put("baseURI", "https://dummyjson.com/products?limit=1");
		config.put("Content-Type", "application/json");
		
	}
  @Test
  public void executeGETTest() {
	  
	  String getResponse;
	  getResponse = client.executeGET(config);
	  System.out.println(" getResponse => " + getResponse);
	  
  }
}
