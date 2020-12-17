package JavaPrograms;

import java.util.Scanner;

public class calculatorUsingMethods {
	public static void calculate(char op, int num1, int num2) {
		switch (op) {
		case '+':
			System.out.println("Sum: " + (num1 + num2));
			break;

		case '-':

			System.out.println("Difference: " + (num1 - num2));
			break;
		case '/':

			System.out.println("Division: " + (num1 / num2));
			break;

		case '*':

			System.out.println("Product: " + (num1 * num2));
			break;
		default:
			System.out.println("Invalid Operator");
			break;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char op;
		int num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("please enter the first number");
		num1 = sc.nextInt();

		System.out.println("please enter the second number");
		num2 = sc.nextInt();

		System.out.println("Enter the operator");
		op = sc.next().charAt(0);
		sc.close();

		calculate(op, num1, num2);
	}

}
