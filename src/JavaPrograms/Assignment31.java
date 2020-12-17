package JavaPrograms;

import java.util.Scanner;

public class Assignment31 {

	//Write a Java method to compute the sum of the digits in an integer. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iNum,digit=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		iNum = sc.nextInt();
		sc.close();
		
		if(iNum>9) {
			while(iNum != 0)
			{
				digit = digit+iNum%10;
				iNum=iNum/10;
			}
			System.out.println("sum " + digit);
		}
		else
			System.out.println("sum " + iNum);
		
	}

}
