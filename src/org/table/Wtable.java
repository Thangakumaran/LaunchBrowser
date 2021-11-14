package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wtable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		WebElement clck = driver.findElement(By.id("src"));
		clck.sendKeys("Pudukkottai");
		Thread.sleep(3000);
		WebElement Destn = driver.findElement(By.id("dest"));
		Destn.sendKeys("Chennai");
		Thread.sleep(3000);
		WebElement Date = driver.findElement(By.id("onward_cal"));
		Date.click();
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> red = table.findElements(By.tagName("tr"));
		//for (int i = 0; i < red.size(); i++) {
		
			//WebElement row = red.get(i);
			//List<WebElement> data = row.findElements(By.tagName("td"));
			//for (int j = 0; j < data.size(); j++) {
				//WebElement datavalue = data.get(j);
				//String text = datavalue.getText();
				//System.out.println(text);}
				
		//	for (WebElement row : red) {
			//	List<WebElement> data = row.findElements(By.tagName("td"));
				//for (WebElement surc : data) {
					//String text = surc.getText();
					//System.out.println(text);	
				//}
				
		//	}
		
			//particular row
		//	WebElement prow = red.get(6);
			//List<WebElement> lrow = prow.findElements(By.tagName("td"));
			//for (int i = 0; i < lrow.size(); i++) {
				//WebElement sel = lrow.get(i);
				//String text = sel.getText();
				//System.out.println(text);
				
				
			//}
		
			//particular column
		for (int i = 6; i < red.size(); i++) {
			
			WebElement Gt = red.get(i);
			List<WebElement> list = Gt.findElements(By.tagName("td"));
			WebElement cc = list.get(5);
			String text = cc.getText();
			System.out.println(text);
			
		}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
	//	}
		
	
	}

}
