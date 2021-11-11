package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
// Basic xpath		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).clear();
// By index		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Deepak");
// By contains		
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("M");
// Text
		driver.findElement(By.xpath("")).sendKeys("M");
		
		driver.findElement(By.xpath("")).sendKeys("M");
	}

}
