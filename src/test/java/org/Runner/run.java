package org.Runner;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class run extends BaseClass{
	
	public static void main(String[] args) throws Exception {
	
		browserlaunch();
		
		launchUrl("https://www.instagram.com/");
		
		implicitWait();
		
		WebElement name = driver.findElement(By.xpath("//span[text()='Phone number, username, or email']"));
		sendKeys(name, excelRead("Sheet1", 0, 0));
		
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		sendKeys(pswd, excelRead("Sheet1", 0, 1));
		
		WebElement login = driver.findElement(By.linkText("Log in"));
		click(login);
		
		
		
	}

}
