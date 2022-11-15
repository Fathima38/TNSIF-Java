package org.rgit;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// By default it is doubly linked list
		// Insertion order is preserved
		// Heterogeneous values are allowed
		// Does not support random access interface
		// Linked list is the best choice in the frequent access in insertion and deletion in the middle
		// Linked list is the worst choice if our frequent access is retrieval operation
		// void addFirst(Object o);
		// void addLast(Object o);
		// Object getFirst();
		// Object getLast();
		// Object removeFirst();
		// Object removeLast();
		// LinkedList l1=new LinkedList();
		// LinkedList l2=new LinkedList(Collection c);
		LinkedList l1=new LinkedList();
		l1.add("rgit");
		l1.add("tns");
		l1.add("cse");
		System.out.println(l1);
		l1.add(3,"ece");
		l1.add(0,"java");
		System.out.println(l1);
		l1.addFirst("core java");
		l1.addLast("Good bye");
		System.out.println(l1);
		
	
	
	
	
	}

}
