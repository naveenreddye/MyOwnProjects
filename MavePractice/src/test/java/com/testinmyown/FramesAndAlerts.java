package com.testinmyown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesAndAlerts {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		 driver.manage().window().maximize();
		 WebElement frame1 = driver.findElement(By.id("iframeResult"));
		 driver. switchTo().frame(frame1);
		 driver.findElement(By.xpath("/html/body/button")).click();
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 String alertText= driver.switchTo().alert().getText();
		 System.out.println(alertText);
		 driver.switchTo().alert().accept();
		 driver. switchTo().parentFrame();
		 System.out.println(driver.getTitle());
		 
		 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		 driver.switchTo().frame("iframeResult");
		 driver.findElement(By.xpath("//button[text()='Try it']")).click();
		 Alert alert = driver.switchTo().alert();
		 String alertText1 = alert.getText();
		 System.out.println(alertText1);
		 alert.sendKeys("Naveen Reddy");
		 alert.accept();
		 System.out.println(driver.findElement(By.id("demo")).getText());
		 driver.quit();

	}

}
