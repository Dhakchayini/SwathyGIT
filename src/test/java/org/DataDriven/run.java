package org.DataDriven;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class run extends BaseClass{
	
	public static void main(String[] args) throws Exception {
	
		browserlaunch();
		
		launchUrl("https://www.facebook.com/");
		
		implicitWait();
		
		WebElement name = driver.findElement(By.xpath("//input[@id='email']"));
		sendKeys(name, excelRead("Sheet1", 0, 0));
		
		WebElement pswd = driver.findElement(By.xpath("//input[@id='pass']"));
		sendKeys(pswd, excelRead("Sheet1", 0, 1));
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		click(login);
		
		
		
	}

}
