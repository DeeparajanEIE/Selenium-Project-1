package com.set_property;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Dropdown {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
// Check the given drop down is multiple or not
		WebElement multi = driver.findElement(By.id("multi-select"));
		Select s = new Select(multi);
		boolean multiple = s.isMultiple();
		System.out.println("Check the Multile :" + multiple);
// Get all the options from the given drop down
		List<WebElement> list = s.getOptions();
		for (WebElement elements : list) {
			String text = elements.getText();
			System.out.println("Get the options :" + text);
		}
// Get the size of the given dropdown
		int size = list.size();
		System.out.println("Size of the options :" + size);
// Select the multiple options using index
		for (int i = 0; i < size; i++) {
			if (i == 0 || i == 3 || i == 7) {
				s.selectByIndex(i);
			}
		}
// Get the selected options		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			String text1 = webElement.getText();
			System.out.println("Selected option :" + text1);
		}
// Get the size of the selected option		
		int size2 = allSelectedOptions.size();
		System.out.println("Size of selected options :" + size2);
// Get thhe first selected option		
		WebElement firstselectedoption = s.getFirstSelectedOption();
		String text2 = firstselectedoption.getText();
		System.out.println("First selected option :" + text2);
// Deselect the option		
		s.deselectByIndex(0);
		s.deselectByValue("New York");
		s.deselectByVisibleText("Washington");
// Selectthe option using value		
		s.selectByValue("Florida");
		s.selectByValue("Ohio");
		s.selectByValue("Pennsylvania");
// Deselect all the options		
		s.deselectAll();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File ds=new File("C:\\Users\\dell\\eclipse-workspace\\Selenium\\screenshot\\snap1.png");
		FileUtils.copyFile(sc, ds);
	}
}