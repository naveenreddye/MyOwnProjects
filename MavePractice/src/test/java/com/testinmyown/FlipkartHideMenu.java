package com.testinmyown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartHideMenu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		WebElement electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		Actions action = new Actions(driver);
		action.moveToElement(electronics).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Gaming')]")).click();
	}

}
