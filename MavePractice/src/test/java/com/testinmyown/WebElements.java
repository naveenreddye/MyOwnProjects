package com.testinmyown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {
	@Test
	public void RelativeLocators() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		By above = RelativeLocator.with(By.tagName("input")).above(By.id("pass"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(above).sendKeys("Naveen Reddy ");
		driver.findElement(By.name("login")).click();
		By above2 = RelativeLocator.with(By.tagName("div")).above(driver.findElement(By.id("loginbutton")));
		String Actulerror= driver.findElement(above2).getText();
		String epexerror="The password that you've entered is incorrect. ";
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(Actulerror, epexerror, " Error message is mismatched");
		driver.close();
		assert1.assertAll();
		 
	}
	
}
