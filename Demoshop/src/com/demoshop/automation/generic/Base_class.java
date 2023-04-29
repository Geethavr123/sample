package com.demoshop.automation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_class 
{
 public WebDriver driver;
	@Parameters({"url","key","value"})
	@BeforeMethod
	public void openApp(String url,String key,String value) 
	{
		System.setProperty(key,value);
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);

	}
@AfterMethod
public void closeApp()
{
	//driver.close();
}
}
