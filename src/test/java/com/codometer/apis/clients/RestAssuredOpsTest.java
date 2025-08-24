package com.codometer.apis.clients;

import java.util.HashMap;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.codometer.apis.posters.LoginDummyUser;
import com.codometer.apis.posters.LoginDummyUserRes;
import com.codometer.apis.serialization.GsonOps;

import io.restassured.specification.RequestSpecification;

// sample unit tests using testng
@Ignore
public class RestAssuredOpsTest {
	
	  RestAssuredOps restassuredOps,restassuredOpsbasicAuth,restassuredOpsNoAuth;
	  String baseUri,contentType,token,loginPayload,loginDummyUserResponse,currentAuthUser;
	  RequestSpecification handle;
	  GsonOps gsonops;
	  LoginDummyUser logindummeruser;
	  LoginDummyUserRes logindummeruserres;
	  HashMap<String,String> headers;

	  @Test
	  public void getBearerTokenTest() {
		  
		  System.out.println("TBD");
	  }
	 
	  @Test(priority = 2)
	  public void getPayloadTest() {
		  
		  baseUri = "https://dummyjson.com/auth/me";  // goes to config file
		  contentType = "application/json";
		  
		  restassuredOps = new RestAssuredOps(baseUri);
		  
		  gsonops = new GsonOps(loginDummyUserResponse,"com.codometer.apis.posters.LoginDummyUserRes");
		  
		  HashMap<String,String> headers = new HashMap<>();
		  
		  logindummeruserres = (LoginDummyUserRes) gsonops.deserializePayload();
		  String token = logindummeruserres.getAccessToken();
		  
		  headers.put("Authorization", token);
		  headers.put("Content-Type", "application/json");
		  
		  handle = restassuredOps.setUpAClient("BEARERTOKENHEADER",headers);
		  
		  currentAuthUser = restassuredOps.getPayload(null, handle); // poster needed
		  
		  System.out.println("current Auth User payload ==> " + currentAuthUser);
		  
	  }

	  @Test(priority = 1)
	  public void postPayloadTest() {
		  
		  baseUri = "https://dummyjson.com/auth/login";  //goes to config file
		  headers = new HashMap<>();
		  headers.put("Content-Type", "application/json");
		  headers.put("Authorization", token);
		  
		  System.out.println("headers => "+ headers.size());
		  restassuredOpsNoAuth = new RestAssuredOps(baseUri);
		  handle = restassuredOpsNoAuth.setUpAClient("NOAUTH",headers);
		  
		  logindummeruser = new LoginDummyUser(); //poster needed
		  
		  logindummeruser.setUsername("emilys");
		  logindummeruser.setPassword("emilyspass");
		  logindummeruser.setExpiresInMins(30);
		  
		  gsonops = new GsonOps(logindummeruser);
		  
		  loginPayload = gsonops.serializePayload();
		  
		  System.out.println("payload==>" + loginPayload);
		  
		  loginDummyUserResponse = restassuredOpsNoAuth.postPayload(null, loginPayload, handle); // poster needed
		  
		  System.out.println("res==>" + loginDummyUserResponse);
		  
		  // assert later
	  }

	  @Test
	  public void putPayloadTest() {
	     System.out.println("TBD");
	  }

	  @Test
	  public void setUpAClientTest() {
		  System.out.println("TBD");
	  }
}
