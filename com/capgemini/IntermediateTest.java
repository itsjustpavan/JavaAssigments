package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntermediateTest 
{
	private Training publicTraining;                                   
	private Training corporateTraining;
	@Before
	
	public void beforeFunction()
	{
		publicTraining=new PublicTraining(581,"java",5000);
		corporateTraining=new CorporateTraining(582,"BigData",35000);	
	}
	
	@Test
	
	public void testingPublicTraining() 
	{	
		int result=publicTraining.getOrderValue(50);
		assertEquals(250000,result);
	}
	
	@Test
	
	public void testingCorporateTraining() 
	{	
     	int result=corporateTraining.getOrderValue(4);
		assertEquals(140000,result);
	}

	@Test
	
	public void testingWrongPublicTraining() 
	{	
		int result=publicTraining.getOrderValue(20);
		assertEquals(250000,result);
	}
	
@Test
	
	public void testingWrongCorporateTraining() 
	{	
     	int result=corporateTraining.getOrderValue(14);
		assertEquals(140000,result);
	}

}