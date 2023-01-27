package com.testinmyown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class CheckBoxs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("englishchbx")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("latinchbx")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("englishchbx")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		List<WebElement> allCheck = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
       for(int i=0;i<allCheck.size();i++) {
			
			System.out.print(allCheck.get(i).getText());
		}
		System.out.println(allCheck.size());
		for (WebElement webElement : allCheck) {
			
			System.out.println(webElement.getText());
		}
		driver.quit();

		

	}

}
