package JavaPrograms;

import java.util.Scanner;

public class Assignment22 {

	// WJP to check if a string contains only digits.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		str1=sc.nextLine();
		sc.close();
		
		boolean b;
		b = str1.matches("\\d+");
		if (b)
			System.out.println("String contains only digits ");
		else
			System.out.println("String contains other chars ");
	}

}
