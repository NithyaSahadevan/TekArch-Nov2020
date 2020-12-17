package classDemos;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int i, j, temp;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Bubble sort:Enter the numbers to sort");
			for(i=0; i<10; i++) {
				arr[i] = sc.nextInt();
			}
			
			//Sort the numbers in ascending order
			for(i=0;i<arr.length-1; i++) {
				for(j=0; j<arr.length-1-i; j++) {
					if(arr[j] > arr[j+1]) {
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] =temp;
					}
				}
			}
			System.out.println("Ascending order: ");
			for(i=0; i<10; i++) {
				System.out.println(arr[i]);
			}
			sc.close();
		}
	}
}
