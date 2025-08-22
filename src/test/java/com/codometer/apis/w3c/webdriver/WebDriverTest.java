package com.codometer.apis.w3c.webdriver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class WebDriverTest {

	WebDriver webdriver = new WebDriver();
	public static final Logger logger = LogManager.getLogger(WebDriverTest.class);
  @Test
  public void getWebDriverStatusTest() throws UnsupportedOperationException, IOException {
	  
	  CloseableHttpResponse response = webdriver.getWebDriverStatus();
	  InputStreamReader inputstreamreader = new InputStreamReader(response.getEntity().getContent());
	  BufferedReader bufferedReader = new BufferedReader(inputstreamreader);
	  StringBuilder stringbuilder = new StringBuilder();
      String line = null;
      
	    try {
			while ((line = bufferedReader.readLine()) != null)
				stringbuilder.append(line).append("\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	  logger.info(stringbuilder.toString());
  }
}
