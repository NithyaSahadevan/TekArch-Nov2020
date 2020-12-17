package JavaPrograms;

import java.util.Scanner;

public class NumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int n, num=1;
	      System.out.println("Enter the row count: ");
	      Scanner sc = new Scanner(System.in);
	      n = sc.nextInt();
	      sc.close();
		  for (int row=1; row<=n; row++) {
			for(int col=1; col<=row; col++, num++) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
