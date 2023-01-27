package com.testinmyown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class XpathAxes {

	 static WebDriver driver;
	
	public static void main(String[] args) {
		//XpathAxes();
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/contactus.html");
	//	driver.findElement(By.id("input")).click();
		WebElement xpath = driver.findElement(By.xpath("//form[@name='contact-form']//child::input[1]"));
		System.out.println(xpath.getText());
		driver.close();
	}
//	public static void XpathAxes() {
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.get("https://www.hyrtutorials.com/p/contactus.html");
//	//	driver.findElement(By.id("input")).click();
//		WebElement xpath = driver.findElement(By.xpath("//form[@name='contact-form']//child::input[1]"));
//		System.out.println(xpath.getText());
//		driver.close();
//		
//	}
}
