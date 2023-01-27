package com.testinmyown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
		 //Singledropdown
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		 WebElement dpdown = driver.findElement(By.id("continents"));
		 Select select1 =new Select(dpdown);
		 select1.selectByIndex(1);
		 Thread.sleep(2000);
		 select1.selectByVisibleText("Australia");
		 
		 
		 //Multiple dropdown
		 driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		 WebElement dpdown1 = driver.findElement(By.id("selenium_commands"));
		 Select select =new Select(dpdown1);
		 select.selectByIndex(2);
		 List<WebElement> options = select.getOptions();
		//System.out.println( "Only selected option "+ select.getAllSelectedOptions().get(2).getText());
		 for (WebElement webElement : options) {
			 System.out.println(webElement.getText());
		}
		 driver.quit();
		 
		 
	}

}
