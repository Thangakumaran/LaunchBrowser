package org.windowhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Link = "https://www.flipkart.com/";
		driver.get(Link);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement write = driver.findElement(By.name("q"));
		write.sendKeys("iphone 12");
		WebElement clk = driver.findElement(By.xpath("//button[@type='submit']"));
		clk.click();
		Thread.sleep(3000);
		WebElement pur = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 256 GB)']"));
		pur.click();
		Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
		//for (String s : child) {
			//if (!s.equals(parent)) {
				//driver.switchTo().window(s);
				
			//}
			
		//}
		//driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		List<String> h = new ArrayList();
		h.addAll(child);
		String jj = h.get(1);
		driver.switchTo().window(jj);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		

	}

}
