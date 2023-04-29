package com.demoshop.automation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclassinsta 
{
public WebDriver driver;
@BeforeMethod
public void openapp()
{
	System.setProperty("Webdriver.chrome.driver", "./softwares/chromedriver.exe");
  driver= new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  driver.get("https://www.instagram.com");
  
	
}
@AfterMethod
public void closeapp()
{
	//driver.close();
}
}
