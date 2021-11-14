package org.practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class PracticeAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		// WebElement clk = driver.findElement(By.xpath("(//a[text()='CONTINUE TO
		// LOGIN'])[1]"));
		// clk.click();

		WebElement From = driver.findElement(By.id("src"));
		From.sendKeys("Pudukkottai");
		WebElement To = driver.findElement(By.id("dest"));
		To.sendKeys("Chennai");
		WebElement Date = driver.findElement(By.id("onward_cal"));
		Date.click();

		WebElement Table = driver.findElement(By.tagName("table"));
		List<WebElement> Tab = Table.findElements(By.tagName("tr"));
		//want column data's alone
		//for (int i = 3; i < Tab.size(); i++) {
			//WebElement Trow = Tab.get(i);
			//List<WebElement> Data = Trow.findElements(By.tagName("td"));
			//for (int j = 0; j < Data.size(); j++) {
				//WebElement data = Data.get(1);
				//String text = data.getText();
				//System.out.println(text);
				//if (text.equals("23")) {
					//data.click();
		//want row alone
		WebElement Ralone = Tab.get(5);
		List<WebElement> Row = Ralone.findElements(By.tagName("td"));
		for (int i = 0; i < Row.size(); i++) {
			WebElement text = Row.get(i);
			String text2 = text.getText();
			System.out.println(text2);
			if (text2.equals("26")) {
				text.click();
				
				
			}
			
		}
		
					
				}
			
		
		}
		
	


