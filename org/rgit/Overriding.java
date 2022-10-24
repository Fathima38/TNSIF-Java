package org.rgit;

class Example
{
	public void add(int a,int b)
	{
		System.out.println("Sum of two is:"+(a+b));
	}
	
}
class Child extends Example
{
	public void add(int a,int b)
	{
		//super.add(100, 200);
		System.out.println("Child sum:"+(a+b));
	}
}
public class Overriding{
	
	public static void main(String[] args) {
		//Poly Object=new Poly();
		Child obj=new Child();
		obj.add(10,20);
		
	}

}
