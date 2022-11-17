package org.rgit;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

	public static <E> void main(String[] args) {
		// If you want to retrieve object one by one then there are three types of cursor
				// 01. Enumeration
				// 02. Iterator
				// 03. ListIterator
				// Enumeration e=v.elements();
				// Iterator itr=c.iterator();
		
		ArrayList l=new ArrayList();
		for(int i=0;i<10;i++) {
			l.add(i);
		}
		System.out.println(l);
		Iterator<E> itr=l.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer)itr.next();
			if(i%2==0) {
				System.out.println(i);
			}
			else
				itr.remove();
		}
		System.out.println(l);
		// Enumeration and Iterators can be moved only in forward direction and backward search is not possible i.e Single direction cursors
		// Using Iterator we can perform read and remove operations
			
	}

}
