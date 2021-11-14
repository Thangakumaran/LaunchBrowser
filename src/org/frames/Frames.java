package org.frames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Link = "https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997";
		driver.get(Link);
		driver.switchTo().frame(0);
		WebElement selct = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		selct.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement s = driver.findElement(By.name("fldLoginUserId"));
		s.sendKeys("kumaran");

	}

}
