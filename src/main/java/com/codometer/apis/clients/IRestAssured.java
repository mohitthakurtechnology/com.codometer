package com.codometer.apis.clients;

import java.util.HashMap;

public interface IRestAssured {
	
	String setUpAClient(String contentType,String authenticationType);
	String getBearerToken(String uri);
	HashMap<String,String> basicAuth();
	String getPayload(String uri);
	String postPayload(String payLoad);
	String putPayload(String payLoad);
	
}
