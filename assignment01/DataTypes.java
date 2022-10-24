package assignment01;

public class DataTypes {
	boolean flag = true;
	byte range=124;
	short temperature=-200;
	int number=-4250000;
	double numdouble=-65.23;
	float numfloat=-65.32f;
	long numlong=-42332200000L;
	char letter='\u0051';
	char letter1='5';
	char letter2 = 65;
	String myString = "Avengers Assemble";
	void display() {
		 System.out.println(flag);    // prints true
		    System.out.println(range);    // prints 124
		    System.out.println(temperature);  // prints -200  
		    System.out.println(number);  // print -4250000
		    System.out.println(numlong);    // prints -42332200000
		    System.out.println(numdouble);  // prints -65.32
		    System.out.println(numfloat);  // prints -65.32
		    System.out.println(letter);  // prints Q
		    System.out.println(letter1);  // prints 5
		    System.out.println(letter2);  // prints A
		}
	public static void main(String[] args) {
		DataTypes DT= new DataTypes();
		DT.display();

}
}
