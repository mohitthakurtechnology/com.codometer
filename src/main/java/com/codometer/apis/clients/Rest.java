package com.codometer.apis.clients;

import com.google.gson.Gson;

import io.restassured.*;
import io.restassured.response.Response;

/*
 * document 
 */
public class Rest 
{
	static Gson gson;
	
	public static void setEndpoint(String uri)
	{
		RestAssured.baseURI = uri;
	}
	
	public static Response getOperation() {
		
		Response getOpsResponse = RestAssured.given().get();
		return getOpsResponse;
		
	}
	
	public static String serializePayload(Object anyObject)
	{
		
		gson = new Gson();
		return gson.toJson(anyObject);
		
	}
	
	public static Object deserializePayload(String response,Object responseClass)
	{
		
		gson = new Gson();
		return gson.fromJson(response, responseClass.getClass());
		
	}
	
}
