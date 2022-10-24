package org.rgit;

public class First {
	int a=100;
	int b=200;
	int c;
	void add()
	{
		c=a+b;
		System.out.println("The sum is:"+c );
	}
	void sub()
	{
		c=a-b;
		System.out.println("The difference is:"+c);
	}
	public static void main(String[] args) {
		
		First fir=new First();
		fir.add();
		fir.sub();
	}

}
