package com.tavant.springrest.exception;

public class NoDataFoundException extends Exception {

	public NoDataFoundException(String message) {
		// TODO Auto-generated constructor stub
	
		super(message);
		
	}
	
	@Override
	public String toString() {
		return super.toString() ;
	}
}
