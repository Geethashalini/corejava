package com.tnsif.streamprgms;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOperations {
	public static void main(String[] args) {
//		//using of method to create stream
//		Stream<Integer> ob=Stream.of(10,20,30,40,50);
////		System.out.println(ob);
////		ob.forEach(System.out::println);
//		
//		//using stream method
//		Integer[] values=new Integer[] {2,3,4,5};
//		ob=Arrays.stream(values);
//		ob.forEach(System.out::println);
		Integer[] values=new Integer[] {2,3,4,5};// get the input from arrays
		Stream<Integer> stream=Arrays.stream(values); //create a stream using stream
		
		//map function
		System.out.println("square of a no"+Arrays.toString(values));
		stream.map(num->num*num).forEach(System.out::println);
		
		System.out.println("even no");
		Integer[] value=new Integer[] {2,3,4,5};
		Stream<Integer> streams=Arrays.stream(value);
		streams.filter(ele->ele%2==0).forEach(System.out::println);
	
		System.out.println("limit operations");
		Integer[] val=new Integer[] {2,3,4,5};
		Stream<Integer> streamobj=Arrays.stream(val);
		System.out.println("skip 1st 2 elements");
		Arrays.stream(val).skip(2).forEach(System.out::println);
	}
	

}
