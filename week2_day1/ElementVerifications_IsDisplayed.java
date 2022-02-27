package week2_day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerifications_IsDisplayed {
	public static void main(String[] args) {



		//Set Property of Browser
		System.setProperty("webdriver.chrome.driver", "E:/Drivers_Testing/chromedriver.exe");

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");

		// Wait 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize the window
		driver.manage().window().maximize();

		//IsDiplayed

		boolean elementIsDisplayed=driver.findElement( By.id( "color")).isDisplayed();
		System.out.println("Is the element Displayed:" +elementIsDisplayed);
		 
		// Close the driver
		driver.close();


	}



}
