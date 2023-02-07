package com.testinmyown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		Actions action =new Actions(driver);
		WebElement dif = driver.findElement(By.id("nb-diff"));
		System.out.println("Before copy paste "+dif.getText());
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]"));
		action.moveToElement(ele).click().perform();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		WebElement ele1 = driver.findElement(By.xpath("(//div[@class='CodeMirror-lines' and @role='presentation'])[2]"));
		action.moveToElement(ele1).click().perform();

		//		List <WebElement> slno = driver.findElements(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[3]/div"));
//		List <WebElement> text=driver.findElements(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div"));
//		System.out.println(slno.size());
//		System.out.println(text.size());

		//System.out.println(slno.getText()+" :"+ text.getText());
			action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
			action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
			System.out.println("After copy paste "+dif.getText());
			driver.quit();

		//driver.findElement(By.xpath("//*[@id=\"result\"]/div[4]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/pre[7]/span")).sendKeys(Keys.CONTROL+"AC");
			
			//pre[@class=' CodeMirror-line ' and @role='presentation']
			
			
			
			
			
			
			
			//print all text from the paragraph
			
//			slno=driver.findElements(By.className("CodeMirror-linenumber CodeMirror-gutter-elt"));
//			text=driver
	}

}
