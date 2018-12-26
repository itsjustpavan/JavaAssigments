package com.capgemini;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CountLinesTest 
{

	@Test
	public void countingNoOfLines() throws IOException 
	{
		CountLine file=new CountLine();
		int result=file.countLines("C:\\java\\day1\\countline.txt");
		assertEquals(5,result);
		
	}

}
