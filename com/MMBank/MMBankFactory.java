package com.MMBank;

public  class MMBankFactory extends BankFactory 
{
	public MMSavingAccount getNewSavingAccount(int accountNumber, String accountName,float accountBalance, boolean isSalaried){
	return getNewSavingAccount(accountNumber,accountName,accountBalance,isSalaried);
	}
	
	public  MMCurrentAccount getNewCurrentAccount(int accountNumber, String accountName,float accountBalance, float creditLimit){
		return getNewCurrentAccount(accountNumber,accountName,accountBalance,creditLimit);
	}

	
}
