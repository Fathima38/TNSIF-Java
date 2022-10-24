package org.rgit;

//Method Overloading
class Sample
{
	void add(int a,int b)
	{
		System.out.println("Sum of two is:"+(a+b));
	}
	void add(int a, int b, int c)
	{
		System.out.println("Sum of three is:"+(a+b+c));
	}
	void add(int a,int b,int c,int d)
	{
		System.out.println("Sum of Two is:"+(a+b+c+d));
	}
}
public class Poly {
	
	public static void main(String[] args) {
		//Poly Object=new Poly();
		Sample obj=new Sample();
		obj.add(10,20);
		obj.add(10, 20,30);
		obj.add(10,20,30,40);
		
	}

}
