package org.rgit;

class myThread1 extends Thread{
	public void run() {
		System.out.println("Child Thread:"+Thread.currentThread().getPriority());
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		// Thread MIN_PRIORITY : 1
		// Thread NORM_PRIORITY : 5
		// Thread MAX_PRIORITY : 10
		myThread1 t=new myThread1();
		myThread1 t2=new myThread1();
		t2.start();
		t2.setName("Peter Parker");
		System.out.println("Child Thread:"+t2.getName());
		t.start();
		t.setName("Tony Stark");
		System.out.println("Main Thread:"+Thread.currentThread().getName());
		System.out.println("Child Thread:"+t.getName());
		//Thread.currentThread().setPriority(8);
		t.setPriority(8);
		System.out.println("Main Thread:"+Thread.currentThread().getPriority());
		
	}

}
