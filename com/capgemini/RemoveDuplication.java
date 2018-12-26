package com.capgemini;

public class RemoveDuplication 
{

	public String removeDuplicationFunction(String wordOne)
	{
		String removedDuplicates =new String();
		int size=wordOne.length();
		for(int index = 0;index<size;index++)
		{
			 if(!removedDuplicates.contains(String.valueOf(wordOne.charAt(index)))) 
			 {

				 removedDuplicates+= String.valueOf(wordOne.charAt(index));  
				 
		     }
			
		}
		return removedDuplicates;
	}

}