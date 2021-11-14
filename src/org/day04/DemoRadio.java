package org.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRadio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		
		WebElement check = driver.findElement(By.id("vfb-7-1"));
		check.click();
		
		WebElement Dcheck = driver.findElement(By.id("vfb-7-2"));
		Dcheck.click();
		
    

	}

}
