package classDemos;

import java.util.Scanner;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		int i, j, temp, minIndex;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Selection sort: Enter the numbers to sort");
			for(i=0; i<10; i++) {
				arr[i] = sc.nextInt();
			}
				
			//Sort the numbers in ascending order
			for(i=0; i<arr.length-1; i++) {
				minIndex=i;
				for(j=i+1; j<arr.length; j++) {
					if(arr[j] < arr[minIndex]) {
						minIndex=j;
					}
				}
				temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp; 
			}
			System.out.println("Ascending order: ");
			for(i=0; i<10; i++) {
				System.out.println(arr[i]);
			}
			sc.close();
		}
	}
}
