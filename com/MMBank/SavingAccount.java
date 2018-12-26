package com.MMBank;

public abstract class SavingAccount extends BankAccount
{
	private boolean isSalaried;
	private static float minBalance=0;
	
	public boolean isSalaried() 
	{
		return isSalaried;
	}
	
	public static float getMinbalance() 
	{
		return minBalance;
	}
	
	public static void setMinbalance(float minbalance)
	{
		minBalance = minbalance;
	}

	public SavingAccount(int accountNumber, String accountName,
			float accountBalance, boolean isSalaried) 
	{
		super(accountNumber, accountName, accountBalance);
		this.isSalaried = isSalaried;
	}
	
	
	@Override
	
	public String toString() 
	{
		return "SavingAccount [isSalaried=" + isSalaried + ", isSalaried()="
				+ isSalaried() + ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountName()=" + getAccountName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	
	public abstract void withdraw(float amountToWitdraw) throws InsufficientFundException;
	
	
	
}
