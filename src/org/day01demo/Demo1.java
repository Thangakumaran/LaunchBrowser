package org.day01demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1
{
	public static void main(String[] args)
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	
	driver.quit();
	 
	String s1 = driver.getCurrentUrl();
	System.out.println(s1);
	String s2 = driver.getTitle();
	System.out.println(s2);
	
	
	
	
	
		
	}

}
