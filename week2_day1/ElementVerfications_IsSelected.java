package week2_day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerfications_IsSelected {

	public static void main(String[] args) {
   
		
		//Set Property of Browser
				System.setProperty("webdriver.chrome.driver", "E:/Drivers_Testing/chromedriver.exe");

				// Launch Chrome Browser
				ChromeDriver driver = new ChromeDriver();

				// Load the URL
				driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");

				// Wait 30 seconds
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// Maximize the window
				driver.manage().window().maximize();

				//IsSelected

				boolean elementIsSelected=driver.findElement(By.xpath( "//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[2]/input[1]")).isSelected();
				System.out.println("Is the element Enabled:" +elementIsSelected);
				 
				

				boolean elementIsSelected1=driver.findElement(By.xpath( "//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[1]/input[1]")).isSelected();
				System.out.println("Is the element Enabled:" +elementIsSelected1);
				 
				// Close the driver
				driver.close();
		
		
		
	}

}
