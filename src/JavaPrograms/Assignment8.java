package JavaPrograms;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum1, iNum2;
		System.out.println("Enter two numbers: ");
		Scanner sc= new Scanner(System.in);
		
		iNum1=sc.nextInt();
		iNum2=sc.nextInt();
		sc.close();
		
		if(iNum1>iNum2)
		{
			System.out.println(iNum1 + " > " + iNum2);
		}
		else if(iNum1<iNum2)
		{
			System.out.println(iNum1 + " < " + iNum2);
		}
		else 
			System.out.println(iNum1 + " = " + iNum2);
	}

}
