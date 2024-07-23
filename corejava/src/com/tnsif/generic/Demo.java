package com.tnsif.generic;

public class Demo {
	public static void main(String [] args) {
		Generic <String> stringobj=new Generic();
		stringobj.setData("hello");
		System.out.println("string obj is " + stringobj.getData());
		
		Generic <Integer> intobj=new Generic();
		stringobj.setData("22");
		System.out.println("string obj is " + stringobj.getData());
		
		Generic <Double> doubleobj=new Generic();
		stringobj.setData("22.5");
		System.out.println("string obj is " + stringobj.getData());
}
}