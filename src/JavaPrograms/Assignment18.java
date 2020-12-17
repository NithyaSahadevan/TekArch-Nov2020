package JavaPrograms;

import java.util.Scanner;

public class Assignment18 {
	// WJP that accepts two integer values from the user and return the larger values. 
	//However if the two values are the same, return 0 and 
	//return the smaller value if the two values have the same remainder when divided by 6.
	public static int retfunc(int num1, int num2) {
		int a = num1%6;
		int b = num2%6;
		if(a == b) {
			if(num1<num2)
				return num1;
			else
				return num2;
		}
		else {
			if(num1>num2)
			return num1;
		else if(num2>num1)
			return num2;
		else
			return 0;
		}
			
	}
	public static void main(String[] args) {
		
		
		int num1, num2;
		Scanner sc = new Scanner(System.in);

        System.out.println("please enter the first number");
        num1 = sc.nextInt();

        System.out.println("please enter the second number");
        num2 = sc.nextInt();
        sc.close();
        
        int res = retfunc(num1, num2);
        
        System.out.println("Returned value " + res);

	}

}
