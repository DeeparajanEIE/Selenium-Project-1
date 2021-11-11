package com.youtube;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Types {

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
// Screenshot by TakesScreenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\dell\\eclipse-workspace\\Selenium\\screenshot\\snap4.png");
// Fileutils or FileHandler both are used		
		//FileUtils.copyFile(s,d);
		FileHandler.copy(s, d);
// TakesScreenshot is no used for full screenshot and alertboxes
// by using robot class to take screenshot inabove condition
		Robot r=new Robot();
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle a=new Rectangle(size);
		BufferedImage screenCapture = r.createScreenCapture(a);
		File f=new File("C:\\Users\\dell\\eclipse-workspace\\Selenium\\screenshot\\snap5.png");
		ImageIO.write(screenCapture, "png", f);
		
	}

}
