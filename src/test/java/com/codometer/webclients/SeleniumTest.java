package com.codometer.webclients;

import java.io.File;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	  static String path;

	  static Selenium selenium;
	  
	  static {
		  path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "binaries\\chromedriver.exe";
		  selenium = new Selenium("CHROME", path);
	  }
	
	  @Test
	  public void jobSearchUtilityTest() {
		  
		  //TBD
		  
	  }
	
//	  @Test
//	  public void clickElementUsingTagTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void clickElementUsingXpathTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void closeBrowserTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void closeDriverAndItsAssociateBinariesAsWellAsWindowsTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void deselectElementByIndexTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void deselectElementByNameTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void deselectElementByVisibleTextTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void getCurrentWindowHandleTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void getListOfElementsUsingIdTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void getListOfElementsUsingTagTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void getListOfElementsUsingXpathTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void getMultipleWindowHandlesTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void getWebElementUsingIdTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void getWebElementUsingTagTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void getWebElementUsingXpathTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void maximizeBrowserWindowTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void minimizeBrowserWindowTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void openWebsiteTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void selectElementByIndexTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void selectElementByNameTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void selectElementByVisibleTextTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void switchToDefaultContentTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void switchToFrameByElementTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void switchToFrameByIndexTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void switchToFrameByNameTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
//	
//	  @Test
//	  public void switchToWindowHandleTest() {
//	    throw new RuntimeException("Test not implemented");
//	  }
  
}
