package com.MMBank;

public abstract class CurrentAccount extends BankAccount 
{
	private final float creditLimit;
	

	public float getCreditLimit() 
	{
		return creditLimit;
	}


	public CurrentAccount(int accountNumber, String accountName,
			float accountBalance, float creditLimit) 
	{
		super(accountNumber, accountName, accountBalance);
		this.creditLimit = 10000;
	}


	@Override
	public String toString() 
	{
		return "CurrentAccount [creditLimit=" + creditLimit
				+ ", getCreditLimit()=" + getCreditLimit()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountName()=" + getAccountName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	
	public void withdraw(float amountToWitdraw) throws Exception
	{
			
	}
}
