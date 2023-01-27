package com.testinmyown;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
 
	@Test
	public void TestGoogle() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR tutorials",Keys.ENTER);
		String actual = driver.getTitle();
		String expec="HYR tutorials - Google Search";
		Thread.sleep(3000);
		Assert.assertEquals(actual, expec, " Tittle is mismatched");
		driver.close();
	}
	@Test
	public void TestMyntra() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("wiueywi",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void TestFacebook() {
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.name("email")).sendKeys("HYR tutorials", Keys.ENTER);
		
		SoftAssert softAssert= new SoftAssert();
		
		//tittle
		String actTittle=driver.getTitle();
		String expeTittle = "Facebook – log in or sign up";
		softAssert.assertEquals(actTittle, expeTittle, "Tittle is mismatched");
		System.out.println("Tittle executed");
		
		//URL
		String actURL= driver.getCurrentUrl();
		String expeURL ="https://www.facebook.com/1233";
		softAssert.assertEquals(actURL, expeURL, "URL is mismatched");
		System.out.println("URL executed");

		//Text
		// Text Asserion
		String actualText = driver.findElement(By.name("email")).getAttribute("value");
		String expectedText = "";
		softAssert.assertEquals(actualText, expectedText, "Username text is mismatched");
		System.out.println("Text executed");
		
		//border
		String actBorder = driver.findElement(By.name("email")).getCssValue("border");
		String expecBorder = "0.666667px solid rgb(27, 116, 228)";
		softAssert.assertEquals(actBorder, expecBorder, "Border is mismatched");
		System.out.println("border executed");
		
		//ErrorMessage
//		String actErrormessage = driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
//		String expErrormessage = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
//		softAssert.assertEquals(actErrormessage, expErrormessage, "Error message is mismatched");
//		System.out.println("ErrorMessage executed");
		driver.quit();
		
		softAssert.assertAll();

		
	}
	
	
	
	
}
