package com.tnsif.multithreadingprgm;

public class SecondWay implements Runnable{ //best way not good way, more precise way
	public static void main(String [] args) {
		SecondWay t=new SecondWay(); 
		Thread th=new Thread(t);
		th.start();
		//th.start(); //IllegalThreadStateException
		th.run(); // it will act as a normal method calling
		//th.sleep(null); //InterruptedException
}
	public void run() {
		System.out.println("creation of thread using runnable interface");
	}
}
