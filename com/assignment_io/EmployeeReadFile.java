package com.capgemini;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeReadFile 
{
	public String readFile() throws IOException 
	{
		FileReader file=new FileReader("C:\\Users\\pkaleru\\Desktop\\emp\\employee.txt");
		BufferedReader bufferedReader=new BufferedReader(file);
		String emptyString="";
		String storingString="";
		while((emptyString=bufferedReader.readLine())!= null)
		{
			storingString=emptyString+storingString;
		}
		bufferedReader.close();
		return storingString;
	}
}
