package com.capgemini;

public class Palindrome 
{                            //class named Palindrome

	public boolean palindromeFunction(int number)    //Function Declaration
	{
		int temporary=number;
		int remainder;
		int sum=0;
		if(number>10)
		{
			while(number>0)
			{
				remainder=number%10;

				sum=sum*10+remainder;

				number=number/10;

			}
			
			return sum==temporary;
		}
			return false;
	}
}
