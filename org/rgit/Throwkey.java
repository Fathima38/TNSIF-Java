package org.rgit;

class Samplee{
public void demo(int age) {
	if(age>10) {
		throw new ArithmeticException("Eligible for C2TC");
		//System.out.println("Eligible for C2TC");
	}
	else {
		System.out.println("Not eligible for C2TC");
	}
}
	public void demo2(int income) {
		if(income>5) {
			//System.out.println("Eligible for C2TC");
			throw new ArrayIndexOutOfBoundsException("Not eligible for C2TC");
		}
		else {
			System.out.println("Not eligible for C2TC");
		}
}
}

public class Throwkey {

	public static void main(String[] args) {
		Samplee S=new Samplee();
		S.demo(20);
		S.demo2(3);
		
	}

}
