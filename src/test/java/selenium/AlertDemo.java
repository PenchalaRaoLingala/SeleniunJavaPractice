package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		WebDriverManager.chromedriver().clearDriverCache().setup(); 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://demo.guru99.com/test/delete_customer.php");	
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).click();
		// Alert Message handling
		Alert alert = driver.switchTo().alert();
		//Get alert text
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		//accept alert
		alert.accept();
		//dismiss alert
		//alert.dismiss();
        
		String alertText2 = driver.switchTo().alert().getText();
		System.out.println(alertText2);
		driver.switchTo().alert().accept();

		driver.quit();
	}

}
