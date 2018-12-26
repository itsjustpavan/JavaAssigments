package com.BasicCollection;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class CellphoneTest 
{
	private Cellphone cellphone;
	private Cellphone cellphoneOne;
	private Cellphone cellphoneTwo;
	
	@Before
	
	public void beforeFunction()
	{
		cellphone=new Cellphone("Nokia", 57 , "Super Phone","Nougat",50000);
		cellphoneOne=new Cellphone("Nokia", 57 , "Super Phone","Nougat",60000);
		cellphoneTwo=new Cellphone("Iphone",8 , "Apple","Mac",60000);
	}
	
	@Test
	
	public void testingSchoolClassWithHashSet()                                             //Hashlist removes Duplicates and returns the values
	{
		HashSet<Object> hashSet = new HashSet<Object>();                                 		//Creating HashList
		hashSet.add(cellphone);
		hashSet.add(cellphoneOne);
		hashSet.add(cellphoneTwo);
		Iterator<Object> iterated = hashSet.iterator();
		while (iterated.hasNext()) 
		{
			System.out.println(iterated.next());
		}
	}

	@Test
	
	public void testingSchoolClassWithArrayList() 													//ArrayList doesnt remove any duplications
	{
		ArrayList<Object> arrayList=new ArrayList<Object>();                            		//Creating arraylist  
		arrayList.add(cellphone);
		arrayList.add(cellphoneOne);
		arrayList.add(cellphoneTwo);
		Iterator<Object> iterated = arrayList.iterator();
		while (iterated.hasNext()) 
		{
			System.out.println(iterated.next());
		}
	}
}