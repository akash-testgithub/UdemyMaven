package com.udemy;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1Test
{
	@Parameters({"MainURL","APIKey"})
	@Test
	public void TC_0(String mainUR, String key)
	{
		System.out.println("TC-0 : "+mainUR);
		System.out.println("TC-0 : "+key);
	}
	
	
	@Test
	public void TC_1()
	{
		System.out.println("TC-1");
		
	}
	
	
	@Test
	public void TC_2()
	{
		System.out.println("TC-2 : ");
		//Assert.assertTrue(false);
	}

}
