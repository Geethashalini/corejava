package com.tnsif.generic;

import java.util.ArrayList;
public class GenericsInJava {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("java");
		list.add(123);
		for (Object object : list) { //throws ClassCastException at run time
			String str=(String) object;
			System.out.println(str);
		}
}
}