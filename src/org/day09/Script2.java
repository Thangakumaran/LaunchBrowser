package org.day09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String s = "https://www.snapdeal.com/";
		driver.get(s);
		WebElement clck = driver.findElement(By.xpath("//p[text()='100% Secure Payments']"));
		WebElement up = driver.findElement(By.xpath("//div[text()='Download Our App']"));
		 JavascriptExecutor t = (JavascriptExecutor)driver;
		t.executeScript("arguments[0].scrollIntoView(true)" ,clck);
		Thread.sleep(3000);
		t.executeScript("arguments[0].scrollIntoView(false)", up);

	}

}
