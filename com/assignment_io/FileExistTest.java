package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileExistTest {

	@Test
	public void filePresentest() 
	{
		FileExist files=new FileExist();
		boolean result=files.checkingFile();
		assertEquals(true,result);
	}

}
