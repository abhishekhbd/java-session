package com.java.session.example.day2;


public class OuterClassMain {

	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		
		OuterClass.InnerPublicClass publ = outer.new InnerPublicClass();
		publ.method();
		System.out.println();
		
		OuterClass.InnerPublicStaticClass outerStatic = new OuterClass.InnerPublicStaticClass();
		outerStatic.method();
		
	}

}
