package com.codometer.apis.clients;

import org.testng.annotations.Test;

public class DummyUserTest {

  @Test(priority = 1)
  public void dummyAPITest() {
	  
	  //get user list
	  Rest.setEndpoint("https://dummyjson.com/users");
	  System.out.println(Rest.getOperation().asPrettyString());
	  Rest.getOperation();
  }
  
//  @Test(priority = 2)
//  public void setEndpointTest() {
//	  
//  }
}
