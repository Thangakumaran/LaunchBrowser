package org.dragdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		WebElement Al = driver.findElement(By.xpath("//button[text()='OK']"));
		Al.click();
		Thread.sleep(2000);
		WebElement list = driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
		list.click();
		
		List<WebElement> list2 = list.findElements(By.xpath("//ul[@role='listbox']"));
		for (WebElement webE : list2) {
			
			Thread.sleep(2000);
			String text = webE.getText();
			System.out.println(text);
			Thread.sleep(2000);
			if (text.contains("CHENNAI EGMORE")) {
				Thread.sleep(2000);
			webE.click();
			System.out.println("clicked");
				
			}
		}
		WebElement To = driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
		To.click();
		List<WebElement> To2 = To.findElements(By.xpath("//ul[@role='listbox']"));
		for (WebElement webE2 : To2) {
			String text2 = webE2.getText();
			System.out.println(text2);
			Thread.sleep(2000);
			if (text2.contains("COIMBATORE")) {
				Thread.sleep(2000);
				webE2.click();
				
			}
			
		}
		WebElement cli = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		cli.click();
		
			
		
		
		//WebElement Snd = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		//Snd.sendKeys("Delhi");


	}

}
