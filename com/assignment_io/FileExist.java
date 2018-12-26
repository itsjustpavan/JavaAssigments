package com.capgemini;
import java.io.*;
public class FileExist 
{
	File file=new File("C:\\java\\day1\\pavan.txt");
	
	public boolean checkingFile()
	{
		if(file.exists())
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
}	