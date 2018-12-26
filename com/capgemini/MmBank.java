package com.capgemini;

public class MmBank 
{
	private static int accountNumber;
	private int accountBalance;
	private String accountHolderName;
	public String getAccountHolderName() 
	{
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) 
	{
		this.accountHolderName = accountHolderName;
	}
	static
	{
		accountNumber=583;
	}
	{
		accountNumber++;
	}
	public static int getAccountNumber() 
	{
		return accountNumber;
	}
	public static void setAccountNumber(int accountNumber) 
	{
		MmBank.accountNumber = accountNumber;
	}
	
	public int getAccountBalance() 
	{
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) 
	{
		this.accountBalance = accountBalance;
	}
	
	public MmBank(int accountBalance, String accountHolderName)                       //Constructor holding two fields
	{
		super();
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
	}
	
	public int amountWithdrawal(int withdrawAmount)
	{
		if(withdrawAmount<=accountBalance)
		{
			accountBalance=accountBalance-withdrawAmount;
		}
		return accountBalance;
	}
	public int amountDeposit(int depositAmount)
	{
		return accountBalance=depositAmount+accountBalance;
	}
	
}
