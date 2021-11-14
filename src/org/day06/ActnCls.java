package org.day06;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActnCls {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String s = "https://www.facebook.com/";
		driver.get(s);
		driver.manage().window().maximize();
		WebElement Copy = driver.findElement(By.id("email"));
		Copy.sendKeys("Thangakumaran");

		Actions actn = new Actions(driver);
		actn.doubleClick(Copy).contextClick(Copy).build().perform();

		Robot K = new Robot();
		for (int i = 0; i < 4; i++) {

			K.keyPress(KeyEvent.VK_DOWN);
			K.keyRelease(KeyEvent.VK_DOWN);

		}

		K.keyPress(KeyEvent.VK_ENTER);
		K.keyRelease(KeyEvent.VK_ENTER);
		K.keyPress(KeyEvent.VK_TAB);
		K.keyRelease(KeyEvent.VK_TAB);
		K.keyPress(KeyEvent.VK_CONTROL);
		K.keyPress(KeyEvent.VK_V);
		K.keyRelease(KeyEvent.VK_CONTROL);
		K.keyRelease(KeyEvent.VK_V);

		WebElement Done = driver.findElement(By.id("pass"));

		String Check = Done.getAttribute("value");
		System.out.println("Successfully Pasted:" + Check);

	}

}
