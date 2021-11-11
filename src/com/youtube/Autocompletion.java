package com.youtube;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompletion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("s");
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		for (WebElement webElement : elements) {
			System.out.println(webElement.getText());
			if (webElement.getText().equalsIgnoreCase("soap")) {
				System.out.println("Selected Option :"+ webElement.getText());
				webElement.click();
				break;
			}

		}
	}

}
