package com.youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		WebElement image = driver.findElement(By.xpath("//img[@src='../images/home.png']"));
		image.click();
		driver.navigate().back();
		WebElement brokenImage = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		if (brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is Broken");			
		}
		else {
			System.out.println("The image is not Broken");
		}
	}

}
