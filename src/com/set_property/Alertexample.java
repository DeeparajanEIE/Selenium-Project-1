package com.set_property;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
// Simple Alert with only submit button		
		WebElement simple = driver.findElement(By.className("analystic"));
		simple.click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
// Confirm Alert with submit or cancel button		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		String text1 = driver.switchTo().alert().getText();
		System.out.println("Confirm Alert text :"+text1);
		driver.switchTo().alert().dismiss();
// Prompt Alert with send text and submit or cancel button
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		driver.switchTo().alert().sendKeys("Deepak");
		String text2 = driver.switchTo().alert().getText();
		System.out.println("Prompt Alert text :"+text2);
		driver.switchTo().alert().accept();
// Take Screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\dell\\eclipse-workspace\\Selenium\\screenshot\\snap2.png");
		FileUtils.copyFile(s, d);
	}

}
