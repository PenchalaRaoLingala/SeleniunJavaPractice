package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;

		WebDriverManager.chromedriver().clearDriverCache().setup(); 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		String baseURL = "http://jsbin.com/osebed/2";
		driver.get(baseURL);
		
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		//selecting the values
		fruits.selectByVisibleText("Banana");
		fruits.selectByValue("orange");
		fruits.selectByIndex(1);
		
		Thread.sleep(1000);
		
		//de-selecting the values
		fruits.deselectByVisibleText("Banana");
		fruits.deselectByValue("orange");
		fruits.deselectByIndex(1);


		//driver.quit();
	}

}
