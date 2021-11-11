package com.xpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");
		driver.manage().window().maximize();
		List<WebElement> products = driver.findElements(By.xpath("//span[@class='product-strike']/preceding-sibling::span"));
		List<Integer> l=new ArrayList<Integer>();
		for (int i = 0; i < products.size(); i++) {
			String replace = products.get(i).getText().replaceAll("Rs. ", "");
			int parseInt = Integer.parseInt(replace);
			l.add(parseInt);		
		}
		int size = l.size();
		System.out.println("Number of products available : "+size);
		System.out.println("Minimum rate of the product : Rs."+Collections.min(l));
		System.out.println("Maximum rate of the product : Rs."+Collections.max(l));
	
	}

}

