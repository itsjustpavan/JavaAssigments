package com.capgemini;

public class StringReverse                            //Creating a class 
{
			String reverseStringByWords(String name)           //function declaration
			
			{
				String[] givenString=name.split(" ");
				String reverse="";
				String reverseFull="";
				for(int count=0;count<givenString.length;count++)
						
				{
					for(int counter=givenString[count].length()-1;counter>=0;counter--)
						{
							reverse=reverse+givenString[count].charAt(counter);
						}
				reverseFull=reverseFull+reverse;
				reverse="";
				if(count!=givenString.length-1)
							reverseFull=reverseFull+" ";
						
				}
				
				return reverseFull;
				
	 
	      }
}
