package JavaPrograms;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {

		//WJP to convert a given string into lowercase.
		
		String inputStr;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		inputStr=sc.nextLine();
		sc.close();
		
		System.out.println("Lower case " + inputStr.toLowerCase());
	}

}
