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
import org.openqa.selenium.support.ui.Select;


public class Webelement2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//xpath Basic
		WebElement create_Account = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create_Account.click();
		Thread.sleep(3000);
		//xpath Index
		WebElement firstname = driver.findElement(By.xpath("(//input[@data-type='text'])[1]"));
		firstname.sendKeys("Deepak");
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@data-type='text'])[2]"));
		lastname.sendKeys("M");
		
		WebElement mobileno = driver.findElement(By.xpath("(//input[@data-type='text'])[3]"));
		mobileno.sendKeys("70100335");
		
		WebElement password = driver.findElement(By.xpath("(//input[@aria-required='true'])[5]"));
		password.sendKeys("Kutty@123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select a=new Select(day);
		a.selectByValue("25");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select b=new Select(month);
		b.selectByIndex(11);
		
		WebElement year = driver.findElement(By.id("year"));
		Select c=new Select(year);
		c.selectByVisibleText("1997");
		
        WebElement gender = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
		gender.click();
		
		WebElement submit = driver.findElement(By.name("websubmit"));
		submit.click();
		Thread.sleep(3000);
		
		TakesScreenshot s=(TakesScreenshot)driver;
		File source = s.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\dell\\eclipse-workspace\\Selenium\\screenshot//snap.png");
		FileUtils.copyFile(source, destination);
		

	}

}
