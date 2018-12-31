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
		String expected="[TelivisionCollection [company=Sony, type=LED, threeDimensionE0nabled=true, price=30000.0], "
						+"TelivisionCollection [company=Philips, type=LCD, threeDimensionE0nabled=false, price=40000.0]]";
		String result=hashSet.toString();
		assertEquals(expected,result);
	}
				

	@Test
	public void testingTelivisionClassWithArrayList() 													//ArrayList doesnt remove any duplications
	{
		ArrayList<Object> arrayList=new ArrayList<Object>();                            		//Creating arraylist  
		arrayList.add(telivision);
		arrayList.add(telivisionOne);
		arrayList.add(telivisionTwo);
		String expected="[TelivisionCollection [company=Sony, type=LED, threeDimensionE0nabled=true, price=30000.0], "
				+"TelivisionCollection [company=Philips, type=LCD, threeDimensionE0nabled=false, price=40000.0], "
				+"TelivisionCollection [company=Sony, type=LED, threeDimensionE0nabled=false, price=30000.0]]";

		String result=arrayList.toString();
		assertEquals(expected,result);
	}
}
		
