package org.rgit;

public class Multithreading extends Thread{
	void disp() {
		for(int i=0;i<2;i++) {
		System.out.println("Hello world");
		}
	}
	public static void main(String[] args) {
		// Application:multimedia
		// process-based taken care by OS
		// thread-based taken care by programmer
	    // extending thread class and implements runnable
		Multithreading t=new Multithreading();
		t.start();
		t.disp();
		for(int i=0;i<3;i++) {
			System.out.println("Hello main world");
		}
	}

}
