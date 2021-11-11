package com.Miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MiniProject_1 {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		Robot robot = new Robot();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		women.click();
		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		dresses.click();
		WebElement casual_Dress = driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
		casual_Dress.click();
		WebElement printed_Dress = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", printed_Dress);
		action.moveToElement(printed_Dress).build().perform();
		WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		addToCart.click();
		Thread.sleep(3000);
		WebElement prooceed_To_Checkkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	    prooceed_To_Checkkout.click();
	    WebElement quantity = driver.findElement(By.xpath("//input[@name='quantity_3_13_0_0']"));
	    quantity.clear();
	    quantity.sendKeys("5");
	    WebElement check_Out = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	    check_Out.click();
	    WebElement mail = driver.findElement(By.id("email"));
	    mail.sendKeys("kutydeepak@gmail.com");
	    WebElement password1 = driver.findElement(By.id("passwd"));
	    password1.sendKeys("deepak111");
	    WebElement submit1 = driver.findElement(By.id("SubmitLogin"));
	    submit1.click();
	    WebElement proceed = driver.findElement(By.name("processAddress"));
	    proceed.click();
	    WebElement aggreement = driver.findElement(By.id("cgv"));
	    aggreement.click();
	    WebElement proceed1 = driver.findElement(By.name("processCarrier"));
	    proceed1.click();	
	    WebElement payment  = driver.findElement(By.className("bankwire"));
	    payment.click();	
	    WebElement order = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
	    order.click();
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File s = ts.getScreenshotAs(OutputType.FILE);
	    File d=new File("C:\\Users\\dell\\eclipse-workspace\\Selenium\\screenshot\\snap6.png");
	    FileUtils.copyFile(s, d);
	}

}

