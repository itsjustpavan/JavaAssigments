package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class DivisionTesting 
 {
	private Calculator calculator;
	@Before                                 //Before Annotation
	public  void BeforeFunction()
	{
		calculator=new Calculator();
		System.out.println("Test started");
	}

	@Test
	public void DivisionTestingOfNegative()
	{
		int result=calculator.division(-5,-1);
		assertEquals(5,result);
	}
	@Test
	public void DivisionTestingOfOneNegative()
	{
		int result=calculator.division(-5,1);
		assertEquals(-5,result);
	}
	@Test
	public void DivisionTestingOfPositive()
	{
		int result=calculator.division(5,1);
		assertEquals(5,result);	
	}
	@Test
	public void DivisionTestingOfZeroes()
	{
		int result=calculator.division(0,5);
		assertEquals(0,result);	
	}		
 }