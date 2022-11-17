package org.rgit;

import java.util.Stack;
public class Stacks {

	public static void main(String[] args) {
		// Last In First Out
		// push method: push()
		// pop()
		// peek()
		// empty()
		// search()
		Stack s=new Stack();
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		System.out.println(s);
		s.pop();
		s.pop();
		s.push(500);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search(500));
	}

}