package org.rgit;

public class KIamotors {
	int nocars;
	String model;
	String color;
	int speed=100;
	void display()
	{
		System.out.println("Welcome to KIA Motors");	
	}
	private void display2() {
		System.out.println("The speed is:"+speed);
	}
	

	public static void main(String[] args) {
	
		KIamotors KIA=new KIamotors();
		KIA.display();
		KIA.display2();
		
		
	}

}
