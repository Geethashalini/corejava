package com.tnsif.abstractprgms;

import java.util.Scanner;

public class Demo {
	public static void main(String [] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter salary of akash");
		double akashsal=sc.nextDouble();
		TaxPayer ob=new Akash(akashsal);
		
		System.out.println("enter salary of hitesh");
		double hiteshsal=sc.nextDouble();
		TaxPayer obone=new Hitesh(hiteshsal);
		
		System.out.println("tax akash");
		ob.display();
		
		System.out.println("tax hitesh");
		obone.display();
		sc.close();
		
	}
	
}
;