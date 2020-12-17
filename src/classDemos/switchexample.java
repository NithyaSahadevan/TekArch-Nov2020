package classDemos;

import java.util.Scanner;

public class switchexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mode = "";	
		Scanner sc = new Scanner(System.in);
		
		while(mode!=null) {
			System.out.println("Enter the mode of transportation");
			mode = sc.nextLine();
			switch (mode) {
			case "Train":
				System.out.println("45 min to reach office");
				break;
			case "Bus":
				System.out.println("30 min to reach office");
				break;
			case "Car":
				System.out.println("20 min to reach office");
				break;
			case "Exit":
				System.out.println("Pgm terminated.....");
				System.exit(0);
			default:
				System.out.println("I dont goto office");
				break;
			}	
		}
		sc.close();
	}
}
