package com.training;

public class Pbook {
	
	String fname, lname;
	Integer phoneno, id;

	public Pbook(Integer i, String fname, String lname, Integer p) {
		this.id = i;
		this.fname = fname;
		this.lname = lname;
		this.phoneno = p;

	}

	// Used to print details
	public String toString() {
		return this.fname + " " + this.lname + " " + this.phoneno + " " + this.id;
	}

}
