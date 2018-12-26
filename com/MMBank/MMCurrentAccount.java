package com.MMBank;

public class MMCurrentAccount extends CurrentAccount 
{

	public MMCurrentAccount(int accountNumber, String accountName,
			float accountBalance, float creditLimit)
	{
		super(accountNumber, accountName, accountBalance, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MMCurrentAccount [getCreditLimit()=" + getCreditLimit()
				+ ", toString()=" + super.toString() + ", getAccountNumber()="
				+ getAccountNumber() + ", getAccountName()=" + getAccountName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	@Override
	
	public void withdraw(float amountToWitdraw) throws Exception
	{
			if(amountToWitdraw<=getAccountBalance()+getCreditLimit())
			{
				setAccountBalance((getAccountBalance()+getCreditLimit())-amountToWitdraw);
			}
			else
			{
				throw new InsufficientFundException("Insufficient funds");
			}
	}
}
