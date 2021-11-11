package com.set_property;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Types {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();              
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
// Implicit wait  
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement createaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        Actions a=new Actions(driver);
        a.click(createaccount).build().perform();
// Explicit wait        
        WebDriverWait wait=new WebDriverWait(driver, 30);
        WebElement fname = wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].value='Deepak';", fname);
// Fluent wait 
        Wait<WebDriver> wait2=new FluentWait<WebDriver>(driver)
        		.withTimeout(Duration.ofSeconds(30))
        		.pollingEvery(Duration.ofSeconds(2))
        		.ignoring(NoSuchElementException.class);
       WebElement lname= wait2.until(new Function<WebDriver,WebElement>(){

		public WebElement apply(WebDriver arg0) {
			return driver.findElement(By.name("lastname"));
		}
       });
     lname.sendKeys("Kutty");             
	}
       
	}
