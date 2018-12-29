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
		String actual=hashSet.toString();
		String expected="[School [city=Hyderbad,  district=RangaReddy, greatSchoolRanking=1], "
				+"School [city=Delhi,  district=Noida, greatSchoolRanking=2]]";
		assertEquals(expected,actual);
	}
	@Test
	public void testingSchoolClassWithArrayList() 													//ArrayList doesnt remove any duplications
	{
		ArrayList<Object> arrayList=new ArrayList<Object>();                            		//Creating arraylist  
		arrayList.add(school);
		arrayList.add(schoolOne);
		arrayList.add(schoolTwo);
		String actual=arrayList.toString();
		String expected="[School [city=Hyderbad,  district=RangaReddy, greatSchoolRanking=1], "
				+"School [city=Hyderbad,  district=RangaReddy, greatSchoolRanking=15], "
				+"School [city=Delhi,  district=Noida, greatSchoolRanking=2]]";
		assertEquals(expected,actual);
	}
}