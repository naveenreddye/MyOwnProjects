package com.testinmyown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class orangeHRM {
	WebDriver driver;
	
	@Test
	public void Launchapp(){
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Launchapp");
	}
	@Test
	public void LoginDetails() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);
		System.out.println("LoginDetails");
	}
	@Test
	public void Myinfo() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[.='My Info']")).click();
		System.out.println("Myinfo");
	}
	@Test
	public void Employedetails() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//h6[.='Personal Details']")).isDisplayed());
		//driver.quit();
	}
	@Test
	public void Verifyname() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement elemen = driver.findElement(By.xpath("//p[.='saman Ebrahimikelidsar']"));
		System.out.println(elemen.isDisplayed());
		System.out.println(elemen.getText());
		driver.quit();
	}
}
