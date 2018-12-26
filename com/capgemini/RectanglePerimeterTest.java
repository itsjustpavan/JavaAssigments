package java1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectanglePerimeterTest 
{
	private RectangleArea rectangleArea;
@Before
	
	public   void beforeFunction()
	{
		rectangleArea=new RectangleArea();
	}
	
	@Test

	public void correctPermetreTest() 
	{	
		rectangleArea.setLength(15);
		rectangleArea.setBreadth(10);
		int result=rectangleArea.perimetreFunction();
		assertEquals(50,result);
	}
	
	@Test
	public void wrongPermetreTest() 
	{	
		rectangleArea.setLength(2);
		rectangleArea.setBreadth(10);			
		int result=rectangleArea.perimetreFunction();
		assertEquals(50,result);
	}

}
