package com.tavant.springrest.exception;

public class EmptyData extends Exception {

	public EmptyData(String message) {
		// TODO Auto-generated constructor stub
	
		super(message);
		
	}
	
	@Override
	public String toString() {
		return super.toString() ;
	}
}
