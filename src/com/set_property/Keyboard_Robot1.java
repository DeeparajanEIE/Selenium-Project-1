package com.set_property;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Robot1 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		// Robot for keyboaed action
		Robot r = new Robot();
		// Actions for mouse action
		Actions a = new Actions(driver);
		WebElement grocery = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
// Press Right click on mouse		
		a.contextClick(grocery).build().perform();
// By using Robot class press down arrow and enter button		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement mobile = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
// Press Right click on mouse
		a.contextClick(mobile).build().perform();
// By using Robot class press down arrow and enter button			
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement topoffers = driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]"));
// Press Right click on mouse
		a.contextClick(topoffers).build().perform();
// By using Robot class press down arrow and enter button
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
// By using window handles go to mobile window		
		Set<String> windowhandles = driver.getWindowHandles();
		String s = "Mobile Phones: The Big Billion Days Sale starts from 3rd October";
		for (String string : windowhandles) {
			System.out.println(driver.switchTo().window(string).getTitle());
			if (driver.switchTo().window(string).getTitle().equalsIgnoreCase(s)) {
				break;
			}
		}
// Close the current tab only		
		driver.close();
	}

}