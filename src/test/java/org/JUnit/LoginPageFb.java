package org.JUnit;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
public class LoginPageFb extends BaseClass {

	public LoginPageFb() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindAll({
	@FindBy(xpath ="//input[@id='email']"),
	@FindBy(xpath = "//input[name='email']")})
	private WebElement email;
	@CacheLookup
	@FindBys({
	@FindBy(xpath ="//input[@id='pass']"),
	@FindBy(xpath = "//input[@name='pass']")})
	private WebElement pswd;
		public WebElement getEmail() {
		return email;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getLogin() {
		return login;
	}

	@CacheLookup
	@FindBy(xpath ="//button[@name='login']")
	private WebElement login;
}
