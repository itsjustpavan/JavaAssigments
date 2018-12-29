package com.BasicCollection;

import static org.junit.Assert.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;



public class ClassStudentsCollectionTest 
{
	private ClassStudentsCollection classStudents;
	private ClassStudentsCollection classStudentsOne;
	private ClassStudentsCollection classStudentsTwo;
	private ClassStudentsCollection classStudentsThree;
	private ClassStudentsCollection classStudentsFour;
		
	@Before
	
	public void beforeFunction() 
	{
		classStudents = new ClassStudentsCollection("pavan","kaleru",583);
		classStudentsOne = new ClassStudentsCollection("nihkil","gandhleru",584);
		classStudentsTwo = new ClassStudentsCollection("Venkat","javvaji",585);
		classStudentsThree=new ClassStudentsCollection("Aakash","adikam",586);
		classStudentsFour=new ClassStudentsCollection("akash","padikam",586);

	}
	
	@Test
	
	public void maintainingOrderTest()                                             				//TreeSet to sort them in natural order
	{
		TreeSet<Object> treeSet = new TreeSet<Object>();                                 		//Creating TreeSet
		treeSet.add(classStudents.toString());
		treeSet.add(classStudentsOne.toString());
		treeSet.add(classStudentsTwo.toString());
		treeSet.add(classStudentsThree.toString());
		treeSet.add(classStudentsFour.toString());
		
		Iterator<Object> iterated = treeSet.iterator();
		while (iterated.hasNext()) 
		{
			System.out.println(iterated.next());
		}
	}
	
	@Test
	
	public void maintainingNaturalOrderTest()                                             				//LinkedList to print them in insertion order
	{
		LinkedList<Object> linkedList = new LinkedList<Object>();                                 		//Creating LinkedList
		linkedList.add(classStudents.toString());
		linkedList.add(classStudentsOne.toString());
		linkedList.add(classStudentsTwo.toString());
		linkedList.add(classStudentsThree.toString());
		linkedList.add(classStudentsFour.toString());
		
		Iterator<Object> iterated = linkedList.iterator();
		while (iterated.hasNext()) 
		{
			System.out.println(iterated.next());
		}
	}
}	
	
	