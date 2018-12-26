package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicationTest {

	private RemoveDuplication removeDuplication;                                      //Creating Instance
	
	@Before
	
	public void beforeFunction()
	{
	  removeDuplication = new RemoveDuplication();
	}
	
	@Test
	
	public void testingOneString()                                                             //First test function 
	
	{
		String word1 = "abcabcabc";
		String expectedWord1="abc";
		String word= removeDuplication.removeDuplicationFunction(word1);
		assertEquals(expectedWord1,word);
	}
	
	@Test
	
	public void testingSecondString() 
	{
		
		String word1 = "javaforschool";
		String expectedWord1="javforschl";
		String word= removeDuplication.removeDuplicationFunction(word1);
		assertEquals(expectedWord1,word);
		
	}
	@Test
	
	public void testingThirdString() 
	{
		
		String word1 = "Mississippi";
		String expectedWord1="Misp";
		String word= removeDuplication.removeDuplicationFunction(word1);
		assertEquals(expectedWord1,word);
		
	}

}