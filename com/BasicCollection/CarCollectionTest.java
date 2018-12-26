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
		Iterator<Object> iterated = hashSet.iterator();
		while (iterated.hasNext()) 
		{
			System.out.println(iterated.next());
		}
	}

	@Test
	public void testingCarClassWithArrayList() 											//ArrayList doesnt remove any duplications
	{
		ArrayList<Object> arrayList=new ArrayList<Object>();                            //Creating arraylist  
		arrayList.add(car);
		arrayList.add(carOne);
		arrayList.add(carTwo);
		arrayList.add(carThree);
		Iterator<Object> iterated = arrayList.iterator();
		while (iterated.hasNext()) 
		{
			System.out.println(iterated.next());
		}
	}
}

