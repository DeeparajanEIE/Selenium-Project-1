package com.youtube;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int columnCount = column.size();
		System.out.println("Number of columns :" + columnCount);
		for (WebElement columnname : column) {
			System.out.println(columnname.getText());

		}
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rowCount =row.size();
		System.out.println("Number of Rows :" + rowCount);
		for (WebElement rowname : row) {
			System.out.println(rowname.getText());
		}
		WebElement percentage = driver.findElement(
				By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String text = percentage.getText();
		System.out.println("Percentage :"+text);
		List<WebElement> progress = driver.findElements(
				By.xpath("//td[2]"));
		List<Integer> percent=new ArrayList<Integer>();
		for (WebElement progress1 : progress) {
			String text2 = progress1.getText().replace("%", "");
			int int1 = Integer.parseInt(text2);
			percent.add(int1);
			
		}
		driver.quit();
	}

}
