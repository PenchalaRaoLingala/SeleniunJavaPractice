package SamplePrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadingDataFromDataTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("Webdriver.chrome.driver", "src\\\\test\\\\resources\\\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String baseURL ="http://demo.guru99.com/test/table.html";
		driver.get(baseURL);
		
		//To Locate Table
		WebElement table = driver.findElement(By.xpath("/html/body/table/tbody"));
		//To Locate rows of Table
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		//To calculate no of rows in table
		int rowCount = rows.size();
		//Loop will execute till the last row of table
		for(int i=0;i<rowCount;i++) {
			//To locate columns of that specific row
			List<WebElement> columns_row = rows.get(i).findElements(By.tagName("td"));
			//To locate no of columns(cells) of in that specific row
			int columnsCount = columns_row.size();
			System.out.println("Number of Cells in Row "+i+" are"+columnsCount);
			//Loop will execute till the last cell of that specific row
			for(int j=0;j<columnsCount;j++) {
				//To retrieve text from that specific cell
				String cellText = columns_row.get(j).getText();
				System.out.println("Cell Value of row number "+i+" and column number "+j+" is"+cellText);
				driver.close();
			}
		}

	}

}
