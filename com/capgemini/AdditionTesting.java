package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTesting                          //Class Named AdditionTesting 
 {

	@Test
	public void AdditionTestingOfNegative() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.addition(-1,-5);
		assertEquals(-6,result);
	}
	
	@Test
	public void AdditionTestingOfOneNegative() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.addition(-1,5);
		assertEquals(4,result);
	}
	
	@Test
	public void AdditionTestingOfPositive() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.addition(1,5);
		assertEquals(6,result);	
	}
	
	@Test
	public void AdditionTestingOfZeroes() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.addition(0,0);
		assertEquals(0,result);	
	}
 }
