package JavaPrograms;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iNum1, iNum2;
		System.out.println("Enter two numbers: ");
		Scanner sc= new Scanner(System.in);
		
		iNum1=sc.nextInt();
		iNum2=sc.nextInt();
		sc.close();
		
		iNum1=iNum1+iNum2;
		iNum2=iNum1-iNum2;
		iNum1=iNum1-iNum2;
		
		System.out.println("Swapped numbers " + iNum1 + " " + iNum2);
	}

}
