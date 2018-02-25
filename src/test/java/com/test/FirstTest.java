package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {

@Test
public void tc_(){
	
	WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.Firefoxdriver","C:\\Softwares\\Selenium\\Firefox\\geckodriver.exe");
	driver.get("http://www.google.com");
	driver.findElement(By.name("q")).sendKeys("Selenium");
	
}

}
