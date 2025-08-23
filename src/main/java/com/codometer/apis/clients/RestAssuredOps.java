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
	
	RestAssuredOps(String baseUri)
	{
		this.baseUri = baseUri;
		this.contentType = contentType;
	}
	
	RestAssuredOps(String baseUri,HashMap<String,String> basicAuths)
	{
		this.baseUri = baseUri;
		this.contentType = contentType;
		this.basicAuths = basicAuths;
	}
	
	RestAssuredOps(String baseUri,String bearerToken)
	{
		this.baseUri = baseUri;
		this.contentType = contentType;
		this.bearerToken = bearerToken;
	}
	
	@Override
	public RequestSpecification setUpAClient(String authenticationType,HashMap<String,String> headers) {
		
		// Query param , path param implemention at the set up level and the each CRUD level
		
		RestAssured.baseURI = this.baseUri;
		
		String userName = null;
		String password = null;
		
		if(authenticationType.compareTo("NOAUTH") == 0 && headers.size() == 0)
		{
			return RestAssured.given().contentType(this.contentType);
		}
		else if(authenticationType.compareTo("NOAUTH") == 0 && headers.size() > 0)
		{
			return RestAssured.given().headers(headers);
		}
		else if(authenticationType.compareTo("BASICAUTH") == 0 && headers.isEmpty() == true)
		{
			
			userName = basicAuths.get(userName);
			password = basicAuths.get(password);
			
			return RestAssured.given().contentType(this.contentType).auth().basic(userName, password);
			
		}
		else if(authenticationType.compareTo("BASICAUTH") == 0 && headers.isEmpty() != true)
		{
			
			userName = basicAuths.get(userName);
			password = basicAuths.get(password);
			
			return RestAssured.given().contentType(this.contentType).auth().basic(userName, password).headers(headers);
			
		}
		else if(authenticationType.compareTo("BEARERTOKENOAUTH") == 0 && headers.isEmpty() == true)
		{
			
			return RestAssured.given().contentType(this.contentType).auth().oauth2(bearerToken);
			
		}
		else if(authenticationType.compareTo("BEARERTOKENOAUTH") == 0 && headers.isEmpty() != true)
		{
			
			return RestAssured.given().contentType(this.contentType).auth().oauth2(bearerToken).headers(headers);
			
		}
		else if(authenticationType.compareTo("BEARERTOKENHEADER") == 0 && headers.size() > 0)
		{
			return RestAssured.given().headers(headers);
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
