package JavaPrograms;

import java.util.Scanner;

public class Assignment33 {

	//Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int year;
	      System.out.println("Enter an Year :: ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();
	      sc.close();
	      
	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	   }
}
