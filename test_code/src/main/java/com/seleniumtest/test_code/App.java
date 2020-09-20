package com.seleniumtest.test_code;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 	* PHP Website
 	*
 	*/
public class App 
{
	
	@Test
	public static void main( String[] args )
    	{
    	System.setProperty("webdriver.chrome.driver"," usr/bin/chromedriver");
    	 ChromeOptions chromeOptions = new ChromeOptions();
    	 WebDriver driver = new ChromeDriver(chromeOptions);
    	 //WebDriver driver = new FirefoxDriver();

    	 System.out.println("Hi, Selenium Test");


    driver.get("http://localhost:index.php");
    driver.manage().window().maximize();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.id("About Us")).click();
    //Thread.sleep(5000);
    driver.quit();
    }
}
