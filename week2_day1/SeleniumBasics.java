package week2_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get( "http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement  elementUsername = driver.findElement( By.id( "username"));
		elementUsername.sendKeys( "Demosalesmanager");
		WebElement elementPassword = driver.findElement( By.id( "password"));
		elementPassword.sendKeys( "crmsfa");
		WebElement  elementLogInButton = driver.findElement( By.className( "decorativeSubmit"));
		elementLogInButton.click();
		WebElement  elementCRMSFA = driver.findElement( By.linkText( "CRM/SFA"));
		elementCRMSFA.click();
		WebElement  elementLeads = driver.findElement( By.linkText( "Leads"));
		elementLeads.click();
		WebElement  elementMyLeads = driver.findElement( By.partialLinkText( "Create"));
		elementMyLeads.click();
		WebElement  elementCompanyName = driver.findElement( By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys( "TCS");
		WebElement  elementFirstName = driver.findElement( By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys( "chand");
		WebElement  elementLastName = driver.findElement( By.id("createLeadForm_lastName"));
		elementLastName.sendKeys( "govind");
		//WebElement  elementSmallSubmit = driver.findElement( By.className( "smallSubmit"));
		//elementSmallSubmit.click();
		
		
		WebElement  elementDropDown = driver.findElement( By.id( "createLeadForm_dataSourceId"));
		elementDropDown.sendKeys( "Website");
		
		//Select se =new Select(elementDropDown);
		//se.selectByIndex(2);
		//se.selectByValue( "LEAD_EMPLOYEE");
		//se.selectByVisibleText("Conference");
		
		
	}

}
