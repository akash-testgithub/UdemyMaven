package com.udemy;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3Test 
{
	
	
	
	
	@Test(dataProvider="getData")
	public void TC_5(String un,String pass)
	{
		System.out.println("TC-5");
		System.out.println(un);
		System.out.println(pass);
	}
	
	
	@Test
	public void TC_6()
	{
		System.out.println("TC-6");
	}
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="FirstName";
		obj[0][1]="pass1";
		obj[1][0]="SecondName";
		obj[1][1]="pass2";
		obj[2][0]="ThirdName";
		obj[2][1]="Pass3";
		
		return obj;
	}


}
