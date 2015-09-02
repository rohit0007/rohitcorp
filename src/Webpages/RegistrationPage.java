package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	
	WebDriver RegDriver=null;
	WebElement FirstName;
	WebElement LastName;
	WebElement LoginName;
	WebElement Password;
	WebElement RePassword;
	WebElement Day;
	WebElement Year;
	WebElement Phone;
	WebElement Email;
	WebElement SkipCaptch;
	WebElement Location;
	WebElement Agree;
	WebElement Next;
	WebElement Month;
	WebElement Gender;
	
	public RegistrationPage(WebDriver driver)
	{
		this.RegDriver=driver; 
	}
	
	public WebDriver getRegDriver() {
		return RegDriver;
	}

	public WebElement getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName.sendKeys(firstName);
	}
	public WebElement getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName.sendKeys(lastName);
	}
	public WebElement getLoginName() {
		return LoginName;
	}
	public void setLoginName(String loginName) {
		LoginName.sendKeys(loginName);
	}
	public WebElement getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password.sendKeys(password);
	}
	public WebElement getRePassword() {
		return RePassword;
	}
	public void setRePassword(String rePassword) {
		RePassword.sendKeys(rePassword);  ;
	}
	public WebElement getDay() {
		return Day;
	}
	public void setDay(String day) {
		Day.sendKeys(day);  
	}
	public String getYear() {
		return Year.getText();
	}
	public void setYear(String year) {
		Year.sendKeys(year);
	}
	public WebElement getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone.sendKeys(phone);
	}
	public WebElement getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email.sendKeys(email);
	}
	public WebElement getSkipCaptch() {
		return SkipCaptch;
	}
	public void setSkipCaptch(String skipCaptch) {
		SkipCaptch.sendKeys(skipCaptch);
	}
	public WebElement getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location.sendKeys(location);
	}
	public WebElement getAgree() {
		return Agree;
	}
	public void setAgree() {
		Agree.click();
	}
	public WebElement getNext() {
		return Next;
	}
	public void setNext() {
		Next.click();
	}
	public WebElement getMonth() {
		return Month;
	}
	public void setMonth() {
		
		RegDriver.findElement(By.xpath("//label[@id='month-label']/span/div/div")).click();
		RegDriver.findElement(By.xpath("//label[@id='month-label']/span/div[2]/div[@id=':7']")).click();
	}
	public WebElement getGender() {
		return Gender;
	}
	public void setGender() {
		
		RegDriver.findElement(By.xpath("//*[@id='Gender']/div[1]")).click();
		RegDriver.findElement(By.xpath("//*[@id=':e']/div")).click();
	}
	
	public void init1(){
		FirstName = RegDriver.findElement(By.id("FirstName"));
		LastName=RegDriver.findElement(By.id("LastName"));
		LoginName=RegDriver.findElement(By.id("GmailAddress"));
		Password=RegDriver.findElement(By.id("Passwd"));
		RePassword=RegDriver.findElement(By.id("PasswdAgain"));
		Day	=RegDriver.findElement(By.id("BirthDay"));
		Year=RegDriver.findElement(By.id("BirthYear"));
		Phone=RegDriver.findElement(By.id("RecoveryPhoneNumber"));
		Email = RegDriver.findElement(By.id("RecoveryEmailAddress"));
		SkipCaptch= RegDriver.findElement(By.id("SkipCaptcha"));
		Agree=RegDriver.findElement(By.id("TermsOfService"));
		Next=RegDriver.findElement(By.id("submitbutton"));
	}
	
}
