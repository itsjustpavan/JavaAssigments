package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringReverseTest                  //Creating a class
{

	@Test
	public void correctString()                      //First Test case
	{
		StringReverse stringreverse=new StringReverse();
		String result=stringreverse.reverseStringByWords("Not Bad");
		assertEquals("toN daB",result);
		
	}
	@Test
	public void wrongString()                            //Second Test case 
	{
		StringReverse stringreverse=new StringReverse();
		String result=stringreverse.reverseStringByWords("Not Bad As you");
		assertEquals("toN daB",result);
		
	}
	@Test
	public void correctString1()                             //Third Test Case
	{
		StringReverse stringreverse=new StringReverse();
		String result=stringreverse.reverseStringByWords("Let's take LeetCode contest");
		assertEquals("s'teL ekat edoCteeL tsetnoc",result);
		
	}

}
