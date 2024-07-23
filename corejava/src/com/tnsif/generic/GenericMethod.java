package com.tnsif.generic;

public class GenericMethod {
	public <T> void displayArrayElements(T [] elements) { //generic methods
		for(T ele:elements) {
			System.out.println("elements are "+ ele);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod obj=new GenericMethod();
		Integer[] intarry= {10,20,30};
		String[] strarry= {"hello","hii"};
		obj.displayArrayElements(intarry);
		obj.displayArrayElements(strarry);
		Function
	}

}
