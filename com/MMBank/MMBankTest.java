package com.MMBank;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MMBankTest 
{
	Logger logger = Logger.getLogger(MMBankFactory.class.getName());
	BankFactory account=new MMBankFactory();
	SavingAccount savingAccount;
	CurrentAccount currentAccount;
	
	@Before                                                                                        //Using Before annotation to assign before every function call
	
	public void beforeFunction()
	{
		savingAccount=account.getNewSavingAccount(583,"Pavan",5000,true);                         //Giving values to the instances
		currentAccount=account.getNewCurrentAccount(584, "Kumar",6000, 10000);
	}
	
	
	@Test
	
	public void savingAccountNumberTest() 
	{
		assertEquals(583,savingAccount.getAccountNumber());
	}
	
	@Test
	
	public void currentAccountNumberTest() 
	{
		assertEquals(584,currentAccount.getAccountNumber());
	}	
	
	@Test
	
	public void savingAccountWithdrawingMoreThanBalanceTest()
	{
		try {
			savingAccount.withdraw(6000);
			System.out.println(savingAccount.getAccountBalance());
		} 
		catch(InsufficientFundException e)
		{
			logger.error(e);
		} 
		catch (Exception e) {
			logger.error(e);
		}
		
	}
	
	@Test
	
	public void savingAccountWithdrawingAmountBalanceTest()
	{
		try {
			savingAccount.withdraw(5000);
			System.out.println(savingAccount.getAccountBalance());
		} 
		catch(InsufficientFundException e)
		{
			logger.error(e);
		} 
		catch (Exception e) {
			logger.error(e);
		}
		
	}
	
	@Test
	
	public void savingAccountWithdrawTest()
	{
		try {
			savingAccount.withdraw(4000);
			System.out.println(savingAccount.getAccountBalance());
		} 
		catch(InsufficientFundException e)
		{
			logger.error(e);
		} 
		catch (Exception e) {
			logger.error(e);
		}
		
	}
	
	@Test
	
	public void currentAccountWithdrawingBalanceTest()
	{
		try {
			currentAccount.withdraw(6000);
			System.out.println(currentAccount.getAccountBalance());
		} 
		catch(InsufficientFundException e)
		{
			logger.error(e);
		} 
		catch (Exception e) {
			logger.error(e);
		}
		
	}
	
	@Test
	
	public void currentAccountWithdrawTest()
	{
		try {
			currentAccount.withdraw(4000);
			System.out.println(currentAccount.getAccountBalance());
		} 
		catch(InsufficientFundException e)
		{
			logger.error(e);
		} 
		catch (Exception e) {
			logger.error(e);
		}
		
	}
	

	@Test
	
	public void currentAccountWithdrawingOdLimitTest()
	{
		try {
			currentAccount.withdraw(16000);
			System.out.println(currentAccount.getAccountBalance());
		} 
		catch(InsufficientFundException e)
		{
			logger.error(e);
		} 
		catch (Exception e) {
			logger.error(e);
		}
		
	}
	
	@Test
	
	public void currentAccountWithdrawingMoreThanBalanceTest()
	{
		try {
			currentAccount.withdraw(17000);
			System.out.println(currentAccount.getAccountBalance());
		} 
		catch(InsufficientFundException e)
		{
			logger.error(e);
		} 
		catch (Exception e) {
			logger.error(e);
		}
		
	}
	
	@Test
	
	public void depositSavingAccountTest() 
	{
		try{
			savingAccount.deposit(500);
			System.out.println(savingAccount.getAccountBalance());
		}
		catch(InsufficientFundException e)
		{
			logger.error(e);
		} 
		catch (Exception e) {
			logger.error(e);
		}
		
	}
	
	@Test
	public void depositingZeroInSavingAccountTest() 
	{
		try{
			savingAccount.deposit(0);
			System.out.println(savingAccount.getAccountBalance());
		}
		catch(InsufficientFundException e)
		{
			logger.error(e);
		} 
		catch (Exception e) {
			logger.error(e);
		}
		
	}
	
	@Test
	public void depositCurrentAccountTest() 
	{
		try {
			currentAccount.deposit(150);
			System.out.println(currentAccount.getAccountBalance());
		} 
		catch(InsufficientFundException e)
		{
			logger.error(e);
		} 
		catch (Exception e) {
			logger.error(e);
		}
		
	}

}
