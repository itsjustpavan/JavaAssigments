package com.capgemini;

public class OccurenceOfWords                                                           //Creating a class
 {

	public int occurenceOfWordsFunction(String[] names, String string) 
	 {
		int count=0;
		for(int counter=0;counter<names.length;counter++)
		{

			if(string.equals(names[counter]))
			{

				count++;

			}

		}
		return count;
	}

 }