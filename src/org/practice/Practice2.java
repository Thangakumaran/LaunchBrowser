package org.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\ELCOT\\\\eclipse-workspaceNew\\\\SELENIUM\\\\LaunchBrowser\\\\DriverFolder\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//String s = "http://demo.guru99.com/test/drag_drop.html";
		String s = "http://www.flipkart.com";
		driver.get(s);
		driver.manage().window().maximize();
	//	WebElement S = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		//WebElement T = driver.findElement(By.xpath("( //li[@class='placeholder'])[1]"));
		
		//Actions acc = new Actions(driver);
		//acc.dragAndDrop(S, T).perform();
		

		WebElement cl = driver.findElement(By.xpath("//button[text()='✕']"));
		cl.click();
		WebElement mos = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		mos.click();
		Thread.sleep(3000);
		
		WebElement sel = driver.findElement(By.xpath("//span[text()='Men']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(sel).perform();
		
		
		Thread.sleep(3000);
		WebElement clk = driver.findElement(By.xpath("//a[contains(@title,'Formal Shirts')]"));
		clk.click();
		
		//type casting
		
	TakesScreenshot	t=(TakesScreenshot)driver; 
	File g = t.getScreenshotAs(OutputType.FILE);
	File f = new File("C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\Screenshot\\Flipkart.png");
	FileUtils.copyFile(g, f);
	System.out.println("yes taked");
		

		
		
		
		
	}

}
