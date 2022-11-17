package org.rgit;

import java.util.*;

public class HashSets {

	public static <E> void main(String[] args) {
		// Hashset h=new Hashset();
		// Hashset h=new Hashset(int initialcapacity);
		// Hashset h=new Hashset(int initialcapacity, float loadfactor);
		// Duplicate values are not allowed
		
		HashSet<E> h=new HashSet<E>();
		//
		//LinkedHashSet<E> h2=new LinkedHashSet<E>():
		h.add((E) "A");
		h.add((E) "a");
		h.add((E) "z");
		h.add((E) "Z");
		System.out.println(h);

	}

}
