package com.capgemini;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class EmployeeReadTest {
	private EmployeeReadFile employeeReadFile;
	
	@Before
	public void beforeFunction()
	{
		employeeReadFile= new EmployeeReadFile();
	}

	@Test
	public void correctFileReadTest() throws IOException 
	{
		assertEquals("EmployeeFile [id=584, name=pavan, salary=50000.0]",employeeReadFile.readFile());
	}
	

	@Test
	public void wrongFileReadTest() throws IOException 
	{
		assertEquals("EmployeeFile [id=583, name=pavan, salary=50000.0]",employeeReadFile.readFile());
	}

}
