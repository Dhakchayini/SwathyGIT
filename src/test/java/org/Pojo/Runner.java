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
		sendKeys(l.getEmail(), "swathypurushoth@gmail.com");
		sendKeys(l.getConfirmEmail(), "swathypurushoth@gmail.com");
		sendKeys(l.getPswd(), "swathy@01");
		dropDown(l.getDate(), "index", "1");
		dropDown(l.getMonth(), "value", "2");
		dropDown(l.getYear(), "text", "1987");
		click(l.getGender());
		click(l.getSignUp());
		click(l.getConfirmCode());
		
		
		
	}

}
