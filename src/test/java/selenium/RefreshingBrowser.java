package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshingBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().clearDriverCache().setup(); 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.toolsqa.com");
		Thread.sleep(2000);
		//method1
		//driver.navigate().refresh();
		//method2
		//driver.findElement(By.xpath("(//*[@placeholder='Search'])[2]")).sendKeys(Keys.F5);
		//method3
		//driver.get(driver.getCurrentUrl());
		//method4
		//driver.navigate().to(driver.getCurrentUrl());
		//method5
		driver.findElement(By.xpath("(//*[@placeholder='Search'])[2]")).sendKeys("\uE035");
		
		Thread.sleep(1000);
		driver.quit();
		
	}
}
