package com.java.session.example.day2;

public class OuterClass {
	
	private int a = 0;
	
	private class InnerPrivateClass {
		private int innerClassVar = 1;
	}
	
	public class InnerPublicClass {
		private int innerClassVar = 2;
		private int a = 1;
		
		public InnerPublicClass() {
		}



		void method(){
			
			System.out.println("a: " + this.a);
			System.out.println("OuterClass a: " + OuterClass.this.a);
			
			System.out.println("OuterClass.InnerPublicClass.method()");
		}
	}
	
	private static class InnerPrivateStaticClass {
		private int innerClassVar = 3;
	}
	
	public static class InnerPublicStaticClass {
		private int innerClassVar = 4;
		
		void method(){
			System.out.println("OuterClass.InnerPublicStaticClass.method()");
		}
	}
	
}
