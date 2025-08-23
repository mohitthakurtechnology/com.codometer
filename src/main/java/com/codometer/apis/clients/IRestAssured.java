package com.codometer.apis.clients;

import java.util.HashMap;

import io.restassured.specification.RequestSpecification;

public interface IRestAssured {
	
	// Make it generic later
	
	RequestSpecification setUpAClient(String authenticationType,HashMap<String,String> headers);
	String getBearerToken(String endpoint,RequestSpecification handle);
	String getPayload(String endpoint,RequestSpecification handle);
	String postPayload(String endpoint,String payLoad,RequestSpecification handle);
	String putPayload(String endpoint,String payLoad,RequestSpecification handle);
	
}
