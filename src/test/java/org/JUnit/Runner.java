package org.JUnit;

import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Runner extends BaseClass {

	@BeforeClass
	public static void dateTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@Before
	public  void before() {
		browserlaunch();
		launchUrl("https://adactinhotelapp.com/");
		implicitWait();
	}
	@Test
	public  void tc1() {
		Loginpage l = new Loginpage();
		sendKeys(l.getEmail(), "swathyraj");
		sendKeys(l.getPswd(), "Marriage@11");
		click(l.getLogin());
	}
	@Test
	public  void tc2() {
		Loginpage l = new Loginpage();
		sendKeys(l.getEmail(), "Archanaraj");
		sendKeys(l.getPswd(), "Marriage@11");
		click(l.getLogin());
	}
	@After
	public  void after()  {
			close();
	}
	@AfterClass
	public static void afterClass() {
		Date d = new Date();
		System.out.println(d);	
	}
}