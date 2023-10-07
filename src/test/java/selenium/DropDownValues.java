package selenium;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		/*
		 * WebDriverManager.chromedriver().clearDriverCache().setup(); ChromeOptions
		 * options = new ChromeOptions();
		 * options.addArguments("--remote-allow-origins=*"); driver = new
		 * ChromeDriver(options);
		 */

		
		  WebDriverManager.edgedriver().clearDriverCache().setup(); 
		  EdgeOptions options = new EdgeOptions(); 
		  options.addArguments("--remote-allow-origins=*"); 
		  driver = new EdgeDriver(options);
		 

		String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		driver.get(baseURL);

		Select select = new Select(driver.findElement(By.name("country")));
		List<WebElement> allOptions = select.getOptions();
		Iterator<WebElement> itr = allOptions.iterator();
		while(itr.hasNext()) {
			String dropDownValues = itr.next().getText();
			System.out.println(dropDownValues);
		}
		driver.quit();
	}
}
