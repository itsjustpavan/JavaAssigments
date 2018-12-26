package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class MissingNumberTest                    //Creating a class
{ 

	@Test
	public void missingNumberOne()                //First test Function
	{
		int number[]={1,2,4,5,6};
		MissingValue missingvalue=new MissingValue();
		assertEquals(3,missingvalue.missingValueFunction(number,5));
	}
	@Test
	public void missingNumberTwo()              //Second Test function
	{
		int number[]={5,1,4,6,3};
		MissingValue missingvalue=new MissingValue();
		assertEquals(2,missingvalue.missingValueFunction(number,5));
	}
	@Test
	public void missingNumberThree()           //Third Test Function
	{
		int number[]={1,2,4};
		MissingValue missingvalue=new MissingValue();
		assertEquals(3,missingvalue.missingValueFunction(number,3));
	}
}
