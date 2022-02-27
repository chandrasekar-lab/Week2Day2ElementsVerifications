package week2_day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerifications_IsEnabled {

	public static void main(String[] args) {

		//Set Property of Browser
		System.setProperty("webdriver.chrome.driver", "E:/Drivers_Testing/chromedriver.exe");

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");

		// Wait 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize the window
		driver.manage().window().maximize();

		//IsEnabled

		boolean elementIsEnabled=driver.findElement(By.name( "username")).isEnabled();
		System.out.println("Is the element Enabled:" +elementIsEnabled);
		 
		

		boolean elementIsEnabled1=driver.findElement(By.xpath( "//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[5]/div[1]/div[1]/input[1]")).isEnabled();
		System.out.println("Is the element Enabled:" +elementIsEnabled1);
		 
		// Close the driver
		driver.close();
	}

}
