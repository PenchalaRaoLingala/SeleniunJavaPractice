package selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KeyboardEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		String baseURL = "https://demoqa.com/text-box";
		driver.get(baseURL);

		// Enter the Full Name
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Mr.Peter Haynes");

		//Enter the Email
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("PeterHaynes@toolsqa.com");

		// Enter the Current Address
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("43 School Lane London EC71 9GO");

		// Copy the Current Address
		currentAddress.sendKeys(Keys.CONTROL);
		currentAddress.sendKeys("A");
		currentAddress.sendKeys(Keys.CONTROL);
		currentAddress.sendKeys("C");

		//Press the TAB Key to Switch Focus to Permanent Address
		currentAddress.sendKeys(Keys.TAB);

		//Paste the Address in the Permanent Address field
		WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		permanentAddress.sendKeys(Keys.CONTROL);
		permanentAddress.sendKeys("V");

		//Compare Text of current Address and Permanent Address
		assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));

		driver.close();

	}

}
