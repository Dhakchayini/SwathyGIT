package org.TestNG;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage extends BaseClass {
	
	public HotelPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	

	@CacheLookup
	@FindBy(xpath = "//input[@id='username']")
	private WebElement email;
	@CacheLookup
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pswd;
	@CacheLookup
	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;
	@CacheLookup
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	@CacheLookup
	@FindBy(id="hotels")
	private WebElement hotel;
	@CacheLookup
	@FindBy(id="room_type")
	private WebElement roomType;
	@CacheLookup
	@FindBy(id="room_nos")
	private WebElement noOfRoom;
	@CacheLookup
	@FindBy(id="datepick_in")
	private WebElement date;
	@CacheLookup
	@FindBy(id="adult_room")
	private WebElement adults;
	@CacheLookup
	@FindBy(id="child_room")
	private WebElement child;
	@FindBy(id="Submit")
	private WebElement search;
	
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getNoOfRoom() {
		return noOfRoom;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getAdults() {
		return adults;
	}
}
