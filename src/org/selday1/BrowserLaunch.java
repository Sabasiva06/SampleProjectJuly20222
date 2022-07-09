package org.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabas\\eclipse-workspace\\FacebookProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Welcome Java");

		driver.navigate().refresh();

		txtUserName.sendKeys("hi javaaa");
	}

}
