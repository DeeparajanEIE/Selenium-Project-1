package com.youtube;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_File {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/download.html");
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.linkText("Download Excel"));
		link.click();
		Thread.sleep(5000);
		File file = new File("C:\\Users\\dell\\Downloads");
		File[] totalFiles = file.listFiles();
		for (File file2 : totalFiles) {
			if (file2.getName().equalsIgnoreCase("testleaf.xlsx")) {
				System.out.println("File is Downloaded");
				break;
			}
		}
		driver.quit();
	}

}
