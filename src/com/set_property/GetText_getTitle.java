package com.set_property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_getTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		String text2 = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getText();
		System.out.println(text2);
		String text = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		System.out.println(text);

	}

}
