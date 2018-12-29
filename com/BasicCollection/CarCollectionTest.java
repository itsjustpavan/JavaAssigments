package com.BasicCollection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class CarCollectionTest {
	private CarCollection car;
	private CarCollection carOne;
	private CarCollection carTwo;
	private CarCollection carThree;
	
	@Before
	
	public void beforeFunction()
	{
		car=new CarCollection("Hyundai",102,1996,102);
		carOne=new CarCollection("Hyundai",102,2019,103);
		carTwo=new CarCollection("Maruti",573,2017,583);
		carThree=new CarCollection("Audi",58,1999,584);
		
	}

	@Test
	public void testingCarClassWithHashSet()                                             //Hashlist removes Duplicates and returns the values
	{
		HashSet<Object> hashSet = new HashSet<Object>();                                 //Creating HashList
		hashSet.add(car);
		hashSet.add(carOne);
		hashSet.add(carTwo);
		hashSet.add(carThree);
		String actual=hashSet.toString();
		String expected="[Car [make=Maruti, model=573, year=2017, price=583.0], "
						+"Car [make=Audi, model=58, year=1999, price=584.0], "
						+"Car [make=Hyundai, model=102, year=1996, price=102.0]]";
		assertEquals(expected,actual);
	}

	@Test
	public void testingCarClassWithArrayList() 											//ArrayList doesnt remove any duplications
	{
		ArrayList<Object> arrayList=new ArrayList<Object>();                            //Creating arraylist  
		arrayList.add(car);
		arrayList.add(carOne);
		arrayList.add(carTwo);
		arrayList.add(carThree);
		String actual=arrayList.toString();
		String expected="[Car [make=Hyundai, model=102, year=1996, price=102.0], "
						+"Car [make=Hyundai, model=102, year=2019, price=103.0], "
						+"Car [make=Maruti, model=573, year=2017, price=583.0], "
						+"Car [make=Audi, model=58, year=1999, price=584.0]]";
		assertEquals(expected,actual);
		
}
}
