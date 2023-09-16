package org.JUnit;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Assert;
import org.junit.Test;

public class RunnerAssertFb1 extends BaseClass{

	@Test

	public void tc1() throws IOException {

		browserlaunch();
		launchUrl("https://www.facebook.com/");
		implicitWait();
		LoginPageFb l = new LoginPageFb();
		sendKeys(l.getEmail(), excelRead("Sheet1", 0, 0));
		String email = getAttribute(l.getEmail());
		Assert.assertTrue(email.contains("a.n.swathyraj@gmail.com"));
		sendKeys(l.getPswd(), excelRead("Sheet1", 0, 1));
		String pswd = getAttribute(l.getPswd());
		Assert.assertEquals("Password Validation", "Marriage@11", pswd);
		click(l.getLogin());
		// close();
	}

	@Test

	public void tc2() throws IOException {

		browserlaunch();
		launchUrl("https://www.facebook.com/");
		implicitWait();
		LoginPageFb l = new LoginPageFb();
		sendKeys(l.getEmail(), excelRead("Sheet1", 1, 0));
		String email = getAttribute(l.getEmail());
		Assert.assertTrue(email.contains("purushothharith82@gnail.com"));
		sendKeys(l.getPswd(), excelRead("Sheet1", 1, 1));
		String pswd = getAttribute(l.getPswd());
		Assert.assertEquals("Password Validation", "papsal@08", pswd);
		click(l.getLogin());
		// close();
	}

	
}
