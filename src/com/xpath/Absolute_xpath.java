package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.javatpoint.com/java-mcq");
		driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("/html/body/div/div/div[6]/div[2]/div/table/tbody/tr/td/h1")).getText();
        System.out.println(text);
	}

}
