package org.alert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SBIalert {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Link = "https://retail.onlinesbi.com/retail/login.htm";
		driver.get(Link);

		WebElement clck = driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
		clck.click();
		Thread.sleep(3000);
		driver.findElement(By.id("Button2")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
	}
	

}
