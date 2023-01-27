package VuramPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.SystemPropertyUtil;

public class Vuram1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\naveenre\\Desktop\\VATT\\Vuram\\chromedriver\\Jar software\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("https://www.instagram.com/");
		WebElement button = driver.findElement(By.xpath("(//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm'])[1]"));
			if(button.isEnabled())
				System.out.println("button enabled");
			else
				System.out.println("not enabled");
//			driver.findElement(By.name("q")).sendKeys("Selenium downloads");
//			Thread.sleep(2500);
//			driver.findElement(By.xpath("//span[.='selenium downloads']")).click();
//			System.out.println("HHHHHHHHHHHHHHHHHHHHHHH");
			driver.quit();
			
			
	}
	

}
