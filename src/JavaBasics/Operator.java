package JavaBasics;

public class Operator {
	
	//Q:WAP input two numbers and print the sum of the numbers.
	public static void main (String[] args) { 

		int a = 5;
		int b = 6;
		int Sum = a + b;
		int sub = b - a;
		int multi = a * b;
		int divison = b / a;
		int modulo = b % a;
		int bitwiseand = b &= a;
		int bitwiseor = b |= a;
		System.out.println("The Sum of two numbers is: " + Sum);
		System.out.println("The Substraction of two numbers is: " + sub);
		System.out.println("The multiplication of two numbers is: " + multi);
		System.out.println("The divison of two numbers is: " + divison);
		System.out.println("The modulo of two numbers is: " + modulo);
		System.out.println("The bitwiseand of two numbers is: " + bitwiseand);
		System.out.println("The bitwiseor of two numbers is: " + bitwiseor);
		System.out.println(b);
	}
	
}