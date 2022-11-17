package org.rgit;

import java.util.ArrayList;
import java.util.List;

// Generics Example
// Compile time error and Run time error

public class ErrorsDemo {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("rgit");
		l1.add("tns");
		String s=(String)l1.get(0);
		System.out.println(l1.get(1));

	}

}
