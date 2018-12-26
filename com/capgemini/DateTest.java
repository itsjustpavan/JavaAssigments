package com.capgemini;
import static org.junit.Assert.*;
import org.junit.Test;

public class DateTest 
{
	
	@Test
	public void checkSmallDate() 
	{
		Date privateDate= new Date(12,12,1996);
		
		assertEquals(false,privateDate.isSmaller(privateDate));
		
	}
	@Test
	public void checkString() 
	{
		Date privateDate= new Date(12,5,2019);
		assertEquals("12/5/2019",privateDate.toString());
		
	}
	@Test
	public void differenceDates() 
	{
		Date privateDate=new Date(12,12,2018);
		int [] result= {-1,0,0};
		assertEquals(result,privateDate.differenceOfDate(privateDate));
		
	}
}
