package selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventsUsingActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		String baseURL = "https://demoqa.com/text-box";
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		//Create object of the Actions class
        Actions actions = new Actions(driver);
       
        
        // Enter the Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");
        
        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");
        
        
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
        
        
        // Select the Current Address using CTRL + A
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        // Copy the Current Address using CTRL + C
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        //Press the TAB Key to Switch Focus to Permanent Address
        actions.sendKeys(Keys.TAB);
        actions.build().perform();
        Thread.sleep(2000);
        
        //Paste the Address in the Permanent Address field using CTRL + V
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        Thread.sleep(2000);
        
        //Compare Text of current Address and Permanent Address
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
        System.out.println("Adresses matched");
        
     // Pressing SHIFT + TAB
        actions.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT);
        actions.build().perform();
        
        //driver.close();

	}

}
