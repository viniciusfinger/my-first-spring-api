package com.viniciusfinger.course.exceptions;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 4784429227643034205L;

	public DatabaseException (String msg) {
		super(msg);
	}
}
