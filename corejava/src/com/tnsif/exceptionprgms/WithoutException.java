package com.tnsif.exceptionprgms;

class WithoutException {
	public static void main(String args[]) {
		int d=0;
		try {
		int a=42/d; //exceptiion is raised
		System.out.println("geetha");
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled sucessfully " + e.getMessage());
		}
		 //System.out.println("will not be printed");
	}
}