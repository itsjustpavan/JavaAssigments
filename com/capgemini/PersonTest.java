package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest 
{
	private Person person1;
	private Person person2;
	Person person[];
	
	@Before
	
	public void beforeFunction()
	{
		person1=new Person("pavan",4,12,1996);
		person2=new Person("kumar",12,4,1996);
		person=new Person[2];
		person[0]=person1;
		person[1]=person2;
		
		
	}
	@Test
	public void test() 
	{
		assertEquals("pavan",04/12/1996,person1.toString());
	}

}
