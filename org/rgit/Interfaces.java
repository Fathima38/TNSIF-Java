package org.rgit;

interface Phonepe{
	void disp1();
	static void displ3() {
		System.out.println("I am Phonepe");
	}
}
interface Rbi{
	void disp2();
}
class Icici implements Phonepe,Rbi{
	public void disp1() {
		System.out.println("Phonepe rules");
	}
	public void disp2() {
		System.out.println("RBI rules");
	}
}
class Hdfc implements Phonepe,Rbi{
	public void disp1() {
		System.out.println("Phonepe rules");
	}
	public void disp2() {
		System.out.println("RBI rules");
	}
}
public class Interfaces {

	public static void main(String[] args) {
		Icici obj=new Icici();
		obj.disp1();
		obj.disp2();
		Hdfc obj2=new Hdfc();
		obj2.disp1();
		obj2.disp2();
		Rbi obj3=new Icici();
		obj3.disp2();
	}

}
