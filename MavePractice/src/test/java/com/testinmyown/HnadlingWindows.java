package com.testinmyown;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HnadlingWindows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("marketing");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/div[1]/div/div[8]/div/div/div/a")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		System.out.println(handles);
		Iterator<String> iterate = handles.iterator();
		String parent = iterate.next();
		String child = iterate.next();
		driver.switchTo().window(child);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Naveen");
		driver.findElement(By.name("UserLastName")).sendKeys("Reddy");
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Questions? Talk to an')]//child::a"));
		System.out.println("Phone number is "+ element.getText());
		driver.switchTo().window(parent);
		
		//driver.quit();

		
	}

}
