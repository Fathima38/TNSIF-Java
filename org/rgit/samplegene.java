package org.rgit;

import java.util.*;

class Testing<T>{
	
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public Testing(T obj) {
		super();
		this.obj = obj;
	}
	void display() {
		System.out.println("Hi tns");
	}
	
	
}

public class samplegene {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList();
		ar.add("cse");
		ar.add("ece");
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
	}

}
// Bounded and Wildcard concepts 

// In generics type casting is easy
// Code reusability