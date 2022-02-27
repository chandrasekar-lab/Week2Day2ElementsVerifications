package week2_day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVarificatios_Href {

	public static void main(String[] args) {


		//Set Property of Browser
		System.setProperty("webdriver.chrome.driver", "E:/Drivers_Testing/chromedriver.exe");

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");

		// Wait 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize the window
		driver.manage().window().maximize();



		// Get Atttibue Value of "Find where am supposed to go without clicking me?"
		String getAttributeOf_href = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println("The Attribute href is:" + getAttributeOf_href);;
		// Close the driver
		driver.close();


	}

}
