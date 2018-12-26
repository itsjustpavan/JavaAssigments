package com.BasicCollection;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class TelvisionCollectionTest 
{	
	private TelivisionCollection telivision;
	private TelivisionCollection telivisionOne;
	private TelivisionCollection telivisionTwo;
	
	@Before
	
	public void beforeFunction()
	{
		telivision=new TelivisionCollection("Sony","LED",30000,true);
		telivisionOne=new TelivisionCollection("Philips","LCD",40000,false);
		telivisionTwo=new TelivisionCollection("Sony","LED",30000,false);
	}
	
	@Test
	
	public void testingTelivisionClassWithHashSet()                                             //Hashlist removes Duplicates and returns the values
	{
		HashSet<Object> hashSet = new HashSet<Object>();                                 		//Creating HashList
		hashSet.add(telivision);
		hashSet.add(telivisionOne);
		hashSet.add(telivisionTwo);
		Iterator<Object> iterated = hashSet.iterator();
		while (iterated.hasNext()) 
		{
			System.out.println(iterated.next());
		}
	}

	@Test
	public void testingTelivisionClassWithArrayList() 													//ArrayList doesnt remove any duplications
	{
		ArrayList<Object> arrayList=new ArrayList<Object>();                            		//Creating arraylist  
		arrayList.add(telivision);
		arrayList.add(telivisionOne);
		arrayList.add(telivisionTwo);
		Iterator<Object> iterated = arrayList.iterator();
		while (iterated.hasNext()) 
		{
			System.out.println(iterated.next());
		}
	}
}