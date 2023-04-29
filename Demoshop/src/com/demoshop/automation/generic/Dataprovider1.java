package com.demoshop.automation.generic;

import org.testng.annotations.DataProvider;

public class Dataprovider1
{
	
		@DataProvider(name="TestData1")
		public  String[][] getData() 
		{
			String[][]arr= {{"geethavr68@gmail.com","8296228083"}};
			return arr;
		}
}
