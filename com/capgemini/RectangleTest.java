package java1;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class RectangleTest 
{
	private RectangleArea rectangleArea;
	
	@Before
	
	public   void beforeFunction()
	{
		rectangleArea=new RectangleArea();
	}

	@Test
	
	public void correctAreaTest() 
	{
		
		int result=rectangleArea.areaFunction();
		rectangleArea.setLength(5);
		rectangleArea.setBreadth(10);
		
		assertEquals(50,result);
	}
	@Test
	public void wrongAreaTest() 
	{
		
		int result=rectangleArea.areaFunction();
		rectangleArea.setLength(2);
		rectangleArea.setBreadth(10);
		
		assertEquals(50,result);
	}

}
