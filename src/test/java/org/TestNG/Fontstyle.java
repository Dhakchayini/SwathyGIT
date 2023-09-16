package org.TestNG;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fontstyle extends BaseClass{

	public static void main(String[] args) {
	
		
			browserlaunch();
				launchUrl("https://www.facebook.com/");
				
				WebElement login = driver.findElement(By.name("login"));
//				System.out.println(login.getCssValue("font-style"));
//				System.out.println(login.getCssValue("font-family"));
//				System.out.println(login.getCssValue("background-color"));
			
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].setAttribute('style','font-size:70px;text-align:center;background:black')",login);
				
	
	
	}
	}
		
	

