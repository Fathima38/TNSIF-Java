package org.rgit;
class Display{
	public synchronized void wish(String name) {
		for(int i=0;i<5;i++) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				
			}
		}
	}
}
class myThreadsy extends Thread{
	Display dd;
	String name;
	myThreadsy(Display dd, String name){
		this.dd=dd;
		this.name=name;
	}
	public void run() {
		dd.wish(name);
		System.out.println(name);
	}
}

public class Syncc {

	public static void main(String[] args) {
		Display dd=new Display();
		myThreadsy t1=new myThreadsy(dd,"Matt");
		t1.start();
		//myThreadsy t2=new myThreadsy(dd,"Peter");
		//t2.start();
		//myThreadsy t3=new myThreadsy(dd,"Alec");
		//t3.start();
		//myThreadsy t4=new myThreadsy(dd,"Ashton//");
		//t4.start();
	
	}

}
