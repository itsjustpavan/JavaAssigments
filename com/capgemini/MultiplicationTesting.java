package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTesting                          //class Named MultiplicationTesting
 {

	@Test
	public void MultiplicationTestingOfNegative() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.multiplication(-1,-5);
		assertEquals(5,result);
	}
	
	@Test
	public void MultiplicationTestingOfOneNegative() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.multiplication(-1,5);
		assertEquals(-5,result);
	}
	
	@Test
	public void MultiplicationTestingOfPositive() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.multiplication(1,5);
		assertEquals(5,result);	
	}
	
	@Test
	public void MultiplicationTestingOfZeroes() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.multiplication(0,0);
		assertEquals(0,result);	
	}
 }