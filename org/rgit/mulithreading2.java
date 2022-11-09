package org.rgit;

class myThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread");
		}
	}
	public void run(int i) {
		for(int n=0;n<5;n++) {
			System.out.println("Argument method");
		}
	}
}
public class mulithreading2 {

	public static void main(String[] args) {
		myThread t=new myThread();
		t.start();
		t.run(5);
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}

}
