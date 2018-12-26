package com.BasicCollection;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class EmployeeFileTest 
{
	private EmployeeFile employeeFile;
	@Before
	
	public void beforeFunction()
	{
		employeeFile=new EmployeeFile(583,"pavan",50000);                   //Creating object of  EmployeeFile class and passing values 
	}
	

	@Test
	public void testCaseOne() throws IOException 
	{
		File file=new File("C:\\Users\\pkaleru\\Desktop\\emp\\employee.txt");
		FileWriter fileWriter=new FileWriter(file);
		String result=employeeFile.toString();
		fileWriter.write(result);                                                     //To write into result
		fileWriter.close();
	}

}
