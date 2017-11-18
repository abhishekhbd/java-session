package com.java.session.example.day2;

public class AssignmentArithmeticUnaryOperator {
	
	public static void main(String[] args) {
		
		// ********************* The Simple Assignment Operator ***********************************
		System.out.println("********************* The Simple Assignment Operator ***********************************");
		/**
		 * = is an assignment operator.
		 * This operator can also be used on objects to assign object references, as discussed in Creating Objects.
		 */
		int cadence = 0;
		int speed = 0;
		int gear = 1;
		
		// ******************************** The Arithmetic Operators *****************************************
		System.out.println("******************************** The Arithmetic Operators *****************************************");
		/**
		 *  +	Additive operator (also used for String concatenation)
			-	Subtraction operator
			*	Multiplication operator
			/	Division operator
			%	Remainder operator
		 */
		
		
		int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
        
        /**
         * You can also combine the arithmetic operators with the simple assignment operator 
         * to create compound assignments. For example, x+=1; and x=x+1; both increment the value of x by 1.
         */
        
        
        // The + operator can also be used for concatenating (joining) two strings together, as shown in the following ConcatDemo program:
	
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);
        
        
        // ************************* The Unary Operators ***************************************
        System.out.println("************************* The Unary Operators ***************************************");
        
        /**
         *  +	Unary plus operator; indicates positive value (numbers are positive without this)
			-	Unary minus operator; negates an expression
			++	Increment operator; increments a value by 1
			--	Decrement operator; decrements a value by 1
			!	Logical complement operator; inverts the value of a boolean
         */
        
        int result_ = +1;
        // result is now 1
        System.out.println(result_);

        result_--;
        // result is now 0
        System.out.println(result_);

        result_++;
        // result is now 1
        System.out.println(result_);

        result_ = -result_;
        // result is now -1
        System.out.println(result_);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
        
        /**
         * The increment/decrement operators can be applied before (prefix) or after (postfix) the operand. 
         * The code result++; and ++result; will both end in result being incremented by one. 
         * The only difference is that the prefix version (++result) evaluates to the incremented value, 
         * whereas the postfix version (result++) evaluates to the original value.
         */
        
        int i = 3;
        i++;
        // prints 4
        System.out.println(i);
        ++i;			   
        // prints 5
        System.out.println(i);
        // prints 6i++
        System.out.println(++i);
        // prints 6
        System.out.println();
        // prints 7
        System.out.println(i);
	}
	
}
