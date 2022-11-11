package org.rgit;
 class Sampleyield extends Thread{
	 public void run() {
		 for(int i=0;i<3;i++) {
			 System.out.println(Thread.currentThread().getName()+" in control");
		 }
	 }
 }
public class myThready {

	public static void main(String[] args) {
		Sampleyield t1=new Sampleyield();
		t1.start();
		
		Sampleyield t2=new Sampleyield();
		t2.start();
		for(int i=0;i<3;i++) {
			t1.yield();
			t2.yield();
			System.out.println(Thread.currentThread().getName()+" in control");
		}

	}

}
