package com.demoshop.automatiom.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.demoshop.automation.generic.Base_class;
import com.demoshop.automation.generic.Data_provider;

public class Script extends Base_class
{
//@Test(dataProvider = "TestData",dataProviderClass = Data_provider.class)
public void register(String fn,String ln,String mail,String pass,String d)
{
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys(fn);
	driver.findElement(By.id("LastName")).sendKeys(ln);
	driver.findElement(By.id("Email")).sendKeys(mail);
	driver.findElement(By.id("Password")).sendKeys(pass);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(pass);
	driver.findElement(By.id("register-button")).click();
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.id("Email")).sendKeys(mail);
	driver.findElement(By.id("Password")).sendKeys(pass);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.findElement(By.name("q")).sendKeys(d);
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	
}

}
