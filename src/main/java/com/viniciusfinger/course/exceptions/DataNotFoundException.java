package com.viniciusfinger.course.exceptions;

public class DataNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -3904574486417229844L;
	
	public DataNotFoundException (Object id) {
		super("Data not found. Id: " + id);
	}
}
