package com.viniciusfinger.course.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -3904574486417229844L;
	
	public ResourceNotFoundException (Object id) {
		super("Resource not found. Id: " + id);
	}
}
