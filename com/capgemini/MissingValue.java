package com.capgemini;

public class MissingValue 
{

	public int missingValueFunction(int number[],int value) 
	{
		
		int counter;
		int total;
		total=(value+1)*(value+2)/2;
		for(counter=0;counter<value;counter++)
			total-=number[counter];	
		return total;
		
	}

}
