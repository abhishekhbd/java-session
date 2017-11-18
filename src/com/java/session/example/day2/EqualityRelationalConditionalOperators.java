package com.java.session.example.day2;

public class EqualityRelationalConditionalOperators {
	
	public static void main(String[] args){
		
		// ****************************The Equality and Relational Operators ***************************
		/**
		 *  ==      equal to
			!=      not equal to
			>       greater than
			>=      greater than or equal to
			<       less than
			<=      less than or equal to
		 */
		
		
		String str1 = "Pune";
		String str2 = "Pune";
		String str3 = str1;
		
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2){
            System.out.println("value1 == value2");
        }
        if(value1 != value2){
            System.out.println("value1 != value2");
        }
        if(value1 > value2){
            System.out.println("value1 > value2");
        }
        if(value1 < value2){
            System.out.println("value1 < value2");
        }
        if(value1 <= value2)
            System.out.println("value1 <= value2");
        
        
        //***************************** The Conditional Operators ************************************
        /**
         * && Conditional-AND
         * || Conditional-OR
         * ?:
         */
        
        int value3 = 1;
        int value4 = 2;
        if((value3 == 1) && (value4 == 2)){
            System.out.println("value4 is 1 AND value4 is 2");
        }
        if((value3 == 1) || (value4 == 1)){
            System.out.println("value1 is 1 OR value4 is 1");
        }
        
        boolean someCondition = true;
        
        int result = someCondition ? value3 : value4;
        
        System.out.println("someCondition" + result);
        
        // *********************************** The Type Comparison Operator instanceof ***************************
        EqualityRelationalConditionalOperators a = new EqualityRelationalConditionalOperators();
        Parent obj1 = a.new Parent();
        Child obj2 = a.new Child();
        Parent obj3 = a.new Child();

        System.out.println("obj1 instanceof Parent: "
            + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
            + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
            + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
            + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
            + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
            + (obj2 instanceof MyInterface));
        System.out.println("obj3 instanceof Child: "
                + (obj3 instanceof Parent));
    }
	
	class Parent {}
     
    class Child extends Parent implements MyInterface{}
    
    interface MyInterface {}
    
}
