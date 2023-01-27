package com.testinmyown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text()='From']")).click();
		WebElement auto = driver.findElement(By.xpath("//input[@placeholder='From']"));
		auto.sendKeys("Patna");
		Thread.sleep(3000);
		auto.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		auto.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		auto.sendKeys(Keys.ENTER);
		driver.quit();
		
	}

}
