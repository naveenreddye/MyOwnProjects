package com.testinmyown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement men = driver.findElement(By.className("desktop-main"));
		Actions action=new Actions(driver);
		action.moveToElement(men).build().perform();
		Thread.sleep(3000);
		List<WebElement> allTags = driver.findElements(By.className("desktop-main"));
		System.out.println(allTags);
//		WebElement jeans = driver.findElement(By.linkText("Jeans"));
//		  action.moveToElement(jeans).perform();
		

	}

}
