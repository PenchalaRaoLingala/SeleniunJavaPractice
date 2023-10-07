package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeysActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).build().perform();

		System.out.println(email.getCssValue("font-size"));
		System.out.println(email.getCssValue("font-colour"));
		System.out.println(email.getCssValue("font-type"));
		System.out.println(email.getCssValue("background-colour"));

	}

}
