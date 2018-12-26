package com.capgemini;

public class Triangle 
{
	private int oneSide;
	private int secondSide;
	private int thirdSide;
	public Triangle(int oneSide, int secondSide, int thirdSide) 
	{
		this.oneSide=oneSide;
		this.secondSide=secondSide;
		this.thirdSide=thirdSide;
	}
	public int getOneSide() 
	{
		return oneSide;
	}
	public void setOneSide(int oneSide) 
	{
		this.oneSide = oneSide;
	}
	public int getSecondSide() 
	{
		return secondSide;
	}
	public void setSecondSide(int secondSide) 
	{
		this.secondSide = secondSide;
	}
	public int getThirdSide() 
	{
		return thirdSide;
	}
	public void setThirdSide(int thirdSide) 
	{
		this.thirdSide = thirdSide;
	}
	public boolean isScalene()
	{
		if ((oneSide != secondSide) && (secondSide != thirdSide) && (oneSide != thirdSide))
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	public boolean isRight()
	{
		double firstSide=Math.pow(oneSide , 2);
		double twoSide=Math.pow(secondSide , 2);
		double threeSide=Math.pow(thirdSide , 2);
		if(firstSide+twoSide == threeSide || firstSide+threeSide==twoSide || twoSide+threeSide == firstSide)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
		
		
	public boolean isIsosceles()
	{
		if (oneSide==secondSide && secondSide != thirdSide ||(secondSide==thirdSide && oneSide != thirdSide) || (oneSide==thirdSide && oneSide != secondSide))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public boolean isEquilateral()
	{
		if (oneSide==secondSide && secondSide==thirdSide)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
