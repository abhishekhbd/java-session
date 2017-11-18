package com.java.session.example.day2;

import java.util.List;

public class BranchingStatement {

	public static void main(String[] args) {
		
		// break statement. terminates the for loop
		
		int[] arrayOfInts = { 32, 87, 3, 589,12, 1076, 2000, 8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                return;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
		
        
        // ********************* The continue Statement ********************* 
        //The continue statement skips the current iteration of a for, while , or do-while loop.
        
        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int j = 0; j < max; j++) {
            // interested only in p's
            if (searchMe.charAt(j) != 'p'){
                continue;   // Go to the for loop and not execute the last line.
            }

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
        
        
        // ************************* The return Statement ***************************
        
        // return ++count;
        
        //The data type of the returned value must match the type of the method's declared return value. When a method is declared void, use the form of return that doesn't return a value.
        // return;
        
        
        
	}
	
}	
