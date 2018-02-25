package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

@Test
public void tc_(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\Firefox\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	driver.findElement(By.name("q")).sendKeys("Selenium");
	
}

}
