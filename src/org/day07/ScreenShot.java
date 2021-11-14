package org.day07;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			String s = "https://www.snapdeal.com/";
			driver.get(s);
			//type casting
			
			TakesScreenshot scrn = (TakesScreenshot)driver;
		
			File create = scrn.getScreenshotAs(OutputType.FILE);
			//String title = driver.getTitle();
			File Set = new File("C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\Screenshot\\SnapDeal.png");
			
			FileUtils.copyFile(create, Set);
			System.out.println("Take the Screenshot and Copy and pasted Succesfully");
			
			
			
			
			
			
			
			
			
			

	}

}
