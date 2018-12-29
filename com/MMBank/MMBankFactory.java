package com.MMBank;

public  class MMBankFactory extends BankFactory 
{
	public MMSavingAccount getNewSavingAccount(int accountNumber, String accountName,float accountBalance, boolean isSalaried){
	return new MMSavingAccount(accountNumber,accountName,accountBalance,isSalaried);
	}
	
	public  MMCurrentAccount getNewCurrentAccount(int accountNumber, String accountName,float accountBalance, float creditLimit){
		return new MMCurrentAccount(accountNumber,accountName,accountBalance,creditLimit);
	}

	
}
