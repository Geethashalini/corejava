package com.tnsif.exceptionprgms;

public class TryCatch {
	public static void divide() {
	int a=6,b=0,c;
	try {
		c=a/b;
		int[] arr = new int[3];
		
	}
	catch(ArithmeticException e) {
		System.out.println("exception caught"+e.getMessage());
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("excepton caught "+e.getMessage());
	}
	catch(Exception e) { //superclass exception
		System.out.println("exception caught"+e.getMessage());
	}
//	catch(NullPointerException e) {
//		System.out.println("exception caught"+e.getMessage());
//	}
	}
}

