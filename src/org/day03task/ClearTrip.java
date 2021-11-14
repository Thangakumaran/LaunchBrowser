package org.day03task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspaceNew\\SELENIUM\\LaunchBrowser\\DriverFolder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");

		WebElement se = driver.findElement(By.id("from_station"));
		se.sendKeys("Chennai");
		
		String rt = se.getAttribute("value");
		System.out.println(rt);
	

		WebElement we = driver.findElement(By.id("to_station"));
		we.sendKeys("Pudukkottai");

		WebElement po = driver.findElement(By.id("trainClass"));
		po.click();

		WebElement tt = driver.findElement(By.xpath("//option[@value='SL']"));
		tt.click();

		WebElement ff = driver.findElement(By.id("dpt_date"));
		ff.click();

		WebElement cc = driver.findElement(By.xpath("//a[text()='30']"));
		cc.click();
		
		WebElement hh = driver.findElement(By.id("train_adults"));
		hh.click();

		WebElement oo = driver.findElement(By.xpath("(//option[@value='5'])[1]"));
		oo.click();

		WebElement bb = driver.findElement(By.name("children"));
		bb.click();

		WebElement jj = driver.findElement(By.xpath("(//option[@value='1'])[2]"));
		jj.click();

		WebElement yy = driver.findElement(By.id("train_male_seniors"));
		yy.click();

		WebElement ll = driver.findElement(By.xpath("(//option[@value='2'])[3]"));
		ll.click();

		WebElement vv = driver.findElement(By.name("female_seniors"));
		vv.click();

		WebElement jjj = driver.findElement(By.xpath("(//option[@value='1'])[4]"));
		jjj.click();

	}

}
