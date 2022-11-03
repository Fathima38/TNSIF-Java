package org.rgit;

public class Wrapper {

	public static void main(String[] args) {
		//Autoboxing : primitive to wrapper classes
		//Unboxing : wrapper class to primitive class
		
		int a=100;
		Integer b= a; //Autoboxing
		System.out.println(b);
		
		Character c='C';
		char d=c; //Unboxing
		System.out.println(d);
		
		Float f=45.45f;
		System.out.println(f);
		
		Double dou=45.45d;
		System.out.println(dou);
		
		
	}

}
