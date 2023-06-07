package org.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("a.n.swathyraj@gmail.com");
		
		WebElement pswd = driver.findElement(By.id("pass"));
		pswd.sendKeys("****");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		driver.quit();
		
	}
}
