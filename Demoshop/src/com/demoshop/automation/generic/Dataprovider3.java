package com.demoshop.automation.generic;

import java.io.FileInputStream;

import org.testng.annotations.DataProvider;

public class Dataprovider3 
{
public Object[][] gedata(String sheet)
{
	  FileInputStream fls = new FileInputStream("new/Appche_excel/New Microsoft Excel Worksheet.xlsx");
	   
	  work
	  
	  int actual_row = sheet2.getPhysicalNumberOfRows();
	  int actual_cell = sheet2.getRow(0).getPhysicalNumberOfCells();
	  
	Object[][]arr=new Object[actual_row-1][actual_cell];
	for (int i = 0; i <actual_row-1; i++)
	{
		for (int j = 0; j <actual_cell; j++)
		{
			
			arr[i][j]=sheet2.getRow(i+1).getCell(j)	.toString();
			}
	}
	return arr;
}
@DataProvider(name="TestData")
public Object[][] script()
{
	Object [][] arr=gedata("sheet2");
	return arr;
}
}
