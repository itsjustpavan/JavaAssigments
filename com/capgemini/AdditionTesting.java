package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTesting                          //Class Named AdditionTesting 
 {

	@Test
	public void additionTestingOfNegative() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.addition(-1,-5);
		assertEquals(-6,result);
	}
	
	@Test
	public void additionTestingOfOneNegative() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.addition(-1,5);
		assertEquals(4,result);
	}
	
	@Test
	public void additionTestingOfPositive() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.addition(1,5);
		assertEquals(6,result);	
	}
	
	@Test
	public void additionTestingOfZeroes() 
	{
		Calculator calculator=new Calculator();
		int result=calculator.addition(0,0);
		assertEquals(0,result);	
	}
 }
