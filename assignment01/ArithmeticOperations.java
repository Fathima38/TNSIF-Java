package assignment01;

public class ArithmeticOperations {
int num1=10,num2=5;
void add() {
	int add;
	add=num1+num2;
	System.out.println("SUM:"+add);
}
void sub() {
	int sub;
	sub=num1-num2;
	System.out.println("DIFFERENCE:"+sub);
}
void mul() {
	int mul;
	mul=num1*num2;
	System.out.println("MULTIPLICATION:"+mul);
}
void div() {
	int div;
	div=num1/num2;
	System.out.println("DIVISION:"+div);
}
	public static void main(String[] args) {
		ArithmeticOperations AC=new ArithmeticOperations();
		AC.add();
		AC.sub();
		AC.mul();
		AC.div();

	}

}
