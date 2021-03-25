package com.example.demowebservices.helloworld;

public class helloWorldBean {
	
	String message;
	
	public helloWorldBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
}
