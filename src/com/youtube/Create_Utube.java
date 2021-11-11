package com.youtube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Utube {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
// get the url
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
// click the search box
		WebElement search = driver.findElement(By.name("search_query"));
		search.click();
// send the search title
		search.sendKeys("tamil kuthu songs");
// click the submit button
		driver.findElement(By.xpath("//*[@id=\'search-icon-legacy\']/yt-icon")).click();
// click to play the video
		driver.findElement(By.xpath("(//a[@class='yt-simple-endpoint style-scope ytd-video-renderer'])[2]")).click();
	}

}