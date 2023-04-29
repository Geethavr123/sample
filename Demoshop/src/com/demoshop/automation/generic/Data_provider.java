package com.demoshop.automation.generic;

import org.testng.annotations.DataProvider;

public class Data_provider 
{
@DataProvider(name="TestData")
public  String[][] getData() 
{
	String[][]arr= {{"Geetha","Raaz","geetharaz68@gmail.com","8296228083","dress"}};
	return arr;
}
}
