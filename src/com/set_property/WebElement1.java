package com.set_property;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		Point p = new Point(500, 500);
		driver.manage().window().setPosition(p);
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		//By using ID
		WebElement mailid = driver.findElement(By.id("email"));
		mailid.sendKeys("deepak@gmail.com");
		//By using Name
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("kutty@123");
		WebElement enter = driver.findElement(By.name("login"));
		enter.click();
	}

}

