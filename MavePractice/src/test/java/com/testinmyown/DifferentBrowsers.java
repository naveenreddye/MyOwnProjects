package com.testinmyown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentBrowsers {
	
	public static String browser="chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.id("txt1")).sendKeys("Naveen");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		
		

	}

}
