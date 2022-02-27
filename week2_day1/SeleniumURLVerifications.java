package week2_day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumURLVerifications {

	public static void main(String[] args) {

		// set property of browser
		System.setProperty("webdriver.chrome.driver", "E:/Drivers_Testing/chromedriver.exe");

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://testleaf.herokuapp.com/");

		// Wait 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize the window
		driver.manage().window().maximize();

		// GetTitle
		String title = driver.getTitle();
		System.out.println("The Title is : " + title);

		// url Verifications
		if (driver.getTitle().contains("TestLeaf")) {

			System.out.println("Title Test: PASS");
		} else
			System.out.println("Title Test : fail");

		// Get the System Current URL
		String currentURL = driver.getCurrentUrl();
		System.out.println("The URL is :" + currentURL);

		// Get Page Source
		String PageSource = driver.getPageSource();
		System.out.println("The Page Source IS :" + PageSource);

		// Close the driver
		driver.close();

	}

}
