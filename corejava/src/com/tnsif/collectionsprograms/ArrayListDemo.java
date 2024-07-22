package com.tnsif.collectionsprograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListDemo {
	public static void main(String [] args) {
//		ArrayList ob=new ArrayList();
//		System.out.println("size of the arraylist "+ob.size());
//		ob.add(20);
//		ob.add('a');
//		ob.add(22.45);
//		System.out.println("elements of the arraylist "+ob);
//		System.out.println("check the element is there or not "+ob.contains(22.45));
//		System.out.println("remove the specified element"+ob.remove(2));
//		System.out.println("elements of the arraylist after removing"+ob);
		
		ArrayList <String>ob=new ArrayList<String>();
		ob.add("geetha");
		ob.add("bangalore");
		ob.add("dbit");
		System.out.println("elements of the arraylist "+ob);
		Collections.sort(ob);
		System.out.println("elements of the arraylist after sorting in natural order "+ob);
		Iterator<String> i=ob.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			System.out.println(nm);
			//ob.remove(0);
			//System.out.println(nm);
		}
	}
}
