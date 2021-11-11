package com.youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// Get the URL
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		//Click the given xpath button
		WebElement button=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		button.click();
		// Enter the value using sendkeys
		WebElement mailid = driver.findElement(By.id("email"));
		mailid.sendKeys("deepak1@gmail.com");
		// Append-already having a predefined value and combine the new value
		WebElement append =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		append.sendKeys("Deepak");
		// Print the given attribute value 
		WebElement getthevalue =driver.findElement(By.name("username"));
		String value = getthevalue.getAttribute("value");
		System.out.println(value);
		// Clear the value
		WebElement clearthevalue =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearthevalue.clear();
		// Check given box is enabed or not
		WebElement able=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled = able.isEnabled();
		System.out.println(enabled);
	}

}