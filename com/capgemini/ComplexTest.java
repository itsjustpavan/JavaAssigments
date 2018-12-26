package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ComplexTest 
 {

	private Complex complex;
	private Complex complexOne;
	
	@Before                                                                            
	public void beforeFunction()
	{		
		complex = new Complex(6.5,5);
		complexOne = new Complex(2.2,3.7);                                                       //Passing values before the test function
	}

	@Test
	public void sumOfComplex() 
	{
		String expectedResult="8.7+8.7i";
		Complex answer = Complex.sum(complex, complexOne);
		answer.display();
		assertEquals(expectedResult, answer.real+"+"+answer.imaginary+"i");
	}
	
 }