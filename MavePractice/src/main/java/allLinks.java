import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class allLinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://www.sugarcrm.com/au/request-demo/");
		Thread.sleep(3000);
		driver1.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		List<WebElement> allLinks = driver1.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for (WebElement webElement : allLinks) {
			String site=webElement.getText();
			String site1 = site.trim();
			System.out.println(site1);
		}
		driver1.quit();
	}

}
