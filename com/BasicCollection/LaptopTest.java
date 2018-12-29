
package com.BasicCollection;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class LaptopTest 
{
	private Laptop laptop;
	private Laptop laptopOne;
	private Laptop laptopTwo;

	@Before
	public void beforeFunction() 
	{
		laptop = new Laptop("Delloite", 5837, "windows 8", "i5 processor");
		laptopOne = new Laptop("HP", 2837, "windows 7", "i7 processor");
		laptopTwo = new Laptop("Delloite", 5837, "windows 7", "i5 processor");
	}

	@Test
	public void testingLappyClassWithHashSet()                                           //Hashlist removes Duplicates and returns the values 
	{
		HashSet<Object> hashSet = new HashSet<Object>();                                 //Creating HashList
		hashSet.add(laptop);
		hashSet.add(laptopOne);
		hashSet.add(laptopTwo);
		String actual=hashSet.toString();
		String expected="[Laptop [company=Delloite, model=5837, operatingsystem=windows 8, processor=i5 processor], "
						+"Laptop [company=HP, model=2837, operatingsystem=windows 7, processor=i7 processor]]";
		assertEquals(expected,actual);
		
	}

	@Test
	public void testingLappyClassWithArrayList()                                        //ArrayList doesnt remove any duplications
	{
		ArrayList<Object> arrayList=new ArrayList<Object>();                            //Creating arraylist  
		arrayList.add(laptop);
		arrayList.add(laptopOne);
		arrayList.add(laptopTwo);
		String actual=arrayList.toString();
		String expected="[Laptop [company=Delloite, model=5837, operatingsystem=windows 8, processor=i5 processor], "
				+"Laptop [company=HP, model=2837, operatingsystem=windows 7, processor=i7 processor], "
				+"Laptop [company=Delloite, model=5837, operatingsystem=windows 7, processor=i5 processor]]";
		assertEquals(expected,actual);
	}
}
