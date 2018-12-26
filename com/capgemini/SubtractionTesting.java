package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractionTesting                       //class named SubtractionTesting
 {
	@Test      
	public void SubtractionTestingOfNegative() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.subtraction(-1,-5);
		assertEquals(4,result);
	}
	
	@Test
	public void SubtractionTestingOfOneNegative() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.subtraction(-1,5);
		assertEquals(-6,result);
	}
	
	@Test
	public void SubtractionTestingOfPositive() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.subtraction(1,5);
		assertEquals(-4,result);	
	}
	
	@Test
	public void SubtractionTestingOfZeroes() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.subtraction(0,0);
		assertEquals(0,result);	
	}	
 }