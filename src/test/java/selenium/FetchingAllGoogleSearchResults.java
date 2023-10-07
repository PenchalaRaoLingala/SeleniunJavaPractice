package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchingAllGoogleSearchResults {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().clearDriverCache().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("selenium");
		Thread.sleep(1000);
	
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		System.out.println("Total No of suggestions :"+list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("selenium tutorial")) {
				list.get(i).click();
				break;
			}
		}
		
		//driver.quit();
	}
}
