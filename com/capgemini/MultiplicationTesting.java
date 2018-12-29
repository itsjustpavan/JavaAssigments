package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTesting                          //class Named MultiplicationTesting
 {

	@Test
	public void multiplicationTestingOfNegative() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.multiplication(-1,-5);
		assertEquals(5,result);
	}
	
	@Test
	public void multiplicationTestingOfOneNegative() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.multiplication(-1,5);
		assertEquals(-5,result);
	}
	
	@Test
	public void multiplicationTestingOfPositive() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.multiplication(1,5);
		assertEquals(5,result);	
	}
	
	@Test
	public void multiplicationTestingOfZeroes() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.multiplication(0,0);
		assertEquals(0,result);	
	}
 }