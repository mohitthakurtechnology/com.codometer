package com.codometer.apis.clients;

import io.restassured.specification.RequestSpecification;

public interface IRestAssured {
	
	RequestSpecification setUpAClient(String authenticationType);
	String getBearerToken(String endpoint,RequestSpecification handle);
	String getPayload(String endpoint,RequestSpecification handle);
	String postPayload(String endpoint,String payLoad,RequestSpecification handle);
	String putPayload(String endpoint,String payLoad,RequestSpecification handle);
	
}
