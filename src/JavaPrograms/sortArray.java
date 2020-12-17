package JavaPrograms;

import java.util.Scanner;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		int i, temp, maxIndex, j;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the numbers to sort");
			for (i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			sc.close();
		}

		//Sort the numbers in ascending order
		for(i=0; i<arr.length-1; i++) {
			maxIndex=i;
			for(j=i+1; j<arr.length; j++) {
				if(arr[j] > arr[maxIndex]) {
					maxIndex=j;
				}
			}
			temp = arr[maxIndex];
			arr[maxIndex] = arr[i];
			arr[i] = temp; 
		}
		System.out.println("Descending order: ");
		for(i=0; i<10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Ascending order: ");
		for(i=arr.length-1; i>0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
