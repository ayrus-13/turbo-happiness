package com.cg.labfive.exception;

public  class Lab5dException extends Exception
{public Lab5dException() {
	// TODO Auto-generated constructor stub
}
	public Lab5dException(String message) {
	super(message);
}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "com.cg.Exercise4Exception"+super.getMessage();
	}
	}

