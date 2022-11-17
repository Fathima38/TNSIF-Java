package org.rgit;

import java.util.Vector;
public class Vectorclass {

	public static void main(String[] args) {
		// addElement(object o);
		// removeElement(object o);
		// removeElementAt(int index);
		// Objectget(int index);
		// ObjectElemenAt(int index);
		// Vector v=new Vector();
		// Vector v1=new Vector(int initialcapacity);
		// Vector v2=new Vector(Collection c);
		// Vector v3=new Vector(int initialcapacity, int incrementalcapactiy);
		// Allows duplicate
		// Random access interface
		
		
		Vector v=new Vector();
		System.out.println(v.capacity());
		for(int i=0;i<=10;i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("rgit");
		System.out.println(v);
		System.out.println(v.capacity());

	}

}
