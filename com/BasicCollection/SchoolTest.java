package com.BasicCollection;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class SchoolTest 
{
	private School school;
	private School schoolOne;
	private School schoolTwo;
	
	@Before
	
	public void beforeFunction()
	{
		school=new School("Mother Teresa","Hyderbad","RangaReddy",1);
		schoolOne=new School("Mother Teresa","Hyderbad","RangaReddy",15);
		schoolTwo=new School("Johnson grammar ","Delhi","Noida",2);
	}

	@Test
	
	public void testingSchoolClassWithHashSet()                                             //Hashlist removes Duplicates and returns the values
	{
		HashSet<Object> hashSet = new HashSet<Object>();                                 		//Creating HashList
		hashSet.add(school);
		hashSet.add(schoolOne);
		hashSet.add(schoolTwo);
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
		arrayList.add(school);
		arrayList.add(schoolOne);
		arrayList.add(schoolTwo);
		Iterator<Object> iterated = arrayList.iterator();
		while (iterated.hasNext()) 
		{
			System.out.println(iterated.next());
		}
	}
}