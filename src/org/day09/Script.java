package org.day09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String s = "https://www.facebook.com/";
		driver.get(s);
		WebElement key = driver.findElement(By.id("email"));
		 JavascriptExecutor t = (JavascriptExecutor)driver;
		 t.executeScript("arguments[0].setAttribute('value','kumaran')", key);
		 WebElement cl = driver.findElement(By.name("login"));
		 t.executeScript("arguments[1].click()", key,cl);
		 

	}

}
