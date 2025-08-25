package com.codometer.apis.clients;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.codometer.apis.posters.LoginDummyUser;
import com.codometer.apis.serialization.GsonOps;

public class HTTPClientTest {
	
	HTTPClient client = new HTTPClient();
	
	static HashMap<Object,Object> config;
	
	String reqResponse,reqsBuilt;
	GsonOps gsonops;

	static {
		// default configs;
		config = new HashMap<>();
		config.put("baseURI", "https://dummyjson.com/products?limit=1");
		config.put("Content-Type", "application/json");
		
	}
	
  @Test
  public void executeGETTest() {
	  
	  reqResponse = client.executeGET(config);
	  System.out.println(" getResponse => " + reqResponse);
	  
  }
  
  @Test
  public void executePUTTest() {
	  
	  LoginDummyUser loginDummyUserReq = new LoginDummyUser();
	  
	  loginDummyUserReq.setUsername("emilys");
	  loginDummyUserReq.setPassword("emilyspass");
	  loginDummyUserReq.setExpiresInMins(30);
	  
	  gsonops = new GsonOps(loginDummyUserReq);
	  
	  reqsBuilt = gsonops.serializePayload();
	  
	  System.out.println("reqsBuilt => " + reqsBuilt);
	  
	  config.put("baseURI", "https://dummyjson.com/auth/login");
	  config.put("reqPayLoad", reqsBuilt);
	  
	  reqResponse = client.executePOST(config);
	  
	  System.out.println("getResponse => " + reqResponse);
	  
  }
}
