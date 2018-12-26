package com.capgemini;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CountNumberTest
{

	@Test
	public void countingNoOfLines() throws IOException 
	{
		CountNumbers file=new CountNumbers();
		int result=file.countingNoOfWords();
		assertEquals(6,result);
		
	}
	
	@Test
	public void countingWrongNoOfLines() throws IOException 
	{
		CountNumbers file=new CountNumbers();
		int result=file.countingNoOfWords();
		assertEquals(5,result);
		
	}
}
