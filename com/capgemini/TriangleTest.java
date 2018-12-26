package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest
{

	@Test
	
	public void testingScalene()                                     //Scalene is all three sides different 
	{
		Triangle triangle =new Triangle(3,4,5);
	
		assertEquals(true,triangle.isScalene());
		
	}
	
	@Test
	
	public void wrongScalene()
	{
		Triangle triangle =new Triangle(3,3,5);
	
		assertEquals(false,triangle.isScalene());					//1st value is equal to second value so it returns false							
	}
	
	@Test
	
	public void testingEquilateral()
	{
		Triangle triangle=new Triangle(3,3,3);                       //All 3 sides are equal so it is Equilateral
		
		assertEquals(true,triangle.isEquilateral());	
	}
	
	@Test
	
	public void wrongEquilateral()
	{
		Triangle triangle=new Triangle(2,3,3);                              //Only two sides are equal it returns false
		
		assertEquals(false,triangle.isEquilateral());	
	}
	
	@Test
	
	public void testingIsoceles()
	{
		Triangle triangle=new Triangle(3,3,5);                         //2 Sides Equal it is Iscoceles
		
		assertEquals(true,triangle.isIsosceles());
		
	}
	
	@Test
	
	public void wrongIsoceles()
	{
		Triangle triangle=new Triangle(2,3,5);                                 //Returns false as no two sides are equal 
		
		assertEquals(false,triangle.isIsosceles());
		
	}
	
	@Test
	
	public void testingRightAngled()
	{
		Triangle triangle=new Triangle(4,3,5);                              //Power of 4 + power of 3 = power of 5 so it returns true
                                                                               		
		assertEquals(true,triangle.isRight());
		
	}
	
	@Test
	
	public void testingRightAngledOne()
	{
		Triangle triangle=new Triangle(12,13,5);                           //Power of 12 + power of 5 = power of 13 so it returns true
		
		assertEquals(true,triangle.isRight());
		
	}
	
	@Test
	
	public void testingwrongRightAngle()
	{
		Triangle triangle=new Triangle(14,13,5);                          //Addition of 2 powers of a number is not equal to third number so it returnsr false		
		assertEquals(false,triangle.isRight());
		
	}
}
