package org.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String Url="http://www.flipkart.com";
		driver.get(Url);
		driver.manage().window().maximize();
		
        WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
        close.click();
        
        WebElement App = driver.findElement(By.xpath("//div[text()='Furniture']"));
        App.click();
        Thread.sleep(3000);
        
        WebElement Select = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
        
        Actions a = new Actions(driver);
        a.moveToElement(Select).perform();
        
        Thread.sleep(3000);
        WebElement select2 = driver.findElement(By.xpath("//a[@title='Sofa']"));
        select2.click();
        
        Thread.sleep(3000);
        WebElement select3 = driver.findElement(By.xpath("(//a[contains(text(),'Flipkart Pe')])[1]"));
        select3.click();
        
        Thread.sleep(5000);
       try {
    	   WebElement Cart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
           Cart.click();
           System.out.println("Cart is launched");
		
	}
       catch (Exception e) {
		//WebElement select4 = driver.findElement(By.xpath("(//button[contains(@class,'_2KpZ6l _2')])[1]"));
        //select4.click();
       System.out.println("it's launched");
	}
       
       WebElement buy = driver.findElement(By.xpath("//button[text()='BUY NOW']"));
       buy.click();
        
       
        
	}

}
