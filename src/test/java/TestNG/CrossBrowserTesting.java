package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		//Check if parameter passed as 'Chrome'
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("Webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		}
		//Check if parameter passed as 'Edge'
		else if(browser.equalsIgnoreCase("Edge")){
			//set path to Edge.exe
			System.setProperty("webdriver.edge.driver","src\\test\\resources\\msedgedriver.exe");
			//create Edge instance
			driver = new EdgeDriver();
		}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void testParameterWithXML() throws InterruptedException{
		driver.get("http://demo.guru99.com/V4/");

		WebElement userName = driver.findElement(By.name("uid"));
		Thread.sleep(1000);
		userName.sendKeys("guru99");
		WebElement password = driver.findElement(By.name("password"));
		Thread.sleep(1000);
		password.sendKeys("guru99");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();

		}
	}

