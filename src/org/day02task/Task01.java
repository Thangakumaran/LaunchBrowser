package org.day02task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String s = "https://www.facebook.com/";
		driver.get(s);
		
		if (s.equals("https://www.facebook.com/")) {
			System.out.println("its launched");
		} 
		else {
			System.out.println("not launched");
        }
		
		WebElement a = driver.findElement(By.id("email"));
		a.sendKeys("thangkumaran1996@gmail.com");
		
		String attribute = a.getAttribute("value");
		System.out.println(attribute);
		
		WebElement b = driver.findElement(By.name("pass"));
		b.sendKeys("9500648367");
		
		WebElement text = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		//WebElement c = driver.findElement(By.name("login"));
	    //c.click();
		String text2 = text.getText();
		System.out.println(text2);
		
		boolean contains = text2.contains("Facebook h");
		System.out.println(contains);

	}

}
