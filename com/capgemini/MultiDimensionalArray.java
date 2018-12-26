package com.capgemini;

public class MultiDimensionalArray                           //Creating class MultiDimensionalArray
{
	public boolean findNumber(int searchnumber, int[][] numbers)           //Declaration of boolean function
	{
		boolean result=false;
		for(int i = 0;i < numbers.length;i++)
		{
		  for(int j = 0;j < numbers[0].length; j++)
			{
			   if(numbers[i][j]== searchnumber)
					{
						result = true;
					}
			}
		}
		return result;
	}
}

