package org.JUnit;

import org.base.BaseClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.support.CacheLookup;

public class RunnerTest extends BaseClass{
	
	
	@Test
	
	public void tc1() {
	
		browserlaunch();
		launchUrl("https://adactinhotelapp.com/");
		implicitWait();
		Loginpage l = new Loginpage();
		sendKeys(l.getEmail(), "swathyraj");
		sendKeys(l.getPswd(), "Marriage@11");
		click(l.getLogin());
		close();
	}
	
	@Test
	public void tc2() {
		
		browserlaunch();
		launchUrl("https://adactinhotelapp.com/");
		implicitWait();
		Loginpage l = new Loginpage();
		sendKeys(l.getEmail(), "Archanaraj");
		sendKeys(l.getPswd(), "Marriage@11");
		click(l.getLogin());
		
	}
	
	@Test
	public void tc4() {
		
		browserlaunch();
		launchUrl("https://adactinhotelapp.com/");
		implicitWait();
		Loginpage l = new Loginpage();
		sendKeys(l.getEmail(), "Anitharaj");
		sendKeys(l.getPswd(), "Marriage@11");
		click(l.getLogin());
		close();
	}
	
	@Ignore
	@Test
	public void tc3() {
		
		browserlaunch();
		launchUrl("https://adactinhotelapp.com/");
		implicitWait();
		Loginpage l = new Loginpage();
		sendKeys(l.getEmail(), "swathyraj");
		sendKeys(l.getPswd(), "Marriage@11");
		click(l.getLogin());
		close();
	}
}


