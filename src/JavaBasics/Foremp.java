package JavaBasics;

import java.util.Scanner;

public class Foremp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner emp = new Scanner(System.in);

		        for (int i = 1; i <= 5; i++) {
		            System.out.println("Enter the Employee " + i + " Name: ");
		            String name = emp.nextLine();

		            System.out.println("Enter the Employee " + i + " Salary: ");
		            double salary = emp.nextDouble();

		            System.out.println("Enter the Employee " + i + " Age: ");
		            int age = emp.nextInt();

		            emp.nextLine(); // consume the newline left after nextInt()

		            System.out.println("The Name, Salary & Age of Employee " + i + ": " + name + " " + salary + " " + age);
		        }

		        emp.close(); // Always good practice to close the Scanner
		    }
		

	}


