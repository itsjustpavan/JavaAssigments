package com.capgemini;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class CountLine 
{
	private String path;
	public String getPath() 
	{
		return path;
	}

	public void setPath(String path) 
	{
		this.path = path;
	}	
	
	
	public int countLines(String path) throws IOException	
	{
		BufferedReader reader=new BufferedReader(new FileReader(path));
		int noOfLines=0;
		while(reader.readLine()!=null)
		noOfLines++;
		return noOfLines;
	}	
	
}	
	