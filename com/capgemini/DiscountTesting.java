package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscountTesting                                      //Creating class
{

	@Test
	public void correctDiscountTesting() 
	{                                                 //Test case function 1
		DiscountClass discountclass = new DiscountClass();
		int result=discountclass.discountFunction(4000);
		assertEquals(2600,result);	
	}
	@Test
	public void wrongDiscountTesting() 
	{     
		DiscountClass discountclass = new DiscountClass();
		int result=discountclass.discountFunction(4000);
		assertEquals(260,result);
	}
}
