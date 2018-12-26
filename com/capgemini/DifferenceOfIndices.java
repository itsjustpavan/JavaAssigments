package com.capgemini;

public class DifferenceOfIndices                                                                     //

	{
	
		public boolean differenceIndicesFunction(int[] numbers, int key)                           
		{
			
			int counter,counterOne,difference=0;

			for(counter=0;counter<numbers.length;counter++)
			
			{
				for(counterOne=counter+1;counterOne<numbers.length;counterOne++)
			
				{
				
					if(numbers[counter]==numbers[counterOne])
					
					{
							difference=counterOne-counter;
					
					}
				}
			}
			
			if(difference<=key)
				
				return true;                                                                    //return statement

			else
				
				return false;
		}



	}



