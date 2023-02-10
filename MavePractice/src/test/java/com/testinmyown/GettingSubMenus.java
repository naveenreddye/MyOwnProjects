package com.testinmyown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GettingSubMenus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		List<WebElement> allSubMenu = driver.findElements(By.xpath("//*[@id=\"nav1\"]/li[4]//li"));
		System.out.println(allSubMenu.size());
		for (WebElement webElement : allSubMenu) {
			System.out.println(webElement.getText());
		}
		driver.quit();

		
	}

}
