package com.set_property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) throws InterruptedException {
		// Property setup
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		// upcasting
		WebDriver driver = new ChromeDriver();
		// Get URL
		driver.get("https://www.flipkart.com/");
		// Maximize the window
		driver.manage().window().maximize();
		// Get the current URL
		String Url = driver.getCurrentUrl();
		System.out.println("CurrentURL : " + Url);
		// Get the given url title
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		// Get the given url page source
		String pageSource = driver.getPageSource();
		System.out.println("Page source : " + pageSource);
		// Navigate to
		driver.navigate().to("https://www.instagram.com/");
		String Url1 = driver.getCurrentUrl();
		System.out.println("CurrentURL : " + Url1);
		String title1 = driver.getTitle();
		System.out.println("Title: " + title1);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();		
	}

}
