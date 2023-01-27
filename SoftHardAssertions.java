package com.testinmyown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftHardAssertions {
	@Test
	public void TestGoogle() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		SoftAssert soft= new SoftAssert();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR tutorials",Keys.ENTER);
		String actual = driver.getTitle();
		String expec="HYR tutorials - Google Search";
		Thread.sleep(3000);
		soft.assertEquals(actual, expec, " Tittle is mismatched");
		driver.close();
		soft.assertAll();
		
		
	}
}
