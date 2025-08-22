package com.codometer.apis.w3c.webdriver;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.codometer.apis.w3c.posters.FirstMatch;
import com.codometer.apis.w3c.posters.Proxy;
import com.codometer.apis.w3c.posters.SecondMatch;
import com.codometer.apis.w3c.posters.SessionRequest;
import com.google.gson.Gson;

/**
 * 
 */
public class WebDriver 
{
	public CloseableHttpResponse getWebDriverStatus()
	{
		SessionRequest sessionrequest = new SessionRequest();
		FirstMatch firstmatch = new FirstMatch();
		SecondMatch secondmatch = new SecondMatch();
		Proxy proxy = new Proxy();
		firstmatch.setBrowserName("Chrome");
		firstmatch.setBrowserVersion("1.2.3.4");
		firstmatch.setPlatformName("Window");
		proxy.setFtpProxy(null);
		firstmatch.setProxy(proxy);
		sessionrequest.setFirstmatch(firstmatch);
		sessionrequest.setSecondmatch(secondmatch);
		Gson gson = new Gson();
		
		System.out.println(gson.toJson(sessionrequest));
		SessionRequest sessionrequest1 = gson.fromJson(gson.toJson(sessionrequest), sessionrequest.getClass());
		System.out.println(sessionrequest1.getFirstmatch().getBrowserName());
		//RestAssured.baseURI = "http://localhost:58121/";
		CloseableHttpResponse response = null;
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpget = new HttpGet("http://localhost:58121/status");
		HttpPost post = new HttpPost("http://localhost:58121/status");
		post.setEntity(null);
		try {
			response = client.execute(httpget);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}
}
