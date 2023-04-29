package com.demoshop.automatiom.testscripts;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoshop.automation.generic.Base_class1;
import com.demoshop.automation.generic.Dataprovider1;

import Pomscript.Pomclass;
@Listeners(com.demoshop.automation.generic.Listener.class)
public class Scipt1 extends Base_class1
{
@Test(dataProvider = "TestData1",dataProviderClass = Dataprovider1.class)
public void login(String user,String pwd) 
{
	Pomclass pmc=new Pomclass(driver);
	pmc.username().sendKeys(user);
	pmc.passwd().sendKeys(pwd);
	pmc.login().click();
	String login_title = driver.getTitle();
	assertEquals(login_title, "Demo Web Shop. Login");
	Reporter.log("login_title");
	
	
}
}
