package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlrtDemo {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Link = "http://demo.automationtesting.in/Alerts.html";
		driver.get(Link);
	
        WebElement f = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
        f.click();
        Thread.sleep(3000);
		WebElement a = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		a.click();
       Alert alert = driver.switchTo().alert();
       Thread.sleep(3000);
       alert.dismiss();
       WebElement k = driver.findElement(By.id("demo"));
       Thread.sleep(3000);
       String text = k.getText();
       System.out.println(text);
       if (text.contains("You P")) {
    	   System.out.println("printed");
    	   
	} else {
		System.out.println("its not printed");

	}

	}

}
