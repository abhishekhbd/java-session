package com.java.session.example.day2;

public class IfElse1 {

	public static void main(String[] args) {
		
		// if 
		
		// if then else
		
		// if then else if then else
		
		// IF Expression
		
		int a = 1;
		int b = 2;
		
		if(a != b){
			System.out.println("a not equals b");
		}
		
		// **************************************
		
		if(a == b){
			System.out.println("Equals");
		} else {
			System.out.println("Not equals");
			System.out.println(" ***** ");
		}
		// ***********************************************
		
		if(a == b){
			System.out.println("Equals");
		} else if(a > b) {
			System.out.println("a is greater");
		} else {
			System.out.println("Not equals");
		}
	}

}
