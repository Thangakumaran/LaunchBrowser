package org.alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Link = "https://netbanking.hdfcbank.com/netbanking/";
		driver.get(Link);
	}

}
