package JavaPrograms;

import java.util.Scanner;

public class calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char op;
		float num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("please enter the first number");
		num1 = sc.nextFloat();

		System.out.println("please enter the second number");
		num2 = sc.nextFloat();

		System.out.println("Enter any operator: a,s,m,d");
		op = sc.next().charAt(0);
		sc.close();
		calc(num1, num2, op);
	}

	public static void calc(float num1, float num2, char op) {

		switch (op) {
		case 'a':
			System.out.println("Sum: " + (num1 + num2));
			break;

		case 's':

			System.out.println("Difference: " + (num1 - num2));
			break;
		case 'd':

			System.out.println("Division: " + (num1 / num2));
			break;

		case 'm':

			System.out.println("Product: " + (num1 * num2));
			break;
		default:
			System.out.println("Invalid Operator");
			break;
		}
	}

}
