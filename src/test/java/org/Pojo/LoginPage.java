package org.Pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//a[text()='Create new account']")
	private WebElement createAcct;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstName;

	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement surName;
	@CacheLookup
	@FindBys({
	@FindBy(xpath="//input[@name='reg_email__']"),
	@FindBy(xpath = "(//input[@data-type='text'])[3]")})
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	private WebElement confirmEmail;
	@CacheLookup
	@FindAll({
	
	@FindBy(xpath="//input[@name='reg_passwd__']"),
	@FindBy(xpath="//input[@id='password_step_input']")})
	private WebElement pswd;
	
	@FindBy(xpath = "//select[@name='birthday_day']")
	private WebElement date;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement year;
		
	@FindBy(xpath="//label[text()='Female']")
	private WebElement gender;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signUp;
	
	@FindBy(xpath = "//span[text()='5-digit code']")
	private WebElement confirmCode;
	

	public WebElement getSurName() {
		return surName;
	}
	public WebElement getConfirmCode() {
		return confirmCode;
	}
	public WebElement getMobileNo() {
		return email;
	}
	public WebElement getPswd() {
		return pswd;
	}
	public WebElement getCreateAcct() {
		return createAcct;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getSignUp() {
		return signUp;
	}
	public WebElement getDate() {
		return date;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getConfirmEmail() {
		return confirmEmail;
	}
	
	
	

}
