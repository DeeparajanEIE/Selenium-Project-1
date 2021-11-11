package com.youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();
		WebElement textbox = driver.findElement(By.id("age"));
		String tooltip = textbox.getAttribute("title");
		System.out.println(tooltip);
	}

}
// Tooltip--> When the mouse arrow move to any element to display the additional information
// Most of the Tooltip are present in a Title atribute