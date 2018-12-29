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
		String actual=hashSet.toString();
		String expected="[Cellphone [company=Iphone, model=8, description=Apple, operatingSystem=Mac, price=60000.0], "
				 +"Cellphone [company=Nokia, model=57, description=Super Phone, operatingSystem=Nougat, price=50000.0]]";
		assertEquals(expected,actual);
	}

	@Test
	
	public void testingSchoolClassWithArrayList() 													//ArrayList doesnt remove any duplications
	{
		ArrayList<Object> arrayList=new ArrayList<Object>();                            		//Creating arraylist  
		arrayList.add(cellphone);
		arrayList.add(cellphoneOne);
		arrayList.add(cellphoneTwo);
		String actual=arrayList.toString();
		String expected="[Cellphone [company=Nokia, model=57, description=Super Phone, operatingSystem=Nougat, price=50000.0], "
							+"Cellphone [company=Nokia, model=57, description=Super Phone, operatingSystem=Nougat, price=60000.0], "
							+"Cellphone [company=Iphone, model=8, description=Apple, operatingSystem=Mac, price=60000.0]]";
		assertEquals(expected,actual);
	}
}