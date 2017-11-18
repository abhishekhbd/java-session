package com.java.session.example.day2;

public class ForStatement {

	public static void main(String[] args) {
		
		/**
		 * 
		 * for (initialization; termination;
			     increment) {
			    statement(s)
			}
		 * 
		 */
		for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }
		
		
		/**
		 * // infinite loop
		for ( ; ; ) {
		    
		    // your code goes here
		}
		 */
		
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
	}

}
