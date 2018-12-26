package com.capgemini;

public class CorporateTraining extends Training 
{

	public CorporateTraining(int id, String subject, int fees) 
	{
		super(id, subject, fees);
		
	}
	@Override
	public int getOrderValue(int noOfDays)
	{
		return noOfDays*fees;
	}
}
