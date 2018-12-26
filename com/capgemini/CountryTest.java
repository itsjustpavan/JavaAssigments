package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountryTest
{
	private Country country1;
	private Country country2;
	private Country country3;
	private Country country4;
	private Country country5;
	Country country[];
	
	@Before
	
	public void beforeFunction()
	{
		country1=new Country("India", 100000,12000);
		country2=new Country("Pakistan", 10000,2000);
		country3=new Country("Srilanka", 2000,3000);
		country4=new Country("USA",1500,2000);
		country5=new Country("Australia",3000,3000);
		country=new Country[5];
		country[0]=country1;
		country[1]=country2;
		country[2]=country3;
		country[3]=country4;
		country[4]=country5;
		
	}
	
	@Test 
	
	public void countryWithHigheshtPopulation()
	{
		
		assertEquals(country2,country1.highestPopulation(country));
	}
	

	@Test 
	
	public void countryWithHigheshtArea()
	{
		
		assertEquals(country1,country1.highestArea(country));
	}
	
	@Test 
	
	public void countryWithHigheshtDensity()
	{
		
		assertEquals(country1,country1.highestDensity(country));
	}
}
	
	
	