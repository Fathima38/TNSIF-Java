package org.rgit;

class myThread4 extends Thread{
	public void run() {
		try {
			for(int i=0;i<5;i++)
				System.out.println("Child Thread");
			Thread.sleep(2500,3000); //Thread.sleep(int ms,int ns);
		}
		catch(InterruptedException e) {
			//for(int i=0;i<5;i++)
				//System.out.println("Child Thread");
		}
	}
}
public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		myThread4 t=new myThread4();
		t.start();
		t.join();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");

	}

}
}
