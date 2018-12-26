package com.capgemini;

public class DiscountClass                      //Creating class 
{

	public int discountFunction(int newItem)      //Function declaration
	{
		int discount;
		discount=(newItem*35)/100;
		int newItemPrice=newItem-discount;
		// TODO Auto-generated method stub
		return newItemPrice;
	}

}
