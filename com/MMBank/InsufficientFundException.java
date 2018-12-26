package com.MMBank;

public class InsufficientFundException extends RuntimeException {
	
	public InsufficientFundException(String message) 
	{
		super(message);
	}

	public InsufficientFundException() {
		
	}
}
