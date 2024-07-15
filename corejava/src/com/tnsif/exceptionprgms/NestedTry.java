package com.tnsif.exceptionprgms;

public class NestedTry {
	public static void check() {
		String str="tns";
		int arr[]=null;
		int y=6;
		try { //outer try
			//int z=y/0;
			try {
				System.out.println(arr[0]);
				System.out.println(str.charAt(y));
			}
//		catch(StringIndexOutOfBoundsException e) {
//			System.out.println("exceptioin caught"+ e.getMessage());
//		}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("excepton caught "+e.getMessage());
			}
		}
//			catch(NullPointerException e) {
//				System.out.println("exceptioin caught null pointer"+ e.getMessage());	
//		}
	
		catch(ArithmeticException e) {
			System.out.println("exception caught"+e.getMessage());
		}
//		catch(NullPointerException e) {
//			System.out.println("exceptioin caught"+ e.getMessage());	
//	}
		catch(Exception e) { //superclass exception
			System.out.println("exception caught"+e.getMessage());
		}
	}
}