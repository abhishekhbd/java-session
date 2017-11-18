package com.java.session.example.day2;

public class whileDoWhileStatement {
	
	public static void main(String[] args) {
		
		/**
		 * while (expression) {
			   statement(s)
		   }
		   
		   
		   while (true){
			   // your code goes here
		   }
		   
		 */
		
		int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
        
        /**
         * do {
			    statement(s)
		   } 
		   while (expression);
         */
        int count1 = 1;
        do {
            System.out.println("Count1 is: " + count1);
            count1++;
        } while (count1 < 11);
        
        
	}
	
}
