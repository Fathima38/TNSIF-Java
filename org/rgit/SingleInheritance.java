package org.rgit;

class Parent{
	void disp() {
		System.out.println("I am from parent class");
	}
}

public class SingleInheritance extends Parent {

	public static void main(String[] args) {
		//Single level inheritance is when a child class inherits properties from a single parent class
		SingleInheritance ob=new SingleInheritance();
		ob.disp();		//Function from parent class
	}

}
