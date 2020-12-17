package JavaPrograms;

import java.util.Scanner;

public class NumberTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  int n;
	      System.out.println("Enter the row count: ");
	      Scanner sc = new Scanner(System.in);
	      n = sc.nextInt();
	      sc.close();
		  for (int row=1; row<=n; row++) {
			  for (int space=n; space>=row; space--) {
				  System.out.print(" ");
			  }
			for(int col=1; col<=row; col++) {
				System.out.print("* " );
			}
			System.out.println();
		  }
		  for (int row=n-1; row>=1; row--) {
			  for (int space=n-1; space>=row; space--) {
				  System.out.print(" ");
			  }
		  for(int col=row; col>=1; col--) {
				System.out.print(" *" );
			}
		  System.out.println();
		  }
	}
}
