package com.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation ob = new Encapsulation ();
		
//		  ob.name = "suma"; 
//		  ob.age = 33;
//		  ob.serialNum = 22;
//		  ob.show();
		  
		  ob.setAge(22);
			 ob.setName("Ramya");
			 ob.setSerialNum(55);
			 System.out.println(ob);
	}

}
