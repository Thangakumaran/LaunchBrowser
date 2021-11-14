package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String s = "http://www.facebook.com/";
		driver.get(s);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.close();
		//driver.quit();
		WebElement Ent = driver.findElement(By.id("email"));
		Ent.sendKeys("Thangakumaran");
		 String print = Ent.getAttribute("value");
		 System.out.println(print);
		WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
        Pass.sendKeys("77777777");
        WebElement Cl = driver.findElement(By.xpath("//button[text()='Log In']"));
        String text = Cl.getText();
        System.out.println(text);
        Cl.click();
        WebElement get = driver.findElement(By.xpath("//div[contains(text(),'The password tha')]"));
        String text2 = get.getText();
        System.out.println(text2);
        
       
      
        
	}

}
