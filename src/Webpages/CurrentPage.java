package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurrentPage {

	WebElement Create_Acct;
	WebDriver HomeDriver;
	
	public CurrentPage(WebDriver driver)
	{
		HomeDriver=driver;
		HomeDriver.get("https://www.gmail.com/intl/en/mail/help/about.html");
		HomeDriver.manage().window().maximize();
		
	}
	public void clickCreateAcc()
	{
		HomeDriver.findElement(By.id("gmail-create-account")).click();	
	}
	
}
