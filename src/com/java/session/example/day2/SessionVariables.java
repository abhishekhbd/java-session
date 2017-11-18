package com.java.session.example.day2;

public class SessionVariables {
	
	/*public static final String USER_SESSION_1 = "USER_SESSION1";
	public static final String USER_SESSION_2 = "USER_SESSION2";*/
	
	public static void main(String[] args) {
		for(SessionEnum values: SessionEnum.values()){
			System.out.println(values);
		}
	}
}
