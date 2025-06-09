package JavaBasics;

import java.util.Scanner;

public class Fiveemployee {

	public static void main(String[] args) {

		Scanner emp = new Scanner(System.in);

		System.out.println("Enter the First Employee Name : ");
		String Name1 = emp.nextLine();
		System.out.println("Enter the first Employee Salery : ");
		double sal1 = emp.nextDouble();
		System.out.println("Enter age of first employee : ");
		int age1 = emp.nextInt();
		
		System.out.println("The Name,Salery & age of First employee : "+Name1+" "+sal1+" "+age1);
		
		Scanner emp2 = new Scanner(System.in);
		
		System.out.println("Enter the second Employee Name : ");
		String Name2 = emp2.nextLine();
		System.out.println("Enter the second Employee Salery : ");
		double sal2 = emp2.nextDouble();
		System.out.println("Enter age of second employee : ");
		int age2 = emp2.nextInt();
		
		System.out.println("The Name,Salery & age of 2nd employee : "+Name2+" "+sal2+" "+age2);
		
		Scanner emp3 = new Scanner(System.in);
		System.out.println("Enter the third Employee Name : ");
		String Name3 = emp3.nextLine();
		System.out.println("Enter the third Employee Salery : ");
		double sal3 = emp3.nextDouble();
		System.out.println("Enter age of third employee : ");
		int age3 = emp3.nextInt();
		
		System.out.println("The Name,Salery & age of 3rd employee : "+Name3+" "+sal3+" "+age3);
		
		Scanner emp4 = new Scanner(System.in);
		System.out.println("Enter the fourth Employee Name : ");
		String Name4 = emp4.nextLine();
		System.out.println("Enter the fourth Employee Salery : ");
		double sal4 = emp4.nextDouble();
		System.out.println("Enter age of fourth employee : ");
		int age4 = emp4.nextInt();
		
		System.out.println("The Name,Salery & age of 4th employee : "+Name4+" "+sal4+" "+age4);
		
		Scanner emp5 = new Scanner(System.in);
		System.out.println("Enter the fifth Employee Name : ");
		String Name5 = emp5.nextLine();
		System.out.println("Enter the fifth Employee Salery : ");
		double sal5 = emp5.nextDouble();
		System.out.println("Enter age of fifth employee : ");
		int age5 = emp5.nextInt();
		
		System.out.println("The Name,Salery & age of 5th employee : "+Name5+" "+sal5+" "+age5);
	}

}
