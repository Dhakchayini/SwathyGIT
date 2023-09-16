package org.JUnit;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass {

	public Loginpage() {
		PageFactory.initElements(driver, this);

	}

	@CacheLookup
	@FindBy(xpath = "//input[@id='username']")
	private WebElement email;
	@CacheLookup
	@FindBy(id = "password")
	private WebElement pswd;
	@CacheLookup
	@FindBy(id = "login")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getLogin() {
		return login;
	}

}
