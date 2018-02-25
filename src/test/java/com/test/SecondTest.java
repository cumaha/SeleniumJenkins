package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
	
	@Test
	
	public void tc_2() {
		

	System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\Firefox\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		driver.get("http://ww.gmail.com");
		
	}

}
