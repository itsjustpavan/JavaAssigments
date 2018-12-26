package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DifferenceOfIndicesTest 
 {

	private DifferenceOfIndices differenceIndices;                                                  //Creating Instance of class
	
	@Before
	
	public void beforeFunction()                                                                     //Before function is executed before every test
	{
		differenceIndices = new DifferenceOfIndices();
	}

	@Test
	
	public void wrongDifferenceTesting() 
	{
		int key=2;
		int numbers[] ={1,2,3,4,5,1,10,9};
		boolean result=differenceIndices.differenceIndicesFunction(numbers,key);
		assertEquals(false,result);
	}
	
	@Test
	
	public void correctDifferenceTesting() 
	{
		int key=4;
		int numbers[] ={1,2,3,4,5,4,10,9};
		boolean result=differenceIndices.differenceIndicesFunction(numbers,key);
		assertEquals(true,result);
	}
	
	@Test
	
	public void correctDifferenceTestingtwo() 
	{
		int key=5;
		int numbers[] ={1,2,3,4,5,1,10,9};
		boolean result=differenceIndices.differenceIndicesFunction(numbers,key);
		assertEquals(true,result);
	}

 }
 

