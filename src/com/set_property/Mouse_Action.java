package com.set_property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
// Click and hold then move		
		Actions a = new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		a.clickAndHold(from);
		WebElement to = driver.findElement(By.id("droppable"));
		a.moveToElement(to).release();
		a.build().perform();
// Drag and drop
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		WebElement from1 = driver.findElement(By.id("draggable"));
		WebElement to1 = driver.findElement(By.id("droppable"));
		a.dragAndDrop(from1, to1).build().perform();
	}

}
