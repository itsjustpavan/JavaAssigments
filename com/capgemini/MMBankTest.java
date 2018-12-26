package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class MMBankTest 
{

	@Test
	
	public void depositTest() 
	{
		MmBank mmBank=new MmBank(50000,"pavan");
		int result=mmBank.amountDeposit(500);
		assertEquals(50500,result);
		
	}
	
	@Test
	
	public void depositWrongTest() 
	{
		MmBank mmBank=new MmBank(50000,"pavan");
		int result=mmBank.amountDeposit(500);
		assertEquals(49500,result);
		
	}

	
	@Test
	
	public void withdrawTest() 
	{
		MmBank mmBank=new MmBank(50000,"nikhil");
		int result=mmBank.amountWithdrawal(500);
		assertEquals(49500,result);
		
	}
	
	@Test
	
	public void withdrawWrongTest() 
	{
		MmBank mmBank=new MmBank(50000,"nikhil");
		int result=mmBank.amountWithdrawal(500);
		assertEquals(50500,result);
		
	}
	
	@Test
	
	public void accountNumberTest() 
	{
		MmBank mmBank=new MmBank(50000,"nikhil");
		int result=mmBank.getAccountNumber();
		assertEquals(584,result);
		
	}
	
	@Test
	
	public void paymentTesting() 
	{
		MmBank mmBank=new MmBank(50000,"pavan");
		MmBank mmBank1=new MmBank(50000,"nikhil");
		PaymentGateway paymentGateway=new PaymentGateway();
		assertEquals(true,paymentGateway.transfer(mmBank,mmBank1,5000));                       //To check if payment is done or not  
		System.out.println(mmBank.getAccountBalance());                                  		//To print the account balance in sender
		System.out.println(mmBank1.getAccountBalance());                                       //To print the account balance in reciever
	}

	@Test
	
	public void fullPaymentTest() 
	{
		MmBank mmBank=new MmBank(50000,"pavan");
		MmBank mmBank1=new MmBank(50000,"nikhil");
		PaymentGateway paymentGateway=new PaymentGateway();
		assertEquals(true,paymentGateway.transfer(mmBank,mmBank1,50000));
		System.out.println(mmBank.getAccountBalance());                       
		System.out.println(mmBank1.getAccountBalance());
	}
	
	@Test
	
	public void wrongPaymentTest()                                   
	{
		MmBank mmBank=new MmBank(50000,"pavan");
		MmBank mmBank1=new MmBank(50000,"nikhil");
		PaymentGateway paymentGateway=new PaymentGateway();
		assertEquals(true,paymentGateway.transfer(mmBank,mmBank1,100000));
		System.out.println(mmBank.getAccountBalance());
		System.out.println(mmBank1.getAccountBalance());
	}
}
