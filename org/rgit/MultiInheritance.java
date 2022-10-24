package org.rgit;

class ParentOne{
	void display1() {
		System.out.println("Parent One");
	}
}
class ParentTwo extends ParentOne{
	void display2() {
		System.out.println("Parent Two");
	}
}
class ParentThree extends ParentTwo{
	void display3() {
		System.out.println("Parent Three");
	}
}
class ParentFour extends ParentThree{
	void display4() {
		System.out.println("Parent Four");
	}
}

public class MultiInheritance extends ParentFour {

	public static void main(String[] args) {
		//Multi-level inheritance is when a child class acts as a parent class to another class
		MultiInheritance ob=new MultiInheritance();
		ob.display1();
		ob.display2();
		ob.display3();
		ob.display4();		//Multi-level inheritance
	}
}
