package com.capgemini;

public class Country
{
	private String name;
	private double population;
	private double area;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getPopulation() 
	{
		return population;
	}
	public void setPopulation(double population) 
	{
		this.population = population;
	}
	public double getArea()
	{
		return area;
	}
	public void setArea(double area) 
	{
		this.area = area;
	}
	
	public Country(String name , double population , double area)
	{
		this.name=name;
		this.population=population;
		this.area=area;
	}
	public Country() 
	{
		
	}
	public Country highestPopulation(Country[] maximum)
	{
		Country highest=maximum[0];
		for(int count=0;count<maximum.length;count++)
		{
			if(maximum[count].population>highest.population)
			{
				highest=maximum[count];
			}
		}
		return highest;
	}
	
	public Country highestArea(Country[] maximum)
	{
		Country highest=maximum[0];
		for(int count=0;count<maximum.length;count++)
		{
			if(maximum[count].area>highest.area)
			{
				highest=maximum[count];
			}
		}
		return highest;
	}
	
	public Country highestDensity(Country[] maximum)
	{
		Country highest=maximum[0];
		for(int count=0;count<maximum.length;count++)
		{
			if(maximum[count].population/maximum[count].area>highest.population/highest.area)
			{
				highest=maximum[count];
			}
		}
		return highest;
	}
}