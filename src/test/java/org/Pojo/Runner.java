package org.Pojo;

import org.base.BaseClass;

public class Runner extends BaseClass {
	
	public static void main(String[] args) {
		
		browserlaunch();
		
		launchUrl("https://www.facebook.com/");
		
		LoginPage l = new LoginPage();
		
		implicitWait();
		
		click(l.getCreateAcct());
		sendKeys(l.getFirstName(),"Swathy");
		sendKeys(l.getSurName(), "purushoth");
		sendKeys(l.getEmail(), "swathyyogesh@gmail.com");
		sendKeys(l.getConfirmEmail(), "swathyyogesh@gmail.com");
		sendKeys(l.getPswd(), "swathy@01");
		dropDown(l.getDate(), "index", "2");
		dropDown(l.getMonth(), "value", "11");
		dropDown(l.getYear(), "text", "2002");
		click(l.getGender());
		click(l.getSignUp());
		
		
		
	}

}
