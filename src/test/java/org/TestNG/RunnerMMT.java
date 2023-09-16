package org.TestNG;

import java.util.Date;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunnerMMT extends BaseClass {

	@BeforeClass

	private void dateTime() {

		Date d = new Date();
		System.out.println(d);
	}

	@BeforeMethod

	private void launching() {
		browserlaunch();
		launchUrl("https://adactinhotelapp.com/");
		implicitWait();

	}

	@Test
		private void tc1() {
		
		HotelPage h = new HotelPage();
		sendKeys(h.getEmail(), "swathyraj");
		sendKeys(h.getPswd(), "Marriage@11");
		click(h.getLogin());
//		dropDown(h.getLocation(), "text", "London");
//		dropDown(h.getHotel(), "value", "Hotel Hervey");
//		dropDown(h.getRoomType(), "text", "Deluxe");
//		dropDown(h.getNoOfRoom(), "text", "4 - Four");
//		sendKeys(h.getDate(), "02/07/2023");
//		dropDown(h.getAdults(), "value", "4");
//		dropDown(h.getChild(), "value", "2");
//		click(h.getSearch());		
//		
	}
	
	
	@AfterMethod

	private void closeBrowser() {
		close();
	}

	@AfterClass

	private void endDateTime() {

		Date d = new Date();
		System.out.println(d);

	}

}
