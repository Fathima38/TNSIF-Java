package org.rgit;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=50/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic operation occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch(Exception e) {
			System.out.println("Exception occurs");
		}
		finally {
		System.out.println("Program continues");
		}
	}

}
