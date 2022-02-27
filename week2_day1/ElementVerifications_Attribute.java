package week2_day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerifications_Attribute {

	public static void main(String[] args) {

		// set property of browser
		System.setProperty("webdriver.chrome.driver", "E:/Drivers_Testing/chromedriver.exe");

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");

		// Wait 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize the window
		driver.manage().window().maximize();

		// Get Atttibue Value of "Get default text entered"
		String getAttributeValue = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println("The Attribute Value is:" + getAttributeValue);
		

		driver.close();

	}

}
