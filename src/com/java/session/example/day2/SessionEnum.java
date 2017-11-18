package com.java.session.example.day2;

public enum SessionEnum {
	
	USER_SESSION_1("ADMIN"),
	USER_SESSION_2("GUEST");
	
	private String sessionName;

	private SessionEnum(String sessionName) {
		this.sessionName = sessionName;
	}

	public String getSessionName() {
		return sessionName;
	}
	
}
