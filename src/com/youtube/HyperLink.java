package com.youtube;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		WebElement link1 = driver.findElement(By.linkText("Go to Home Page"));
		link1.click();
		driver.navigate().back();
		// Find the given link is go to which page
		WebElement link2 = driver.findElement(By.partialLinkText("Find where"));
		String attribute = link2.getAttribute("href");
		System.out.println(attribute);
		// Check the given link isbroken are not
		WebElement link3 = driver.findElement(By.linkText("Verify am I broken?"));
		link3.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("The given link is broken");
		} else {
			System.out.println("The given link is not broken");
		}
		driver.navigate().back();
		WebElement link4 = driver.findElement(By.linkText("Go to Home Page"));
		link4.click();

		driver.navigate().back();
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int size = totalLinks.size();
		System.out.println(size);
		driver.quit();
	}

}
