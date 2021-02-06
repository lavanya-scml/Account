package com.tavant.springrest.exception;

public class AccountNotFoundException extends Exception{

	public AccountNotFoundException(String message) {
		// TODO Auto-generated constructor stub
	
		super(message);
		
	}
	
	@Override
	public String toString() {
		return super.toString() ;
	}
}
