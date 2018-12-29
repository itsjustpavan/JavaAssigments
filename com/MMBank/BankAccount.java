package com.MMBank;

public abstract class BankAccount 
{
	private int accountNumber;
	private String accountName;
	private float accountBalance;
	
	public BankAccount(int accountNumber, String accountName,
			float accountBalance) 
	{
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}


	public void setAccountName(String accountName) 
	{
		this.accountName = accountName;
	}

	
	public int getAccountNumber() 
	{
		return accountNumber;
	}


	public String getAccountName() 
	{
		return accountName;
	}


	public float getAccountBalance() 
	{
		return accountBalance;
	}
	
	public void setAccountBalance(float accountBalance)
	{
		this.accountBalance = accountBalance;
	}


	public abstract void withdraw(float amountToWitdraw) throws InsufficientFundException, Exception;
	

	public  void deposit(float amountToDeposit)
	{
		if(amountToDeposit>0)
			accountBalance +=amountToDeposit;
		else
			throw new InsufficientFundException("Invalid Amount");
	}
	

	@Override
	
	public String toString() 
	{
		return "BankAccount [accountNumber=" + accountNumber + ", accountName="
				+ accountName + ", accountBalance=" + accountBalance + "]";
	}
	
	
	
	
}
