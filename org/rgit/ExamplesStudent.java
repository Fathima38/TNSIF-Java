package org.rgit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ExamplesStudent {

	public static void main(String[] args) {
		ArrayList<Object> l1=new ArrayList<Object>();
		l1.add("Fathima Khanum");
		l1.add("7th Sem");
		l1.add("CSE");
		l1.add("RGIT");
		Iterator itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
