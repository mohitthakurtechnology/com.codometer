package com.codometer.webclients;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium 
{
	static String browser,binaryPath;
	
	static WebDriver driver;
	static Select select;
	
	Selenium(String browser,String binaryPath)
	{
		this.browser = browser;
		this.binaryPath = binaryPath;
	}
	
    static {
    	System.setProperty("webdriver.chrome.driver",binaryPath);
    	driver =  new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(20000,TimeUnit.SECONDS);
    }
    
    public static void openWebsite(String websiteURL)
    {
    	driver.get(websiteURL);
    }
    
    public static void clickElementUsingXpath(String xpath)
    {
    	driver.findElement(By.xpath(xpath)).click();
    }
    
    public static void clickElementUsingId(String id)
    {
    	driver.findElement(By.id(id)).click();
    }
    
    public static void clickElementUsingTag(String tag)
    {
    	driver.findElement(By.tagName(tag)).click();
    }
    
    public static WebElement getWebElementUsingXpath(String xpath)
    {
    	return driver.findElement(By.xpath(xpath));
    }
    
    public static WebElement getWebElementUsingId(String id)
    {
    	return driver.findElement(By.id(id));
    }
    
    public static WebElement getWebElementUsingTag(String tag)
    {
    	return driver.findElement(By.tagName(tag));
    }
    
    public static List<WebElement> getListOfElementsUsingTag(String tag)
    {
    	return driver.findElements(By.tagName(tag));
    }
    
    public static List<WebElement> getListOfElementsUsingXpath(String xpath)
    {
    	return driver.findElements(By.xpath(xpath));
    }
    
    public static List<WebElement> getListOfElementsUsingId(String id)
    {
    	return driver.findElements(By.id(id));
    }
    
    public static Set<String> getMultipleWindowHandles()
    {
    	return driver.getWindowHandles();
    }
    
    public static String getCurrentWindowHandle()
    {
    	return driver.getWindowHandle();  //finally use here
    }
    
    public static WebDriver switchToWindowHandle(String windowHandle)
    {
    	return driver.switchTo().window(windowHandle);
    }
    
    public static WebDriver switchToFrameByIndex(int frameIndex)
    {
    	return driver.switchTo().frame(frameIndex);
    }
    
    public static WebDriver switchToFrameByName(String frameName)
    {
    	return driver.switchTo().frame(frameName);
    }
    
    public static WebDriver switchToFrameByElement(WebElement frameElement)
    {
    	return driver.switchTo().frame(frameElement);
    }
    
    public static WebDriver switchToDefaultContent()
    {
    	return driver.switchTo().defaultContent();
    }
    
    public static void maximizeBrowserWindow()
    {	
    	driver.manage().window().maximize();
    }
    
    public static void minimizeBrowserWindow()
    {	
    	driver.manage().window().minimize();
    }
    
    public static void selectElementByIndex(WebElement element,int index)
    {
    	select = new Select(element);
    	select.selectByIndex(index);
    }
    
    public static void selectElementByName(WebElement element,String name)
    {
    	select = new Select(element);
    	select.selectByValue(name);
    }
    
    public static void selectElementByVisibleText(WebElement element,String visibleText)
    {
    	select = new Select(element);
    	select.selectByVisibleText(visibleText);
    }
    
    public static void deselectElementByIndex(WebElement element,int index)
    {
    	select = new Select(element);
    	select.deselectByIndex(index);
    }
    
    public static void deselectElementByName(WebElement element,String name)
    {
    	select = new Select(element);
    	select.deselectByValue(name);
    }
    
    public static void deselectElementByVisibleText(WebElement element,String visibleText)
    {
    	select = new Select(element);
    	select.deselectByVisibleText(visibleText);
    }
    
    public static void closeBrowser()
    {
    	driver.close();
    }
    
    public static void closeDriverAndItsAssociateBinariesAsWellAsWindows()
    {
    	driver.quit();
    }
    
    public static String getPageSource()
    {
    	return driver.getPageSource();
    }
    
    public static void refreshPage()
    {
    	 driver.navigate().refresh();
    }
    
}


