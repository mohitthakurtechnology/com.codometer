package com.codometer.apis.clients;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

/*
 * document rest client set up using rest assured
 */

public class RestAssuredOps implements IRestAssured
{

	String baseUri, contentType,bearerToken;
	HashMap<String,String> basicAuths;
	
	static String overriddenBaseUri;
	
	RestAssuredOps(String baseUri,String contentType)
	{
		this.baseUri = baseUri;
		this.contentType = contentType;
	}
	
	RestAssuredOps(String baseUri,String contentType,HashMap<String,String> basicAuths)
	{
		this.baseUri = baseUri;
		this.contentType = contentType;
		this.basicAuths = basicAuths;
	}
	
	RestAssuredOps(String baseUri,String contentType,String bearerToken)
	{
		this.baseUri = baseUri;
		this.contentType = contentType;
		this.bearerToken = bearerToken;
	}
	
	@Override
	public RequestSpecification setUpAClient(String authenticationType) {
		
		RestAssured.baseURI = this.baseUri;
		
		String userName = null;
		String password = null;
		
		if(authenticationType.compareTo("NOAUTH") == 0)
		{
			return RestAssured.given().contentType(this.contentType);
		}
		else if(authenticationType.compareTo("BASICAUTH") == 0)
		{
			
			userName = basicAuths.get(userName);
			password = basicAuths.get(password);
			
			return RestAssured.given().contentType(this.contentType).auth().basic(userName, password);
			
		}
		else if(authenticationType.compareTo("BEARERTOKEN") == 0)
		{
			return RestAssured.given().contentType(this.contentType).auth().oauth2(bearerToken);
		}
		
		return null;
	}

	@Override
	public String getBearerToken(String endpoint,RequestSpecification handle) {
		
			// edge cases for the exact token extraction from the payload later ...
		
		 	overriddenBaseUri = (endpoint != null) ? this.baseUri.concat(endpoint) : this.baseUri; // /checks here needed ...
		 	
		 	return handle.get(overriddenBaseUri).getBody().asString();
		 	
	}

	@Override
	public String getPayload(String uri,RequestSpecification handle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String postPayload(String endpoint,String payLoad,RequestSpecification handle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String putPayload(String endpoint,String payLoad,RequestSpecification handle) {
		// TODO Auto-generated method stub
		return null;
	}
}
