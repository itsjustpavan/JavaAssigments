package com.MMBank;

public class MMSavingAccount extends SavingAccount
{
	private final float minBalance=0;
	public MMSavingAccount(int accountNumber, String accountName,
			float accountBalance, boolean isSalaried) 
	{
		super(accountNumber, accountName, accountBalance, isSalaried);
		
	}
	
	@Override
	
	public void withdraw(float amountToWitdraw) throws InsufficientFundException
	{
		if(getAccountBalance()>=amountToWitdraw)
		{
			setAccountBalance(getAccountBalance() - amountToWitdraw);
		}
		else
			throw new InsufficientFundException("Insufficient funds");
		
	}
	
	
	@Override
	public String toString() 
	{
		return "MMSavingAccount [minBalance=" + minBalance + ", isSalaried()="
				+ isSalaried() + ", toString()=" + super.toString()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountName()=" + getAccountName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
