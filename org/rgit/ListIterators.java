package org.rgit;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterators {

	public static <E> void main(String[] args) {
		// FORWARD METHODS
		// public boolean hasNext()
		// public void Next()
		// public int nextIndex()
		// BACKWARD METHODS
		// public boolean hasPrevious()
		// public void previous()
		// public int previousIndex()
		// COMMON METHODS
		// public void remove()
		// public void set(Object o)
		// public void add(Object o)
		
		LinkedList l=new LinkedList();
		l.add("hi");
		l.add("rgit");
		l.add("tns");
		l.add("cse");
		System.out.println(l);
		ListIterator<E> itr=l.listIterator();
		while(itr.hasNext()) {
			String str=(String)itr.next();
			if(str.equals("hi")) {
				itr.add((E) "ISE");
			}
			else if(str.equals("cse")) {
				itr.add((E)"ECEE");
			}
			else if(str.endsWith("tns")) {
				itr.add((E) "mech");
			}
			System.out.println(l);
		}
	}
}
