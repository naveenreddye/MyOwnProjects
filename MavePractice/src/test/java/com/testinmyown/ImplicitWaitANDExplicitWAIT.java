package com.testinmyown;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitANDExplicitWAIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		//Thread.sleep(3000);
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
//		WebElement electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(electronics).perform();
//		driver.findElement(By.xpath("//a[contains(text(),'Gaming')]")).click();
//		driver.quit();
		Actions action = new Actions(driver);
		driver.get("https://www.ebay.com/");
		Actions action1 = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[2]"));
		action.moveToElement(ele).perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Camera drones')])"))).click();
	//	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("(//a[contains(text(),'Camera drones')])")).click();
		driver.quit();
		

	}

}
