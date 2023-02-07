package com.testinmyown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizebleJQUERY {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/resizable/");
//		WebElement frame1= driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
//		driver.switchTo().frame(frame1);
//	//Thread.sleep(2000);
//		WebElement resize = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
//		Actions action= new Actions(driver);
//		//action.moveToElement(resize).perform();
//		action.dragAndDropBy(resize, 22, 22).perform();
//		driver.quit();
		
		//SLIDER Handling
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://jqueryui.com/slider/#colorpicker");
		WebElement frame2= driver1.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver1.switchTo().frame(frame2);
	//Thread.sleep(2000);
		WebElement greenslider = driver1.findElement(By.xpath("//*[@id=\"green\"]/span"));
		Actions action1= new Actions(driver1);
		action1.dragAndDropBy(greenslider, -20, 0).perform(); //we can use neative integer to move backward
		driver1.quit();
		
		
		
		
	}

}
