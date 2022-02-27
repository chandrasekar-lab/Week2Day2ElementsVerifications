package week2_day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerifications_Text_Color {

	public static void main(String[] args) {
		
		
		// set property of browser
				System.setProperty("webdriver.chrome.driver", "E:/Drivers_Testing/chromedriver.exe");

				// Launch Chrome Browser
				ChromeDriver driver = new ChromeDriver();

				// Load the URL
				driver.get("http://testleaf.herokuapp.com/pages/Button.html");

				// Wait 30 seconds
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// Maximize the window
				driver.manage().window().maximize();

				// Get the Text Color
				String getCssValue_Textcolor = driver.findElement(By.id("color")).getCssValue("background-color");
				System.out.println("The Attribute Value is:" + getCssValue_Textcolor);
				
				// Get the Text - What color am I?
				String get_Text = driver.findElement(By.id("color")).getText();
				System.out.println("The Text  is:" + get_Text);
				

				driver.close();

	}

}
