package com.capgemini;

public class PaymentGateway 
{
	public  boolean transfer(MmBank sender, MmBank reciever, int  amount)                    //Method to transfer money which use withdrawal function and deposit function
	{
		if(sender.getAccountBalance()>=amount)
		{
		sender.amountWithdrawal(amount);
		reciever.amountDeposit(amount);
		
		return true;
		}
		else
			return false;
	}

}
