package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTesting                                 //Creating a class
{

	@Test
	public void negativePalindrome()                         //First function
	{
		
		Palindrome palindrome=new Palindrome();
		boolean result=palindrome.palindromeFunction(-121);
		assertEquals(false,result);
		
	}
	@Test
	public void positivePalindrome()                          //Second Function
	{
		
		Palindrome palindrome=new Palindrome();
		boolean result=palindrome.palindromeFunction(121);
		assertEquals(true,result);
		
	}
	@Test
	public void wrongPalindrome() 							//Third Function
	{
		
		Palindrome palindrome=new Palindrome();
		boolean result=palindrome.palindromeFunction(123);
		assertEquals(false,result);
		
	}
	
}
