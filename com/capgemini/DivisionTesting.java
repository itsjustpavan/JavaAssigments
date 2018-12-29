package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class DivisionTesting 
 {
	private Calculator calculator;
	
	@Before                                                                 //Before Annotation
	
	public  void beforeFunction()
	{
		calculator=new Calculator();
		System.out.println("Test started");
	}

	@Test
	public void divisionTestingOfNegative()
	{
		int result=calculator.division(-5,-1);
		assertEquals(5,result);
	}
	@Test
	public void divisionTestingOfOneNegative()
	{
		int result=calculator.division(-5,1);
		assertEquals(-5,result);
	}
	@Test
	public void divisionTestingOfPositive()
	{
		int result=calculator.division(5,1);
		assertEquals(5,result);	
	}
	@Test
	public void divisionTestingOfZeroes()
	{
		int result=calculator.division(0,5);
		assertEquals(0,result);	
	}		
 }