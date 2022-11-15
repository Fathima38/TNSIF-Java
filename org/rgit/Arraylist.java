package org.rgit;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add(null);
		al.add("aaa");
		System.out.println(al);
		al.remove(2);
		al.add("rgit");
		al.add(100);
		al.add(2,"tns");
		System.out.println(al);
		// Array list is the best choice if our frequent operation is retrieval operations
		// Array list performs random access interface
		// Array list is the worst choice if our frequent operation is insertion and deletion
		// Because several shift operations are required
		// To synchronize: List l1=new Collections.synchronizedList();
		

	}

}
