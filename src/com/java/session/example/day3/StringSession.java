package com.java.session.example.day3;

public class StringSession {
	
	public static void main(String[] args) {
		
		String str = "I am Bhopali";
		char[] chars = new char[str.length()];
		char[] chars_ = {'I', 'a', 'm'};
		char char_ = 'I';
		
		String a = "Bhopal";
		String c = "Bhopal";
		System.out.println(a == c);
		
		String b = a;
		System.out.println(b == a);
		String d = new String(a);
		System.out.println(a == d);
		System.out.println(a.equals(d));
		
	}
	
}
