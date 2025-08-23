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
		
		// Query param , path param implemention at the set up level and the each CRUD level
		
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
	public String getBearerToken(String endpoint,RequestSpecification handle) { // supposed to be in utility
		
			// edge cases for the exact token extraction from the payload later ...
		
		 	overriddenBaseUri = (endpoint != null) ? this.baseUri.concat(endpoint) : this.baseUri; // /checks here needed ...
		 	return handle.get(overriddenBaseUri).getBody().asPrettyString();
		 	
	}

	@Override
	public String getPayload(String endpoint,RequestSpecification handle) {
		
		overriddenBaseUri = (endpoint != null) ? this.baseUri.concat(endpoint) : this.baseUri; // /checks here needed ...
		return handle.get(overriddenBaseUri).getBody().asPrettyString();
		
	}

	@Override
	public String postPayload(String endpoint,String payLoad,RequestSpecification handle) {
		
		overriddenBaseUri = (endpoint != null) ? this.baseUri.concat(endpoint) : this.baseUri; // /checks here needed ...
		return handle.body(payLoad).post().asPrettyString();
		
	}

	@Override
	public String putPayload(String endpoint,String payLoad,RequestSpecification handle) {
		
		overriddenBaseUri = (endpoint != null) ? this.baseUri.concat(endpoint) : this.baseUri; // /checks here needed ...
		return handle.body(payLoad).put().asPrettyString();
		
	}
}
