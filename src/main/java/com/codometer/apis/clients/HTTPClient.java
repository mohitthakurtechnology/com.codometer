package com.codometer.apis.clients;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/*
 * document rest client set up using http client
 */

public class HTTPClient<ANY> implements IHTTPClient<ANY>
{
	
	String baseURI,response,reqPayLoad,contentType;
	
	StringEntity stringEntity;
	
	static CloseableHttpClient httpClient;
	
	CloseableHttpResponse getHttpResponse;
	
	static {
		 httpClient = HttpClients.createDefault();
	}

	@Override
	public String executeGET(HashMap<ANY,ANY> config) {
		
		baseURI = config.get("baseURI").toString();
		
		HttpGet httpget = new HttpGet(baseURI);
		
			try {
				
				getHttpResponse = httpClient.execute(httpget);
				
				response = new String(getHttpResponse.getEntity().getContent().readAllBytes());
				
				return response;
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

//	@Override
//	public String executePUT(HashMap config) {
//		HttpPut httpput = new HttpPut();
//		return null;
//	}
//
	@Override
	public String executePOST(HashMap<ANY,ANY> config) {
		
		baseURI = config.get("baseURI").toString();
		reqPayLoad = config.get("reqPayLoad").toString();
		contentType = config.get("Content-Type").toString();
		
		HttpPost httppost = new HttpPost(baseURI);
		httppost.setHeader("Content-Type",contentType);
		
		try {
				stringEntity = new StringEntity(reqPayLoad);
				
				httppost.setEntity(stringEntity);
				
				getHttpResponse = httpClient.execute(httppost);
				
				response = new String(getHttpResponse.getEntity().getContent().readAllBytes());
				
				return response;
			
		} catch (ClientProtocolException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
//
//	@Override
//	public String executeDELETE(HashMap config) {
//		HttpDelete httpdelete = new HttpDelete();
//		return null;
//	}
}
