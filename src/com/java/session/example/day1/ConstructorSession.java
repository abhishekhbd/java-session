package com.java.session.example.day1;

public class ConstructorSession {

	String a1, a2;

	public ConstructorSession(String s1) {

		a1 = s1;

	}

	public void ConstructorSession(String s2) {

		a2 = s2;
	}

	public void display() {
		System.out.println(a1 + " " + a2);
	}

	public static void main(String[] args) {
		ConstructorSession a1 = new ConstructorSession("One");
//		ConstructorSession a2 = new ConstructorSession("Two");
		 a1.ConstructorSession("Two");
		 a1.display();
	}

}
