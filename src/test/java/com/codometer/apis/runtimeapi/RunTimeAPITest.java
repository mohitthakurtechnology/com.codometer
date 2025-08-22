package com.codometer.apis.runtimeapi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.codometer.apis.processapi.ProcessAPI;
import com.codometer.apis.propertiesapi.PropertiesAPI;

public class RunTimeAPITest {
	
	  public static final Logger log = LogManager.getLogger(RunTimeAPITest.class);
	  
	  RunTimeAPI runtimeapi = new RunTimeAPI();
	  ProcessAPI processapi = new ProcessAPI();
	  PropertiesAPI propertyapi = new PropertiesAPI();;
	  Process process;
	  
	  @Test
	  public void executeShellCommandTest() {
		  /*executed the shell command for a particular process
		   *  
		   */
		  String path,pid,command,output;
		  path = processapi.getApplicationPathByName("chromedriver");
		  process = runtimeapi.invokeApplication(path);
		  pid = String.valueOf(process.pid());
		  propertyapi.loadProperties("windowcmd");
		  command = propertyapi.getProperty("PortNumberFetchFromPID");
		  output = runtimeapi.executeShellCommand(command, pid);
		  log.info("RunTimeAPITest.executeShellCommand:successfully generated =>" + output);
		  //    throw new RuntimeException("Test not implemented");
	  }
	
	  @Test
	  public void getRunTimeInstanceTest() {
	//    throw new RuntimeException("Test not implemented");
	  }
	
	  @Test
	  public void invokeApplicationTest() {
		  String path = processapi.getApplicationPathByName("chromedriver");
		  Process process = runtimeapi.invokeApplication(path);
		  log.info("RunTimeAPITest.invokeApplicationTest chromedriver process api instance is alive => " + process.isAlive());
	  }
}
