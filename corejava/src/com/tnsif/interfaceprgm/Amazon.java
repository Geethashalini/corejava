package com.tnsif.interfaceprgm;

public interface Amazon {
	void welcome();
	void thankyou();
	
default void serviceCharge() {
	int amt=100;
	System.out.println("the service charge is " + amt);
	
}
static void aboutUs() {
	System.out.println("it's a ecommerce website");
}
}
