package com.set_property;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Example {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
// single frame
		WebElement singleframe = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(singleframe);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Deepak");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
// Multiple frame
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		WebElement multiframe1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(multiframe1);
		WebElement multiframe2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(multiframe2);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Deeparajan");
// Take Screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\dell\\eclipse-workspace\\Selenium\\screenshot\\snap3.png");
		FileUtils.copyFile(s, d);
	}
}
