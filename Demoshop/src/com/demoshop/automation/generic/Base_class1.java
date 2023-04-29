package com.demoshop.automation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_class1 
{
public WebDriver driver;

@BeforeMethod
public void oppapp()
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--disable-notifications");
	 driver=new ChromeDriver(opt);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com");
	 
	 
}
@AfterMethod
public void closeapp()
{
	//driver.close();
}
}
