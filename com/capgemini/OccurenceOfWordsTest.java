package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OccurenceOfWordsTest 
   {
	

		private OccurenceOfWords occurenceofwords;                                     //Creating Instance of class
		
		@Before
		
		public void beforeFunction()
		
		{
			occurenceofwords = new OccurenceOfWords();
		}
		
		@Test
		
		public void namePresentinArray() 
		
		{
			
			String names[]={"Dave", "George","Ann", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "George", "Sam", "Ted"};
			int actual =occurenceofwords.occurenceOfWordsFunction(names,"Sam");
			int expected=3;
			assertEquals(expected, actual);

		}
		
		@Test

		public void nameNotPresentInArray()
		
		{
			
			String names[]={"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "George", "Sam", "Ted"};
			int actual =occurenceofwords.occurenceOfWordsFunction(names,"Pavan");
			int expected=0;
			assertEquals(expected, actual);
			
		}


	}



