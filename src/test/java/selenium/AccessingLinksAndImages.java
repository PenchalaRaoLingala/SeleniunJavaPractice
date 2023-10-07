package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccessingLinksAndImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		WebDriverManager.chromedriver().clearDriverCache().setup(); 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		//String baseURL = "http://demo.guru99.com/test/link.html";
		//driver.get(baseURL);essing image links


		/*
		 * //link text driver.findElement(By.linkText("click here")).click();
		 * System.out.println("Title of the page : "+driver.getTitle());
		 * 
		 * driver.get(baseURL); //partial link text
		 * driver.findElement(By.partialLinkText("here")).click();
		 * System.out.println("Title of the page : "+driver.getTitle());
		 */
		String baseUrl = "http://demo.guru99.com/test/newtours/";	
		//Multiple links with the same Link Text
		driver.get(baseUrl);					
		String theLinkText = driver.findElement(By					
				.partialLinkText("egis"))			
				.getText();		
		System.out.println(theLinkText);					
		theLinkText = driver.findElement(By					
				.partialLinkText("EGIS"))			
				.getText();		
		System.out.println(theLinkText);


	}

}
