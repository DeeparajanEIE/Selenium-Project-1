package com.set_property;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Javascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// Go to flipkart page		
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
// To cancel the login window		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
// By using java script to scroll down	---------> method 1	
		js.executeScript("window.scroll(0,3000);");
		Thread.sleep(3000);
// By using java script to scroll up	---------> method 2	
		js.executeScript("window.scroll(0,0);");
// By using java script to click the mobile button ---> method 3			
		WebElement mobile = driver.findElement(By.xpath("(//div[@class=\'xtXmba\'])[3]"));
		js.executeScript("arguments[0].click();", mobile);
// By using javascript scroll the specific element	--->method 4	
		WebElement realme = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[17]/div/div[2]/a/div/img[2]"));
		js.executeScript("arguments[0].scrollIntoView(true);", realme);
		Thread.sleep(3000);
// By using java script to scroll down the end of the page --> method 5		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		js.executeScript("window.scroll(0,0);");
	}
}
