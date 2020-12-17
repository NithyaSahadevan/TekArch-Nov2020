package JavaPrograms;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum;
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        iNum = sc.nextInt();
        sc.close();
  
        // Function Call 
        Fibonacci(iNum); 
	}

	// Function to print N Fibonacci Number 
    static void Fibonacci(int N) 
    { 
        int num1 = 0, num2 = 1; 
  
        int counter = 0; 
  
        // Iterate till counter is N 
        for (counter=0; counter < N; counter++) { 
  
            // Print the number 
            System.out.print(num1 + " "); 
  
            // Swap 
            int num3 = num2 + num1; 
            num1 = num2; 
            num2 = num3; 
        } 
    }
}
