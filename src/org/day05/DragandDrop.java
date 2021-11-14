package org.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String Url="http://demo.guru99.com/test/drag_drop.html";
		driver.get(Url);
		driver.manage().window().maximize();
		
		if (Url.contains("demo.gu")) {
			System.out.println("true");
			
		} else {
			System.out.println("false");

		}
		WebElement sur = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement tar = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions d = new Actions(driver);
		d.dragAndDrop(sur, tar).perform();
		
		WebElement sur2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement tar2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		d.dragAndDrop(sur2, tar2).perform();
		
		WebElement sur3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement tar3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		d.dragAndDrop(sur3, tar3).perform();
		
		WebElement sur4 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement tar4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		d.dragAndDrop(sur4, tar4).perform();
		
		WebElement ret = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		ret.click();
		
		System.out.println("All values should be filled by using drag & drop method");
	}

}
