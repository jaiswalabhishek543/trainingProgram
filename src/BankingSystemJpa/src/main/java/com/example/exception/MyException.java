package com.example.exception;

public class MyException extends Exception {
	
	String abc;
	public MyException(String str)
	{
		this.abc=str;
		
	}
	
	public String toString()
	{
		return ("MyException Occurred: "+abc) ;
	}
	
	

}
