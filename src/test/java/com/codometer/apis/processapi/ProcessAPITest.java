package com.codometer.apis.processapi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.codometer.apis.runtimeapi.RunTimeAPI;

public class ProcessAPITest {
	
	  public static final Logger logger = LogManager.getLogger();
			
	  ProcessAPI processapi = new ProcessAPI();
	  RunTimeAPI runtimeapi = new RunTimeAPI();
	  Process process;
	  
	  @Test
	  public void getApplicationPathByNameTest() {
		  
		  String path = processapi.getApplicationPathByName("chromedriver");
		  logger.info("ProcessAPI.getApplicationPathByName:ApplicationName Path => " + path);
		  
	  }
	  
	  @Test
	  public void getProcessIdTest() {
		  
		  String path,processid;
		  path = processapi.getApplicationPathByName("chromedriver");
		  process = runtimeapi.invokeApplication(path);
		  processid = processapi.getProcessId(process);
		  logger.info("ProcessAPI.getApplicationPathByName:InvokeApplication Process ID is => " + processid);
		  
	  }
	  
	  @Test
	  public void abortProcessTest() {
		  
		  	String path,processid;
		  	path = processapi.getApplicationPathByName("chromedriver");
		  	process = runtimeapi.invokeApplication(path);
		  	processapi.abortProcess(process);
			logger.info("ProcessAPI.abortProcessTest: Success");
		  
	  }
	  
	  @Test
	  public void getApplicationPortTest() {
		  
		  String portNumber = processapi.getApplicationPort("chromedriver");
		  logger.info("ProcessAPI.getApplicationPathByName:InvokeApplication Port Number is => " + portNumber);
		  
	  }
}
