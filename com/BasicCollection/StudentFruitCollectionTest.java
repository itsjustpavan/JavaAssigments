package com.BasicCollection;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class StudentFruitCollectionTest 
{
	private StudentFruitCollection objectOne;												 	//Creating instances of class			
	private StudentFruitCollection objectTwo;
	private StudentFruitCollection objectThree;
	
	@Before
	
	public void beforeFunction()
	{
		objectOne=new StudentFruitCollection("pavan");                                          
		objectTwo=new StudentFruitCollection("krishna");
		objectThree=new StudentFruitCollection("harish");
	}
	
	
	@Test
	
	public void fruitStudentMappingCorrectTest()
	{
		HashMap<Object,String> hashMap=new HashMap<Object,String>();                           //Using hashmap to map student names with fruits
		hashMap.put(objectOne, "mango");
		hashMap.put(objectTwo, "apple");
		hashMap.put(objectThree, "grapes");
		for(Map.Entry m:hashMap.entrySet())
		{    
		       System.out.println(m.getKey()+" "+m.getValue());    
		}  
		for(Map.Entry m:hashMap.entrySet())
		{    
		       System.out.println(m.getKey());    
		}  
			
	}
	
	@Test
	
	public void fruitStudentMappingWrongTest()
	{
		HashMap<Object,String> hashMap=new HashMap<Object,String>();
		hashMap.put(objectOne, "mango");
		hashMap.put(objectTwo, "apple");
		hashMap.put(objectThree, "grapes");
		assertEquals("apple",hashMap.get(objectOne));			
	}
	

}
