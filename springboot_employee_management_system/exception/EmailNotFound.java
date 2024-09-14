package com.qsp.springboot_employee_management_system.exception;

public class EmailNotFound extends RuntimeException{

	private String message;
	
	public EmailNotFound(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
