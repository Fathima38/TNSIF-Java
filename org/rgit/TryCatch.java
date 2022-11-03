package org.rgit;

public class TryCatch {

	public static void main(String[] args) {
		int num1=50/10;
		System.out.println(num1);
		int num2=50-10;
		int num3;
		System.out.println(num2);
		try {
			num3=50/0;
			System.out.println(num3);
		}
		catch (ArithmeticException e) {
			System.out.println("Division by zero");
			e.printStackTrace();
		}

	}

}
