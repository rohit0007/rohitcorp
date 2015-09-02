package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Webpages.CurrentPage;
import Webpages.RegistrationPage;

public class GmailAccountTest {
	
	@Test
	
	public void TestCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\417085\\Desktop\\rohit\\selium\\driver\\chromedriver.exe");
		WebDriver MainDriver = new ChromeDriver();
		CurrentPage currentpage =new CurrentPage(MainDriver);
		currentpage.clickCreateAcc();
		RegistrationPage Reg = new RegistrationPage(MainDriver);
	    Reg.setFirstName("Rohit");
	    Reg.setLastName("Garud");
	    Reg.setLoginName("Rohitggggaaarr");
	    Reg.setPassword("Rohit12345676");
	    Reg.setRePassword("Rohit12345676");
	    Reg.setDay("08");
	    Reg.setYear("2015");
	    Reg.setPhone("9877215230");
	    Reg.setEmail("rohitgam@gmail.com");
	    Reg.setMonth();
	    Reg.setGender();
	    
	    Reg.setAgree();
	    int year1= Integer.parseInt(Reg.getYear());
	    if(year1<1997)
	    {
	    	Assert.assertTrue(false);
	    }
	    
	    
	    
	    Reg.setNext();

		
       String  output= MainDriver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr/td/font[2]/p")).getText();
        Assert.assertTrue(output.equals("In order to have a Google Account, you must meet certain age requirements. To learn more about online child safety, visit the Federal Trade Commission's website."));
	    
	    
		
		
	}

	
}
