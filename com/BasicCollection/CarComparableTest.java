package com.BasicCollection;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class CarComparableTest 
{
	private CarCollection car;
	private CarCollection carOne;
	private CarCollection carTwo;
	private CarCollection carThree;
	
	@Before
	
	public void beforeFunction()
	{
		car=new CarCollection("Hyundai",102,1996,102);
		carOne=new CarCollection("Byundai",102,2019,103);
		carTwo=new CarCollection("Maruti",573,2017,583);
		carThree=new CarCollection("Audi",58,1999,584);
		
	}

	@Test
	public void comparableTest()
	{
		ArrayList<CarCollection> al=new ArrayList<CarCollection>(); 
		
		
		
		
	}
}