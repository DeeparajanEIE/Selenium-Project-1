package com.youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
// click the button
		WebElement button = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a/img"));
		button.click();
//click and backto page
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
// Get the position of the button
		WebElement b1 = driver.findElement(By.id("position"));
		Point location = b1.getLocation();
		System.out.println(location);
		int i = b1.getLocation().x;
		int j = b1.getLocation().y;
		System.out.println(i);
		System.out.println(j);
// Get colour of the button
		WebElement b2 = driver.findElement(By.id("color"));
		String cssValue = b2.getCssValue("background-color");
		System.out.println(cssValue);
// get size of the button
		WebElement size = driver.findElement(By.id("size"));
		int k = size.getSize().height;
		int l = size.getSize().width;
		System.out.println("Height :"+k  +  "Width :"+l);
		
	}

}
