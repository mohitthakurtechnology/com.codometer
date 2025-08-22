package com.codometer.interview.problems.wipro;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/*
 * interview dated at 1/9/2025
 * go to https://www.flipkart.com/ and find the product with discount more than 70 % and print the name of those product
 */
public class Fetch_70_Percent_Off_Product_From_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\personal softwares\\chromedriver-131.0.6778.264\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		List<WebElement> productListOf70Percentproducts = driver.findElements(By.xpath("//*[contains(text(),'70% Off')]//preceding::div[1]"));
		System.out.println("productListOf70Percentproducts => " + productListOf70Percentproducts.size());
		for(int i = 0;i < productListOf70Percentproducts.size();i++)
		{
			System.out.println("product percent off => " + productListOf70Percentproducts.get(i).getText());
		}

		Thread.sleep(5000);
		driver.quit();
		
	}

}
