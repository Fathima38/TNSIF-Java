package org.rgit;

public class Arrayoutofbound {

	public static void main(String[] args) {
		// Write a java program to check array out of bounds exception
		try {
		int arr[]=new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		finally {
			System.out.println("Program continues");
		}
	}

}

