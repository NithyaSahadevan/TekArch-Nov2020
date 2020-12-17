package JavaPrograms;

import java.util.Scanner;

public class positiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iNum;
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        iNum = sc.nextInt();
        sc.close();

        if(iNum>0)
        	System.out.println("Number is positive");
        else if(iNum<0)
        	System.out.println("Number is negative");
        else
        	System.out.println("Number is zero");

	}

}
