package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DistanceTest 
{

	private DistanceCalculator distance;
	private DistanceCalculator distance1;
	
	@Before
	
	public void beforeFunction()
	{
		distance = new DistanceCalculator(8.1f,6.4f);
		distance1 = new DistanceCalculator(7.2f,1.3f);
	}
	
	@Test
	
	public void distanceTestFunction() 
	{
		String expectedResult="15.3 ft 7.7 in";
		DistanceCalculator answer = DistanceCalculator.sum(distance, distance1);
		answer.display();
	
		assertEquals(expectedResult, answer.feet+" ft "+answer.inches+" in");
	}
	
	@Test
	
	public void wrongdistanceTestFunction() 
	{
		String expectedResult="15.299999 ft 7.700001 in";
		DistanceCalculator answer = DistanceCalculator.sum(distance, distance1);
		answer.display();
	
		assertEquals(expectedResult, answer.feet+" ft "+answer.inches+" in");
	}

}