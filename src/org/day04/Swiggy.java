package org.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		WebElement Sgn = driver.findElement(By.xpath("//a[text()='Sign up']"));
		Sgn.click();
		
		WebElement Phn = driver.findElement(By.id("mobile"));
		Phn.sendKeys("9500648367");
		
       String att = Phn.getAttribute("value");
       System.out.println(att);
       
       WebElement Cl = driver.findElement(By.xpath("(//a[text()='Terms & Conditions'])[2]"));
       String text = Cl.getText();
       System.out.println(text);

	}

}
