package com.youtube;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seletable {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		List<WebElement> element = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		int size = element.size();
		System.out.println(size);
		// Method 1
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(element.get(0))
		.click(element.get(2))
		.click(element.get(4))
		.build().perform();
		// Method 2
		action.clickAndHold(element.get(1));
		action.clickAndHold(element.get(3));
		action.build().perform();		
				
	}

}
