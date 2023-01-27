package com.testinmyown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsOfWebDriver {

	
	public static void main(String[] args) throws Exception {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("(//a[.='Tech News'])[1]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.quit();
		System.out.println(2);
		
	}
}
