package com.capgemini;
     
import static org.junit.Assert.*;

import org.junit.Before;                                                                     //Importing file for using before
import org.junit.Test;

public class MultiDimensionTest 
    {

		private MultiDimensionalArray multidimensional;                                  //Creating Instance of class
		
		@Before                                                                            //Before Function is executed before every test function 
		
		
		public void beforeFunction()
		{
			multidimensional = new MultiDimensionalArray();
		}
		
		@Test
		
		public void findNumberTest() 
		{
			int array[][] = 
				{
					
					{7,8,9},
					{1,2,3},
					{4,5,6}
			
				};
			boolean result = multidimensional.findNumber(5,array);
			assertEquals(true,result);
		}
		
		@Test
		
		public void findNotPresentNumber() 
		{
			int array[][] = 
				{	
					
					{4,5,6},
					{7,8,9},
					{1,2,3},
					
				};

			boolean result = multidimensional.findNumber(15,array);
			assertEquals(false,result);
		}
	}
