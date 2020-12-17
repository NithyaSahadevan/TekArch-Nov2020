package JavaPrograms;

import java.util.Scanner;

public class productArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		int i;
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the numbers to sort");
			for (i = 0; i < 5; i++) {
				arr[i] = sc.nextInt();
			}
			sc.close();
		}	
		int[] res=ArrProd(arr);
		for(int l=0; l<res.length; l++) {
			System.out.print(res[l] + " ");
		}
		
	}
	public static int[] ArrProd(int[] arr) {
		int prod;
		int[] resArr = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			prod=1;
			for(int j=0; j<arr.length; j++) {
				if(arr[j] != arr[i])
				{
					prod=prod*arr[j];
					
				}

			}
			
			resArr[i]=prod;
		}
		return resArr;
	}
}
