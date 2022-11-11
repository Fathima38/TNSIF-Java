package org.rgit;

class myThread3 extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++) {
			System.out.println("Child thread");
			Thread.yield();
		}
	}
}
public class YieldMethod {

	public static void main(String[] args) {
		myThread3 t=new myThread3();
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}

}
