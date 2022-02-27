package week2_day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerifications_Location_Size_Tagname {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:/Drivers_Testing/chromedriver.exe");

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");

		// Wait 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize the window
		driver.manage().window().maximize();

		// Get the Loaction
		
		System.out.println(driver.findElement(By.id( "color")).getLocation().getX());
		System.out.println(driver.findElement(By.id( "color")).getLocation().getY());

		System.out.println(driver.findElement(By.id( "color")).getLocation());

		Point locationPoint= driver.findElement(By.id( "color")).getLocation();
		System.out.println("The Location points are:" + locationPoint);


		
        // Get Size
		System.out.println(driver.findElement(By.id( "color")).getSize().getHeight());
		System.out.println(driver.findElement(By.id( "color")).getSize().getWidth());

		System.out.println(driver.findElement(By.id( "color")).getSize());

		Dimension sizePoint= driver.findElement(By.id( "color")).getSize();
		System.out.println("The dimension size is:" + sizePoint);
       
		//Get TagName
		
		String currentTagName= driver.findElement(By.id( "color")).getTagName();
		System.out.println("The currentTagName is:" + currentTagName);

		driver.close();




	}

}
