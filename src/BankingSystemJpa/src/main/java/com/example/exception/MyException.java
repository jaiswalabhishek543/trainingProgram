package com.example.exception;

/*
 * @abhishek
 */
public class MyException extends Exception {

	// Creating custom Exception

	String abc;

	public MyException(String str) {
		this.abc = str;

	}

	public String toString() {
		return ("MyException Occurred: " + abc);
	}

}
