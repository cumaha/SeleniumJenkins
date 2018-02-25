package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SecondTest {
	
	@Test
	
	public void tc_2() {
		
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.Firefoxdriver","C:\\Softwares\\Selenium\\Firefox\\geckodriver.exe");
		
		driver.get("http://ww.gmail.com");
		
	}

}
