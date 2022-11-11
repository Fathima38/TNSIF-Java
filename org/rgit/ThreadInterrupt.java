//demo on how thread can interrupt another thread
package org.rgit;

class Intt extends Thread{
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("I am lazy");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}
public class ThreadInterrupt {

	public static void main(String[] args) {
		Intt t=new Intt();
		t.start();
		t.interrupt();
		System.out.println("End of Main");

	}

}
