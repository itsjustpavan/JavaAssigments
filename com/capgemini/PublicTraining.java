package com.capgemini;

public class PublicTraining extends Training                                                //Using extends to get inherit from Training class
{
	public PublicTraining(int id,String subject,int fees)
	{
		super(id,subject,fees);                                                  //Using super keyword to get the values from the parent class
	}
	
	@Override
	public int getOrderValue(int noOfParticipants )
	{
		return noOfParticipants*fees;
	}
}
	