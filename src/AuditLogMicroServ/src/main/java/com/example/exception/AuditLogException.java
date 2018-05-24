package com.example.exception;

/**
 * @author abhishek
 *
 */
public class AuditLogException extends Exception {

	String str;

	public AuditLogException(final String str) {

		this.str = str;

	}

	@Override
	public String toString() {
		return "AuditLogException [str=" + str + "]";
	}

}
