package JavaPrograms;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ascii value of a given character
		char c;
		System.out.println("Enter a character ");
		Scanner sc= new Scanner(System.in);
		
		c=sc.next().charAt(0);
		sc.close();
		
		int ascii = (int) c;
		System.out.println("Ascii value " + ascii);
	}

}
