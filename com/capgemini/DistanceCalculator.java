package com.capgemini;

public class DistanceCalculator 
{
	float feet;
	float inches;
	
	public DistanceCalculator()                                                 //Default Constructor
	{
	}

	public DistanceCalculator(float feet, float inches) 
	{
		this.feet=feet;
		this.inches=inches;
	}
	
	public void display()
	{
		System.out.println(feet+" ft "+inches+" in");;
	}

	public static DistanceCalculator sum(DistanceCalculator distance, DistanceCalculator distance1) 
	{
		DistanceCalculator result = new DistanceCalculator();
		result.feet=distance.feet+distance1.feet;
		result.inches=distance.inches+distance1.inches;
		return result;
	}

}