package com.capgemini;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountNumbers 
{
	public int countingNoOfWords() throws IOException
	{
		FileReader file=new FileReader("C:\\java\\day1\\countline.txt");
		BufferedReader bufferedReader= new BufferedReader(file);
        String line=bufferedReader.readLine();
        int count=0;
        while(line!=null)
        {
            String[] word=line.split(" ");                   //splits whenever there is a space in line
            for(String words:word)
            {
            	count++;
            }
            line=bufferedReader.readLine();
            
        }
		
		return count; 
		
	}
}
