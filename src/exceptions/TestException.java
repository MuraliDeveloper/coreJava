package exceptions;

import java.util.Scanner;

/**
How to convert string to int?
->Use Integer.parseInt(age)

Take string as input and convert to int
 */
public class TestException {
	public static void main3(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age::");
		//take string as input
		String age = sc.next();
		
		//convert str to int
		int ageInt = Integer.parseInt(age);
		System.out.println("after conversion age int :: " + ageInt);
		System.out.println("exit");

	}

	/**
	Case#1:
	enter the age::
	34
	after conversion age int :: 34
	exit
	 
	CASE#2:
	enter the age::
	ABC
	Exception in thread "main" java.lang.NumberFormatException: For input string: "ABC"
		at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
		at java.lang.Integer.parseInt(Integer.java:580)
		at java.lang.Integer.parseInt(Integer.java:615)
		at exceptions.TestException.main(TestException.java:12)
		
	java creates obj for NumberFormatException  
	
	IN THIS CASE "ABC" cannot be converted to integer.
	java creates NumberFormatException object.
	prog terminated.
	customer will see the techical message.
 */
	
	
	/**
	if num2 is zero , then exception occurs; because division by 0 is not possible.
	o/p:
	Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exceptions.TestException.main(TestException.java:50

	java creates ArithmeticException object.
	 */
	
	
	public static void main12(String[] args) {
		int num1 = 20;
		int num2 = 0;

		int x = num1 / num2;
		System.out.println(x);
		System.out.println("Program ends");
	}

	/**
	o/p:
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9
		at exceptions.TestException.main(TestException.java:72)
  
	java creates object for ArrayIndexOutOfBoundsException

	 */
	
	public static void mainad(String[] args) {
		int nums[] = new int[5]; // array size is 5
		System.out.println(nums[9]); // access 10 element
	}
	
	/**
	 O/p:
	 Exception in thread "main" java.lang.NullPointerException
	at exceptions.TestException.main(TestException.java:106)
	
	method cannot be called without obj creation.
	Here java created NullPointerException obj
	
	 */
	public static void main(String[] args) {
		String name = null;
		int len =name.length();
		System.out.println("length = "+len);
	}

	/**
 	  solution: try with multiple catches
 			at a time only one exception is created.
 			at a time only one catch block is executed.
	 */
	public static void main1(String[] args) {
		String name = null;
		int num1= 20;
		int num2 = 0;
		int nums[] = new int[5];
		
		//can fail due to number format
		int num = Integer.parseInt("ABC");
		System.out.println(" after conversion ::"+num);
		
		// possibility of exception due to divide by zero
		int x = num1 / num2;
		System.out.println(x);

		// java.lang.NullPointerException occurs if obj is not created
		System.out.println(name.length());

		// error due to invalid index array index out of bound
		System.out.println(nums[9]);
		
		System.out.println("END");
	}
}
